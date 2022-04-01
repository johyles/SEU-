<template>
  <div class="页面">
    <div class="头部">
      <Navbar ref="nav_ins"></Navbar>
    </div>
    <div class="正文" style="zoom: 90%">
      <div id="展示区" >
        <div id="走马灯展示区">
          <div id="左侧分类栏">
            <div id="分类栏头">全部商品分类</div>
            <div id="分类栏表">
              <ul>
                <li id="li1">
                  <img src="../assets/img/分类小图标/sprite_fresh1.png" width="30px" height="30px">
                  <a href="#" style="color:black;font-size: 20px">电子数码</a><i>></i>
                  <div id="右侧拉出栏1">
                    <div id="右拉菜单">
                      <div id="小抬头"><a  href="/goodslist?productname=手机">手机 ></a></div>
                    </div>
                    <div id="右拉菜单">
                      <div id="小抬头"><a id="小抬头" href="/goodslist?productname=电脑">电脑 ></a></div>
                    </div>
                  </div>
                </li>
                <li id="li2">
                  <img src="../assets/img/分类小图标/sprite_fresh2.png" width="30px" height="30px">
                  <a href="#" style="color:black;font-size: 20px">衣帽鞋服</a><i>></i>
                  <div id="右侧拉出栏2">
                    <div id="右拉菜单">
                      <div id="小抬头"><a  href="/goodslist?productname=衣帽">衣帽 ></a></div>
                    </div>
                    <div id="右拉菜单">
                      <div id="小抬头"><a id="小抬头" href="/goodslist?productname=鞋服">鞋服 ></a></div>
                    </div>
                  </div>
                </li>
                <li id="li3">
                  <img src="../assets/img/分类小图标/sprite_fresh3.png" width="30px" height="30px">
                  <a href="#" style="color:black;font-size: 20px">日用品</a><i>></i>
                  <div id="右侧拉出栏3">
                    <div id="右拉菜单">
                      <div id="小抬头"><a  href="/goodslist?productname=日用品">日用品 ></a></div>

                    </div>
                  </div>
                </li>
                <li id="li4">
                  <img src="../assets/img/分类小图标/sprite_fresh4.png" width="30px" height="30px">
                  <a href="#" style="color:black;font-size: 20px">书籍</a><i>></i>
                  <div id="右侧拉出栏4">
                    <div id="右拉菜单">
                      <div id="小抬头"><a  href="/goodslist?productname=书籍">书籍 ></a></div>
                    </div>
                  </div>
                </li>
                <li id="li5">
                  <img src="../assets/img/分类小图标/sprite_fresh5.png" width="30px" height="30px">
                  <a href="#" style="color:black;font-size: 20px">食品</a><i>></i>
                  <div id="右侧拉出栏5">
                    <div id="右拉菜单">
                      <div id="小抬头"><a  href="/goodslist?productname=零食">零食 ></a></div>
                    </div>
                  </div>
                </li>
              </ul>
            </div>
            <!--                        <div id="插图1"><img src="../assets/img/fruits-plate.png" width="250px"></div>-->
          </div>
          <div id="中部走马灯">
            <el-carousel height="430px" >
              <el-carousel-item v-for="item in pictures" :key="item">
                <h3 class="small"><img class="h3img":src=item></h3>
              </el-carousel-item>
            </el-carousel>
          </div>
          <div id="右侧头条广告">
            <div id="右侧头条">
              <div id="头条标题"><b align="center" style="font-size:20px">—SEU闲置头条—</b></div>
              <div id="头条内容">
                <p align="center"><a href="https://top100.jd.com/" style="font-size: 18px">闲置物品轻松卖</a></p>
                <p align="center"><a href="https://top100.jd.com/" style="font-size: 18px">二手轻松换成钱</a></p>
              </div>
            </div>
            <div id="右侧广告">
              <img src="https://s2.loli.net/2022/03/14/LIwcEURDz4WoshT.png" width="200x" style="margin-top: 40px">
            </div>
          </div>
        </div>
        <div id="展示区下侧">
          <div id="下侧展示块">
            <div id="展示块图片"><img src="../assets/img/white/leafs-transparent.png" width="90px"></div>
            <div id="展示块文字"><p id="展示块文字上">闲置二手</p><p id="展示块文字下">互惠互利 SEU精选</p></div>
          </div>
          <div id="下侧展示块">
            <div id="展示块图片"><img src="../assets/img/white/leafs-transparent.png" width="90px"></div>
            <div id="展示块文字"><p id="展示块文字上">闲置二手</p><p id="展示块文字下">互惠互利 SEU精选</p></div>
          </div>
          <div id="下侧展示块">
            <div id="展示块图片"><img src="../assets/img/white/leafs-transparent.png" width="90px"></div>
            <div id="展示块文字"><p id="展示块文字上">闲置二手</p><p id="展示块文字下">互惠互利 SEU精选</p></div>
          </div>
          <div id="下侧展示块">
            <div id="展示块图片"><img src="../assets/img/white/leafs-transparent.png" width="90px"></div>
            <div id="展示块文字"><p id="展示块文字上">闲置二手</p><p id="展示块文字下">互惠互利 SEU精选</p></div>
          </div>
        </div>
      </div>

      <div id="推荐区">
        <div id="标题栏">
          <p style="font-size:30px"> SEU / 闲置 / 严 / 选 </p>
          <p>INSPIRATION FRESH</p>
        </div>
        <div id="推荐区导航">
          <el-tabs id="推荐区导航栏" v-model="activeName" @tab-click="handleClick">
            <el-tab-pane id ="推荐区块" label="电子数码" name="first">
              <div id="推荐商品区块">
                <div id="推荐商品区">
                  <div id="单个商品块" v-for="o, index in products2" :key="index">
                    <div id="单个商品图片">
                      <a href="javascript:void(0);" @click="toshop(products2[index].id)">
                        <img :src="products2[index].pictureUrl"  width="170px" height="170px">
                      </a>
                    </div>
                    <div id="单个商品名称">
                      <a href="javascript:void(0);" @click="toshop(products2[index].id)"><p>{{products2[index].name}}</p></a>
                    </div>
                    <div id="单个商品价格">
                      <a href="javascript:void(0);" @click="toshop(products2[index].id)">
                        <p>
                          ￥{{products2[index].price}}
                        </p>
                      </a>
                      <div id="销量">
                        <p >销量 :{{products2[index].sales_amount}}</p>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </el-tab-pane>
            <el-tab-pane id ="推荐区块" label="衣帽鞋服" name="fourth">
              <div id="推荐商品区块">
                <div id="推荐商品区">
                  <div id="单个商品块" v-for="o, index in products4" :key="index">
                    <div id="单个商品图片">
                      <a href="javascript:void(0);" @click="toshop(products4[index].id)">
                        <img :src="products4[index].pictureUrl"  width="170px" height="170px">
                      </a>
                    </div>
                    <div id="单个商品名称">
                      <a href="javascript:void(0);" @click="toshop(products4[index].id)">
                        <p>{{products4[index].name}}</p>
                      </a>
                    </div>
                    <div id="单个商品价格">
                      <a href="javascript:void(0);" @click="toshop(products4[index].id)">
                        <p>
                          ￥{{products4[index].price}}
                        </p>
                      </a>
                      <div id="销量">
                        <p >销量 :{{products4[index].sales_amount}}</p>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </el-tab-pane>
            <el-tab-pane id ="推荐区块" label="日用品" name="second">
              <div id="推荐商品区块">
                <div id="推荐商品区" >
                  <div id="单个商品块" v-for="o, index in products1" :key="index">
                    <div id="单个商品图片">
                      <a href="javascript:void(0);" @click="toshop(products1[index].id)">
                        <img :src="products1[index].pictureUrl"  width="170px" height="170px">
                      </a>
                    </div>
                    <div id="单个商品名称">
                      <a href="javascript:void(0);" @click="toshop(products1[index].id)">
                        <p>{{products1[index].name}}</p>
                      </a>
                    </div>
                    <div id="单个商品价格">
                      <a href="javascript:void(0);" @click="toshop(products1[index].id)">
                        <p>
                          ￥{{products1[index].price}}
                        </p>
                      </a>
                      <div id="销量">
                        <p >销量 :{{products1[index].sales_amount}}</p>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </el-tab-pane>
            <el-tab-pane id ="推荐区块" label="食品" name="third">
              <div id="推荐商品区块">
                <div id="推荐商品区">
                  <div id="单个商品块" v-for="o, index in products3" :key="index">
                    <div id="单个商品图片">
                      <a href="javascript:void(0);" @click="toshop(products3[index].id)">
                        <img :src="products3[index].pictureUrl"  width="170px" height="170px">
                      </a>
                    </div>
                    <div id="单个商品名称">
                      <a href="javascript:void(0);" @click="toshop(products3[index].id)">
                        <p>{{products3[index].name}}</p>
                      </a>
                    </div>
                    <div id="单个商品价格">
                      <a href="javascript:void(0);" @click="toshop(products3[index].id)">
                        <p>
                          ￥{{products3[index].price}}
                        </p>
                      </a>
                      <div id="销量">
                        <p >销量 :{{products3[index].sales_amount}}</p>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </el-tab-pane>
          </el-tabs>
        </div>
        <div id="推荐展示区"></div>
      </div>

      <Bottom ref="bottom_ins"></Bottom>
      <el-backtop>
        <div>
          <i class="el-icon-top"></i>
        </div>
      </el-backtop>
    </div>
  </div>
