/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agate;

/**
 *
 * @author Felipe
 */

import java.util.*;

public class Campaña {
    private double costeReal;
    private double costesProbables;
    private Date fechaTerminacion;
    private Date fechaPago;
    private Date fechaInicio;
    private String titulo;
    private double presupuestos;

    public Campaña(double costeReal, double costesProbables, Date fechaTerminacion, Date fechaPago, Date fechaInicio, String titulo, double presupuestos) {
        this.costeReal = costeReal;
        this.costesProbables = costesProbables;
        this.fechaTerminacion = fechaTerminacion;
        this.fechaPago = fechaPago;
        this.fechaInicio = fechaInicio;
        this.titulo = titulo;
        this.presupuestos = presupuestos;
    }
    
    
    public Persona registrarPersona(){
        return null;
    }
    
    public void resgistroPago(){
        
    }
    
    public int tarifaPersona(){
        return 0;
    }
    

    public double getCosteReal() {
        return costeReal;
    }

    public double getCostesProbables() {
        return costesProbables;
    }

    public Date getFechaTerminacion() {
        return fechaTerminacion;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPresupuestos() {
        return presupuestos;
    }

    public void setCosteReal(double costeReal) {
        this.costeReal = costeReal;
    }

    public void setCostesProbables(double costesProbables) {
        this.costesProbables = costesProbables;
    }

    public void setFechaTerminacion(Date fechaTerminacion) {
        this.fechaTerminacion = fechaTerminacion;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPresupuestos(double presupuestos) {
        this.presupuestos = presupuestos;
    }
    
    
    
    
}
