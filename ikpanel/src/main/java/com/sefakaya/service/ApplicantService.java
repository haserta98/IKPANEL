package com.sefakaya.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sefakaya.dao.ApplicantDAO;
import com.sefakaya.entity.Applicant;

@Service
@Transactional
public class ApplicantService {
	
	@Autowired
	private ApplicantDAO applicantDAO;
	
	public void createApplicant(Applicant applicant,HttpServletRequest request)
	{
		applicantDAO.insert(applicant);
	}
	
	public void updateJob(Applicant applicant,HttpServletRequest request)
	{
		applicantDAO.update(applicant);
	}
	
	public void deleteJob(Applicant applicant,HttpServletRequest request)
	{
		applicantDAO.delete(applicant);
	}
	
	public ArrayList<Applicant> getAll(){
		
		  return applicantDAO.getAll();
		}
	
	public Applicant getFindById(Long id){


		  return applicantDAO.getFindById(id);
		}
	
	

}
