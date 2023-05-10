package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Controllers.ProfilController;
import Dto.DoctorDto;
import Dto.PatientDto;
import Exception.userConnexion.moreThanOneUserException;
import Exception.userConnexion.notFoundUserException;
import InterfaceMetier.IBLog;
import StaticClass.ConnexionMysql;
import StaticClass.Logger;

public class DoctorConnexionDAO implements IBLog<DoctorDto, Integer, ProfilController>{

	private String TABLE = "medecin";
	private static Connection cnx;
	
	public static DoctorConnexionDAO getDao() {
		try {
			cnx = ConnexionMysql.cconnexionBD();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new DoctorConnexionDAO();
	}
	
	
	/*
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
	}*/
	
	
	
	
	@Override
	public void save(DoctorDto o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(DoctorDto o) {
		// TODO Auto-generated method stub
		
		PreparedStatement preparedStatement = null; 
		ResultSet res = null;
		try {
			
			StringBuffer sb = new StringBuffer();
			sb.append("UPDATE ");
			sb.append(TABLE);
			sb.append(" SET ");
			//this.appendProjectionUPDATE(sb);
			preparedStatement = cnx.prepareStatement(sb.toString());
			
			Integer index = 0;
			preparedStatement.setInt(index++, o.getID());
			preparedStatement.setString(index++, o.getUserName());
			preparedStatement.setString(index++, o.getAdresse());
			preparedStatement.setInt(index++, o.getCp());
			preparedStatement.setString(index++, o.getVille());
			preparedStatement.setString(index++, o.getMail());
			preparedStatement.setString(index++, o.getTel());
			preparedStatement.setString(index++, o.getHoj());
			preparedStatement.setString(index++, o.getHoh());
			preparedStatement.setString(index++, o.getDescription());
			
		}catch(Exception e) {
			
		}
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public DoctorDto findOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DoctorDto findOneByU_P(DoctorDto o) {
		PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        DoctorDto dto = null;
        try {
			StringBuffer sb = new StringBuffer();
			sb.append("SELECT ");
			//this.appendProjection(sb);
			sb.append(" FROM ");
			sb.append(TABLE);
			sb.append(" WHERE userName = ? ");
			sb.append(" AND password = ? ");
			preparedStatement = cnx.prepareStatement(sb.toString());
			
			preparedStatement.setString(1, o.getUserName());
			preparedStatement.setString(2, o.getPassword());
			
			resultSet = preparedStatement.executeQuery();
			Logger.whriteLog(String.valueOf(preparedStatement));
			ArrayList<PatientDto> result = new ArrayList<PatientDto>();
			while (resultSet.next()) {
			    //result.add(rowToObject(resultSet));
			}
			if (result == null || result.size() == 0) {
				throw new notFoundUserException("Aucun resulat");
			} else {
                if (result.size() > 1) {
                    throw new moreThanOneUserException("Il y a un doublons dans la base de données");
                } else {
    			   // dto = result.get(0);
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
	public List<DoctorDto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DoctorDto findOneByU_P(DoctorDto o, ProfilController c) {
		// TODO Auto-generated method stub
		return null;
	}


}
