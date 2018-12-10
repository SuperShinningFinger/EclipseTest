<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<div class="clear teacher" style="background:url(statics/images/bg_logo.png) no-repeat center; border:groove #49C42B 3px; border-radius:20px;margin:0 auto;">
    <ul>
    <c:forEach items="${teachers}" var="t" varStatus="s">
        <li><a href="TeacherDisplay?id=${t.id }"><img src="${t.photo }" alt=""> <span>${t.name } ${t.title }</span></a></li>
	</c:forEach>
    </ul>
</div>