<template>
    <div >
        <div class="my clearfix">
            <h2 class="fl">商品评价</h2>
        </div>
        <div class="dlist">
            <ul class="clearfix" id="pro">
                <li class="on"><a href="#2">待评价商品</a></li>
                <li><a href="#2">已评价商品</a></li>
                <li><a href="#2">评价失效商品</a></li>
            </ul>
        </div>
        <div class="sx clearfix">
            <div class="clearfix">
                <dl class="fl">
                    <dt><a href="#"><img src="../../static/img/nav3.jpg"/></a></dt>
                    <dd><a href="#">家用创意壁挂  釉下彩复古</a></dd>
                    <dd>¥199.00</dd>
                    <dd>16000人评价</dd>
                    <dd><a href="#2">评价</a></dd>
                </dl>
                <dl class="fl">
                    <dt><a href="#"><img src="../../static/img/nav3.jpg"/></a></dt>
                    <dd><a href="#">家用创意壁挂  釉下彩复古</a></dd>
                    <dd>¥199.00</dd>
                    <dd>16000人评价</dd>
                    <dd><a href="#2">评价</a></dd>
                </dl>
            </div>
            <div class="clearfix">
                <dl class="fl">
                    <dt><a href="#"><img src="../../static/img/nav3.jpg"/></a></dt>
                    <dd><a href="#">家用创意壁挂  釉下彩复古</a></dd>
                    <dd>¥199.00</dd>
                    <dd>16000人评价</dd>
                    <dd><a href="#2">查看评价</a></dd>
                </dl>
            </div>
            <div class="clearfix" >
                <dl class="fl">
                    <dt><a href="#"><img src="../../static/img/nav3.jpg"/></a></dt>
                    <dd><a href="#">家用创意壁挂  釉下彩复古</a></dd>
                    <dd>¥199.00</dd>
                    <dd>16000人评价</dd>
                    <dd><a href="#2">暂不能评价</a></dd>
                </dl>
            </div>
        </div>

        <!--遮罩-->
        <div class="mask"></div>
        <!--评价弹框-->
        <div class="pj">
            <div class="clearfix"><a href="#" class="fr gb"><img src="../../static/img/icon4.png"/></a></div>
            <h3>商品评分</h3>
            <form action="#" method="get">
                <div class="clearfix">
                    <p class="fl">请打分：</p>
                    <p class="fl" >
                        <a href="#2"><img src="../../static/img/xin.png"/></a>
                        <a href="#2"><img src="../../static/img/xin.png"/></a>
                        <a href="#2"><img src="../../static/img/xin.png"/></a>
                        <a href="#2"><img src="../../static/img/xin.png"/></a>
                        <a href="#2"><img src="../../static/img/xin.png"/></a>
                    </p>
                </div>
                <textarea name="" rows="" cols="" placeholder="请输入评价" ></textarea>
                <div class="bc">
                    <input type="button" value="保存"  />
                    <input type="button" value="取消" />
                </div>
            </form>
        </div>
        <!--查看评价-->
        <div class="chak">
            <div class="clearfix"><a href="#" class="fr gb"><img src="../../static/img/icon4.png"/></a></div>
            <h3>商品评分</h3>
            <form action="#" method="get">
                <div class="clearfix">
                    <p class="fl">请打分：</p>
                    <p class="fl" id="xin">
                        <a href="#2"><img src="../../static/img/hxin.png"/></a>
                        <a href="#2"><img src="../../static/img/hxin.png"/></a>
                        <a href="#2"><img src="../../static/img/hxin.png"/></a>
                        <a href="#2"><img src="../../static/img/hxin.png"/></a>
                        <a href="#2"><img src="../../static/img/hxin.png"/></a>
                    </p>
                </div>
                <textarea name="" rows="" cols="" placeholder="请输入评价" >挺好的挺好的挺好的~五分好评</textarea>
                <div class="bc">
                    <input type="button" value="保存"  />
                    <input type="button" value="取消" />
                </div>
            </form>
        </div>
    </div>
</template>

<script>
    export default {
        name: "userCommand"
    }
</script>

<style scoped>

</style>