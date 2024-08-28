/**
 * 
 */
package br.com.joaomiguelg.services;

import br.com.joaomiguelg.dao.IClienteDAO;
import br.com.joaomiguelg.domain.Cliente;
import br.com.joaomiguelg.exceptions.DAOException;
import br.com.joaomiguelg.exceptions.MaisDeUmRegistroException;
import br.com.joaomiguelg.exceptions.TableException;
import br.com.joaomiguelg.exceptions.TipoChaveNaoEncontradaException;
import br.com.joaomiguelg.services.generic.GenericService;

/**
 * @author rodrigo.pires
 *
 */
public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {
	
	private IClienteDAO clienteDAO;
	
	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
		this.clienteDAO = clienteDAO;
	}

	@Override
	public Boolean salvar (Cliente cliente) throws TipoChaveNaoEncontradaException, DAOException {
		return clienteDAO.cadastrar(cliente);
	}

	public Boolean cadastrar (Cliente cliente) throws TipoChaveNaoEncontradaException {
		return null;
	}

	@Override
	public Cliente buscarPorCPF(Long cpf) throws DAOException {
		try {
			return this.dao.consultar(cpf);
		} catch (MaisDeUmRegistroException | TableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void excluir(Long cpf) throws DAOException {
		clienteDAO.excluir(cpf);
}

	@Override
	public void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException, DAOException {
		clienteDAO.alterar(cliente);
	}

}
