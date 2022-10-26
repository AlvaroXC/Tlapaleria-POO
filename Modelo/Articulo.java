package Modelo;

public abstract class Articulo implements Pagar{

    private String codArt;
    private String desc;
    private double precioUnitario;
    private int cantidad;
    
    public Articulo(String codArt, String desc, double precioUnitario, int cantidad) {
        this.codArt = codArt;
        this.desc = desc;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
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

    @Override
    public String toString(){

        return "Código de artículo: "+getCodArt()+"\nDescripción: "+getDesc()+"\nPrecio unitario: "+getPrecioUnitario()+"\nCantidad: "+getCantidad();
    }
}
