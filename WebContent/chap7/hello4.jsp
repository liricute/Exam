<%--教科書P109 LIST 07-06 --%>

<%@page contentType="text/html; charset=UTF-8" %>

<%--カレントディレクトリはJSPのフォルダ(URL)になる --%>
<%@include file="../header.html" %>


<%--メッセージ出力--%>
<p>Hello</p>
<p>includeを利用しています。</p>


<p><%out.print(new java.util.Date()); %></p>
<%@include file="../footer.html"%>
