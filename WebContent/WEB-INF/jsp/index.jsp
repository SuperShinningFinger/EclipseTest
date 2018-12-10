<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>东北林业大学信息学院软件工程 - ${position }</title>
<link rel="stylesheet" type="text/css" href="statics/css/footer.css" />
<link rel="stylesheet" type="text/css" href="statics/css/top_nav.css" />
<link rel="stylesheet" type="text/css" href="statics/css/banner.css" />
<link rel="stylesheet" type="text/css" href="statics/css/index.css" />
<link rel="icon" href="statics/images/icon.ico" type="image/x-icon"/>
</head>
<body>
  <%@include file="/WEB-INF/jsp/top_nav.jsp"%>
  <%@include file="/WEB-INF/jsp/banner.jsp"%>

		<div id="page-wrapper">
			<!-- Main -->
				<section id="main" style="background:url(statics/images/bg_logo.png) no-repeat center; ">
					<div class="container">
						<div class="row">

							<!-- Sidebar -->
								<div id="sidebar" class="col-4 col-12-medium">

									<!-- Excerpts -->
										<section>
											<ul class="divided">
											<c:forEach items="${newses }" var="news">
												<li>
													<!-- Excerpt -->
														<article class="box excerpt">
															<header>
																<span class="date" style="margin: 0 0 2.5em 0;">${news.date }</span>
																<h3><a href="NewsDetailDisplay?id=${news.id }">${news.title }</a></h3>
															</header>
															<p>${news.content }...</p>
														</article>
														<a href="NewsDetailDisplay?id=${news.id }" class="button">更多</a>
											  </li>
											</c:forEach>
											</ul>
										</section>

								</div>

							<!-- Content -->
								<div id="content" class="col-8 col-12-medium imp-medium">
									<jsp:include page="/WEB-INF/jsp/${select }"></jsp:include>
								</div>

						</div>
					</div>
				</section>

		</div>
        

			<script src="statics/js/jquery-1.11.0.js"></script>
			<script src="statics/js/jquery.dropotron.min.js"></script>
			<script src="statics/js/browser.min.js"></script>
			<script src="statics/js/breakpoints.min.js"></script>
			<script src="statics/js/util.js"></script>
			<script src="statics/js/main.js"></script>
  <%@include file="/WEB-INF/jsp/footer.jsp"%>
</body>
</html>