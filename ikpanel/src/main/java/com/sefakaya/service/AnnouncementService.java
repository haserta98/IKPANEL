package com.sefakaya.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sefakaya.dao.AnnouncementDAO;
import com.sefakaya.entity.Announcement;

@Service
@Transactional
public class AnnouncementService {

	@Autowired
	private AnnouncementDAO annoDAO;
	
	public void createAnnouncement(Announcement anno,HttpServletRequest request)
	{
		annoDAO.insert(anno);
	}
	
	public void deleteAnnouncement(Announcement anno,HttpServletRequest request)
	{
		annoDAO.delete(anno);
	}
	
	public ArrayList<Announcement> getAll(){
		
		  return annoDAO.getAll();
		}
	
	public Announcement getFindById(Long id){
		

		  return annoDAO.getFindById(id);
		}
	
	
}
