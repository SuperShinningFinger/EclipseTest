<%@ page pageEncoding="UTF-8"%>
	<div class="display">
		<a href="AdminDisplay" style="display:inline-block; margin-left:15px;">&lt;返回</a>
        	<div class="wrap" style="width:1000px;height:1000px; margin:0 auto;">
    				<h4 style="font-size:20px; text-align:center; font-weight:bold;margin:10px;">添加新闻</h4>
                <form action="AddNewsServlet" method="get">
                <div class="register-box-con2">     
                    <div class="register-box-con2-box clearfix mar-bottom20">
                    	<label class="register-box-con2-box-left"><em class="bitian">*</em>新闻标题</label>
                        <div class="register-box-con2-box-right">
                        	<input name="title" type="text" class="login-box-cen-form-input w358" placeholder="不超过20个字"  />
                        	<label id="reg_info_company_text"  class="err err-top40">标题不能超过20个字</label>
                        </div>
                    </div>
                    <div class="register-box-con2-box clearfix mar-bottom20">
                    	<label class="register-box-con2-box-left"><em class="bitian"></em>作者</label>
                        <div class="register-box-con2-box-right">
                        	<input name="author" type="text" class="login-box-cen-form-input w358" placeholder="请输入新闻作者"  />
                        </div>
                    </div>
                    <div class="register-box-con2-box clearfix mar-bottom20">
                    	<label class="register-box-con2-box-left"><em class="bitian"></em>时间</label>
                        <div class="register-box-con2-box-right">
                        	<input name="date" type="date" class="login-box-cen-form-input w358"  />
                        </div>
                    </div>
                    <div class="register-box-con2-box clearfix mar-bottom20">
                    	<label class="register-box-con2-box-left"><em class="bitian"></em>新闻内容</label>
                        <div class="register-box-con2-box-right">
                        	<textarea name="content" class="login-box-cen-form-textarea w358 h88" id="reg_info_textarea" placeholder="请输入新闻内容" style="height:500px;"></textarea>
                        </div>
                    </div>
                    
                    <div class="register-box-con2-box clearfix mar-bottom20 mar-top50">
                    	<label class="register-box-con2-box-left"></label>
                        <div class="register-box-con2-box-right">
                        	<input type="submit" value="提交" class="login-box-cen-form-button w380" id="reg_info_submit" />
                        </div>
                    </div>
                    
                </div>
                </form>
            </div>
            </div>
    <script type="text/javascript" src="statics/js/jquery-1.11.0.js"></script>  
    <script type="text/javascript" src="statics/js/tbdValidate.js"></script>  
	<script type="text/javascript" src="statics/js/login.js"></script>
