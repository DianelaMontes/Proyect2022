package interfaces;

import java.util.List;

import beans.AgresorDTO;

public interface AgresorDAO {
	
	public List<AgresorDTO>listarAgresores();
	public AgresorDTO buscarAgresor(String dni );
	public int registrarAgresor(AgresorDTO obj);
	public int actualizarAgresor(AgresorDTO obj);
	public int eliminarAgresor(int dni);
	
}
