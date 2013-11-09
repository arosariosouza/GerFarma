/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alf.gerfarma.util;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author allan
 */
public class JPAUtil {
    
    private static EntityManager em = null;
    
    public static EntityManager getInstance() {
        if (em == null)
            em = Persistence.createEntityManagerFactory("GERFARMAPU").createEntityManager();
        return em;
    }
    
    private JPAUtil() {}
}
