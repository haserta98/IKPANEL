package com.sefakaya.dao;

import java.util.ArrayList;

import javax.persistence.Query;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sefakaya.entity.Announcement;

@Repository
public class AnnouncementDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	
		public void insert(Announcement anno) {
			sessionFactory.getCurrentSession().save(anno);

		}

		public void delete(Announcement anno) {
			sessionFactory.getCurrentSession().delete(anno);

		}	
	
		public Announcement getFindById(Long id){
			
			Query query= sessionFactory.getCurrentSession().createQuery("FROM Announcement WHERE id=:id")
				.setLong("id",id);
			  return (Announcement) query.getSingleResult();
			}
		
		
		public ArrayList<Announcement> getAll(){
			
			Query query= sessionFactory.getCurrentSession().createQuery("FROM Announcement");
			
			return (ArrayList<Announcement>) query.getResultList();

		}
		
		
		
		
}
