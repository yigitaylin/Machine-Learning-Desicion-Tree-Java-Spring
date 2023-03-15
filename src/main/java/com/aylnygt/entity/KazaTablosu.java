package com.aylnygt.entity;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "kazatablosu")
public class KazaTablosu {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
	
	
	@Column(name="il")
	private int il;
	
	@Column(name="hava_durumu")
	private int hava_durumu;
	
	@Column(name="arac_sayisi")
	private int arac_sayisi;
	
	
	@Column(name="kaza_id")
	private Long kaza_id;
	
	@Column(name="cinsi")
	private int cinsi;
	
	@Column(name="gun")
	private int gun;
	
	@Column(name="kaza")
	private int kaza;
	
	
	
  public int getId() {
		return id;
	}

	
	public void setId(int id) {
		this.id = id;
	}

	public int getIl() {
		return il;
	}
	
	public void setIl(int il) {
		this.il = il;
	}
	
	public int getHava_durumu() {
		return hava_durumu;
	}
	
	public void setHava_durumu(int hava_durumu) {
		this.hava_durumu = hava_durumu;
	}
	
	public int getArac_sayisi() {
		return arac_sayisi;
	}
	
	public void setArac_sayisi(int arac_sayisi) {
		this.arac_sayisi = arac_sayisi;
	}
	
	public Long getKaza_id() {
		return kaza_id;
	}
	
	public void setKaza_id(Long kaza_id) {
		this.kaza_id = kaza_id;
	}
	
	public int getCinsi() {
		return cinsi;
	}
	
	public void setCinsi(int cinsi) {
		this.cinsi = cinsi;
	}
	
	public int getGun() {
		return gun;
	}
	
	public void setGun(int gun) {
		this.gun = gun;
	}
	
	public int getKaza() {
		return kaza;
	}
	
	public void setKaza(int kaza) {
		this.kaza = kaza;
	}
	

}
