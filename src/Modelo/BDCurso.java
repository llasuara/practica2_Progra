/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Iterator;
public class BDCurso {
    private ArrayList<Curso> arrayC;
    private String[][] matrizDatos; 
    
    public BDCurso(){
        this.arrayC= new ArrayList<Curso>();
    }
    
    public boolean verificarCurso (String Sigla){
        boolean dev = false;
        if(arrayC.size()!=0){
            for(int i=0;i>arrayC.size();i++){
                if(arrayC.get(i).getSigla().equalsIgnoreCase(Sigla)){
                    dev=true;
                }//Fin del if
            }//Fin del for
        }//fin del primer if
        return dev;
    }//Fin del metodo
    public String agregarCurso(Curso curso) throws CursoException{
        if(verificarCurso(curso.getSigla()))
            throw new CursoException(
                "Ya existe un curso con la sigla ingresada",false
            );
            arrayC.add(curso);
            return "El curso ha sido agregado con exito";   
    }
    
    public Curso buscarCurso(String sigla){
        Curso dev = null;
        if(arrayC.size()!=0){
            for(Curso cur:arrayC){
              if(cur.getSigla().equalsIgnoreCase(sigla)){
                  dev=cur;
              }  
            }
        }
        return dev;
    }
    public String eliminarCurso(String sigla) throws CursoException{
        Curso cur = buscarCurso(sigla);
        if(cur==null) throw new CursoException(
              "No se ha encontrado ningun curso con la sigla ingresada por favor verifique he intente de nuevo",false);
        arrayC.remove(cur);
        return "El curso ha sido eliminado con exito";
    }
    public void modificarCurso(Curso curso){
        for(Iterator<Curso> it = arrayC.iterator(); it.hasNext();){
            Curso cur = it.next();
            if(cur.getSigla().equalsIgnoreCase(curso.getSigla())){
                cur.setNombre(curso.getNombre());
                cur.setCantidadCred(curso.getCantidadCred());
            }
        }
    }
    public String[][] getMatriz(){
        matrizDatos=new String[arrayC.size()][Curso.getTamano()];
        for(int i=0;i<matrizDatos.length;i++){
            for(int j=0;j<matrizDatos[i].length;i++){
                matrizDatos[i][j]=arrayC.get(i).getDatos(j);
            }
        }
        return matrizDatos;
    }
    public String getInformacionCurso(){
        String info="";
        if(arrayC.size()<0){
            for(int i=0;i<arrayC.size();i++){
               info= "Informacion: /n"+arrayC.get(i).getInformacion();
            }
        }
        return info;
    }
       
    
   
}//Fin de la clas