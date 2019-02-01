package application;


import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		/*Department obj = new Department(1, "Books");
		Seller seller = new Seller(1, "Bob Brown", "bob@gmail.com", new Date(), 3000.0, obj);
		System.out.println(seller);*/
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("===== TEST 1: seller findById =====");
		Seller seller =  sellerDao.findById(2);		
		System.out.println(seller);
		
		System.out.println("===== TEST 2: seller findByDepartment =====");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("===== TEST 3: seller findAll =====");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("===== TEST 4: seller insert =====");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4600.0, new Department(1, null));
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		
	}

}
