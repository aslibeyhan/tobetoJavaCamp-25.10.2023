package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public interface IProductDao {
	// interfaceler sadece metod imzası barındırabilir
	//birbirinin altenatifi durumlarda interface kullanılır.
	void add(Product product);

}
