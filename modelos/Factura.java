public class Factura extends Articulo{
    private String codCliente;
    private String codEmpleado;
    Fecha fecha;

    public Factura(String codArt, String desc, double precioUnitario, int cantidad, String codCliente, String codEmpleado, Fecha fecha) {
        super(codArt, desc, precioUnitario, cantidad);
        this.codCliente = codCliente;
        this.codEmpleado = codEmpleado;
        this.fecha = fecha;
    }


    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }

    public void setCodEmpleado(String codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }


    public String getCodCliente() {
        return codCliente;
    }

    public String getCodEmpleado() {
        return codEmpleado;
    }

    public Fecha getFecha() {
        return fecha;
    }
    
    public double calcularMontoPago(){
        return getPrecioUnitario()*getCantidad();
    }


    @Override
    public String toString() {
        return "Código de cliente: " + getCodCliente() + "\nCódigo de empleado: " + getCodEmpleado() + "\nFecha: " + getFecha();
    }

    
}
