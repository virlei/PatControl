package model.dao;

import java.util.List;

import model.entities.Patrimonio;

public interface PatrimonioDao {
	
	void insert(Patrimonio obj);
	void update (Patrimonio obj);
	void deleteById (Integer id);
	Patrimonio findById(Integer id);
	List<Patrimonio> findAll();
	
}
