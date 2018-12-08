<%@ page pageEncoding="UTF-8"%>
        <div class="login-box">
            <div class="wrap display">
    				<h4 style="font-size:20px; text-align:center; font-weight:bold;margin:10px;">后台管理</h4>
                <div class="login-box-cen" style="width:20em">
					<br /><br />
					<form action="LoginDisplay" method="post">
                    <div class="login-box-cen-form clearfix mar-bottom20">
                        <input type="text" class="login-box-cen-form-input w218" placeholder="请输入账号" name="user_name" />
                        <label class="err err-top40" id="login_phone_text">账号错误</label>
                    </div>
                    <div class="login-box-cen-form clearfix mar-bottom20">
                        <input type="text" class="login-box-cen-form-input w218" placeholder="请输入密码" name="password" />
                        <label class="err err-top40" id="login_password_text">请输入密码</label>
                    </div>
                    <div class="login-box-cen-form clearfix">
                        <input type="submit" value="登录" class="login-box-cen-form-button w238" id="login_submit" style="padding:0px 0px 0px 0px;"/>
                    </div>
                    </form>
                </div>
            </div>
        </div>    
    <script type="text/javascript" src="statics/js/jquery-1.11.0.js"></script>  
    <script type="text/javascript" src="statics/js/tbdValidate.js"></script>  
	<script type="text/javascript" src="statics/js/login.js"></script>