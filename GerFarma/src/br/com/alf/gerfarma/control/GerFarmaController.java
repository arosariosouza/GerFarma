/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alf.gerfarma.control;

import br.com.alf.gerfarma.model.entity.Funcionario;

/**
 *
 * @author allan
 */
public class GerFarmaController {
    private static Funcionario funcionarioCorrente = null;

    public static Funcionario getFuncionarioCorrente() {
        return funcionarioCorrente;
    }

    public static void setFuncionarioCorrente(Funcionario aFuncionarioCorrente) {
        funcionarioCorrente = aFuncionarioCorrente;
    }    
}
