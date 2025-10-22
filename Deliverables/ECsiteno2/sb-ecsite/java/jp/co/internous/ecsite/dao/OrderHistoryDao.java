package jp.co.internous.ecsite.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 注文履歴情報にアクセスするためのDAO
 */
@Mapper
public interface OrderHistoryDao {


	// 注文情報を登録する
	@Insert("""
			INSERT INTO
			 order_history
			 (product_id,order_count,ordered_at)
			 VALUES
			 (#{productId},#{orderCount},NOW());
    			
            """)
	void insertOrderHistory(@Param("productId") int productId,
            				@Param("orderCount") int orderCount);
	

}
