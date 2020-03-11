package com.empresa.empresa.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.empresa.empresa.model.Funcionario;

@RepositoryRestResource(collectionResourceRel = "Funcionario" , path = "Funcionario")
public interface FuncionarioRepository extends PagingAndSortingRepository<Funcionario, Integer>{
	
	List<Funcionario> findByCpf(String cpf);
	
	Funcionario findByNome(String nome);
	
	List<Funcionario> findByEndereco(String endereco);
	
	Funcionario findByNomeAndCpf(String nome, String cpf);
	
	List<Funcionario> findBySalario(double salario);

}
