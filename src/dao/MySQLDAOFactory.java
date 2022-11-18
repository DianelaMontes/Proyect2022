package dao;

import interfaces.AgresorDAO;
import interfaces.PoliciaDAO;

public class MySQLDAOFactory extends DAOFactory {

	@Override
	public PoliciaDAO getPolicia() {
		
		return new MySQLPoliciaDAO();


	}

	@Override
	public AgresorDAO getAgresor() {
		// TODO Auto-generated method stub
		return new MySQLAgresorDAO();
	}

}
