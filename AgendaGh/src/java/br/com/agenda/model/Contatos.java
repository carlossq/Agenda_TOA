/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agenda.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Carlos
 */
@Entity(name="contatos")
public class Contatos implements Serializable {
    
    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String celular;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    /*
 Codigo agregado para web services
 */
   /* public Contatos(String nome, String email, String telefone, String celular) {
       this.nome = nome;
       this.email = email;
       this.telefone = telefone;
       this.celular = celular;
    }
*/
    
}