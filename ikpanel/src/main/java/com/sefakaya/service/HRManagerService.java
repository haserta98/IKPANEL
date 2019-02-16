package com.sefakaya.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sefakaya.dao.HRManagerDAO;
import com.sefakaya.entity.HRManager;

@Service
@Transactional
public class HRManagerService {

		@Autowired
		private HRManagerDAO HRManagerDAO; 
	
	public HRManager getFindByUsernameAndPass(HRManager HRManager){
		
		  return HRManagerDAO.getFindByUsernameAndPass(HRManager.getePosta(),HRManager.getParola());
		
	}
	
	
}
