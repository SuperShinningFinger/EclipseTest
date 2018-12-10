<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<div class="display">
  <div style="height:30px;"></div>
  <div id="page-wrapper" > 
    <!-- Main -->
    <section id="main">
      <div class="container">
        <div id="content" > 
          
          <!-- Post -->
          <article class="box post">
            <header>
              <h2 align="center" style="margin: 0 0 1.5em 0;"><span><strong style="color:#389d1d">${teacher.name } ${teacher.title }</strong></span>相关介绍</h2>
            </header>
            <div align="center"><span class="image featured" style="width:192px;height:258px;"><img src="${teacher.photo }" alt="" /></span></div>
            <div style="width:68.5em;margin:0 auto;padding:0.5em 0 0 1em;">
            <pre>${teacher.content }</pre>
            </div>
          </article>
        </div>
      </div>
    </section>
  </div>
  <div style="height:30px;"></div>
</div>