package br.com.model.negocio;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author celio_henrique
 */
@Entity
public class Funcionario implements Serializable {
    
    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private String idade;
    private String funcao;
    private String observacoes;
    
    @ManyToOne
    @JoinColumn(name = "idFilme", referencedColumnName = "id")
    private Filme filme;
    
    public Funcionario() {
    }

    public int getId() {
        return id;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    public String toString() {
        return this.nome;
    }

    
    
}
