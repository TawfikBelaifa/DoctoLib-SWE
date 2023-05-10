package Dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import Dto.PatientDto;
import Dto.UserDTO;
import InterfaceMetier.IBLog2P;
import StaticClass.ConnexionMysql;
import StaticClass.Logger;

public class ConnexionDAO<X extends UserDTO,Y> implements IBLog2P<X,Y>{

	private static String drTable = "medecin";
	private static String ptTable = "user";
	private static Connection cnx;
	
	public static ConnexionDAO getDao() {
		try {
			cnx = ConnexionMysql.cconnexionBD();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ConnexionDAO();
	}
	
	
	@Override
	public void save(X o) {
		// TODO Auto-generated method stub
		
		PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        PatientDto dto = null;
        StringBuffer sb = new StringBuffer();
		sb.append("INSERT INTO ");
		sb.append(drTable);
		sb.append(" (");
		sb.append(" id, ");
		sb.append(" userName,");
		sb.append(" password,");
		sb.append(" birth,");
		sb.append(" siret,");
		sb.append(" cp,");
		sb.append(" ville,");
		sb.append(" adress,");
		sb.append(" spe");
		sb.append(") VALUES (");
		sb.append("id,?,?,?,?,?,?,?,?");
		sb.append(")");
		try {
			preparedStatement =  cnx.prepareStatement(sb.toString());
			Logger.whriteLog(String.valueOf(preparedStatement));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int index = 1;
		try {
			preparedStatement.setString(index++, o.getUserName());
			preparedStatement.setString(index++, o.getPassword());
			preparedStatement.setString(index++, o.getBirth());
			preparedStatement.setInt(index++, o.getCp());
			preparedStatement.setString(index++, o.getVille());
			preparedStatement.setString(index++, o.getAdresse());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
        	try {
				cnx.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
	}

	@Override
	public void update(X o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Y id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public X findOne(Y id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public X findOneByU_P(X o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<X> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
