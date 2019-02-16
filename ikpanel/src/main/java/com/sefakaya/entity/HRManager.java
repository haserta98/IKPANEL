package com.sefakaya.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HRManager {

	// Attribute tanýmlarý.	
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
	
		private String ePosta;
		
		private String parola;
	
	//Getter, Setter metotlarý.	
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getePosta() {
		return ePosta;
	}
	public void setePosta(String ePosta) {
		this.ePosta = ePosta;
	}
	public String getParola() {
		return parola;
	}
	public void setParola(String parola) {
		this.parola = parola;
	}
	
	
	
	
	
	
}
