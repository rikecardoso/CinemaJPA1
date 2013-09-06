/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.persistencia.dao;

import br.com.model.negocio.Funcionario;
import java.util.List;

/**
 *
 * @author celio_henrique
 */
public interface FuncionarioDao extends DAO<Funcionario, Integer>{
    
    List<Funcionario> getByNome (String nome);
    Funcionario getFuncionarioByNome(String nome);
}
