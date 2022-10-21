/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inicio;

import Modelo.EmpleadoAsalariado;
import java.util.ArrayList;
import proyecto.gui.FrmInicio;

/**
 *
 * @author aitor
 */
public class InicioRecursosHumanos {
    public static ArrayList<EmpleadoAsalariado> listaEmpleados = new ArrayList<EmpleadoAsalariado>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        new FrmInicio().setVisible(true);
        
    }
}
