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
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "medicamento", catalog = "gerfarma", schema = "")
@NamedQueries({
    @NamedQuery(name = "Medicamento.findAll", query = "SELECT m FROM Medicamento m"),
    @NamedQuery(name = "Medicamento.findByIdMedicamento", query = "SELECT m FROM Medicamento m WHERE m.idMedicamento = :idMedicamento"),
    @NamedQuery(name = "Medicamento.findByNome", query = "SELECT m FROM Medicamento m WHERE m.nome = :nome"),
    @NamedQuery(name = "Medicamento.findByFormula", query = "SELECT m FROM Medicamento m WHERE m.formula = :formula"),
    @NamedQuery(name = "Medicamento.findByFabricante", query = "SELECT m FROM Medicamento m WHERE m.fabricante = :fabricante"),
    @NamedQuery(name = "Medicamento.findByPrecoVenda", query = "SELECT m FROM Medicamento m WHERE m.precoVenda = :precoVenda"),
    @NamedQuery(name = "Medicamento.findByPrecoCusto", query = "SELECT m FROM Medicamento m WHERE m.precoCusto = :precoCusto"),
    @NamedQuery(name = "Medicamento.findByCodigoDeBarras", query = "SELECT m FROM Medicamento m WHERE m.codigoDeBarras = :codigoDeBarras"),
    @NamedQuery(name = "Medicamento.findByTipoMedicamento", query = "SELECT m FROM Medicamento m WHERE m.tipoMedicamento = :tipoMedicamento"),
    @NamedQuery(name = "Medicamento.findByGrupoMedicamento", query = "SELECT m FROM Medicamento m WHERE m.grupoMedicamento = :grupoMedicamento")})
public class Medicamento implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_MEDICAMENTO")
    private int idMedicamento;
    @Basic(optional = false)
    @Column(name = "NOME", unique = true)
    private String nome;
    @Basic(optional = false)
    @Column(name = "FORMULA")
    private String formula;
    @Basic(optional = false)
    @Column(name = "FABRICANTE")
    private String fabricante;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "PRECO_VENDA")
    private double precoVenda;
    @Basic(optional = false)
    @Column(name = "PRECO_CUSTO")
    private double precoCusto;
    @Column(name = "CODIGO_DE_BARRAS")
    private String codigoDeBarras;
    @Column(name = "QUANTIDADE_ESTOQUE")
    private int quantidadeEstoque;
    @Column(name = "QUANTIDADE_ESTOQUE_MINIMO")
    private int quantidadeEstoqueMinimo;

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
            int oldQuantidadeEstoque = this.quantidadeEstoque;
        this.quantidadeEstoque = quantidadeEstoque;
            changeSupport.firePropertyChange("quantidadeEstoque", oldQuantidadeEstoque, quantidadeEstoque);
    }

    public int getQuantidadeEstoqueMinimo() {
        return quantidadeEstoqueMinimo;
    }

    public void setQuantidadeEstoqueMinimo(int quantidadeEstoqueMinimo) {
            int oldQuantidadeEstoqueMinimo = this.quantidadeEstoqueMinimo;
        this.quantidadeEstoqueMinimo = quantidadeEstoqueMinimo;
            changeSupport.firePropertyChange("quantidadeEstoqueMinimo", oldQuantidadeEstoqueMinimo, quantidadeEstoqueMinimo);
    }
    @Column(name = "TIPO_MEDICAMENTO")
    private String tipoMedicamento;
    @Column(name = "GRUPO_MEDICAMENTO")
    private String grupoMedicamento;

    public Medicamento() {
    }

    public Medicamento(Integer idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

    public Medicamento(Integer idMedicamento, String nome, String formula, String fabricante, double precoVenda, double precoCusto, String tipoMedicamento, String grupoMedicamento) {
        this.idMedicamento = idMedicamento;
        this.nome = nome;
        this.formula = formula;
        this.fabricante = fabricante;
        this.precoVenda = precoVenda;
        this.precoCusto = precoCusto;
        this.tipoMedicamento = tipoMedicamento;
        this.grupoMedicamento = grupoMedicamento;
    }

    public int getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(int idMedicamento) {
        int oldIdMedicamento = this.idMedicamento;
        this.idMedicamento = idMedicamento;
        changeSupport.firePropertyChange("idMedicamento", oldIdMedicamento, idMedicamento);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        String oldFormula = this.formula;
        this.formula = formula;
        changeSupport.firePropertyChange("formula", oldFormula, formula);
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        String oldFabricante = this.fabricante;
        this.fabricante = fabricante;
        changeSupport.firePropertyChange("fabricante", oldFabricante, fabricante);
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        double oldPrecoVenda = this.precoVenda;
        this.precoVenda = precoVenda;
        changeSupport.firePropertyChange("precoVenda", oldPrecoVenda, precoVenda);
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        double oldPrecoCusto = this.precoCusto;
        this.precoCusto = precoCusto;
        changeSupport.firePropertyChange("precoCusto", oldPrecoCusto, precoCusto);
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(String codigoDeBarras) {
        String oldCodigoDeBarras = this.codigoDeBarras;
        this.codigoDeBarras = codigoDeBarras;
        changeSupport.firePropertyChange("codigoDeBarras", oldCodigoDeBarras, codigoDeBarras);
    }

    public String getTipoMedicamento() {
        return tipoMedicamento;
    }

    public void setTipoMedicamento(String tipoMedicamento) {
        String oldTipoMedicamento = this.tipoMedicamento;
        this.tipoMedicamento = tipoMedicamento;
        changeSupport.firePropertyChange("tipoMedicamento", oldTipoMedicamento, tipoMedicamento);
    }

    public String getGrupoMedicamento() {
        return grupoMedicamento;
    }

    public void setGrupoMedicamento(String grupoMedicamento) {
        String oldGrupoMedicamento = this.grupoMedicamento;
        this.grupoMedicamento = grupoMedicamento;
        changeSupport.firePropertyChange("grupoMedicamento", oldGrupoMedicamento, grupoMedicamento);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.idMedicamento;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Medicamento other = (Medicamento) obj;
        if (this.idMedicamento != other.idMedicamento) {
            return false;
        }
        return true;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}

