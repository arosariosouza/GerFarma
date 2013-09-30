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
@DiscriminatorValue(value="Medico")
public class Medico extends PessoaFisica {
    
    @Column(name = "CRM")
    private String crm;

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        String oldCrm = this.crm;
        this.crm = crm;
        changeSupport.firePropertyChange("crm", oldCrm, crm);
    }        
}