package Modelo;

public abstract class Empleado implements Pagar{
    private String codEmpleado;
    private String nombre;
    private String apPat;
    private String apMat;

    //Constructor
    public Empleado(String codEmpleado, String nombre, String apPat, String apMat){
        this.codEmpleado = codEmpleado;
        this.nombre = nombre;
        this.apPat = apPat;
        this.apMat = apMat;
    }

    //Métodos set
    public void setCodEmpleado(String codEmpleado){
        this.codEmpleado = codEmpleado;
    }    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApPaterno(String apPat){
        this.apPat = apPat;
    }
    public void setApMaterno(String apMat){
        this.apMat = apMat;
    }
    
    //Métodos get
    public String getCodEmpleado(){
        return codEmpleado;
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
    
    //Método toString
    @Override
    public String toString() {
        return "Código de empleado: " + getCodEmpleado() + "\nNombre: " + getNombre() + " " + getApPat() + " " + getApMat();
    }
}
