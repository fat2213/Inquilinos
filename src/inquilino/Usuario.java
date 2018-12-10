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
public class Usuario {
    
    private String Usuario;
    private char []pass;
    
    /**
     * 
     * @param Usuario
     * @param pass 
     */
    public Usuario(String Usuario,char []pass){
        this.Usuario=Usuario;
        this.pass=pass;
    }
    
    public boolean VerificarUsuario(char []passingre,String UsuaIngres){
        boolean Entra;
        if( UsuaIngres.equals(Usuario)){
            Entra=true;
            int correct=0;
            for (int i=0;i<=4;i++){
                if(pass[i]==passingre[i]){
                    correct = correct+1;
                }
            }
            if(correct == pass.length){
               Entra=true;
               return true; 
            }else{
        Entra=false;
        return false;
                        }
        }
        else{
        Entra=false;
        return false;
    }              
    }
    
}

