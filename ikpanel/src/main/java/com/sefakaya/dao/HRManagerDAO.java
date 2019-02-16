package com.sefakaya.dao;

import javax.persistence.Query;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sefakaya.entity.HRManager;


@Repository
public class HRManagerDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
public HRManager getFindByUsernameAndPass(String ePosta,String parola){
		
		Query query= sessionFactory.getCurrentSession().createQuery("FROM HRManager WHERE ePosta=:ePosta AND parola=:parola")
			.setString("ePosta",ePosta)
			.setString("parola", parola);
		HRManager hrmanager=null;
		
		try {
			hrmanager=(HRManager) query.getSingleResult();
			
		} catch (javax.persistence.NoResultException e) {
			hrmanager=null;
		}
		
		  return hrmanager;
		
		  
		  
		  
		}
	
	

}
