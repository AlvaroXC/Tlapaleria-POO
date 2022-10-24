/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.tlapaleria.Modelo;

/**
 *
 * @author aitor
 */
public class EmpleadoAsalariado extends Empleado{
    private double salarioSemanal;
    
    //Constructor
    public EmpleadoAsalariado(String nombre, String apPat, String apMat, int nss, double salarioSemanal) {
        super(nombre, apPat, apMat, nss);
        this.salarioSemanal = salarioSemanal;
    }
    
    //Método set
    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }
    
    //Método get
    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    //Otro
    @Override    
    public double obtenerMontoPago() {
        return getSalarioSemanal();
    }

    //toString
    @Override
    public String toString() {
        return super.toString() + "\nSalario Semanal: " + getSalarioSemanal();
    }
    
}