</template>

<script>
const axios = require('axios');
/* import App from '../App.vue' */
import Navbar from './Navbar.vue'
import Header from './Header.vue'
import Bottom from './Bottom.vue'
export default {
  components: {
    Navbar,
    Header,
    Bottom
  },
  created () {
    if (localStorage.hasOwnProperty('currentuser')){
      axios.defaults.headers.common.Authorization = JSON.parse(localStorage.currentuser).token
      axios.post('http://127.0.0.1:8080/api/user/message/find', {
      }).then(res => {
        console.log(res.data)
        if (res.data.code === 200) {
          console.log(res.data.data)
          this.messages.messageId = res.data.data.messageId
          this.messages.productId = res.data.data.productId
          this.messages.oldPrice = res.data.data.oldPrice
          this.messages.percentage = res.data.data.percentage
          this.messages.productPicture = res.data.data.productPicture
          this.messages.currentPrice = res.data.data.currentPrice
          this.messages.message = res.data.data.message
          console.log(res.data.data.productName)
          this.messages.productname = res.data.data.productName
          this.messages.id = res.data.data.productId
          this.messages.days = res.data.data.days
          this.messages.percentage = res.data.data.percentage
          this.discountdialogVisible = true
        }
      })
    }
    axios.post('http://127.0.0.1:8080/api/product/kill', {
    }).then(res => {
      this.discountproduct = res.data.data
    })
    axios.post('http://127.0.0.1:8080/api/product', {
      pageNum: 4,
      categoryFirst: '日用品'
    }).then(res => {
      this.products1 = res.data.data
      console.log(this.products1)
    })
    axios.post('http://127.0.0.1:8080/api/product', {
      pageNum: 4,
      categoryFirst: '电子数码'
    }).then(res => {
      this.products2 = res.data.data
    })
    axios.post('http://127.0.0.1:8080/api/product', {
      pageNum: 4,
      categoryFirst: '食品'
    }).then(res => {
      this.products3 = res.data.data
    })
    axios.post('http://127.0.0.1:8080/api/product', {
      pageNum: 4,
      categoryFirst: '衣帽鞋服'
    }).then(res => {
      this.products4 = res.data.data
    })
  },
  data () {
    return {
      messages: {
        messageId: ' ',
        productId: ' ',
        oldPrice: ' ',
        percentage: ' ',
        productPicture: ' ',
        currentPrice: ' ',
        message: ' ',
        productname: ' ',
        id: ' '
      },
      discountdialogVisible: false,
      discountproduct: [],
      notifyPromise:Promise.resolve(),
      messages:[],
      input: '',
      img_url1: 'https://img10.360buyimg.com/cms/jfs/t13846/115/2346218030/176079/dfd8ece7/5a4094d3Nc8168196.png',
      activeName: 'second',
      pictures: ['https://s2.loli.net/2022/03/14/VE4nUzGQt2ysghc.jpg',
        'https://s2.loli.net/2022/03/14/DpkcYa3eu6iAZ24.jpg',
        'https://s2.loli.net/2022/03/14/1R2wBG3SOZi7vb6.jpg'],
      products1: [],
      products2: [],
      products3: [],
      products4: [],
      products5: [],
    }
  },
  function: {
    change (myid, mode) {
      document.getElementById(myid).style.display = mode
      if (mode === 'block') { // 显示下拉菜单
        // 设置下拉菜单所在的div边框
        document.getElementById(myid).style.border = '1px solid #eee'
        document.getElementById(myid).style.borderTop = 'none'
        // 设置鼠标划过的li的边框以及背景颜色
        document.getElementById(myid).parentNode.style.backgroundColor = '#fff'
        document.getElementById(myid).parentNode.style.border = '1px solid #eee'
        document.getElementById(myid).parentNode.style.borderBottom = 'none'
      } else {
        // 当不显示下拉列表的时候 鼠标划过的li的边框以及背景颜色
        document.getElementById(myid).parentNode.style.backgroundColor = ''
        document.getElementById(myid).parentNode.style.border = ''
      }
    }
  },
  methods: {
    toshop2 (id) {
      this.$router.push({ path: '/singleproduct', query: { id: this.messages.id } })
    },
    notify(msg) {
      this.notifyPromise = this.notifyPromise.then(this.$nextTick).then(()=>{
        this.$notify({
          title: "提示",
          message: msg,
          dangerouslyUseHTMLString: true,
          duration: 0,
          offset:50
        });
      })
    },
    handleClick (tab, event) {
      console.log(tab, event)
    },
    toshop (id) {
      this.$router.push({ path: '/singleproduct', query: { id: id } })
    }
  }
}
</script>

