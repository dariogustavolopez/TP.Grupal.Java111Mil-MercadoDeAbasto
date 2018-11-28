/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mercado.dao;

import com.mercado.resources.TipoPuesto;
import com.mercado.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Juan
 */
public class TipoPuestoDaoHibernateImpl implements TipoPuestoDao{

    @Override
    public List<TipoPuesto> getTipos() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        List<TipoPuesto> tipos = s.createQuery("SELECT tp FROM TipoPuesto tp").list();
        s.close();
        return tipos;
    }
    
}
