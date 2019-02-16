package com.sefakaya.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Applicant {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String jobadi;
	private String Ad;
	private String Email;
	private String Telefon;
	private String Adres;

	@Column(length=99999)
	private String Dusunce;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAd() {
		return Ad;
	}

	public void setAd(String ad) {
		Ad = ad;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getTelefon() {
		return Telefon;
	}

	public void setTelefon(String telefon) {
		Telefon = telefon;
	}

	public String getAdres() {
		return Adres;
	}

	public void setAdres(String adres) {
		Adres = adres;
	}

	public String getDusunce() {
		return Dusunce;
	}

	public void setDusunce(String dusunce) {
		Dusunce = dusunce;
	}

	public String getJobadi() {
		return jobadi;
	}

	public void setJobadi(String jobadi) {
		this.jobadi = jobadi;
	}

	@Override
	public String toString() {
		return "Applicant [id=" + id + ", jobadi=" + jobadi + ", Ad=" + Ad + ", Email=" + Email + ", Telefon=" + Telefon
				+ ", Adres=" + Adres + ", Dusunce=" + Dusunce + "]";
	}


	
	
	
	
	
}
