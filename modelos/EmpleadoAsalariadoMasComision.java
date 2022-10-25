public class EmpleadoAsalariadoMasComision extends EmpleadoAsalariado{
    private double ventasBrutas;
    private double tarifaComision;
    
    //Constructor
    public EmpleadoAsalariadoMasComision(String codEmpleado, String nombre, String apPat, String apMat, int nss, double salarioSemanal, double ventasBrutas, double tarifaComision) {
       super(codEmpleado, nombre, apPat, apMat, nss, salarioSemanal);
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
    }
    
    //Método set
    public void setVentasBrutas(double ventasBrutas) {
        this.ventasBrutas = ventasBrutas;
    }

    public void setTarifaComision(double tarifaComision) {
        this.tarifaComision = tarifaComision;
    }

    //Método get
    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public double getTarifaComision() {
        return tarifaComision;
    }

    //Otro
    @Override    
    public double obtenerMontoPago() {
        return super.obtenerMontoPago() + getTarifaComision()*getVentasBrutas();
    }

    //toString
    @Override
    public String toString() {
        return super.toString() + "\nSueldo Base: " + getSueldoBase();
    }

}
