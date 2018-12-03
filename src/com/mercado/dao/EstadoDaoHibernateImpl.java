/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mercado.dao;

import com.mercado.resources.Estado;
import com.mercado.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Juan
 */
public class EstadoDaoHibernateImpl implements EstadoDao {

    @Override
    public List<Estado> getEstados() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        List<Estado> estados = s.createQuery("SELECT e FROM Estado e").list();
        s.close();
        return estados;
    }

}
