<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<div style="border:solid 1px #ddd; border-radius:20px;width:71.5em; margin:0 auto; background:url(statics/images/bg_logo.png) no-repeat center;" >
  <div style="height:30px;"></div>
  <div id="page-wrapper" > 
    <!-- Main -->
    <section id="main" style="background:url(statics/images/bg_logo.png) no-repeat center; ">
      <div class="container">
      <table>
          <ul>
            <tr>
      		<c:forEach items="${newses }" var="news" varStatus="s">
              <td style="width:35em">
	              <li class="title" style="overflow : hidden;text-overflow:ellipsis;white-space: nowrap;">
	                <article class="excerpt excerpt-first">
	                  <div class="titleright"> <b><a class="gotoArchive" href="NewsDetailDisplay?id=${news.id }" title="${news.title }">${news.title }</a></b> </div>
	                  <div class="titleleft"> <span class="datetime">${news.date }</span> </div>
	                </article>
	              </li>
              </td>
              <c:if test="${s.count % 2 == 0}">
					</tr>
					<tr>
			   </c:if>
			</c:forEach>
            </tr>
          </ul>
      </table>
      </div>
    </section>
  </div>
  <div style="height:30px;"></div>
</div>