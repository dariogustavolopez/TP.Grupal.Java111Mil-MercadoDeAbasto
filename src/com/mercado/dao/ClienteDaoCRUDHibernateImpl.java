/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mercado.dao;

import com.mercado.resources.Cliente;
import com.mercado.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Juan
 */
public class ClienteDaoCRUDHibernateImpl implements IDaoCRUD<Cliente> {

    @Override
    public Cliente read(long id) {
        Cliente oCliente;
        Session s = HibernateUtil.getSessionFactory().openSession();
        oCliente = (Cliente) s.get(Cliente.class, id);
        s.close();
        return oCliente;
    }

    @Override
    public boolean create(Cliente entity) {
        return this.save(entity);
    }

    @Override
    public boolean delete(Cliente entity) {
        boolean aviso = true;
        Session s = HibernateUtil.getSessionFactory().openSession();
        try {
            s.beginTransaction();
            s.delete(entity);
            s.getTransaction().commit();
        } catch (HibernateException ex) {
            s.getTransaction().rollback();
            aviso = false;
        } finally {
            if (s != null && s.isOpen()) {
                s.close();
            }
        }
        return aviso;
    }

    @Override
    public boolean update(Cliente entity) {
        return this.save(entity);
    }

    private boolean save(Cliente entity) {
        boolean aviso = true;
        Session s = HibernateUtil.getSessionFactory().openSession();
        try {
            s.beginTransaction();
            s.saveOrUpdate(entity);
            s.getTransaction().commit();
        } catch (HibernateException ex) {
            s.getTransaction().rollback();
            aviso = false;
        } finally {
            if (s != null && s.isOpen()) {
                s.close();
            }
        }
        return aviso;
    }
}
