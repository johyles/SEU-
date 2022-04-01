<template>
    <div class="右侧页面">
        <el-card class="页面内容" v-for="(item, index) in forum" :key="index" @click.native="tocontent(item.id)" shadow="hover">
            <div class="头像和用户名">
                <div class="头像">
                    <el-avatar :size="70" :src="item.userAvatar" @error="true">
                        <img src="https://cube.elemecdn.com/0/88/03b0d39583f48206768a7534e55bcpng.png"/>
                    </el-avatar>
                </div>
                <div class="用户名">{{item.username}}</div>
            </div>
            <div class="内容标题">
                标题:{{item.title}}
            </div>
        </el-card>
    </div>
</template>

<script>
const axios = require('axios');
export default {
    methods:{
        tocontent(id){
            console.log(id);
            this.$router.push({ path: '/forumcontent', query: { id: id } })
        },
        editinformation(){
            this.$router.push('/mymodifyinformation')
        }
    },
    data(){
        return{
            forum:[],
            用户信息: {
            }
        }
    },
    created(){

        // axios.defaults.headers.common.Authorization = JSON.parse(localStorage.currentuser).token
        axios.post('http://127.0.0.1:8080/api/forum/findall',{
                "pageIndex":0,
                "pageSize":5
        }).then(resp=>{
            console.log(resp);
            this.forum=resp.data.data.forum;
        })
        // alert('fuck');

    }
}
</script>

<style scoped>
*{
    text-align: left;
}
.内容标题{
    margin-left: 20px;
    font-size: 30px;
    font-weight: bold;
    margin-bottom: 10px;
}
.个性签名{
    width: 85%;
}
.个性签名内容{
    min-height: 100px;
    /* height:100px; */
    /* overflow:scroll; */
}
.页面内容{
    border-radius: 30px;
    padding:15px;
    margin-bottom: 10px;
}
.头像和用户名{
    margin-left: 20px;
    margin-top: 10px;
    margin-bottom: 30px;
    height: 70px;
    display: flex;
}
.头像{
    width: 70px;
    height: 70px;
}
.用户名{
    margin-left: 30px;
    font-size: 20px;
    font-weight:bold;
    height: 70px;
    line-height: 70px;
}

</style>
