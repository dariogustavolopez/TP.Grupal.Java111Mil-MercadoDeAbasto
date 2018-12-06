/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mercado.dao;

import com.mercado.resources.Puesto;
import com.mercado.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Juan
 */
public class PuestoDaoHibernateImpl implements PuestoDao{

    @Override
    public List<Puesto> getPuestos() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        List<Puesto> puestos = s.createQuery("SELECT p FROM Puesto p").list();
        s.close();
        return puestos;
    }
    
}
