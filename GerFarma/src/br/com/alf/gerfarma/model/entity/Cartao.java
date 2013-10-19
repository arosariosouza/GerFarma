/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alf.gerfarma.model.entity;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author allan
 */
@Entity
@Table(name = "cartao", catalog = "gerfarma", schema = "")
@NamedQueries({
    @NamedQuery(name = "Cartao.findAll", query = "SELECT c FROM Cartao c"),
    @NamedQuery(name = "Cartao.findByIdCartao", query = "SELECT c FROM Cartao c WHERE c.idCartao = :idCartao"),
    @NamedQuery(name = "Cartao.findByBandeira", query = "SELECT c FROM Cartao c WHERE c.bandeira = :bandeira")})
public class Cartao implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_CARTAO")
    private Integer idCartao;
    @Basic(optional = false)
    @Column(name = "BANDEIRA")
    private String bandeira;

    public Cartao() {
    }

    public Cartao(Integer idCartao) {
        this.idCartao = idCartao;
    }

    public Cartao(Integer idCartao, String bandeira) {
        this.idCartao = idCartao;
        this.bandeira = bandeira;
    }

    public Integer getIdCartao() {
        return idCartao;
    }

    public void setIdCartao(Integer idCartao) {
        Integer oldIdCartao = this.idCartao;
        this.idCartao = idCartao;
        changeSupport.firePropertyChange("idCartao", oldIdCartao, idCartao);
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        String oldBandeira = this.bandeira;
        this.bandeira = bandeira;
        changeSupport.firePropertyChange("bandeira", oldBandeira, bandeira);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCartao != null ? idCartao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cartao)) {
            return false;
        }
        Cartao other = (Cartao) object;
        if ((this.idCartao == null && other.idCartao != null) || (this.idCartao != null && !this.idCartao.equals(other.idCartao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.alf.gerfarma.view.Cartao[ idCartao=" + idCartao + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
