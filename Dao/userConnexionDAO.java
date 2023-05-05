package Dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Dto.userDto;
import Exception.userConnexion.moreThanOneUserException;
import Exception.userConnexion.notFoundUserException;
import InterfaceMetier.IBLog2P;
import StaticClass.ConnexionMysql;
import StaticClass.Logger;

public class userConnexionDAO implements IBLog2P<userDto, Integer>{

	private static String TABLE = "user";
	private static Connection cnx;
	
	public static userConnexionDAO getDao() {
		return new userConnexionDAO();
	}

	@Override
	public void save(userDto o) {
		PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        userDto dto = null;
        StringBuffer sb = new StringBuffer();
		sb.append("INSERT INTO ");
		sb.append(TABLE);
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
			cnx = ConnexionMysql.cconnexionBD();
			preparedStatement =  cnx.prepareStatement(sb.toString());
			Logger.whriteLog(String.valueOf(preparedStatement));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int index = 1;
		try {
			preparedStatement.setString(index++, o.getUsername());
			preparedStatement.setString(index++, o.getPassword());
			preparedStatement.setString(index++, o.getBirth());
			preparedStatement.setInt(index++, o.getSiret());
			preparedStatement.setInt(index++, o.getCp());
			preparedStatement.setString(index++, o.getVille());
			preparedStatement.setString(index++, o.getAdresse());
			preparedStatement.setString(index++, o.getSpeChoice());
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
	public void update(userDto o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public userDto findOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private void appendProjection(StringBuffer sb) {
		sb.append("id, ");
		sb.append("userName, ");
		sb.append("password, ");
		sb.append("birth, ");
		sb.append("siret");
	}
	
	private userDto rowToObject(ResultSet resultSet) throws Exception {
		userDto dto = new userDto();
		int index = 1;
		dto.setId(new Integer(resultSet.getInt(index++)));
		dto.setUsername(resultSet.getString(index++));
		dto.setPassword(resultSet.getString(index++));
		dto.setBirth(resultSet.getString(index++));
		dto.setSiret(new Integer(resultSet.getInt(index++)));
		return dto;
	}

	@Override
	public userDto findOneByU_P(userDto o) {
		PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        userDto dto = null;
        try {
        	cnx = ConnexionMysql.cconnexionBD();
			StringBuffer sb = new StringBuffer();
			sb.append("SELECT ");
			this.appendProjection(sb);
			sb.append(" FROM ");
			sb.append(TABLE);
			sb.append(" WHERE userName = ? ");
			sb.append(" AND password = ? ");
			preparedStatement = cnx.prepareStatement(sb.toString());
			
			preparedStatement.setString(1, o.getUsername());
			preparedStatement.setString(2, o.getPassword());
			
			resultSet = preparedStatement.executeQuery();
			Logger.whriteLog(String.valueOf(preparedStatement));
			ArrayList<userDto> result = new ArrayList<userDto>();
			while (resultSet.next()) {
			    result.add(rowToObject(resultSet));
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
	public List<userDto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
