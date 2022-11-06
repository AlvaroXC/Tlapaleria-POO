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
 * @author aitor
 */
public class TablaFacturas {
    public void inicializar(JTable TblRegistroFacturas){
        Vector<String> titulos = new Vector<String>();
        Vector<Vector<Object>> datos = new Vector<Vector<Object>>();

       titulos.add("Código");
       titulos.add("Descripción");
       titulos.add("Precio Unitario");
       titulos.add("Cantidad");
       titulos.add("CODIGO DEL CLIENTE");
       titulos.add("CODIGO DEL EMPLEADO");
       titulos.add("FECHA");
       
       for(int i=0; i< InicioFerreteria.listaFacturas.size(); i++){
        
            Vector<Object> filas = new Vector<Object>();
            filas.add(InicioFerreteria.listaFacturas.get(i).getCodArt());
            filas.add(InicioFerreteria.listaFacturas.get(i).getDesc());
            filas.add(InicioFerreteria.listaFacturas.get(i).getPrecioUnitario());
            filas.add(InicioFerreteria.listaFacturas.get(i).getCantidad());
            filas.add(InicioFerreteria.listaFacturas.get(i).getCodCliente());
            filas.add(InicioFerreteria.listaFacturas.get(i).getCodEmpleado());
            filas.add(InicioFerreteria.listaFacturas.get(i).getFecha());
            
            datos.add(filas);
       }
       
       DefaultTableModel modelo = new DefaultTableModel(datos, titulos);
       TblRegistroFacturas.setModel(modelo);
        
    }
}
