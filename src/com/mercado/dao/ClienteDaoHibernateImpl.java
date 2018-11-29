/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mercado.dao;

import com.mercado.resources.Cliente;
import com.mercado.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author alumno
 */
public class ClienteDaoHibernateImpl implements ClienteDao{

    @Override
    public Cliente buscarClientePorId(long id) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Query query = s.createQuery("SELECT c FROM Cliente c WHERE c.cuitCliente = ?");
        query.setLong(0, id);
        Cliente cliente = (Cliente) query;
        s.close();
        return cliente;
    }
    
}
