/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mercado.negocio;

import com.mercado.dao.DimensionDaoHibernateImpl;
import com.mercado.dao.TipoPuestoDaoHibernateImpl;
import com.mercado.resources.Dimension;
import com.mercado.resources.TipoPuesto;
import java.util.List;

/**
 *
 * @author Juan
 */
public class Gestor {

    private TipoPuestoDaoHibernateImpl tipoPuesto;
    private DimensionDaoHibernateImpl dimensiones;

    public Gestor() {
        tipoPuesto = new TipoPuestoDaoHibernateImpl();
        dimensiones = new DimensionDaoHibernateImpl();
    }

    public List<TipoPuesto> getTipos() {
        return tipoPuesto.getTipos();
    }

    public List<Dimension> getDimensiones() {
        return dimensiones.getDimensiones();
    }

}
