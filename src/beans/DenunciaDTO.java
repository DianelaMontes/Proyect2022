package beans;

import java.sql.Date;

public class DenunciaDTO {

	private String  numden;
	private String codcom;
	private String  coddel;
	private String descrip;
	private String codpol ;
	private String codagr;
	private String codvic;
	private Date fecha ;
	private int estado ;
	public String getNumden() {
		return numden;
	}
	public void setNumden(String numden) {
		this.numden = numden;
	}
	public String getCodcom() {
		return codcom;
	}
	public void setCodcom(String codcom) {
		this.codcom = codcom;
	}
	public String getCoddel() {
		return coddel;
	}
	public void setCoddel(String coddel) {
		this.coddel = coddel;
	}
	public String getDescrip() {
		return descrip;
	}
	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}
	public String getCodpol() {
		return codpol;
	}
	public void setCodpol(String codpol) {
		this.codpol = codpol;
	}
	public String getCodagr() {
		return codagr;
	}
	public void setCodagr(String codagr) {
		this.codagr = codagr;
	}
	public String getCodvic() {
		return codvic;
	}
	public void setCodvic(String codvic) {
		this.codvic = codvic;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
	
}
