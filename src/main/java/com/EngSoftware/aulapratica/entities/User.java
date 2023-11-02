package com.EngSoftware.aulapratica.entities;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


//@Entity para dizer que esta clase é uma JPA
//@Table mapeamento da classe para tabela

@Entity 
@Table(name = "tb_user")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    
	//Criação do objeto relacional dos bancos
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	private String nome;
	private String email;
	private String telefone;
	private String password;
	
	//Objeto usuário com a ligação com objeto Department
	// Vários para um
	@ManyToOne
	@JoinColumn(name = "department_id")
	private Department department;
	
	//O método equals é usado para comparar se dois objetos são iguais, de acordo com a lógica definida na implementação desse método.
	@Override
	public int hashCode() {
		return Objects.hash(email, id, nome, password, telefone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(email, other.email) && Objects.equals(id, other.id) && Objects.equals(nome, other.nome)
				&& Objects.equals(password, other.password) && Objects.equals(telefone, other.telefone);
	}
	
	// Construtor da classe
	public User() {
		
	}

	//Get and Set
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

		
}

