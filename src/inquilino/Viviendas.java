/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inquilino;

/**
 *
 * @author matias
 */
public class Viviendas {
    protected int id;
    protected int metroscuadrados;
    protected double preciomensual;
    protected inquilinos inquilino;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMetroscuadrados() {
        return metroscuadrados;
    }

    public void setMetroscuadrados(int metroscuadrados) {
        this.metroscuadrados = metroscuadrados;
    }

    public double getPreciomensual() {
        return preciomensual;
    }

    public void setPreciomensual(double preciomensual) {
        this.preciomensual = preciomensual;
    }

    public inquilinos getInquilino() {
        return inquilino;
    }

    public void setInquilino(inquilinos inquilino) {
        this.inquilino = inquilino;
    }

    
    
    public Viviendas(int id, int metroscuadrados, double preciomensual, inquilinos inquilino){
        this.id=id;
        this.metroscuadrados= metroscuadrados;
        this.preciomensual=preciomensual;
        this.inquilino=inquilino;
        
        
    }
    
}
