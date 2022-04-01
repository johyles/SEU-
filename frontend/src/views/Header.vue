<template>
  <div>
    <div class="空菜单栏"></div>
    <div class="顶部菜单栏">
      <el-menu mode="horizontal" background-color="#ff4401" router
               :default-active="this.$route.path">
        <el-menu-item index="/finalhome" style="color: seashell;font-size: 25px;">SEU首页</el-menu-item>
        <!--                 <el-menu-item index="/goodslist">商品列表页</el-menu-item> -->
        <el-menu-item index="/myorder"style="color: seashell;font-size: 17px">订单中心</el-menu-item>
        <el-menu-item index="/myinformation"style="color: seashell;font-size: 17px">个人中心</el-menu-item>
        <el-menu-item index="/myhippo"style="color: seashell;font-size: 17px">我的画像</el-menu-item>
        <el-menu-item index="/forumhome"style="color: seashell;font-size: 17px">SEU论坛</el-menu-item>
        <el-submenu index="4" class="用户头像">
          <template #title>
            <el-avatar :src="用户信息.avatar" size="medium"></el-avatar>
          </template>
          <el-menu-item index="/mymodifyinformation" class="展开菜单 头像展开菜单"style="color: seashell;font-size: 15px">个人信息管理</el-menu-item>
          <el-menu-item index="/login" class="展开菜单 头像展开菜单" @click.native="logout" style="color: seashell;font-size: 15px">退出登陆</el-menu-item>
        </el-submenu>
      </el-menu>
    </div>
  </div>
</template>

<script>
import axios from "axios";
export default {
    methods:{
        logout(){
            localStorage.removeItem('currentuser');
            this.$notify.success({
                title: '退出登陆成功',
                message: "请重新登陆",
                offset:50
            })
        }
    },
  data(){
    return{
      用户信息:{

      }
    }
  },
  created(){

    axios.defaults.headers.common.Authorization = JSON.parse(localStorage.currentuser).token
    axios.post('http://127.0.0.1:8080/api/user/information').then(resp=>{
      console.log(resp);
      this.用户信息=resp.data.data.user;
    })
    // alert('fuck');

  }
}
</script>

<style scoped>
    .展开菜单{
        text-align: center;
        z-index: 50000;
    }
    .用户头像{
        position:absolute;
        right: 10px;
        z-index: 50000;
    }
    .顶部菜单栏 {
        width: 100%;
        margin-left: 10px;
        z-index: 50000;
        position: fixed;
        height: 80px;
        top: 0;
    }
    .空菜单栏 {
        height: 65px;
        top: 0;
    }
</style>
