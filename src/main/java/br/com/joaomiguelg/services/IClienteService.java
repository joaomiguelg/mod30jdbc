/**
 * 
 */
package br.com.joaomiguelg.services;

import br.com.joaomiguelg.domain.Cliente;
import br.com.joaomiguelg.exceptions.DAOException;
import br.com.joaomiguelg.exceptions.TipoChaveNaoEncontradaException;
import br.com.joaomiguelg.services.generic.IGenericService;

/**
 * @author rodrigo.pires
 *
 */
public interface IClienteService extends IGenericService<Cliente, Long> {

	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;

	Cliente buscarPorCPF(Long cpf) throws DAOException;

    void excluir(Long cpf) throws DAOException;

	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException, DAOException;

}
