
public abstract class Cliente extends Empleado {
    /* 
    private String codCliente;
    private String nombre;
    private String apPat;
    private String apMat;
    */
    private String rfc;

     
    public Cliente(String codEmpleado, String nombre, String apPat, String apMat, String rfc) {
        super(codEmpleado, nombre, apPat, apMat);
        this.rfc = rfc;
    }
    
    public void setRFC(String rfc) {
        this.rfc = rfc;
    }

    public String getRFC() {
        return rfc;
    }

    @Override
    public String toString(){
        return super.toString()+"\nRFC: "+ getRFC();
    }
}
