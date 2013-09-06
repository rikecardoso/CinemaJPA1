/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.negocio;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author celio_henrique
 */
@Entity
public class Filme implements Comparable<Filme>, Serializable{
    
    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private String genero;
    private int idade;
    private String duracaoFilme;
    private String tresD;
    private float entrada;

    

    public Filme() {
    }



    public int getId() {
        return id;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDuracaoFilme() {
        return duracaoFilme;
    }

    public void setDuracaoFilme(String duracaoFilme) {
        this.duracaoFilme = duracaoFilme;
    }

    public String isTresD() {
        return tresD;
    }

    public void setTresD(String tresD) {
        this.tresD = tresD;
    }

    public float getEntrada() {
        return entrada;
    }

    public void setEntrada(float entrada) {
        this.entrada = entrada;
    }
    public String toString() {
        return this.nome;
    }

    @Override
    public int compareTo(Filme o) {
           if (this.idade > o.getIdade()) {
        } else {
            return -1;
        }
        if (this.idade < o.getIdade()) {
        } else {
            return 1;
        }
        return 0;
    }
    
    }
