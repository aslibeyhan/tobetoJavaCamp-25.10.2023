package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements IProductDao{
	//bu katmana sadece db erişim kodları yazılır SQL.
	//interface onu impelemente eden sınıfın referansını tutabilir
	public void add(Product product) {
		System.out.println("JDBC ile veritabanına eklendi");
		
	}

}
