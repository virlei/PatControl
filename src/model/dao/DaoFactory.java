package model.dao;

import db.DB;
import model.dao.impl.PatrimonioDaoJDBC;

public class DaoFactory {

	public static PatrimonioDao createPatrimonioDao() {
		return new PatrimonioDaoJDBC(DB.getConnection());
	}
}
