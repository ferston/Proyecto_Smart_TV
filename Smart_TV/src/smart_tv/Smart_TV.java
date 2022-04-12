/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package smart_tv;

/**
 *
 * @author Home
 */
public class Smart_TV {
    int pulgadas;
    String Marca;
    String SO;
    Boolean HDMI;
    Boolean HDR;
    String Definicion;

    public Smart_TV(int pulgadas, String marca, String SO, Boolean HDMI, Boolean HDR, String definicion) {
        this.pulgadas = pulgadas;
        Marca = marca;
        this.SO = SO;
        this.HDMI = HDMI;
        this.HDR = HDR;
        Definicion = definicion;
    }

    public void metodoAbstrIniciarAndorid_TV(){
        System.out.println("Iniciando el sistema Andorid TV");
    }


    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getSO() {
        return SO;
    }

    public void setSO(String SO) {
        this.SO = SO;
    }

    public Boolean getHDMI() {
        return HDMI;
    }

    public void setHDMI(Boolean HDMI) {
        this.HDMI = HDMI;
    }

    public Boolean getHDR() {
        return HDR;
    }

    public void setHDR(Boolean HDR) {
        this.HDR = HDR;
    }

    public String getDefinicion() {
        return Definicion;
    }

    public void setDefinicion(String Definicion) {
        this.Definicion = Definicion;
    }

    public void Encender(){
        System.out.println("Encendiendo Pantalla");
    }

    public void Apagar(){
        System.out.println("Apagando pantalla");
    }

    public void Netflix(){
        System.out.println("Abiendo Netflix");
    }

}


