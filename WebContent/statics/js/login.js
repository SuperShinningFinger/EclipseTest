// JavaScript Document
$(function(){
			//demo1
			var regconfig=[
					{eleinput:"login_phone",eletext:"login_phone_text",rule:[{reg:/^.+$/,text:"账号不能为空"}]},
					{eleinput:"login_password",eletext:"login_password_text",rule:[{reg:/^.+$/,text:"密码不能为空"}]}
				];
			tbdValidate(
				regconfig,
				{
					elesubmit:"login_submit",//提交按钮
					funsubmit:function(){//验证通过可提交回调				
						//信息提交接口
						alert("成功");				
					},
					funerr:function(){//不可提交回调
						
					},
                    funerrlist:function(errlist){
                        $('#'+ errlist[0]).focus();
                    }	
				}
			);	
			//end
			//demo2
			var regconfig=[
					{eleinput:"reg_info_company",eletext:"reg_info_company_text",rule:[{reg:/^.+$/,text:"新闻标题不能为空"},{reg:/^.{1,20}$/,text:"新闻标题不超过20个字"}]}
				];
			tbdValidate(
				regconfig,
				{
					elesubmit:"reg_info_submit",//提交按钮
					funsubmit:function(){//验证通过可提交回调
						if($("#reg_info_file_base64").attr("src")){
							$("#reg_info_file_text").hide();
						}else{
							$("#reg_info_file_text").html('请上传名片').show();
							return false;
						};	
						//信息提交接口
						alert("成功");			
					},
					funerr:function(){//不可提交回调
						if($("#reg_info_file_base64").attr("src")){
							$("#reg_info_file_text").hide();
						}else{
							$("#reg_info_file_text").html('请上传名片').show();
							return false;
						};	
					},
                    funerrlist:function(errlist){
                        $('#'+ errlist[0]).focus();
                    }	
				}
			);
			
			var noregconfig=[
					{eleinput:"reg_info_www",eletext:"reg_info_www_text",rule:[{reg:/(^(((^https?:(?:\/\/)?)(?:[-;:&=\+\$,\w]+@)?[A-Za-z0-9.-]+|(?:www.|[-;:&=\+\$,\w]+@)[A-Za-z0-9.-]+)((?:\/[\+~%\/.\w-_]*)?\??(?:[-\+=&;%@.\w_]*)#?(?:[\w]*))?)$)|(^$)/,text:"请输入正确的网址"}]},
					{eleinput:"reg_info_address",eletext:"reg_info_address_text",rule:[{reg:/^.{0,40}$/,text:"公司所在地址，不超过40个字"}]},
					{eleinput:"reg_info_textarea",eletext:"reg_info_textarea_text",rule:[{reg:/^.{0,200}$/,text:"简介不超过200个字"}]}
				];
			tbdnoValidate(noregconfig);
			//end
			//demo3
			//获取短信验证码
			var mesdong=null;
			var mestime=60;
			$("#reg_mescode_btn").click(function(){	
				var phoneval=$.trim($("#reg_phone").val());
				if(regconfig[0].rule[0].reg.test(phoneval)){
					$("#reg_phone_text").hide();				
				}else{			
					$("#reg_phone_text").html(regconfig[0].rule[0].text).show();
					$("#reg_phone").focus();
					return false
				};
				if(regconfig[0].rule[1].reg.test(phoneval)){
					$("#reg_phone_text").hide();				
				}else{
					$("#reg_phone").focus();
					$("#reg_phone_text").html(regconfig[0].rule[1].text).show();
					return false
				};
				if($(this).attr('able')=="able"){//发送
					$(this).attr('able',"disable");
					$(this).css('cursor','not-allowed');
					$(this).html(mestime+"s");
					mesdong=setInterval(function(){//倒计时
						mestime-=1;
						if(mestime<0){
							$("#reg_mescode_btn").attr('able',"able");
							$("#reg_mescode_btn").css('cursor','pointer');
							$("#reg_mescode_btn").html('获取验证码');
							mestime=60;
							clearInterval(mesdong);
						}else{
							$("#reg_mescode_btn").html(mestime+"s");			
						};
					},1000);
					//短信发送接口
					
				}else{
					
				};
			});	
			//注册 
			var regconfig=[
					{eleinput:"reg_phone",eletext:"reg_phone_text",rule:[{reg:/^.+$/,text:'账号不能为空'},{reg:/^1[34578]\d{9}$/,text:'账号格式错误'}]},
					{eleinput:"reg_password",eletext:"reg_password_text",rule:[{reg:/^.+$/,text:'密码不能为空'},{reg:/^.{6,10}$/,text:'密码在6-10位之间'}]},
					{eleinput:"reg_mescode",eletext:"reg_mescode_text",rule:[{reg:/^.+$/,text:'短信验证码不能为空'},{reg:/^[0-9]{6}$/,text:'输入6位短信验证码'}]}
				];
			tbdValidate(
				regconfig,
				{
					elesubmit:"reg_submit",//提交按钮
					funsubmit:function(){//验证通过可提交回调	
						//信息提交接口
						alert("成功");				
					},
					funerr:function(){//不可提交回调
	
					},
                    funerrlist:function(errlist){
                        $('#'+ errlist[0]).focus();
                    }	
				}
			);	
			//end	
		});