package br.com.jean.padroes_proj_spring.model.entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Endereco {
	
	/*
	 * Atributos
	 */
	@Id
	private String cep;
	private String logradouro;
	private String complemento;
	private String bairro;
	private String localidade;
	private String uf;
	private String ibge;
	private String gia;
	private String ddd;
	private String siafi;
	
	
	/*
	 * Getters e Setters
	 */
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getLocalidade() {
		return localidade;
	}
	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getIbge() {
		return ibge;
	}
	public void setIbge(String ibge) {
		this.ibge = ibge;
	}
	public String getGia() {
		return gia;
	}
	public void setGia(String gia) {
		this.gia = gia;
	}
	public String getDdd() {
		return ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public String getSiafi() {
		return siafi;
	}
	public void setSiafi(String siafi) {
		this.siafi = siafi;
	}
	
	
	/*
	 * toString, hashCode e Equals
	 */
	@Override
	public String toString() {
		return "Endereco [cep=" + cep + ", logradouro=" + logradouro + ", complemento=" + complemento + ", bairro="
				+ bairro + ", localidade=" + localidade + ", uf=" + uf + ", ibge=" + ibge + ", gia=" + gia + ", ddd="
				+ ddd + ", siafi=" + siafi + "]";
	}	
	@Override
	public int hashCode() {
		return Objects.hash(bairro, cep, complemento, ddd, gia, ibge, localidade, logradouro, siafi, uf);
	}	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		return Objects.equals(bairro, other.bairro) && Objects.equals(cep, other.cep)
				&& Objects.equals(complemento, other.complemento) && Objects.equals(ddd, other.ddd)
				&& Objects.equals(gia, other.gia) && Objects.equals(ibge, other.ibge)
				&& Objects.equals(localidade, other.localidade) && Objects.equals(logradouro, other.logradouro)
				&& Objects.equals(siafi, other.siafi) && Objects.equals(uf, other.uf);
	}
	
	
	
	
	
	
}
