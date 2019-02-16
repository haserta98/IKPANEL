package com.sefakaya.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sefakaya.dao.JobDAO;
import com.sefakaya.entity.Job;


@Service
@Transactional
public class JobService {

	@Autowired
	private JobDAO jobDAO;
	
	
	public void createJob(Job job,HttpServletRequest request)
	{
		 jobDAO.insert(job);
	}
	
	public void updateJob(Job job,HttpServletRequest request)
	{
		 jobDAO.update(job);
	}
	
	public void deleteJob(Job job,HttpServletRequest request)
	{
		 jobDAO.delete(job);
	}
	
	public ArrayList<Job> getAll(){
		
		  return jobDAO.getAll();
		}
	
	public Job getFindById(Long id){
		

		  return jobDAO.getFindById(id);
		}
	

	
	
	
}
