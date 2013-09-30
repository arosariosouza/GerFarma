/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alf.gerfarma.model.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author allan
 */
@Entity
@Table
@DiscriminatorValue(value="PessoaFisica")
public class PessoaFisica extends Pessoa {

    @Column(name = "CPF")
    private String cpf;

    public PessoaFisica() {
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        String oldCpf = this.cpf;
        this.cpf = cpf;
        changeSupport.firePropertyChange("cpf", oldCpf, cpf);
    }       
    
    @Override
    public String toString() {
        return "br.com.alf.gerfarma.model.entity.PessoaFisica[ idPessoa=" + idPessoa + " ]";
    }
    
}
