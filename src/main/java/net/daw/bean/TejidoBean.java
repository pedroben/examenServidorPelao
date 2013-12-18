/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.daw.bean;

import javax.ejb.Stateless;

/**
 *
 * @author al037184
 */
@Stateless
public class TejidoBean {
    private int id=0;
    private String descripcion="";
    private double precio_base=0;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the precio_base
     */
    public double getPrecio_base() {
        return precio_base;
    }

    /**
     * @param precio_base the precio_base to set
     */
    public void setPrecio_base(double precio_base) {
        this.precio_base = precio_base;
    }
}
