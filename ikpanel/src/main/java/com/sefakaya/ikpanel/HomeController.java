package com.sefakaya.ikpanel;

import java.util.ArrayList;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sefakaya.entity.Announcement;
import com.sefakaya.entity.Applicant;
import com.sefakaya.entity.Job;
import com.sefakaya.service.AnnouncementService;
import com.sefakaya.service.ApplicantService;
import com.sefakaya.service.JobService;


@Controller
public class HomeController {
	
	
	@Autowired
	private JobService jobService;
	
	@Autowired
	private ApplicantService applicantService;
	
	@Autowired
	private AnnouncementService annoService;
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		
		return "redirect:/index";
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String home1(Locale locale, Model model) {
		
		
		return "redirect:/index";
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String home2(Locale locale, Model model) {
		
		
		return "home";
	}
	
	@RequestMapping(value = "/basvurankisi", method = RequestMethod.GET)
	public String kisiListe(Locale locale, Model model) {
		
		
		return "kisiliste";
	}
	
	@RequestMapping(value = "/ilanliste", method = RequestMethod.GET)
	public String ilanliste(Model model) {

		
		return "ilanliste";
	}
	
	@RequestMapping(value = "/isilanlari", method = RequestMethod.GET)
	public String isilanlari(Locale locale, Model model) {
		
		
		return "isilanlari";
	}
	
	@RequestMapping(value = "/duyuruekle", method = RequestMethod.GET)
	public String duyuruekle(Locale locale, Model model) {
		
		
		return "duyuruekle";
	}
	

	@RequestMapping(value = "/duyurular", method = RequestMethod.GET)
	public String duyurular(Locale locale, Model model) {
		
		
		return "duyurular";
	}
	
	@RequestMapping(value="/addJob",method= RequestMethod.POST)
	public ResponseEntity<String> addJob(@RequestBody Job job,HttpServletRequest request){

		
		System.out.println(job.toString());
		
		jobService.createJob(job, request);
	
		return new ResponseEntity<>("OK",HttpStatus.CREATED);
		
	}
	
	@RequestMapping(value="/ilanCek",method= RequestMethod.POST)
	public ResponseEntity<ArrayList<Job>> ilanCek(HttpServletRequest request){

		return new ResponseEntity<>(jobService.getAll(),HttpStatus.CREATED);
		
	}
	@RequestMapping(value="/applicantCek",method= RequestMethod.POST)
	public ResponseEntity<ArrayList<Applicant>> applicantCek(HttpServletRequest request, Model model){

		
		return new ResponseEntity<>(applicantService.getAll(),HttpStatus.CREATED);
		
	}
	
	@RequestMapping(value="/birilanCek",method= RequestMethod.POST)
	public ResponseEntity<Job> birilancek(@RequestBody String id,HttpServletRequest request){

		return new ResponseEntity<>(jobService.getFindById(Long.parseLong(id)),HttpStatus.CREATED);
		
	}
	
	
	@RequestMapping(value = "/basvuru/{id}", method = RequestMethod.GET)
	public String home1(@PathVariable("id") Long id, Model model) {
		
	
		model.addAttribute("id",id);
		return "basvuru";
	}
	
	@RequestMapping(value="/addApplicant",method= RequestMethod.POST)
	public ResponseEntity<String> addApplicant(@RequestBody Applicant applicant,HttpServletRequest request){

		System.out.println(applicant.toString());
		applicantService.createApplicant(applicant, request);
		return new ResponseEntity<>("OK",HttpStatus.CREATED);
		
	}
	
	@RequestMapping(value="/deleteJob",method= RequestMethod.POST)
	public ResponseEntity<String> deleteJob(@RequestBody String id,HttpServletRequest request){

		System.out.println("ÝD BURADA : "+id);
		
		Job oldJob=jobService.getFindById(Long.parseLong(id));
		
		jobService.deleteJob(oldJob, request);
	
		return new ResponseEntity<>("OK",HttpStatus.CREATED);
		
	}
	
	@RequestMapping(value="/duyuruEklemek",method= RequestMethod.POST)
	public ResponseEntity<String> duyuruEkle(@RequestBody Announcement anno,HttpServletRequest request){
		
		annoService.createAnnouncement(anno, request);
	
		return new ResponseEntity<>("OK",HttpStatus.CREATED);
		
	}
	
	@RequestMapping(value="/duyuruSil",method= RequestMethod.POST)
	public ResponseEntity<String> deleteAnno(@RequestBody String id,HttpServletRequest request){

		System.out.println("ÝD BURADA : "+id);
		
		Announcement oldAnno=annoService.getFindById(Long.parseLong(id));
		
		annoService.deleteAnnouncement(oldAnno, request);
	
		return new ResponseEntity<>("OK",HttpStatus.CREATED);
		
	}
	
	
	@RequestMapping(value="/duyuruCek",method= RequestMethod.POST)
	public ResponseEntity<ArrayList<Announcement>> duyuruCek(HttpServletRequest request){

		return new ResponseEntity<>(annoService.getAll(),HttpStatus.CREATED);
		
	}
	
	

	
}
