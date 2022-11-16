package Modelo;

public class Factura implements Pagar{
    private String codArt;
    private String desc;
    private double precioUnitario;
    private int cantidad;
    private String codCliente;
    private String codEmpleado;
    private Fecha fecha;

    public Factura(String codArt, String desc, double precioUnitario, int cantidad, String codCliente, String codEmpleado, Fecha fecha) {
        this.codArt = codArt;
        this.desc = desc;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
        this.codCliente = codCliente;
        this.codEmpleado = codEmpleado;
        this.fecha = fecha;
    }

    public void setCodArt(String codArt) {
        this.codArt = codArt;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
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

    public String getCodArt() {
        return codArt;
    }
    public String getDesc() {
        return desc;
    }
    public double getPrecioUnitario() {
        return precioUnitario;
    }
    public int getCantidad() {
        return cantidad;
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
        return "Código de artículo: " + getCodArt() + "\nDescripción: " + getDesc() + "\nPrecio unitario: " + getPrecioUnitario() + "\nCantidad: " + getCantidad() + "\nCódigo de cliente: " + getCodCliente() + "\nCódigo de empleado: " + getCodEmpleado() + "\nFecha: " + getFecha();
    }
}