<style scoped>
/* =========================================== */
a:link{
  color: black;
}

.头部 {
  width: 100%;
  margin: auto;
}
#展示区
{
  background: url('') ;/*背景*/
  background-color: #f0f0f7;
  height: 580px;
  background-position:center center;
  display: flex;
  flex-direction: column;
  align-items: center;
}
#走马灯展示区{
  width: 100%;
  height: 400px;
  display: flex;
  justify-content:center;
  flex-direction: row;
}
ul{
  list-style: none;
  flex-direction: column;
  justify-content: center;
  width: 100%;
  margin:0px;
  padding: 0px;
}
a{
  text-decoration:none
}
#左侧分类栏{
  width: 200px;
  background-color: rgb(247, 245, 242);
  position: relative;
}
#li1, #li2, #li3, #li4, #li5{
  height: 55px;
  line-height: 50px;
  width: 92.5%;
  /*  text-align: center; */
  list-style: none;
  margin: 0 auto;
  padding-right: 15px;
  display: flex;
  flex-direction: row;
  justify-content: space-around;
  align-items: center;
  border-color: white;
  border-bottom-color: rgb(121, 124, 123) ;
  border-width: 1px;
  border-style: solid;
}
#li1:hover, #li2:hover, #li3:hover, #li4:hover{
  background-color: rgb(255, 255, 255);
}
#li5:hover{
  background-color: rgb(255, 255, 255);
}
#li1:hover #右侧拉出栏1{
  z-index: 50;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: flex-start;
}
#li2:hover #右侧拉出栏2{
  z-index: 50;
}
#li3:hover #右侧拉出栏3{
  z-index: 50;
}
#li4:hover #右侧拉出栏4{
  z-index: 50;
}
#li5:hover #右侧拉出栏5{
  z-index: 50;
}
#分类栏头{
  height:40px;
  width: 100%;
  text-align: center;
  background-color: black;
  color:white;
  font-size: 20px;
  line-height: 40px;
}
#分类栏表{
  text-align: center;

}
#分类栏表 i{
  float: right;
  font-size: 20px;
  color: black;
}
#右侧拉出栏1{
  width: 150px;
  height: auto;
  position: absolute;
  left: 190px;
  top: 40px;
  background-color: white;
  z-index: -1;
  opacity: 1;
  display: flex;
  flex-direction: column;
  justify-content: center;
}
#右侧拉出栏2{
  width: 150px;
  height: auto;
  position: absolute;
  left: 190px;
  top: 97px;
  background-color: white;
  z-index: -1;
  opacity: 1;
  display: flex;
  flex-direction: column;
  justify-content: center;
}
#右侧拉出栏3{
  width: 150px;
  height: auto;
  position: absolute;
  left: 190px;
  top: 154px;
  background-color: white;
  z-index: -1;
  opacity: 1;
  display: flex;
  flex-direction: column;
  justify-content: center;
}
#右侧拉出栏4{
  width: 150px;
  height: auto;
  position: absolute;
  left: 190px;
  top: 211px;
  background-color: white;
  z-index: -1;
  opacity: 1;
  display: flex;
  flex-direction: column;
  justify-content: center;
}
#右侧拉出栏5{
  width: 150px;
  height: auto;
  position: absolute;
  left: 190px;
  top: 268px;
  background-color: white;
  z-index: -1;
  opacity: 1;
  display: flex;
  flex-direction: column;
  justify-content: center;
}
.el-carousel__item h3 {
  width:100%;
  font-size: 14px;
  opacity: 1;
  line-height: 150px;
  margin: 0;
}
.h3img{
  width: 100%;
  height: 100%;
}
.el-carousel__indicators {
  display: flex;
  flex-direction: row;
  justify-content: center;
}
#中部走马灯{
  width:1000px;
}
#右侧头条广告
{
  width: 200px;
  height: 396px;
  background-color: white;
  border-color: white;
  border-top-color: #57b25b ;
  border-top-width: 3px;
  border-style: solid;
}
#头条内容 p{
  font-size:10px;
  color: black;
  font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
}
#头条内容 a{
  color: black;
}
#右侧广告{
  position: relative;
  top:-4px;
}

