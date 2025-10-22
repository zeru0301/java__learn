package jp.co.internous.ecsite.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jp.co.internous.ecsite.dao.OrderHistoryDao;

/**
* 注文履歴機能を制御するコントローラークラス
* 注文履歴の登録、注文完了画面の表示を行う
*/
@Controller
public class OrderHistoryController {

	// orderHistoryDao という変数名で OrderHistoryDao インターフェースを利用するための宣言
	@Autowired
	private OrderHistoryDao oderHistoryDao;



	// 注文履歴テーブルに注文情報を登録し注文完了画面を表示する
	//】URL「http://localhost:8080/ecsite/order」とひもづけする
	@GetMapping("/ecsite/order")
	//パラメータとして送られてきた値 productId を引数「int productId」に、
	// orderCount を引数「int orderCount」に格納する	
	public ModelAndView registerOrder(@RequestParam("productId")int productId,
								 	  @RequestParam("orderCount")int orderCount,
								 	  ModelAndView mav) {
		
		//注文履歴テーブルに注文情報を登録する
		oderHistoryDao.insertOrderHistory(productId,orderCount);

		//レスポンスとして次に表示させるHTMLファイル名を指定す
		mav.setViewName("complete");
		
		return mav;
	}

}
