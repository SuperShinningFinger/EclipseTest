<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>东北林业大学软件工程 - ${position }</title>
<link rel="stylesheet" type="text/css" href="statics/css/footer.css" />
<link rel="stylesheet" type="text/css" href="statics/css/top_nav.css" />
<link rel="stylesheet" type="text/css" href="statics/css/index.css" />
<link rel="stylesheet" type="text/css" href="statics/css/display.css" />
<link rel="stylesheet" type="text/css" href="statics/css/detail.css" />
<link rel="icon" href="statics/images/icon.ico" type="image/x-icon"/>
</head>
<body>
  <%@include file="/WEB-INF/jsp/top_nav.jsp"%>
  <%@include file="/WEB-INF/jsp/info_bg.jsp"%>
  <%@include file="/WEB-INF/jsp/bread.jsp"%>
  <jsp:include page="/WEB-INF/jsp/${select }"></jsp:include>
  <%@include file="/WEB-INF/jsp/footer.jsp"%>
</body>
</html>