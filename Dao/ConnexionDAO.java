package Dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Controllers.SignInUpController;
import Dto.PatientDto;
import Dto.UserDTO;
import Exception.userConnexion.moreThanOneUserException;
import Exception.userConnexion.notFoundUserException;
import InterfaceMetier.IBLog2P;
import StaticClass.ConnexionMysql;
import StaticClass.Logger;
import StaticClass.UserSession;

public class ConnexionDAO<X extends UserDTO,Y> implements IBLog2P<X,Y>{

	private static String drTable = "medecin";
	private static String ptTable = "user";
	private static String TABLE = UserSession.instance.getRole() == "medecin" ? drTable : ptTable ;
	private static Connection cnx;
	
	@SuppressWarnings("rawtypes")
	public static ConnexionDAO getDao() {
		try {
			cnx = ConnexionMysql.cconnexionBD();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ConnexionDAO<>();
	}
	
	private <T extends UserDTO> T rowToObject(ResultSet resultSet, T obj) throws SQLException {
		int index = 1;
		obj.setID(resultSet.getInt(index++));
		obj.setUserName(resultSet.getString(index++));
		return obj;
	}
	
	private void appendProjectionWHERE(StringBuffer sb) {
		sb.append(" WHERE userName = ? ");
		sb.append(" AND password = ? ");
	}
	
	private void appendProjection(StringBuffer sb) {
		sb.append(" id,");
		sb.append(" userName,");
		sb.append(" adresse,");
		sb.append(" cp,");
		sb.append(" ville,");
		sb.append(" mail,");
		sb.append(" Tel,");
		sb.append(" hoj,");
		sb.append(" hoh,");
		sb.append(" description ");
	}
	
	private void appendProjectionUPDATE(StringBuffer sb) {
		sb.append(" id = ? ");
		sb.append(" userName = ? ");
		sb.append(" adresse = ? ");
		sb.append(" cp = ?  ");
		sb.append(" ville = ?  ");
		sb.append(" mail = ? ");
		sb.append(" Tel = ?  ");
		sb.append(" hoj = ? ");
		sb.append(" hoh = ?  ");
		sb.append(" description = ?  ");
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
	
	@SuppressWarnings("unchecked")
	@Override
	public <T extends UserDTO> T findOneByU_PG(T o) {
		PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        T dto = null;
        try {
			StringBuffer sb = new StringBuffer();
			sb.append("SELECT ");
			this.appendProjection(sb);
			sb.append(" FROM ");
			sb.append(TABLE);
			this.appendProjectionWHERE(sb);
			preparedStatement = cnx.prepareStatement(sb.toString());
			
			preparedStatement.setString(1, o.getUserName());
			preparedStatement.setString(2, o.getPassword());
			
			resultSet = preparedStatement.executeQuery();
			Logger.whriteLog(String.valueOf(preparedStatement));
			ArrayList<T> result = new ArrayList<T>();
			while (resultSet.next()) {
				T obj = (T) new UserDTO();
			    result.add((T) rowToObject(resultSet, obj));
			}
			if (result == null || result.size() == 0) {
				throw new notFoundUserException("Aucun resulat");
			} else {
                if (result.size() > 1) {
                    throw new moreThanOneUserException("Il y a un doublons dans la base de données");
                } else {
    			    dto = result.get(0);
                }
			}
		} catch (notFoundUserException e) {
			System.out.println(e.getMessage());
		} catch (moreThanOneUserException e) {
			System.out.println(e.getMessage());
        } catch (SQLException e) {
			// TODO Auto-generated catch block
        	System.out.println(e.getMessage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} finally {
        	try {
				cnx.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        return dto;
	}


	@Override
	public List<X> findAll() {
		// TODO Auto-generated method stub
		return null;
	}


}
