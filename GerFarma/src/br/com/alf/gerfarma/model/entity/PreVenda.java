/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alf.gerfarma.model.entity;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author flavio
 */
@Entity
@Table(name = "pre_venda", catalog = "gerfarma", schema = "")
@NamedQueries({
    @NamedQuery(name = "PreVenda.findAll", query = "SELECT p FROM PreVenda p")})
public class PreVenda implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_PREVENDA")
    private Integer idPrevenda;
    @ManyToOne
    private Funcionario funcionario;
    @ManyToOne
    private Pessoa cliente;
    @ManyToOne
    private Medico medico;
    @Column(name = "DATA_HORA_PREVENDA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataHoraPrevenda;
    @Basic(optional = false)
    @Column(name = "DESCONTO")
    private long desconto;

    public List<ItemVenda> getItemsVenda() {
        return itemsVenda;
    }

    public void setItemsVenda(List<ItemVenda> itemsVenda) {
        this.itemsVenda = itemsVenda;
    }

    @OneToMany
    private List<ItemVenda> itemsVenda;

    public PreVenda() {
    }

    public PreVenda(Integer idPrevenda) {
        this.idPrevenda = idPrevenda;
    }

    public PreVenda(Integer idPrevenda, Funcionario funcionario, Date dataHoraPrevenda, long desconto) {
        this.idPrevenda = idPrevenda;
        this.funcionario = funcionario;
        this.dataHoraPrevenda = dataHoraPrevenda;
        this.desconto = desconto;
    }

    public Integer getIdPrevenda() {
        return idPrevenda;
    }

    public void setIdPrevenda(Integer idPrevenda) {
        Integer oldIdPrevenda = this.idPrevenda;
        this.idPrevenda = idPrevenda;
        changeSupport.firePropertyChange("idPrevenda", oldIdPrevenda, idPrevenda);
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        Funcionario oldFuncionario = this.funcionario;
        this.funcionario = funcionario;
        changeSupport.firePropertyChange("funcionario", oldFuncionario, funcionario);
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        Pessoa oldCliente = this.cliente;
        this.cliente = cliente;
        changeSupport.firePropertyChange("cliente", oldCliente, cliente);
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        Medico oldMedico = this.medico;
        this.medico = medico;
        changeSupport.firePropertyChange("medico", oldMedico, medico);
    }

    public Date getDataHoraPrevenda() {
        return dataHoraPrevenda;
    }

    public void setDataHoraPrevenda(Date dataHoraPrevenda) {
        Date oldDataHoraPrevenda = this.dataHoraPrevenda;
        this.dataHoraPrevenda = dataHoraPrevenda;
        changeSupport.firePropertyChange("dataHoraPrevenda", oldDataHoraPrevenda, dataHoraPrevenda);
    }

    public long getDesconto() {
        return desconto;
    }

    public void setDesconto(long desconto) {
        long oldDesconto = this.desconto;
        this.desconto = desconto;
        changeSupport.firePropertyChange("desconto", oldDesconto, desconto);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPrevenda != null ? idPrevenda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PreVenda)) {
            return false;
        }
        PreVenda other = (PreVenda) object;
        if ((this.idPrevenda == null && other.idPrevenda != null) || (this.idPrevenda != null && !this.idPrevenda.equals(other.idPrevenda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.alf.gerfarma.view.PreVenda[ idPrevenda=" + idPrevenda + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
