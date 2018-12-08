<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<div class="display">
<div style="width:68em; margin:0 auto;">
  <a href="LogoutServlet">&lt;登出</a>
  <div id="content-main">
    <ul class="object-tools">
      <li>
      <form action="SearchNewsServlet" method="get">
      	  <input type="search" name="search" style="margin:5px 0px 0px 0px;height:40px;vertical-align: bottom;"/> 
      	  <input type="submit" value="搜索" style="height:40px;margin:0 20px 0px 0px;vertical-align: bottom;"/>
      </form>
      </li>
      <li> <a href="AddNewsDisplay" class="addlink"> 增加新闻</a> </li>
    </ul>
    <div class="module" id="changelist">
        <div class="results">
          <table id="result_list">
            <thead>
              <tr>
                <th scope="col" class="sortable column-title"> <div class="text"><a href="">标题</a></div>
                  <div class="clear"></div>
                </th>
                <th scope="col" class="sortable column-author"> <div class="text"><a href="">作者</a></div>
                  <div class="clear"></div>
                </th>
                <th scope="col" class="sortable column-date"> <div class="text"><a href="">时间</a></div>
                  <div class="clear"></div>
                </th>
                <th scope="col" class="action-checkbox-column" width="80px"> <div class="text"><a>删除</a></div>
                  <div class="clear"></div>
                </th>
              </tr>
            </thead>
            <tbody>
      		<c:forEach items="${newses }" var="news" varStatus="s">
              <c:if test="${s.count % 2 != 0 }">
              	<tr class="row1">
			  </c:if>
			  <c:if test="${s.count % 2 == 0 }">
              	<tr class="row2">
			  </c:if>
                <th class="field-title"><a href="ModifyNewsDisplay?id=${news.id }">${news.title }</a></th>
                <td class="field-author">${news.author }</td>
                <td class="field-date">${news.date }</td>
                <td class="delete_button"><a href="DeleteNewsServlet?id=${news.id }" style="display:block; width:32px; height:32px;"></a></td>
              </tr>
            </c:forEach>
            </tbody>
          </table>
        </div>
    </div>
  </div>
</div>
</div>