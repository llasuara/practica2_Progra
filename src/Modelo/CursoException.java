/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

public class CursoException extends Exception {
    private boolean limpiarInterfazC;
    
    public CursoException (String msj,boolean limpiarInterfazC){
        super(msj);
        this.limpiarInterfazC=limpiarInterfazC;
    }
    public boolean isLimpiarInterfaz(){
        return limpiarInterfazC;
    }
    
}
