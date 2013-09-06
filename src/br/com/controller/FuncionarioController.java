/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controller;

import br.com.model.negocio.Funcionario;
import br.com.model.persistencia.FuncionarioImpl;
import br.com.model.persistencia.dao.FuncionarioDao;
import java.util.List;

/**
 *
 * @author celio_henrique
 */
public class FuncionarioController {
    
    public boolean inserir(Funcionario funcionario){
    FuncionarioDao dao = new FuncionarioImpl();
    return dao.save(funcionario);
    }
    public boolean excluir(int id){
        FuncionarioDao dao = new FuncionarioImpl();
        return dao.remove(Funcionario.class,id); 
                
}
    public List <Funcionario> listarFuncionario(){
        FuncionarioDao dao = new FuncionarioImpl();
        return dao.getAll(Funcionario.class);
    }
    public Funcionario listarFuncionarioById (int id){
        FuncionarioDao dao = new FuncionarioImpl();
        return dao.getById(Funcionario.class, id);
    }
    public List<Funcionario> listarFuncionariosByNome (String nome){
        FuncionarioDao dao = new FuncionarioImpl();
        return dao.getByNome(nome);
    }
     public Funcionario listarFilmeByNome (String nome){
       FuncionarioDao dao = new FuncionarioImpl();
       return dao.getFuncionarioByNome(nome);
   }
}