package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDAO();
		
		System.out.println("=== Test 1 Seller ByFindAll id ===");
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
	}
}
