<%@ page pageEncoding="UTF-8"%>
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
              <h2 align="center">${news.title }</h2>
              <div class="s_xx">时间：${news.date }&nbsp;&nbsp;作者：${news.author }  </div>
            </header>
            <div  style="width:69em;margin:15px 0;">
            <div style="width:68.5em;margin:0 auto;padding:0.5em 0 0 1em;">
            <pre>${news.content }</pre>
            </div>
          </div>
          </article>
        </div>
      </div>
    </section>
  </div>
  <div style="height:30px;"></div>
</div>