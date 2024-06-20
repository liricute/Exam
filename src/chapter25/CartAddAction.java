package chapter25;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Item;
import bean.Product;
import tool.Action;

public class CartAddAction extends Action {

	@SuppressWarnings("unchecked")
	public String execute(
		HttpServletRequest request, HttpServletResponse response
	) throws Exception {

		HttpSession session=request.getSession();
		
		

		//doGetメソッドを呼び出しや際に引数に設定した値(id）をｉｎｔ型で取得
		//”Integer.parseInt()"を使ってString型をint型に変換
		int id=Integer.parseInt(request.getParameter("id"));
		
		//Item(been)型のリストでセッションのカート情報を取得
		List<Item> cart=(List<Item>)session.getAttribute("cart");
		
		//cartの中身があるか確認(nulチェック)
		if (cart==null) {
			//cartがnullの場合car変数を定義
			cart=new ArrayList<Item>();
			//セッションにcart変数を作成
			session.setAttribute("cart", cart);
		}
		//ループを使ってcarの中身を分解して取得
		
		

		for (Item i : cart) {
			//カートの中に同じ商品が入っていないかを確認
			//主キー項目IDを比較して同じ場合にカート中に同じ商品がある
			if (i.getProduct().getId()==id) {
				//"i.getCount()"カート中の商品毎の個数の取得
				//"i.setCount()"カート中の商品毎の個数の取得
				i.setCount(i.getCount()+1);
				return "cart.jsp";
			}
		}
		// <%--product( bean)のimageフィールドを表示--%>
		
		List<Product> list=(List<Product>)session.getAttribute("list");
		for (Product p : list) {
			if (p.getId()==id) {
				Item i=new Item();
				i.setProduct(p);
				i.setCount(1);
				cart.add(i);
			}
		}
		// <%--product( bean)のpriceフィールドを表示--%>

		return "cart.jsp";
	}
}
