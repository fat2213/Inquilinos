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
public class Piso extends Viviendas {
    
    private boolean Amoblado;
    private double Año_Construccion;
    
    
        public Piso (int id, int metroscuadrados, double preciomensual, inquilinos inquilino, boolean Amoblado, double Años_Construccion){
        super(id, metroscuadrados, preciomensual, inquilino);
        this.Amoblado = Amoblado;
        this.Año_Construccion = Años_Construccion;
        
    }
    
}
