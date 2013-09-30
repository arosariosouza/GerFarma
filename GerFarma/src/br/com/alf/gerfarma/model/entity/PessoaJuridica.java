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
@DiscriminatorValue(value="PessoaJuridica")
public class PessoaJuridica extends Pessoa {

    @Column(name="CNPJ")
    private String cnpj;

    public PessoaJuridica() {
    }
    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        String oldCnpj = this.cnpj;
        this.cnpj = cnpj;
        changeSupport.firePropertyChange("cnpj", oldCnpj, cnpj);
    }
    
    @Override
    public String toString() {
        return "br.com.alf.gerfarma.model.entity.PessoaJuridica[ idPessoa=" + idPessoa + " ]";
    }
}
