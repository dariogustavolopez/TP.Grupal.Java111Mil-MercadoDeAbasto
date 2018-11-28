/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mercado.dao;

import com.mercado.resources.Dimension;
import com.mercado.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Juan
 */
public class DimensionDaoHibernateImpl implements DimensionDao{

    @Override
    public List<Dimension> getDimensiones() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        List<Dimension> dimensiones = s.createQuery("SELECT d FROM Dimension d").list();
        s.close();
        return dimensiones;
    }
    
}
