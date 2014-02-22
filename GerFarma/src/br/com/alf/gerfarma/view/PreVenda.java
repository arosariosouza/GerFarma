/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.alf.gerfarma.view;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
        @NamedQuery(name = "PreVenda.findAll", query = "SELECT p FROM PreVenda p"),
        @NamedQuery(name = "PreVenda.findByIdPrevenda", query = "SELECT p FROM PreVenda p WHERE p.idPrevenda = :idPrevenda"),
        @NamedQuery(name = "PreVenda.findByIdFuncionario", query = "SELECT p FROM PreVenda p WHERE p.idFuncionario = :idFuncionario"),
        @NamedQuery(name = "PreVenda.findByIdCliente", query = "SELECT p FROM PreVenda p WHERE p.idCliente = :idCliente"),
        @NamedQuery(name = "PreVenda.findByIdMedico", query = "SELECT p FROM PreVenda p WHERE p.idMedico = :idMedico"),
        @NamedQuery(name = "PreVenda.findByDataHoraPrevenda", query = "SELECT p FROM PreVenda p WHERE p.dataHoraPrevenda = :dataHoraPrevenda"),
        @NamedQuery(name = "PreVenda.findByDesconto", query = "SELECT p FROM PreVenda p WHERE p.desconto = :desconto")})
public class PreVenda implements Serializable {
        @Transient
        private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
        private static final long serialVersionUID = 1L;
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Basic(optional = false)
        @Column(name = "ID_PREVENDA")
        private Integer idPrevenda;
        @Basic(optional = false)
        @Column(name = "ID_FUNCIONARIO")
        private int idFuncionario;
        @Column(name = "ID_CLIENTE")
        private Integer idCliente;
        @Column(name = "ID_MEDICO")
        private Integer idMedico;
        @Basic(optional = false)
        @Column(name = "DATA_HORA_PREVENDA")
        @Temporal(TemporalType.TIMESTAMP)
        private Date dataHoraPrevenda;
        @Basic(optional = false)
        @Column(name = "DESCONTO")
        private long desconto;

        public PreVenda() {
        }

        public PreVenda(Integer idPrevenda) {
                this.idPrevenda = idPrevenda;
        }

        public PreVenda(Integer idPrevenda, int idFuncionario, Date dataHoraPrevenda, long desconto) {
                this.idPrevenda = idPrevenda;
                this.idFuncionario = idFuncionario;
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

        public int getIdFuncionario() {
                return idFuncionario;
        }

        public void setIdFuncionario(int idFuncionario) {
                int oldIdFuncionario = this.idFuncionario;
                this.idFuncionario = idFuncionario;
                changeSupport.firePropertyChange("idFuncionario", oldIdFuncionario, idFuncionario);
        }

        public Integer getIdCliente() {
                return idCliente;
        }

        public void setIdCliente(Integer idCliente) {
                Integer oldIdCliente = this.idCliente;
                this.idCliente = idCliente;
                changeSupport.firePropertyChange("idCliente", oldIdCliente, idCliente);
        }

        public Integer getIdMedico() {
                return idMedico;
        }

        public void setIdMedico(Integer idMedico) {
                Integer oldIdMedico = this.idMedico;
                this.idMedico = idMedico;
                changeSupport.firePropertyChange("idMedico", oldIdMedico, idMedico);
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
