package chap6;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tool.Page;


@WebServlet(urlPatterns={"/chapt6/select"})
public class select extends HttpServlet {
	public void doPost(HttpServletRequest request,HttpServletResponse reponse)
			throws ServletException,IOException{
		reponse.setContentType("text/html;charset=UTF-8");
		PrintWriter out=reponse.getWriter();

		request.setCharacterEncoding("UTF-8");
		String count=request.getParameter("count");
		String payment=request.getParameter("payment");
		String review=request.getParameter("review");
		String mail=request.getParameter("mail");

		Page.header(out);
		out.println("<p>"+count+"個ぼ商品をカートに設定しました</p>");
		out.println("<p>お支払い方法を"+payment+"に設定しました。</p>");
		out.println("<p>ご感想ありがとうございます。</p>");
		out.println("<p>["+review+"</p>");

		if(mail!=null){
			out.println("<p>メールは送りました。</p>");

		}else{
			out.println("<p>メールは送りません。</p>");

	    }
		Page.footer(out);

	}

}
