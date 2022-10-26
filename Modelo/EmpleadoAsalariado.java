package Modelo;

public class EmpleadoAsalariado extends Empleado{
    private double salarioSemanal;
    
    //Constructor
    public EmpleadoAsalariado(String codEmpleado, String nombre, String apPat, String apMat, double salarioSemanal) {
        super(codEmpleado, nombre, apPat, apMat);
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
    public double calcularMontoPago() {
        return getSalarioSemanal();
    }

    //toString
    @Override
    public String toString() {
        return super.toString() + "\nSalario Semanal: " + getSalarioSemanal();
    }
    
}
