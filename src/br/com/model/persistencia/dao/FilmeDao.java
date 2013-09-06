/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.persistencia.dao;

import br.com.model.negocio.Filme;
import java.util.List;

/**
 *
 * @author celio_henrique
 */


public interface FilmeDao extends DAO<Filme, Integer>{
    
    List<Filme> getByNome (String nome);
    Filme getFilmeByNome(String nome);
}
