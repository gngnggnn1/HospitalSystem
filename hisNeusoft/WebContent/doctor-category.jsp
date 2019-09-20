<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ page import="java.util.*" %>
<%@ page import="java.sql.*" %>

<!--_meta 作为公共模版分离出去-->
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="Bookmark" href="/favicon.ico" >
<link rel="Shortcut Icon" href="/favicon.ico" />
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5shiv.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<![endif]-->
<link rel="stylesheet" type="text/css" href="static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css" href="lib/Hui-iconfont/1.0.8/iconfont.css" />
<link rel="stylesheet" type="text/css" href="static/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/style.css" />
<!--[if IE 6]>
<script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<!--/meta 作为公共模版分离出去-->

<title>医生诊疗</title>
<meta name="keywords" content="">
<meta name="description" content="">
</head>
<body>
<article class="page-container">
	<form action="treatServlet" method="post" class="form form-horizontal" id="form-member-add">
		
			<div class="row cl">
			<label class="form-label col-xs-1 col-sm-1"><span class="c-red">*</span> 病人：</label>
			<div class="formControls col-xs-2 col-sm-2">
				<span class="select-box"><select class="select" name = "registID">
				<%
				    ArrayList<String> patientList = new ArrayList<String>();
					Connection conn = null;
					ResultSet rs = null;
					Statement st = null;
					String sql = "select registID, patientName from regist where seenDoctor = 0";
					Class.forName("com.mysql.cj.jdbc.Driver");
					conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT%2B8&useSSL=false","root","gn131313");
					st = conn.createStatement();
					try{
						rs = st.executeQuery(sql);
						while(rs.next()){
							patientList.add(rs.getInt("registID")+ "--" + rs.getString("patientName"));// + "--" + rs.getString("deptName")
						}
					}
					catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					finally {
						
						try {
							if(st != null) {
								st.close();
							}
							
							if(rs != null) {
								rs.close();
							}
							
							if(conn != null) {
								conn.close();
							}
						} 
						catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
				%>
				<% for(int i = 0; i != patientList.size(); i++) {%>	
					
					<option><%= patientList.get(i) %><option>
					
				<%} %>
				
				</select></span>
			</div>
		</div>	
		
		<div class="row cl">
		
			<label class="form-label col-xs-1 col-sm-1"><span class="c-red">*</span>主诉：</label>
			<div class="formControls col-xs-1 col-sm-5">
				<input type="text" class="input-text" value="" placeholder="" name="actionInChief">
			</div>
			
		</div>
		
		<div class="row cl">
		
			<label class="form-label col-xs-1 col-sm-1"><span class="c-red">*</span>现病史：</label>
			<div class="formControls col-xs-1 col-sm-5">
				<input type="text" class="input-text" value="" placeholder="" name="presentSickHistory">
			</div>
			
		</div>
		
		<div class="row cl">
		
			<label class="form-label col-xs-1 col-sm-1"><span class="c-red">*</span>现病治疗情况：</label>
			<div class="formControls col-xs-1 col-sm-5">
				<input type="text" class="input-text" value="" placeholder="" name="presentSickTreatment">
			</div>
			
		</div>
		
		<div class="row cl">
		
			<label class="form-label col-xs-1 col-sm-1"><span class="c-red">*</span>既往病史：</label>
			<div class="formControls col-xs-1 col-sm-5">
				<input type="text" class="input-text" value="" placeholder="" name="previousHistory">
			</div>
			
		</div>
		
		<div class="row cl">
		
			<label class="form-label col-xs-1 col-sm-1"><span class="c-red">*</span>过敏史：</label>
			<div class="formControls col-xs-1 col-sm-5">
				<input type="text" class="input-text" value="" placeholder="" name="allergicHistory">
			</div>
			
		</div>
		
		<div class="row cl">
		
			<label class="form-label col-xs-1 col-sm-1"><span class="c-red">*</span>体格检查：</label>
			<div class="formControls col-xs-1 col-sm-5">
				<input type="text" class="input-text" value="" placeholder="" name="physicalExam">
			</div>
			
		</div>
		
		<div class="row cl">
		
			<label class="form-label col-xs-1 col-sm-1"><span class="c-red">*</span>建议：</label>
			<div class="formControls col-xs-1 col-sm-5">
				<input type="text" class="input-text" value="" placeholder="" name="advice">
			</div>
			
		</div>
		
		<div class="row cl">
		
			<label class="form-label col-xs-1 col-sm-1"><span class="c-red">*</span>注意事项：</label>
			<div class="formControls col-xs-1 col-sm-5">
				<input type="text" class="input-text" value="" placeholder="" name="notice">
			</div>
			
		</div>
		
		<div class="row cl">
		
			<label class="form-label col-xs-1 col-sm-1"><span class="c-red">*</span>诊断结果：</label>
			<div class="formControls col-xs-1 col-sm-5">
				<input type="text" class="input-text" value="" placeholder="" name="sickResult">
			</div>
			
		</div>
		
		<div class="row cl">
			<div class="formControls col-xs-2 col-sm-2">
				<input class="btn btn-primary radius" type="submit" value="&nbsp;&nbsp;提交病历&nbsp;&nbsp;"onclick = "succeed()">
			</div>
			<div class="formControls col-xs-2 col-sm-2">
				<input class="btn btn-primary radius" type="reset" value="&nbsp;&nbsp;清空&nbsp;&nbsp;" onclick = "succeed()">
			</div>
		</div>
			
	</form>
</article>

<script language = javascript>
function succeed(){
	alert("操作成功!");
}
</script>

<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>