package com.generation.blogpessoal.model;

public class UserLogin {
	private Long Id;
	
	private String nome;
	
	private String usuario;
	
	private String senha;
	
	private String token;
	
	private String Foto;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getFoto() {
		return Foto;
	}

	public void setFoto(String foto) {
		Foto = foto;
	}

	public Long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}
	

}
