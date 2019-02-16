package com.sefakaya.dao;

import java.util.ArrayList;

import javax.persistence.Query;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sefakaya.entity.Applicant;

@Repository
public class ApplicantDAO {
	
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void insert(Applicant applicant) {
		sessionFactory.getCurrentSession().save(applicant);
		
	}
	
	public void update(Applicant applicant) {
	sessionFactory.getCurrentSession().update(applicant);
	
		
	}
	
	public void delete(Applicant applicant) {
		sessionFactory.getCurrentSession().delete(applicant);
		
	}
	
	public Applicant getFindById(Long id){
		
		Query query= sessionFactory.getCurrentSession().createQuery("FROM Applicant WHERE id=:id")
			.setLong("id",id);
		  return (Applicant) query.getSingleResult();
		}
	
	
	public ArrayList<Applicant> getAll(){
		
		Query query= sessionFactory.getCurrentSession().createQuery("FROM Applicant");
		
		return (ArrayList<Applicant>) query.getResultList();

	}
	
	
	
	

}
