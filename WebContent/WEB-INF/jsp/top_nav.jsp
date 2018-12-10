<%@ page pageEncoding="UTF-8"%>
<script src="statics/js/jquery-1.11.0.js" type="text/javascript"></script>
<script type="text/javascript">
	$(function(){
		$(".nav>li").hover(function(){
			$(this).children('ul').stop(true,true).show(300);
		},function(){
			$(this).children('ul').stop(true,true).hide(300);
		})
	})
</script>
<!--顶部栏-->
    <div class="top">
           <dl>
              <dt>欢迎来到东北林业大学软件工程网</dt>
              <dd><a href="LoginDisplay">后台管理</a></dd>
           </dl>
    </div>
<!--导航开始-->
	<div class="menu" align="center">
    	<img src="statics/images/logo.png" style="margin-top:5px;"/>
		<ul class="nav">
			<li><a href="IndexDisplay?select=1" style="background-color:#093001;">首页</a>
			</li>
			<li><a href="IndexDisplay?select=0">专业介绍</a>
				<ul class="sub-nav">
					<li><a href="IndexDisplay?select=1">专业简介</a></li>
					<li><a href="IndexDisplay?select=2">培养方案</a></li>
				</ul>
			</li>
			<li><a href="LabDisplay?select=0">实验室</a>
				<ul class="sub-nav">
					<li><a href="LabDisplay?select=1">923 创新实验室</a></li>
					<li><a href="LabDisplay?select=2">925 移动开发实验室</a></li>
					<li><a href="LabDisplay?select=3">923 实验室</a></li>
				</ul>
			</li>
			<li><a href="TeacherTotalServlet?title=all">师资力量</a>
				<ul class="sub-nav">
					<li><a href="TeacherTotalServlet?title=教授">教授</a></li>
					<li><a href="TeacherTotalServlet?title=副教授">副教授</a></li>
					<li><a href="TeacherTotalServlet?title=讲师">讲师</a></li>
				</ul>
			</li>
			<li><a href="ListNewsServlet">软件新闻</a></li>
			<li><a href="JobDisplay">就业指南</a></li>
		</ul>
	</div>
<!--导航结束-->