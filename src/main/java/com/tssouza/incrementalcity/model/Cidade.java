package com.tssouza.incrementalcity.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Cidade {

	// ibge_id,uf,name,capital,lon,lat,no_accents,alternative_names,microregion,mesoregion

	@Id
	private String ibgeId;
	@NotNull
	@NotEmpty
	private String uf;
	private String nome;
	private String capital;
	private String longitude;
	private String latitude;
	private String noAccents;
	private String nomeAlternativo;
	private String microRegiao;
	private String macroRegiao;

	public String getIbgeId() {
		return ibgeId;
	}

	public void setIbgeId(String ibgeId) {
		this.ibgeId = ibgeId;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getNoAccents() {
		return noAccents;
	}

	public void setNoAccents(String noAccents) {
		this.noAccents = noAccents;
	}

	public String getNomeAlternativo() {
		return nomeAlternativo;
	}

	public void setNomeAlternativo(String nomeAlternativo) {
		this.nomeAlternativo = nomeAlternativo;
	}

	public String getMicroRegiao() {
		return microRegiao;
	}

	public void setMicroRegiao(String microRegiao) {
		this.microRegiao = microRegiao;
	}

	public String getMacroRegiao() {
		return macroRegiao;
	}

	public void setMacroRegiao(String macroRegiao) {
		this.macroRegiao = macroRegiao;
	}

}
