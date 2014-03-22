/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alf.gerfarma.model.entity;

public enum GrupoMedicamento {

    GENERICO("Genérico"), MARCA("Marca"), SIMILAR("Similar");

    public String valor;

    GrupoMedicamento(String valor) {
        this.valor = valor;
    }

    public String toString() {
        return valor;
    }
}
