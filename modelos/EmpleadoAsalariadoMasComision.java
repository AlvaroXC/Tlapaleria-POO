public class EmpleadoAsalariadoMasComision extends EmpleadoAsalariado{
    private double ventasBrutas;
    private double tarifaComision;
    
    //Constructor
    public EmpleadoAsalariadoMasComision(String codEmpleado, String nombre, String apPat, String apMat, double salarioSemanal, double ventasBrutas, double tarifaComision) {
       super(codEmpleado, nombre, apPat, apMat, salarioSemanal);
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
    public double calcularMontoPago() {
        return super.obtenerMontoPago() + getTarifaComision()*getVentasBrutas();
    }

    //toString
    @Override
    public String toString() {
        return super.toString() + "\nVentas Brutas: " + getVentasBrutas() + "\nTarifa de Comision: " + getTarifaComision();
    }

}
