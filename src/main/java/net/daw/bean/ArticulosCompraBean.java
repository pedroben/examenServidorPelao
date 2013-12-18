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
public class ArticulosCompraBean {
private int id=0;
private int id_articulo=0;
private int id_tipoarticulo=0;
private int id_compra=0;
private int cantidad=0;

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
     * @return the id_articulo
     */
    public int getId_articulo() {
        return id_articulo;
    }

    /**
     * @param id_articulo the id_articulo to set
     */
    public void setId_articulo(int id_articulo) {
        this.id_articulo = id_articulo;
    }

    /**
     * @return the id_tipoarticulo
     */
    public int getId_tipoarticulo() {
        return id_tipoarticulo;
    }

    /**
     * @param id_tipoarticulo the id_tipoarticulo to set
     */
    public void setId_tipoarticulo(int id_tipoarticulo) {
        this.id_tipoarticulo = id_tipoarticulo;
    }

    /**
     * @return the id_compra
     */
    public int getId_compra() {
        return id_compra;
    }

    /**
     * @param id_compra the id_compra to set
     */
    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