/* ---------------------------------插图 */
/* ----------------------------------------插图 */

#展示块文字上{
  color: #000000;
  font-size: 25px;
  padding-bottom: 5px;
  margin-bottom: 0px;
}
#展示块文字下{
  color: #000000;
  font-size: 15px;
  margin-top: 0px;
}
#下侧展示块{
  display: flex;
  flex-direction: row;
  margin-right: 20px;
}
#展示区下侧
{
  margin-top: 30px;
  display: flex;
  flex-direction: row;
}
#展示块图片
{
  margin-right: 10px;
}

/*推荐区样式*/

#推荐区{
  background: url('https://static.360buyimg.com/mtd/pc/fresh_v3/1.0.0/home/images/fresh_unique_bg.jpg') ;
  background-repeat: no-repeat;
  display: flex;
  flex-direction: column;
  align-items: center;
}
#推荐区 #标题栏{
  background: url('https://static.360buyimg.com/mtd/pc/fresh_v3/1.0.0/home/images/fresh_mod_head_bg.png');
  height:200px;
  width :1200px;
  background-repeat: no-repeat;
  background-position:50% 50% ;
  text-align: center;
  display: flex;
  flex-direction: column;
  justify-content: center;
  color: #fafafa;
}
#标题栏 p{
  margin-bottom: 0px;
}
#推荐区导航栏
{
  border-style: none;
  display: flex;
  flex-direction: column;
  align-items: center;
  margin-top: -30px;
}
.el-tabs__nav-wrap::after{
  height: 0px!important;
}
.el-tabs__nav-scroll{
  display: flex;
  justify-content: center;
}
.el-tabs__item{
  font-size: 20px!important;
}
#推荐区块{
  background: url('https://static.360buyimg.com/mtd/pc/fresh_v3/1.0.0/home/images/fresh_unique_top100_bg.jpg');
  background-repeat: no-repeat;
  width: 1200px;
  height: 700px;
  display: flex;
  flex-direction: row;
  justify-content: center;
}
#推荐商品区块{
  width: 850px;
  height: 400px;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
}
#推荐商品区
{
  width: 1100px;
  height: 350px;
  border-bottom-right-radius: 50px;
  display: flex;
  flex-direction: row;
  flex-wrap: wrap;
}
#展示模块 #标题{
  font-size: 26px;
  margin-bottom: 5px;
}
#展示模块 #装字盒, #展示模块2 #装字盒{
  font-size: 14px;
  border-style: solid;
  border-radius: 15px;
  border-color: white;
  color: white;
  width: auto;
  border-width: 1px;
  height: 25px;
  display: flex;
  flex-direction: row;
  align-items: center;
  margin-bottom: 9px;
  margin-right: 9px;
  flex-wrap: wrap;
}
#更多 #装字盒{
  font-size: 14px;
  border-style: solid;
  border-radius: 15px;
  border-color: white;
  color: white;
  width: auto;
  border-width: 1px;
  height: 30px;
  display: flex;
  flex-direction: row;
  align-items: center;
  margin-bottom: 9px;
  margin-right: 9px;
  flex-wrap: wrap;
  background-color: white;
}
#电子数码展区 #更多 a{
  color: rgb(67, 231, 67);
  font-size: 16px;
}
#衣帽鞋服展区 #更多 a{
  color: rgb(26, 140, 247);
  font-size: 16px;
}
#日用品展区 #更多 a{
  color: rgb(253, 137, 43);
  font-size: 16px;
}
#装字盒 a{
  color:white;
  padding-left: 13px;
  padding-right: 13px;
}
#选项{
  width: 160px;
  height: 117px;
}
#展示模块 #简述, #展示模块2 #简述{
  font-size: 16px;
  color: white;
  margin-bottom: 20px;
  padding-bottom: 10px;
}
#展示模块 #简述::after, #展示模块2 #简述::after{
  content: "";
  width: 59px;
  height: 4px;
  background: #fff;
}
#展示模块 #选项, #展示模块2 #选项{
  display: flex;
  flex-direction: row;
  flex-wrap: wrap;
}
#电子数码展区 #展示模块上部块1{
  background: url('https://img11.360buyimg.com/cms/jfs/t6868/56/1584301821/12315/9fe217a6/5982d8c6N279ff1cf.png');
}
#电子数码展区 #展示模块上部块2{
  background: url('https://m.360buyimg.com/babel/jfs/t1/182866/39/12765/118834/60e272d6Eb4edc8a4/31c588f19a67ee72.jpg');
}
#电子数码展区 #展示模块上部块3{
  background: url('https://m.360buyimg.com/babel/jfs/t1/181275/23/12244/115702/60dd9f28Ef918a957/84367afca68de929.png');
}
#衣帽鞋服展区 #展示模块上部块1{
  background: url('https://img11.360buyimg.com/cms/jfs/t6811/139/2080819948/8091/eca88413/59886313N1622b0f9.png');
}
#衣帽鞋服展区 #展示模块上部块2{
  background: url('https://m.360buyimg.com/babel/jfs/t1/182595/39/13051/51906/60e57325E444f9604/f595376916cdb3f5.jpg');
}
#衣帽鞋服展区 #展示模块上部块3{
  background: url('https://m.360buyimg.com/babel/jfs/t1/175620/29/18537/87097/60e53d05Ef6d7cc4d/9c08f9f947f47ce5.png');
}
#日用品展区 #展示模块上部块1{
  background: url('https://img11.360buyimg.com/cms/jfs/t7129/338/1166404786/8830/81357242/59886595Nc9fc959b.png');
}
#日用品展区 #展示模块上部块2{
  background: url('https://m.360buyimg.com/babel/jfs/t1/172283/25/17504/26971/60dd4d8aE104aa022/200d6f292c9e8bc3.jpg');
}
#日用品展区 #展示模块上部块3{
  background: url('https://m.360buyimg.com/babel/jfs/t1/188023/7/11394/126464/60de8b2aE69e8a7c9/5d7fd6971347f9e2.png');
}

