/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Inicio.InicioFerreteria;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alvar
 */
public class TablaEmpleados {
    public void inicializar(JTable tabla){
        Vector<String> titulos = new Vector<String>();
        Vector<Vector<Object>> datos = new Vector<Vector<Object>>();

       titulos.add("Código De Empleado");
       titulos.add("Nombre");
       titulos.add("Apellido Paterno");
       titulos.add("Apellido materno");
       titulos.add("Salario");
       
       for(int i=0; i< InicioFerreteria.listaEmpleados.size(); i++){
        
            Vector<Object> filas = new Vector<Object>();
            filas.add(InicioFerreteria.listaEmpleados.get(i).getCodEmpleado());
            filas.add(InicioFerreteria.listaEmpleados.get(i).getNombre());
            filas.add(InicioFerreteria.listaEmpleados.get(i).getApPat());
            filas.add(InicioFerreteria.listaEmpleados.get(i).getApMat());
            filas.add(InicioFerreteria.listaEmpleados.get(i).getSalarioSemanal());
            
            datos.add(filas);
       }
       
       DefaultTableModel modelo = new DefaultTableModel(datos, titulos);
       tabla.setModel(modelo);
        
    }
    
    /*
    public void inicializar(JTable tablaEMP) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    */
    
}
