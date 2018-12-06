/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mercado.negocio;

import com.mercado.dao.ClienteDao;
import com.mercado.dao.ClienteDaoCRUDHibernateImpl;
import com.mercado.dao.ClienteDaoHibernateImpl;
import com.mercado.dao.DimensionDao;
import com.mercado.dao.DimensionDaoHibernateImpl;
import com.mercado.dao.EstadoDao;
import com.mercado.dao.EstadoDaoHibernateImpl;
import com.mercado.dao.IDaoCRUD;
import com.mercado.dao.PuestoDao;
import com.mercado.dao.PuestoDaoCRUDHibernateImpl;
import com.mercado.dao.PuestoDaoHibernateImpl;
import com.mercado.dao.TipoPuestoDao;
import com.mercado.dao.TipoPuestoDaoHibernateImpl;
import com.mercado.resources.Cliente;
import com.mercado.resources.Dimension;
import com.mercado.resources.Estado;
import com.mercado.resources.Puesto;
import com.mercado.resources.TipoPuesto;
import java.util.List;

/**
 *
 * @author Juan
 */
public class Gestor {

    private TipoPuestoDao tipoPuesto;
    private DimensionDao dimensiones;
    private ClienteDao cliente;
    private IDaoCRUD dao;
    private EstadoDao estados;
    private PuestoDao puestos;

    public Gestor() {
    }

    public List<TipoPuesto> getTipos() {
        tipoPuesto = new TipoPuestoDaoHibernateImpl();
        return tipoPuesto.getTipos();
    }

    public List<Dimension> getDimensiones() {
        dimensiones = new DimensionDaoHibernateImpl();
        return dimensiones.getDimensiones();
    }

    public Cliente buscarCliente(long parseLong) {
        cliente = new ClienteDaoHibernateImpl();
        return cliente.buscarClientePorCuit(parseLong);
    }

    public void crearCliente(Cliente cliente) {
        dao = new ClienteDaoCRUDHibernateImpl();
        dao.create(cliente);
    }

    public List<Estado> getEstados() {
        estados = new EstadoDaoHibernateImpl();
        return estados.getEstados();
    }

    public void crearPuesto(Puesto puesto) {
        dao = new PuestoDaoCRUDHibernateImpl();
        dao.create(puesto);
    }

    public List<Puesto> getPuestos() {
        puestos = new PuestoDaoHibernateImpl();
        return puestos.getPuestos();
    }

}
