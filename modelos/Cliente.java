
public abstract class Cliente extends Empleado {
    /* 
    private String codCliente;
    private String nombre;
    private String apPat;
    private String apMat;
    */
    private String RFC;

     
    public Cliente(String nombre, String apPat, String apMat, int nss, String rFC) {
        super(nombre, apPat, apMat, nss);
        RFC = rFC;
    }


    public String getRFC() {
        return RFC;
    }
    

    public void setRFC(String rFC) {
        RFC = rFC;
    }

    @Override
    public String toString(){
        return super.toString()+"RFC: "+ getRFC();
    }
}
