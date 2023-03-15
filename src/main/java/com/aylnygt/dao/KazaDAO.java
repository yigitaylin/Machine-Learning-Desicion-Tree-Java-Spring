package com.aylnygt.dao;

import java.util.ArrayList;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aylnygt.entity.Kaza;

@Repository
public class KazaDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	//CRUD
	public Long insert(Kaza kaza) {
	return  (Long) sessionFactory.getCurrentSession().save(kaza);
	}
	
	public void update(Kaza kaza) {
		sessionFactory.getCurrentSession().update(kaza);
		
		}
	public void persist(Kaza kaza) {
		sessionFactory.getCurrentSession().persist(kaza);
		
	}
	
	public void delete(Kaza kaza) {
		sessionFactory.getCurrentSession().delete(kaza);	
	}
	
	
	
	
	//READ
	
	public Kaza getFindById(Long id) {
		Query query = sessionFactory.getCurrentSession().createQuery("FROM Kaza WHERE id=:id")
				.setLong("id",id);
		return (Kaza) query.getSingleResult();
	}
	
	
	
	
	
	public ArrayList<Kaza> getAll(){
		Query query = sessionFactory.getCurrentSession().createQuery("FROM Kaza order by id desc"); //Sýnýfýn adý tablo adý deðil
		return  (ArrayList<Kaza>) query.getResultList();
	}
	
	
	public ArrayList<Kaza> getAll(Long id){                                                     //Sýnýfýn adý tablo adý deðil
		Query query = sessionFactory.getCurrentSession().createQuery("FROM Kaza WHERE id=:id order by id desc")
				.setLong("id",id);
			
		return  (ArrayList<Kaza>) query.getResultList();
	}
	
	
	
	
	

}
