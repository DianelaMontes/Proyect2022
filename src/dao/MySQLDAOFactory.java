package dao;

import interfaces.PoliciaDAO;

public class MySQLDAOFactory extends DAOFactory {

	@Override
	public PoliciaDAO getPolicia() {
		
		return new MySQLPoliciaDAO();


	}

}
