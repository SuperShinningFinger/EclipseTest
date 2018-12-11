<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!--轮播开始-->

	<div class="wrapper">
		<div id="focus">
	  <ul>
			<c:forEach items="${newses }" var="news" varStatus="t">
				<li><a href="NewsDetailDisplay?id=${news.id }" target="_blank"><img src="statics/images/banner/banner${t.count }.jpg" alt="新闻轮播1" /></a></li>
			</c:forEach>	
	  </ul>
		</div><!--focus end-->
	
	</div><!-- wrapper end -->


<!--轮播结束-->

<script type="text/javascript" src="statics/js/banner.js"></script>