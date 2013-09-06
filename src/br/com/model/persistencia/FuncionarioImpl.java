/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.persistencia;

import br.com.model.negocio.Funcionario;
import br.com.model.persistencia.dao.FuncionarioDao;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author celio_henrique
 */
public class FuncionarioImpl extends DAOImpl<Funcionario, Integer> implements FuncionarioDao{

    @Override
    public List<Funcionario> getByNome(String nome) {
        return getEntityManager().createQuery("select fu from Funcionario fu where fu.nome like '%" + nome + "%'").getResultList();
    }

    @Override
    public Funcionario getFuncionarioByNome(String nome) {
         Query q = getEntityManager().createQuery("select fu from Funcionario fu where fu.nome like '" + nome + "'", Funcionario.class);
        List<Funcionario> funcionarios = q.getResultList();
        Funcionario fun = new Funcionario();
        for (Funcionario f : funcionarios) {
            fun = f;
        }
        return fun;

    }
    }
    

