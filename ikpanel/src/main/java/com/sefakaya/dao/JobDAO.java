package com.sefakaya.dao;

import java.util.ArrayList;

import javax.persistence.Query;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sefakaya.entity.Job;


@Repository
public class JobDAO {
	
			@Autowired
			private SessionFactory sessionFactory;
	
			
	public void insert(Job job) {
		sessionFactory.getCurrentSession().save(job);
		
	}
	
	public void update(Job job) {
	sessionFactory.getCurrentSession().update(job);
	
		
	}
	
	public void delete(Job job) {
		sessionFactory.getCurrentSession().delete(job);
		
	}
	
	public Job getFindById(Long id){
		
		Query query= sessionFactory.getCurrentSession().createQuery("FROM Job WHERE id=:id")
			.setLong("id",id);
		  return (Job) query.getSingleResult();
		}
	
	
	public ArrayList<Job> getAll(){
		
		Query query= sessionFactory.getCurrentSession().createQuery("FROM Job");
		
		return (ArrayList<Job>) query.getResultList();

	}
	
	
	

	
}

