/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mercado.dao;

/**
 *
 * @author Juan
 */
public interface IDaoCRUD<T> {
    T read(long id);
    boolean create(T entity);
    boolean delete(T entity);
    boolean update(T entity);
}
