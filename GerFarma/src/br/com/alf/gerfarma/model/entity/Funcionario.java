/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alf.gerfarma.model.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

/**
 *
 * @author allan
 */
@Entity
@Table
@DiscriminatorValue(value="Funcionario")
public class Funcionario extends PessoaFisica {

    public static String CARGO_CAIXA = "caixa";
    public static String CARGO_BALCONISTA = "balconista";
    public static String CARGO_FARMACEUTICO = "farmacêutico";
    public static String CARGO_GERENTE = "gerente";
    
    @Column(name = "USUARIO")
    private String usuario;

    @Column(name = "SENHA")
    private String senha;

    @Column(name = "CARGO")
    private String cargo;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        String oldUsuario = this.usuario;
        this.usuario = usuario;
        changeSupport.firePropertyChange("usuario", oldUsuario, usuario);    
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        String oldSenha = this.senha;
        this.senha = senha;
        changeSupport.firePropertyChange("senha", oldSenha, senha);
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        cargo = cargo.toLowerCase();
        if (!cargo.equals(CARGO_CAIXA) && !cargo.equals(CARGO_BALCONISTA) && !cargo.equals(CARGO_FARMACEUTICO) && !cargo.equals(CARGO_GERENTE)) {
            cargo = CARGO_CAIXA;
        }
        
        String oldCargo = this.cargo;
        this.cargo = cargo;
        changeSupport.firePropertyChange("cargo", oldCargo, cargo);
    }
        
}