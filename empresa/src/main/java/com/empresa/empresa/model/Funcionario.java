package com.empresa.empresa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @NoArgsConstructor @Data
public class Funcionario {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int id_funcionario;
	
	private String nome;
	
	private String cpf;
	
	private String endereco;
	
	private double salario;

}
