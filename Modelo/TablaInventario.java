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
public class TablaInventario {
    public void inicializar(JTable tblInventario){
        Vector<String> titulos = new Vector<String>();
        Vector<Vector<Object>> datos = new Vector<Vector<Object>>();

       titulos.add("Código Articulo");
       titulos.add("Descripción");
       titulos.add("Precio Unitario");
       titulos.add("Cantidad");
       
       for(int i=0; i< InicioFerreteria.listaInventario.size(); i++){
        
            Vector<Object> filas = new Vector<Object>();
            filas.add(InicioFerreteria.listaInventario.get(i).getCodArt());
            filas.add(InicioFerreteria.listaInventario.get(i).getDesc());
            filas.add(InicioFerreteria.listaInventario.get(i).getPrecioUnitario());
            filas.add(InicioFerreteria.listaInventario.get(i).getCantidad());
            
            datos.add(filas);
       }
       
       DefaultTableModel modelo = new DefaultTableModel(datos, titulos);
       tblInventario.setModel(modelo);
        
    }
}
