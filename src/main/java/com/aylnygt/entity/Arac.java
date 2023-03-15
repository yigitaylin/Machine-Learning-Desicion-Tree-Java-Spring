package com.aylnygt.entity;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="araclar")
public class Arac {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
	private Long kaza_id;
	private String arac_cinsi;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getKaza_id() {
		return kaza_id;
	}
	public void setKaza_id(Long kaza_id) {
		this.kaza_id = kaza_id;
	}
	public String getArac_cinsi() {
		return arac_cinsi;
	}
	public void setArac_cinsi(String arac_cinsi) {
		this.arac_cinsi = arac_cinsi;
	}
	

}
