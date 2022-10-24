public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    //Constructor
    public Fecha(int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    //Método establecer
    public void EstablecerDia(int dia){
        this.dia = dia;
    }

    public void EstablecerMes(int mes){
        this.mes = mes;
    }

    public void EstablecerAnio(int anio){
        this.anio = anio;
    }

    //Método obtener
    public int ObtenerDia(){
        return dia;
    }

    public int ObtenerMes(){
        return mes;
    }

    public int ObtenerAnio(){
        return anio;
    }

    //Método toString
    @Override
    public String toString(){
        return  ObtenerDia() + "/" + ObtenerMes() + "/" + ObtenerAnio();
    }
}
