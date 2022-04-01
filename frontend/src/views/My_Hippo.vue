<template>
    <div class="右侧页面">
        <el-card class="页面内容">
            <div class="头像和用户名">
                <div class="头像">
                    <el-avatar :size="100" :src="用户信息.avatar" @error="true">
                        <img src="https://cube.elemecdn.com/0/88/03b0d39583f48206768a7534e55bcpng.png"/>
                    </el-avatar>
                </div>
                <div class="用户名">{{用户信息.username}}</div>
            </div>
            <div class="sb">
                今天是我来SEU闲置的第 {{天数}} 天
            </div>
            <div class="sb">
                在SEU闲置，我淘到了 {{(总金额.已支付+总金额.待支付).toFixed(2)}} 元的商品，其中 {{(总金额.待支付).toFixed(2)}} 元等待支付。
            </div>
        </el-card>
        <el-card class="页面内容">
            <div class="内容标题">我的商品偏好</div>
            <div class="图表">
                <el-card class="图">
                    <ve-radar :data="类别1" :settings="radarSet" :extend="radarChartDataExtend"></ve-radar>
                    我偏好的类别
                </el-card>
                <el-card class="图">
                    <ve-pie :data="类别2" :settings="pieSet"></ve-pie>
                    我偏好的闲置种类
                </el-card>
            </div>
        </el-card>
        <el-card class="页面内容">
            <div class="内容标题">一周内，我的购买偏好时间段</div>
            <div class="图表">
                <el-card class="图2">
                    <ve-line :data="时间分布" :settings="polylineSet"></ve-line>
                    我的购买偏好
                </el-card>
            </div>
        </el-card>
    </div>
</template>

<script>
const axios = require('axios');
export default {
    methods:{
        editinformation(){
            this.$router.push('/mymodifyinformation')
        }
    },
    data(){
        return{
            天数: 0,
            总金额:{
                "已支付": 87.6,
                "待支付": 9.99
            },
            商品种类:{},
            时间段:{},
            时间分布:{},
            类别1:{},
            类别2:{},
            用户信息: {
            },
            pieSet: {
                roseType: "radius",
                labelMap: {
                number: "数字",
                authentication: "认证",
                },
            },
            pieData: {
                columns: ["number", "authentication"],
                rows: [
                { number: "22", authentication: 1393 },
                { number: "32", authentication: 3530 },
                { number: "31", authentication: 2923 },
                { number: "14", authentication: 1723 },
                { number: "15", authentication: 3792 },
                ],
            },
            //
            radarSet: {
                labelMap: {
                  电子数码: "电子数码",
                  衣帽鞋服: "衣帽鞋服",
                  日用品: "日用品",
                  书籍: "书籍",
                  食品: "食品",
                },
                areaStyle: {
                opacity: 0.8,
                },
            },

            radarChartDataExtend: {
                radar:{indicator: [
                { name: '电子数码', max: 20},
                { name: '衣帽鞋服', max: 20},
                { name: '日用品', max: 20},
                { name: '书籍', max: 20},
                { name: '食品', max: 20},
                ]}
            },
            //

            polylineSet: {
                area: true,
            },


        }
    },
    created(){

        axios.defaults.headers.common.Authorization = JSON.parse(localStorage.currentuser).token
        axios.post('http://127.0.0.1:8080/api/user/information').then(resp=>{
            console.log(resp);
            this.用户信息=resp.data.data.user;
            var objDate=new Date(this.用户信息.createTime);
            var currentTime = Date.now();
            this.天数=((currentTime-objDate)/ (1000 * 60 * 60 * 24)).toFixed(0);
            axios.post('http://127.0.0.1:8080/api/order/money').then(res2=>{
                this.总金额=res2.data.data;
            })
            axios.post('http://127.0.0.1:8080/api/order/category').then(res3=>{
                this.商品种类=res3.data.data;
                var 类2={}
                类2.columns=["number", "authentication"],
                类2.rows=[]
                var c2=this.商品种类.categorySecond
                var namearray=Object.keys(c2);
                console.log(namearray);
                var valarray=namearray.map(function(i){return c2[i]})
                console.log(valarray);
                var p=-1;
                for (var i=0;i<namearray.length;i++){
                    // if (i>=3) continue;
                    if (valarray[i]===0) continue;
                    p++;
                    类2.rows[p]={};
                    类2.rows[p].number=namearray[i];
                    类2.rows[p].authentication=valarray[i];
                }
                this.类别2=类2;


                var 类1={}
                类1.columns=['我的偏好','电子数码','衣帽鞋服','日用品','书籍','食品']
                类1.rows=[]

                类1.rows[0]=this.商品种类.categoryFirst;
                类1.rows[0].我的偏好='我的偏好'
                this.类别1=类1;
            })
            axios.post('http://127.0.0.1:8080/api/order/time').then(res4=>{
                this.时间段=res4.data.data.time;
                var obj=this.时间段;
                var namearray=Object.keys(obj);
                console.log(namearray)
                var valarray=namearray.map(function(i){return obj[i]})
                console.log(valarray)
                var timetable={}
                timetable.columns=['时间段','我的下单数']
                timetable.rows=[]
                var datearray=['00', '01', '02', '03', '04', '05', '06', '07', '08', '09', '10', '11', '12', '13', '14', '15', '16', '17', '18', '19', '20', '21', '22', '23']
                for (var i=0;i<namearray.length;i++){
                    timetable.rows[i]={};
                    timetable.rows[i].时间段=datearray[i];
                    timetable.rows[i].我的下单数=obj[datearray[i]];
                }
                this.时间分布=timetable;

            })
        })
        // alert('fuck');

    }
}
</script>

<style scoped>
.图{
    width: 500px;
    text-align: center;
    margin-left: 2%;
    margin-right: 2%;
}
.图2{
    width: 1000px;
    text-align: center;
    margin-left: 2%;
    margin-right: 2%;
}
.图表{
    display: flex;
}
.sb{
    margin-left: 50px;
    margin-bottom: 10px;
    font-size: 30px;
    font-weight: bold;
}
*{
    text-align: left;
}
.标题对应内容{
    font-size: 20px;
    margin-bottom: 10px;
    margin-left: 10px;
}
.内容标题{
    font-size: 20px;
    font-weight: bold;
    margin-bottom: 10px;
}
.页面内容{
    border-radius: 30px;
    padding:15px;
    margin-bottom:20px
}
.头像和用户名{
    margin-left: 20px;
    margin-top: 10px;
    margin-bottom: 30px;
    height: 100px;
    display: flex;
}
.头像{
    width: 100px;
    height: 100px;
}
.用户名{
    margin-left: 30px;
    font-size: 40px;
    font-weight:bold;
    height: 100px;
    line-height: 100px;
}

</style>
