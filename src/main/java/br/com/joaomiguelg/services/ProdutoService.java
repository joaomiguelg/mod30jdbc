/**
 * 
 */
package br.com.joaomiguelg.services;

import br.com.joaomiguelg.dao.IProdutoDAO;
import br.com.joaomiguelg.domain.Cliente;
import br.com.joaomiguelg.domain.Produto;
import br.com.joaomiguelg.exceptions.DAOException;
import br.com.joaomiguelg.exceptions.TipoChaveNaoEncontradaException;
import br.com.joaomiguelg.services.generic.GenericService;

/**
 * @author rodrigo.pires
 *
 */
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

	@Override
	public Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException, DAOException {
		return null;
	}
}
