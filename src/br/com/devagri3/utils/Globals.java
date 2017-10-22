/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.devagri3.utils;

/**
 *
 * @author willyan
 */
public class Globals {
    
    double prcana;
    double area_total;

    public double getPrcana() {
        return prcana;
    }

    public void setPrcana(double prcana) {
        this.prcana = prcana;
    }

    public double getArea_total() {
        return area_total;
    }

    public void setArea_total(double area_total) {
        this.area_total = area_total;
    }
    

    // prcana e area_total
    public static Globals instancia;

    public Globals() {

    }

    public static Globals getInstancia() {
        if (instancia == null) {
            instancia = new Globals();
        }
        return instancia;

    }
}
