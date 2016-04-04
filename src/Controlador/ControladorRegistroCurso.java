/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Modelo.BDCurso;
import Modelo.Curso;
import Vista.RegistroCurso;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author llasu
 */
public class ControladorRegistroCurso implements ActionListener {
    private BDCurso arrayCurso;
    private RegistroCurso registroCurso;
    
public ControladorRegistroCurso(RegistroCurso registro,BDCurso arrayCurso){
    
    this.arrayCurso= arrayCurso;
    this.registroCurso=registroCurso;
    
}

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getActionCommand().equals("Agregar")){
           System.out.println("Ëntro a evento");
           Curso curso=null;
           System.out.println("hpbt " +  registroCurso.getCampoTSigla().getText());
           if(!arrayCurso.verificarCurso( registroCurso.getCampoTSigla().getText())){
                  curso= new Curso(registroCurso.getCampoTNombre().getText(), registroCurso.getCampoTSigla().getText(), registroCurso.getTextField3().getText());
           }
       }
    }

    
}//Fin de la clase
