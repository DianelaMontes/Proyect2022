package interfaces;

import java.util.List;


import beans.DenunciaDTO;

public interface DenunciaDAO {
	
	public List<DenunciaDTO> listarDenuncias();
	public int registrarDenuncia(DenunciaDTO obj);

}
