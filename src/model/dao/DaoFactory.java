package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
/**responsavel por implementar os daos,
	com operações estaticas para implementar os daos
**/	
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
	
}

