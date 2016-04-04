/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import java.awt.event.ActionListener;
/**
 *
 * @author llasu
 */
public class ControladorRegistroCurso implements ActionListener {
    
    private Curso curso;
    private BDCurso arrayCurso;
    private RegistroCurso registroCurso;
    private BotonesCurso botonesCurso;
public ControladorRegistro(BDCurso arrayCurso,RegistroCurso registro){
    this.arrayCurso= arrayCurso;
    this.registroCurso=registroCurso;
    this.botonesCurso = new BotonesCurso();
}

    
}//Fin de la clase
