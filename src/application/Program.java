package application;

import java.util.Date;

import db.DB;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		/*Department obj = new Department(1, "Books");
		Seller seller = new Seller(1, "Bob Brown", "bob@gmail.com", new Date(), 3000.0, obj);
		System.out.println(seller);*/
		
		System.out.println("===== TEST 1: seller findById =====");
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller =  sellerDao.findById(2);		
		System.out.println(seller);
	}

}
