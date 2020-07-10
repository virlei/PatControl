package model.dao;

import model.dao.impl.PatrimonioDaoJDBC;

public class DaoFactory {

	public static PatrimonioDao createPatrimonioDao() {
		return new PatrimonioDaoJDBC();
	}
}
