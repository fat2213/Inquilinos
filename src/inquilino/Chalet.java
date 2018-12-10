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
public class Chalet extends Viviendas {
    
    private boolean Piscina;
    
    
    
    public Chalet (int id, int metroscuadrados, double preciomensual, inquilinos inquilino, boolean Piscina){
        super(id, metroscuadrados, preciomensual, inquilino);
        this.Piscina = Piscina;
    }
    
    
    
    
}
