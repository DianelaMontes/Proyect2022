package dao;


import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import beans.DenunciaDTO;
import interfaces.DenunciaDAO;
import utils.MySqlDbConexion;


public class MySQLDenunciaDAO implements DenunciaDAO{
	
	
	@Override
	public List<DenunciaDTO> listarDenuncias(){
		
		List<DenunciaDTO> data = new ArrayList<DenunciaDTO>();
		DenunciaDTO obj = null;
		Connection cn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		try {
			cn = MySqlDbConexion.getConexion();
			String sql = "select * from TB_DENUNCIA";
			pstm = cn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while (rs.next()) {
				obj = new DenunciaDTO();
				obj.setNumden(rs.getString(1));
				obj.setCodcom(rs.getString(2));
				obj.setCoddel(rs.getString(3));
				obj.setDescrip(rs.getString(4));
				obj.setCodpol(rs.getString(5));
				obj.setCodagr(rs.getString(6));
				obj.setCodvic(rs.getString(7));
				obj.setFecha(rs.getDate(8));
				obj.setEstado(rs.getInt(9));
				data.add(obj);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return data;
			
	}
	
		
		
	/*
				String sql = "select p.cod_pro, p.des_pro, p.pre_pro, p.stock_pro, m.nom_mar from tb_producto p inner join tb_marca m on p.cod_mar = m.cod_mar";
		*/	
	
		
	
	
	@Override
	public int registrarDenuncia(DenunciaDTO obj) {
		
		int estado = -1;
		Connection cn = null;
		PreparedStatement pstm = null;
		
		try {
			cn = MySqlDbConexion.getConexion();
			String sql = "insert into TB_DENUNCIA values(null,?,?,?,?,?,?,?,?)";
			pstm = cn.prepareStatement(sql);
			pstm.setString(1, obj.getCodcom());
			pstm.setString(2, obj.getCoddel());
			pstm.setString(3, obj.getDescrip());
			pstm.setString(4, obj.getCodpol());
			pstm.setString(5, obj.getCodagr());
			pstm.setString(6, obj.getCodvic());
			pstm.setDate(7, obj.getFecha());
			pstm.setInt(8, obj.getEstado());
			estado = pstm.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}		
		return estado;
	}
}
