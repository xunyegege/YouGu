<template>
    <div>

        <div class="Bott">
            <div class="wrapper clearfix">
                <div class="zuo fl">
                    <h3>
                        <a href="#"><img src="../static/img/tx.png"/></a>
                        <p class="clearfix"><span class="fl">[{{username}}]</span>
                            <span class="fr" @click="exit">[退出登录]</span></p>
                    </h3>
                    <div>


                        <ul>
<!--    //这边是路由-->

                            <li><router-link :to="{path:'/user/userOrder'}">我的订单</router-link> </li>
                            <li><router-link :to="{path:'/user/userCommand'}">评价晒单</router-link> </li>
                            <li><router-link :to="{path:'/user/userAddress'}">地址管理</router-link> </li>
                            <li><router-link :to="{path:'/user/userInfo'}">个人信息</router-link> </li>
                            <li><router-link :to="{path:'/user/changePassword'}">修改密码</router-link> </li>


                        </ul>
                    </div>
                </div>
                <div class="you fl">

<!--                    这边是出口-->
                    <router-view name="user"  ></router-view>
                </div>
            </div>
        </div>
        
    </div>
</template>

<script>
    export default {
        name: "User"
    }
</script>

<style scoped>
/*这个是个人中心页*/
</style>