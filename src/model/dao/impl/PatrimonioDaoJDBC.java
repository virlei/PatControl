package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import db.DB;
import db.DbException;
import model.dao.PatrimonioDao;
import model.entities.Equipamento;
import model.entities.Patrimonio;

public class PatrimonioDaoJDBC implements PatrimonioDao {

	private Connection conn;
	
	public PatrimonioDaoJDBC(Connection conn) {
		this.conn = conn;
	}
	
	@Override
	public void insert(Patrimonio obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Patrimonio obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Patrimonio findById(long id) {
		
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement(
					"SELECT TB_PATRIMONIO.*, TB_EQUIPAMENTO.TXT_Descricao as Equip "
					+ "FROM TB_PATRIMONIO INNER JOIN TB_EQUIPAMENTO "
					+ "ON TB_PATRIMONIO.FK_EQUIPAMENTO = TB_EQUIPAMENTO.PK_Equipamento "
					+ "where TB_PATRIMONIO.PK_Patrimonio = ?");
			st.setLong(1, id);
			rs = st.executeQuery();
			if (rs.next()) {
				
				Equipamento equip = new Equipamento();
				equip.setId(rs.getInt("FK_Equipamento"));
				equip.setDescricao(rs.getString("Equip"));
				
				Patrimonio pat = new Patrimonio();
				pat.setNumero(rs.getLong("PK_Patrimonio"));
				pat.setMarca(rs.getString("TXT_Marca"));
				pat.setFabricante(rs.getString("TXT_Fabricante"));
				pat.setDescricao(rs.getString("TXT_Descricao"));
				pat.setCondicaoUso(rs.getByte("INT_condicaoUso"));
				pat.setTipEquip(equip);
				return pat;				
			} 
			return null;					
		}
		catch (SQLException e) {
			throw new DbException (e.getMessage());
		}
		finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
	
	}

	@Override
	public List<Patrimonio> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
