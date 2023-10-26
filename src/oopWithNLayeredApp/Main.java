package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.ILogger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		//arayüz işbirimi ile iletişim kurar veri tabanına gidemez
		Product product1=new Product(1,"MatebookD14",12000);
		ILogger[] loggers = {new DatabaseLogger(),new FileLogger(),new MailLogger()};
		
		ProductManager productManager=new ProductManager(new HibernateProductDao(),loggers);
		productManager.add(product1);

	}

}
