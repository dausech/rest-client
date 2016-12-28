package net.dausech.RestClient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Empresa {
	private Atividade[] atividade_principal;
	private String cnpj;
	private String nome;
	private String logradouro;
	private String numero;
	private String bairro;
	private String municipio;
	private String uf;
	
	
	public Atividade[] getAtividade_principal() {
		return atividade_principal;
	}
	public void setAtividade_principal(Atividade[] atividade_principal) {
		this.atividade_principal = atividade_principal;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	
	  @Override
	    public String toString() {
	        return "Empresa{" +
	                "nome='" + nome + '\'' +
	                ", cnpj=" + cnpj +
	                ", municipio=" + municipio +
	                ", uf=" + uf +
	                ", atividade=" + atividade_principal[0].getText() +
	                '}';
	    }
}
