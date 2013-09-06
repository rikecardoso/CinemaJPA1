package br.com.model.persistencia;

import br.com.model.negocio.Filme;
import br.com.model.persistencia.dao.FilmeDao;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author celio_henrique
 */
public class FilmeImpl extends DAOImpl<Filme, Integer> implements FilmeDao{

    @Override
    public List<Filme> getByNome(String nome) {
        return getEntityManager().createQuery("select f from Filme f where f.nome like '%" + nome + "%'").getResultList();
    }

    @Override
    public Filme getFilmeByNome(String nome) {
             Query q = getEntityManager().createQuery("select f from Filme f where f.nome like '" + nome + "'", Filme.class);
        List<Filme> filmes = q.getResultList();
        Filme fi = new Filme();
        for (Filme m : filmes) {
            fi = m;
        }
        return fi;

    }
    }

   

    

