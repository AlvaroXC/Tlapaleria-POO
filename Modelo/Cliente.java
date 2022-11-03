package Modelo;

public abstract class Cliente  {
     
    private String codCliente;
    private String nombre;
    private String apPat;
    private String apMat;
    private String rfc;
     //constructores
    
     public cliente(String codCliente, String nombre, String apPat, String apMat, String rfc) {
        this.codCliente = codCliente;
        this.nombre = nombre;
        this.apPat = apPat;
        this.apMat = apMat;
        this.rfc = rfc;
    }
    
     //get and set

    public String getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPat() {
        return apPat;
    }

    public void setApPat(String apPat) {
        this.apPat = apPat;
    }

    public String getApMat() {
        return apMat;
    }

    public void setApMat(String apMat) {
        this.apMat = apMat;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    
    
    
  
}
