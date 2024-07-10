package br.com.jean.padroes_proj_spring.service;

import br.com.jean.padroes_proj_spring.model.entity.Cliente;

/**
 * Interface que define o padrão Strategy no domínio do cliente.
 * Se necessário podemos ter múltiplas implementações dessa interface.
 */
public interface ClienteService {

	Iterable<Cliente> buscarTodos();
	
	Cliente buscarPorId(Long id);
	
	void inserir(Cliente cliente);
	
	void atualizar(Long id, Cliente cliente);
	
	void excluir(Long id);
	
}
