package utils;

import java.sql.Connection;



import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JDialog;
import javax.swing.JOptionPane;



public class MySqlDbConexion {
	
	
	
	
	public static Connection getConexion()  {
		Connection cn = null;
		try {
			
		    Class.forName("com.mysql.jdbc.Driver");
			cn=DriverManager.getConnection("jdbc:mysql://localhost/BD_PROYECTO_LP2","root","mysql");
		} catch (SQLException e) {	
			
			e.printStackTrace();
			
			//Agregacion opcional de panel de aviso de escepciones u errores/
			final JDialog dialog = new JDialog();
			dialog.setAlwaysOnTop(true);
			JOptionPane.showMessageDialog(dialog, "Error en la Conexion"+ e.getMessage());
			//---------------------------------------------------------------------------/
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cn;
	}

}
