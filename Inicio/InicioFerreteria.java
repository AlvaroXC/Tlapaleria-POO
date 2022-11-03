package Inicio;

import Vista.FrmMenu;
import Modelo.Articulo;
import Modelo.Cliente;
import Modelo.EmpleadoAsalariado;
import Modelo.Factura;
import java.util.ArrayList;

public class InicioFerreteria {
    public static ArrayList<Articulo> listaInventario = new ArrayList<Articulo>();
    public static ArrayList<Factura> listaFacturas = new ArrayList<Factura>();
    public static ArrayList<EmpleadoAsalariado> listaEmpleados = new ArrayList<EmpleadoAsalariado>();
    public static ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        new FrmMenu().setVisible(true);
        
    }
    
}
