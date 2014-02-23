/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alf.gerfarma.model.entity;

/**
 *
 * @author flavio
 */
public enum TipoMedicamento {

        NAO_CONTROLADO("Não Controlado"), CONTROLADO("Controlado");

        public String valor;

        TipoMedicamento(String valor) {
                this.valor = valor;
        }
}
