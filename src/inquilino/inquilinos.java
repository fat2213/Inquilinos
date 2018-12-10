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
public class inquilinos {
    private String nombre;
    private long dni;

    public String getNombre() {
        return nombre;
    }

    public long getDni() {
        return dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }
    
    public inquilinos(String nombre, long dni){
        this.nombre=nombre;
        this.dni=dni;
    }
    
}
    

