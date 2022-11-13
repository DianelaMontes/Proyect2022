package dao;

import interfaces.PoliciaDAO;

public abstract class DAOFactory {
	
	public static final int MYSQL = 1;	

	// Trae tantas interfaces como tengas
	public abstract PoliciaDAO getPolicia();
	
	public static DAOFactory getDAOFactory(int whichFactory) {
		switch(whichFactory) {
			case MYSQL:
				return new MySQLDAOFactory();
		
		}
		return null;
	}

}
