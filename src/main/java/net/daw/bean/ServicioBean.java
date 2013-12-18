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
public class ServicioBean {
    private int id = 0;
    private String descripcion = "";
    private int horas=0;
    private double preciohora = 0;

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
     * @return the horas
     */
    public int getHoras() {
        return horas;
    }

    /**
     * @param horas the horas to set
     */
    public void setHoras(int horas) {
        this.horas = horas;
    }

    /**
     * @return the preciohora
     */
    public double getPreciohora() {
        return preciohora;
    }

    /**
     * @param preciohora the preciohora to set
     */
    public void setPreciohora(double preciohora) {
        this.preciohora = preciohora;
    }

}
