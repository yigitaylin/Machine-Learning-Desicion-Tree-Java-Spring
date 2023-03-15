package com.aylnygt.entity;




import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id; 
import javax.persistence.Table;

@Entity
@Table(name = "kazalar")
public class Kaza {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
	
	
	@Column(name="saat")
	private String saat;
	
	
	@Column(name="il")
	private String il;
	
	
	@Column(name="tarih")
	private String tarih;
	
	
	@Column(name="ilce")
	private String ilce;
	
	
	@Column(name="hava_durumu")
	private String hava_durumu;
	
	@Column(name="arac_sayisi")
	private String arac_sayisi;
	
	
	
	@Column(name="arac_cinsi")
	private String arac_cinsi;
	
	
	@Column(name="gun")
	private String gun;
	
	@Column(name="toplam_olu")
	private int toplam_olu;
	
	@Column(name="toplam_yarali")
	private int toplam_yarali;
	
	@Column(name="olumlu_sonuc")
	private int olumlu_sonuc;
	
	
	@Column(name="kaza_id")
	private Long kaza_id;

	
	
	

	/**
	 * @return the arac_cinsi
	 */
	public String getArac_cinsi() {
		return arac_cinsi;
	}


	/**
	 * @param arac_cinsi the arac_cinsi to set
	 */
	public void setArac_cinsi(String arac_cinsi) {
		this.arac_cinsi = arac_cinsi;
	}


	/**
	 * @return the gun
	 */
	public String getGun() {
		return gun;
	}


	/**
	 * @param gun the gun to set
	 */
	public void setGun(String gun) {
		this.gun = gun;
	}


	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}


	/**
	 * @return the saat
	 */
	public String getSaat() {
		return saat;
	}


	/**
	 * @param saat the saat to set
	 */
	public void setSaat(String saat) {
		this.saat = saat;
	}


	/**
	 * @return the il
	 */
	public String getIl() {
		return il;
	}


	/**
	 * @param il the il to set
	 */
	public void setIl(String il) {
		this.il = il;
	}


	/**
	 * @return the tarih
	 */
	public String getTarih() {
		return tarih;
	}


	/**
	 * @param tarih the tarih to set
	 */
	public void setTarih(String tarih) {
		this.tarih = tarih;
	}


	/**
	 * @return the ilce
	 */
	public String getIlce() {
		return ilce;
	}


	/**
	 * @param ilce the ilce to set
	 */
	public void setIlce(String ilce) {
		this.ilce = ilce;
	}


	/**
	 * @return the hava_durumu
	 */
	public String getHava_durumu() {
		return hava_durumu;
	}


	/**
	 * @param hava_durumu the hava_durumu to set
	 */
	public void setHava_durumu(String hava_durumu) {
		this.hava_durumu = hava_durumu;
	}


	/**
	 * @return the arac_sayisi
	 */
	public String getArac_sayisi() {
		return arac_sayisi;
	}


	/**
	 * @param arac_sayisi the arac_sayisi to set
	 */
	public void setArac_sayisi(String arac_sayisi) {
		this.arac_sayisi = arac_sayisi;
	}


	/**
	 * @return the toplam_olu
	 */
	public int getToplam_olu() {
		return toplam_olu;
	}


	/**
	 * @param toplam_olu the toplam_olu to set
	 */
	public void setToplam_olu(int toplam_olu) {
		this.toplam_olu = toplam_olu;
	}


	/**
	 * @return the toplam_yarali
	 */
	public int getToplam_yarali() {
		return toplam_yarali;
	}


	/**
	 * @param toplam_yarali the toplam_yarali to set
	 */
	public void setToplam_yarali(int toplam_yarali) {
		this.toplam_yarali = toplam_yarali;
	}


	/**
	 * @return the olumlu_sonuc
	 */
	public int getOlumlu_sonuc() {
		return olumlu_sonuc;
	}


	/**
	 * @param olumlu_sonuc the olumlu_sonuc to set
	 */
	public void setOlumlu_sonuc(int olumlu_sonuc) {
		this.olumlu_sonuc = olumlu_sonuc;
	}


	

	/**
	 * @return the kaza_id
	 */
	public Long getKaza_id() {
		return kaza_id;
	}


	/**
	 * @param kaza_id the kaza_id to set
	 */
	public void setKaza_id(Long kaza_id) {
		this.kaza_id = kaza_id;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Kaza [id=" + id + ", saat=" + saat + ", il=" + il + ", tarih=" + tarih + ", ilce=" + ilce
				+ ", hava_durumu=" + hava_durumu + ", arac_sayisi=" + arac_sayisi + ", arac_cinsi=" + arac_cinsi
				+ ", gun=" + gun + ", toplam_olu=" + toplam_olu + ", toplam_yarali=" + toplam_yarali + ", olumlu_sonuc="
				+ olumlu_sonuc + ", kaza_id=" + kaza_id + "]";
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	
	
	
	
	

}











