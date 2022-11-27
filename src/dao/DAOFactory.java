package dao;

import interfaces.AgresorDAO;
import interfaces.PoliciaDAO;

public abstract class DAOFactory {
	
	public static final int MYSQL = 1;	

	// Trae tantas interfaces como tengas
	public abstract PoliciaDAO getPolicia();
	public abstract AgresorDAO getAgresor();
	
	public static DAOFactory getDAOFactory(int whichFactory) {
		switch(whichFactory) {
			case MYSQL:
				return new MySQLDAOFactory();
		
		}
		return null;
	}

}