#右拉菜单 a{
  color: rgb(99, 99, 99);
}

#小抬头 a{
  color: black;
  font-size: 20px;
}
#右拉菜单{
  display: flex;
  flex-direction: row;
  flex-wrap: wrap;
  margin-left: 20px;
  justify-content: flex-start;
}
/* ----------单个商品展示块------------------
                                    <div id="单个商品块">
                                        <div id="单个商品图片">
                                            <img>
                                        </div>
                                        <div id="单个商品名称">
                                            <p></p>
                                        </div>
                                        <div id="单个商品价格">
                                            <p></p>
                                        </div>
                                    </div> */
#单个商品块{
  width: 250px;
  height: 280px;
  display: flex;
  flex-direction: column;
}
#单个商品图片{
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  padding-top: 12px;
}
#单个商品名称 p{
  padding-left: 20px;
  padding-right: 20px;
  height: 50px;
  overflow: hidden;
  line-height: 25px;
  font-size: 20px;
  margin-bottom: 0px;
}
#单个商品价格 p{
  font-size: 25px;
  color: orange;
  padding-left: 20px;
  padding-right: 20px;
}
#单个商品价格{
  display: flex;
  flex-direction: row;
  align-items: center;
  margin-top: -30px;
}
#销量 p{
  color: #5e5f61!important;
  font-size: 20px;
}
</style>
