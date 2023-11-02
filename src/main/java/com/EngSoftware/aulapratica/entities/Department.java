package com.EngSoftware.aulapratica.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


//@Entity para dizer que esta clase é uma JPA
//@Table mapeamento da classe para tabela

@Entity 
@Table(name = "tb_department")
public class Department {
	
	//Criação do objeto relacional dos bancos
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	private String name;
	
// Construtor da classe
	
	public Department() {
		
	}

//Get and Set
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
