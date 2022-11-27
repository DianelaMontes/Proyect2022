package service;

import java.util.List;

import beans.DenunciaDTO;
import dao.DAOFactory;
import interfaces.DenunciaDAO;
import utils.Constantes;

public class DenunciaService {

	DAOFactory fabrica = DAOFactory.getDAOFactory(Constantes.ORIGEN_DE_DATOS_MYSQL);
	DenunciaDAO objAgr = fabrica.getDenuncia();
	
	public List<DenunciaDTO> listarDenuncia(){
		 return objAgr.listarDenuncias();
	}
	
	public int registrarDenuncia(DenunciaDTO obj) {
				return objAgr.registrarDenuncia(obj);
	}
			
}
