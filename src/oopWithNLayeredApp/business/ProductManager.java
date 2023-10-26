package oopWithNLayeredApp.business;

import java.util.List;

import oopWithNLayeredApp.core.logging.ILogger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.IProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	 // domain -- iş kuralları businessa yazılır.
	 // entities --- yardımcı katman
	
	//loosely coupled ---> gevşek bağlılık
	private IProductDao productDao;
	private ILogger[] loggers;
	
	
	public ProductManager(IProductDao productDao,ILogger[] loggers) {
		super();
		this.productDao = productDao;
		this.loggers=loggers;
	}

	public void add(Product product) throws Exception {  // response request pattern
		if(product.getUnitPrice()<10) {
			throw new Exception("Ürün fiyatı 10 tl den küçük olamaz");
		}
		
		// iş kurallarını sağladığı için db ye bağlandık.
		//******Bir katman başka bir katmanın clasını kullanıyorken sadeece interfacesinden erişmelidir.
		//IProductDao productDao=new HibernateProductDao();
		productDao.add(product);
		for (ILogger iLogger : loggers) {
			iLogger.log(product.getName());
		}
		
		
		
		
	}

}
