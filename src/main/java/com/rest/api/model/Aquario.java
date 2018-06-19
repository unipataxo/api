package com.rest.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Aquario {

	@Id
	private Long id;
	
	private Long codigo;
	
	@Column(name="temperatura")
	private String temperatura;
	
	@Column(name="ph")
	private String ph;
	
	@Column(name="salinidade")
	private String salinidade;
	
	@Column(name="volume")
	private String volume;
	
	@Column(name="transparencia")
	private String transparencia;
	
	@Column(name="mo")
	private String mo;
	
	@Column(name="od")
	private String od;
	
	@Column(name="dureza")
	private String dureza;
	
	@Column(name="amonia")
	private String amonia;
	
	@Column(name="nitrito")
	private String nitrito;
	
	@Column(name="h2s")
	private String h2s;
	
	@Column(name="silicato")
	private String silicato;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}

	public String getPh() {
		return ph;
	}

	public void setPh(String ph) {
		this.ph = ph;
	}

	public String getSalinidade() {
		return salinidade;
	}

	public void setSalinidade(String salinidade) {
		this.salinidade = salinidade;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public String getTransparencia() {
		return transparencia;
	}

	public void setTransparencia(String transparencia) {
		this.transparencia = transparencia;
	}

	public String getMo() {
		return mo;
	}

	public void setMo(String mo) {
		this.mo = mo;
	}

	public String getOd() {
		return od;
	}

	public void setOd(String od) {
		this.od = od;
	}

	public String getDureza() {
		return dureza;
	}

	public void setDureza(String dureza) {
		this.dureza = dureza;
	}

	public String getAmonia() {
		return amonia;
	}

	public void setAmonia(String amonia) {
		this.amonia = amonia;
	}

	public String getNitrito() {
		return nitrito;
	}

	public void setNitrito(String nitrito) {
		this.nitrito = nitrito;
	}

	public String getH2s() {
		return h2s;
	}

	public void setH2s(String h2s) {
		this.h2s = h2s;
	}

	public String getSilicato() {
		return silicato;
	}

	public void setSilicato(String silicato) {
		this.silicato = silicato;
	}
	
	
	
}
