/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

public class Curso {
    private String nombre;
    private String sigla;
    private String cantidadCred;
    private static String[] etiquetas ={"nombre", "sigla","cantidadCred"};
    
     public String getDatos(int j) {

        switch (j) {
            case 0:
                return nombre;
                
            case 1:
                return sigla;
                
            case 2: 
                return cantidadCred;
                

        }
        return null;

    }
    
    public static String[] getEtiqueta(){
        return etiquetas;
    }
    
    public static int getTamano(){
        return etiquetas.length;         
          
    }
    
    public Curso(String nombre, String sigla,String cantidadCred){
        this.nombre=nombre;
        this.sigla=sigla;
        this.cantidadCred=cantidadCred;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getCantidadCred() {
        return cantidadCred;
    }

    public void setCantidadCred(String cantidadCred) {
        this.cantidadCred = cantidadCred;
    }

    public String getInformacion(){
        return "Nombre"+nombre+"Sigla"+sigla+"Numero de creditos"+cantidadCred;
    }
    
}//Fin de la clase