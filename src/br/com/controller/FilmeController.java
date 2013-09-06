package br.com.controller;

import br.com.model.negocio.Filme;
import br.com.model.persistencia.FilmeImpl;
import br.com.model.persistencia.dao.FilmeDao;
import java.util.List;

/**
 *
 * @author celio_henrique
 */
public class FilmeController {
    
    public boolean inserir(Filme filme){
    FilmeDao dao = new FilmeImpl();
    return dao.save(filme);
    }
    
    
    public boolean excluir(int id){
        FilmeDao dao = new FilmeImpl();
        return dao.remove(Filme.class, 
                id);
    }
    
    public List <Filme> listarFilme(){
        FilmeDao dao = new FilmeImpl();
        return dao.getAll(Filme.class);
    }
    
    public Filme listarFilmeById (int id){
        FilmeDao dao = new FilmeImpl();
        return dao.getById(Filme.class, id);
    }
    
    public List<Filme> listarFilmesByNome (String nome){
        FilmeDao dao = new FilmeImpl();
        return dao.getByNome(nome);
    }
    
    public Filme listarFilmeByNome (String nome){
       FilmeDao dao = new FilmeImpl();
       return dao.getFilmeByNome(nome);
   }
}
