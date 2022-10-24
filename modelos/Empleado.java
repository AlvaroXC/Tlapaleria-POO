/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.tlapaleria.Modelo;

/**
 *
 * @author aitor
 */
public abstract class Empleado implements PorPagar{
    private String nombre;
    private String apPat;
    private String apMat;
    private int nss;

    //Constructor
    public Empleado(String nombre, String apPat, String apMat, int nss){
        this.nombre = nombre;
        this.apPat = apPat;
        this.apMat = apMat;
        this.nss = nss;
    }

    //Métodos set
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApPaterno(String apPat){
        this.apPat = apPat;
    }

    public void setApMaterno(String apMat){
        this.apMat = apMat;
    }

    public void setNSS(int nss){
        this.nss = nss;
    }
    
    //Métodos get
    public String getNombre() {
        return nombre;
    }

    public String getApPat() {
        return apPat;
    }

    public String getApMat() {
        return apMat;
    }

    public int getNSS() {
        return nss;
    }
    
    //Codigo para metodo abstracto
    /*No lo imprimo, no necesito poner código aquí, la clase se vuelve abstracta*/
    
    //Método toString
    @Override
    public String toString() {
        return "**Empleado**\nNombre: " + getNombre() + " " + getApPat() + " " + getApMat() + "\nNSS: " + getNSS();
    }
}
