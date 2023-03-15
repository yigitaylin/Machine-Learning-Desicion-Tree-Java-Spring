package com.aylnygt.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aylnygt.dao.KazaDAO;
import com.aylnygt.entity.Kaza;

@Service
@Transactional
public class KazaService {
	
	
	@Autowired
	private KazaDAO kazaDAO;
	
	
	public Long createKaza(Kaza kaza,HttpServletRequest request) {   //
		return kazaDAO.insert(kaza);
		 
	}
	
	
	public Kaza getFindById(Long id) {
		return kazaDAO.getFindById(id);
	}
	
	
	public ArrayList<Kaza> getAll(){
		return kazaDAO.getAll();
	}
	
	
	public ArrayList<Kaza> getAll(Long id){
		return kazaDAO.getAll(id);
	}
	
	
	
	
}
