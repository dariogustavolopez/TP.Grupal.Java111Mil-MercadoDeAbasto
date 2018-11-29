/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mercado.dao;

import com.mercado.resources.Cliente;

/**
 *
 * @author Juan
 */
public interface ClienteDao {
    Cliente buscarClientePorId(long id);
}
