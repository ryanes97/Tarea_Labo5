package com.uca.capas.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.uca.capas.domain.Estudiante;

public interface EstudianteDAO {
	public List<Estudiante> findALL() throws DataAccessException;
	
	public void addOne(Estudiante estudinte) throws DataAccessException;
}
