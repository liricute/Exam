<%@page contentType="text/html; charset=UTF-8" %><%--カレントディレクトリはJSPのフォルダ(URL)になる --%>
<%@include file="../header.html" %>

<%! int countA=0; %>
<%

//スクリプトレット内で定義される変更
//JSPが実行している間だけ有効
int countB=0;
countA++;
countB++;
%>
<p>宣言によるcountAは<%=countA %></p>
<p>スクリプトレット内の変数countBは<%=countB %></p>
<%@include file="../footer.html"%>