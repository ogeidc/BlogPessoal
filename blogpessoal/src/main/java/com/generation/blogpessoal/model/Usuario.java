package com.generation.blogpessoal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import io.swagger.v3.oas.annotations.media.Schema;

@Entity
@Table(name ="tb_usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@NotNull
	@Size(min = 2, max = 100)
	private String nome;
	@Schema(example = "email@email.com.br")
	@NotNull(message = "O atributo Usuario é obrigatório")
	@Email(message = "O atributo usuario deve ser um email valido")
	@Size(min = 5, max = 100)
	private String usuario;
	@NotNull
	@Size(min = 5, max = 100)
	private String senha;
	
	private String Foto;
	
	public Usuario(Long id, String nome, String usuario, String senha, String foto) {
		this.Id = id;
		this.nome = nome;
		this.usuario = usuario;
		this.senha = senha;
		this.Foto = foto;
	}
	public Usuario() {    } 

	
	//getters and setters
	
	public Long getId() {
		return Id;
	}
	public void setId(long id) {
		this.Id = id;
	}
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
	public String getFoto() {
		return Foto;
	}
	public void setFoto(String foto) {
		Foto = foto;
	}
	
	
}
