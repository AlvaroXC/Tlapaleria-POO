package Modelo;

public class Cliente {
    private String codCliente;
    private String nombre;
    private String apPat;
    private String apMat;
    private String rfc;

     
    public Cliente(String codCliente, String nombre, String apPat, String apMat, String rfc) {
        this.codCliente = codCliente;
        this.nombre = nombre;
        this.apPat = apPat;
        this.apMat = apMat;
        this.rfc = rfc;
    }
    

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApPat(String apPat) {
        this.apPat = apPat;
    }

    public void setApMat(String apMat) {
        this.apMat = apMat;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    
    public String getCodCliente() {
        return codCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApPat() {
        return apPat;
    }

    public String getApMat() {
        return apMat;
    }

    public String getRfc() {
        return rfc;
    }


    @Override
    public String toString(){
        return "Código de empleado: " + getCodCliente() + "\nNombre: " + getNombre() + " " + getApPat() + " " + getApMat()+"\nRFC: "+ getRfc();
    }
}
