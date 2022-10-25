/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aitor
 */
public class EmpleadoBaseMasComision extends EmpleadoAsalariado{
    private double sueldoBase;
    
    //Constructor
    public EmpleadoBaseMasComision(String nombre, String apPat, String apMat, int nss, double ventasBrutas, double tarifaComision, double sueldoBase) {
       super(nombre, apPat, apMat, nss, sueldoBase);
        this.sueldoBase = sueldoBase;
    }
    
    //Método set
    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    //Método get
    public double getSueldoBase() {    
        return sueldoBase;
    }

    //Otro
    @Override    
    public double obtenerMontoPago() {
        return super.obtenerMontoPago() + getSueldoBase();
    }

    //toString
    @Override
    public String toString() {
        return super.toString() + "\nSueldo Base: " + getSueldoBase();
    }

}
