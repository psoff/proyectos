/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import Modelo.Practicas;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author FRANCO
 */
@Stateless
public class PracticasFacade extends AbstractFacade<Practicas> {

    @PersistenceContext(unitName = "WebPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PracticasFacade() {
        super(Practicas.class);
    }
    
}
