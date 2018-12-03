/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mercado.dao;

import com.mercado.resources.Puesto;
import com.mercado.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Juan
 */
public class PuestoDaoCRUDHibernateImpl implements IDaoCRUD<Puesto> {

    @Override
    public Puesto read(long id) {
        Puesto oPuesto;
        Session s = HibernateUtil.getSessionFactory().openSession();
        oPuesto = (Puesto) s.get(Puesto.class, id);
        s.close();
        return oPuesto;
    }

    @Override
    public boolean create(Puesto entity) {
        return this.save(entity);
    }

    @Override
    public boolean delete(Puesto entity) {
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
    public boolean update(Puesto entity) {
        return this.save(entity);
    }

    private boolean save(Puesto entity) {
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
