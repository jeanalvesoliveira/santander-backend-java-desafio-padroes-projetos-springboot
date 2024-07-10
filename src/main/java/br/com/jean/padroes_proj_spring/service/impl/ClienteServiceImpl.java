package br.com.jean.padroes_proj_spring.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jean.padroes_proj_spring.model.entity.Cliente;
import br.com.jean.padroes_proj_spring.model.entity.Endereco;
import br.com.jean.padroes_proj_spring.model.repository.ClienteRepository;
import br.com.jean.padroes_proj_spring.model.repository.EnderecoRepository;
import br.com.jean.padroes_proj_spring.service.ClienteService;
import br.com.jean.padroes_proj_spring.service.ViaCepService;

@Service
public class ClienteServiceImpl implements ClienteService{

	@Autowired
	ClienteRepository clienteRepository;
	
	@Autowired
	EnderecoRepository enderecoRepository;
	
	@Autowired
	private ViaCepService viaCepService;
	
	
	@Override
	public Iterable<Cliente> buscarTodos() {
		return clienteRepository.findAll();
	}

	@Override
	public Cliente buscarPorId(Long id) {
		return clienteRepository.findById(id).get();
	}

	@Override
	public void inserir(Cliente cliente) {
		String cep = cliente.getEndereco().getCep();
		//String cep = "36570314";
		Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
			Endereco novoEndereco = viaCepService.consultarCep(cep);
			enderecoRepository.save(novoEndereco);
			return novoEndereco;
		});
		
		cliente.setEndereco(endereco);
		
		clienteRepository.save(cliente);
	}

	@Override
	public void atualizar(Long id, Cliente cliente) {
		Optional<Cliente> clienteBd = clienteRepository.findById(id);
		if (clienteBd.isPresent()) {
			inserir(cliente);
		}
	}

	@Override
	public void excluir(Long id) {
		clienteRepository.deleteById(id);		
	}

}
