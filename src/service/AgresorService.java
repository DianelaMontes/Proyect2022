package service;

import dao.DAOFactory;

import java.util.List;

import beans.AgresorDTO;
import interfaces.AgresorDAO;
import utils.Constantes;

public class AgresorService {
	
	
	DAOFactory fabrica = DAOFactory.getDAOFactory(Constantes.ORIGEN_DE_DATOS_MYSQL);
	AgresorDAO objAgr = fabrica.getAgresor();
	
	public List<AgresorDTO> listarAgresor(){
		 return objAgr.listarAgresores();
	}
	public AgresorDTO buscarAgresor(String dni) {
		return objAgr.buscarAgresor(dni);
	}
	
	public int registrarAgresor(AgresorDTO obj) {
		return objAgr.registrarAgresor(obj);
	}
	
	public int actualizarAgresor(AgresorDTO obj) {
		return objAgr.actualizarAgresor(obj);
	}
	
	public int eliminarAgresor(String dni) {
		return objAgr.eliminarAgresor(dni);
	}
	
	

}
