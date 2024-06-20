<%@page contentType="text/html; charset=UTF-8" %><%--カレントディレクトリはJSPのフォルダ(URL)になる --%>
<%@include file="../header.html" %>

<%!
int add(int a,int b){
	return a+b;
}
%>
<P>1+2=<%=add(1,2) %></P>
<P>3+4=<%=add(3,4) %></P>
<%@include file="../footer.html"%>