package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import beans.AgresorDTO;
import interfaces.AgresorDAO;
import utils.MySqlDbConexion;

public class MySQLAgresorDAO implements AgresorDAO {

	@Override
	public List<AgresorDTO> listarAgresores() {
		
		List<AgresorDTO> data = new ArrayList<AgresorDTO>();
		AgresorDTO obj = null;
		Connection cn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		try {
			cn = MySqlDbConexion.getConexion();
			String sql = "select * from TB_AGRESOR ";
			pstm = cn.prepareStatement(sql);
			rs = pstm.executeQuery();
			while (rs.next()) {
				obj = new AgresorDTO();
				obj.setCodagr(rs.getString(1));
				obj.setNomagr(rs.getString(2));
				obj.setApeagr(rs.getString(3));
				obj.setDni(rs.getString(4));
				obj.setSexo(rs.getString(5));
				
				data.add(obj);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return data;
	}

	@Override
	public AgresorDTO buscarAgresor(String dni) {
		AgresorDTO obj = null;
		Connection cn =  null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		try {
			cn = MySqlDbConexion.getConexion();
			String sql = "select * from TB_AGRESOR where DNI = ?";
			pstm = cn.prepareStatement(sql);
			pstm.setString(1, dni);
			rs = pstm.executeQuery();
			
			if(rs.next()) {
				obj = new AgresorDTO();
				obj.setCodagr(rs.getString(1));
				obj.setNomagr(rs.getString(2));
				obj.setApeagr(rs.getString(3));
				obj.setDni(rs.getString(4));
				obj.setSexo(rs.getString(5));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return obj;
	}

	@Override
	public int registrarAgresor(AgresorDTO obj) {
		
		int estado = -1;
		Connection cn = null;
		PreparedStatement pstm = null;
		
		try {
			
			cn = MySqlDbConexion.getConexion();
			String sql = "insert into TB_AGRESOR values(?,?,?,?,?)";
			pstm = cn.prepareStatement(sql);
			pstm.setString(1, obj.getCodagr());
			pstm.setString(2, obj.getNomagr());
			pstm.setString(3, obj.getApeagr());
			pstm.setString(4, obj.getDni());
			pstm.setString(5, obj.getSexo());
			estado = pstm.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return estado;
	}

	@Override
	public int actualizarAgresor(AgresorDTO obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int eliminarAgresor(int dni) {
		// TODO Auto-generated method stub
		return 0;
	}

}
