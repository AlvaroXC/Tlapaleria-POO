package Inicio;

import Vista.FrmMenu;
import Modelo.Articulo;
import Modelo.Cliente;
import Modelo.EmpleadoAsalariado;
import Modelo.Factura;
import java.util.ArrayList;

public class InicioFerreteria {
    public static ArrayList<Articulo> listaInventario = new ArrayList<>();
    public static ArrayList<Factura> listaFacturas = new ArrayList<>();
    public static ArrayList<EmpleadoAsalariado> listaEmpleados = new ArrayList<>();
    public static ArrayList<Cliente> listaClientes = new ArrayList<>();

    public static void main(String[] args) {
        new FrmMenu().setVisible(true);
    }
}
