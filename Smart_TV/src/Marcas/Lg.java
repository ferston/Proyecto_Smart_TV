package Marcas;

import SO_TV.WebOs;

public class Lg extends WebOs {
    String menu;

    public Lg(int pulgadas, String marca, String SO, Boolean HDMI, Boolean HDR, String definicion, String menu) {
        super(pulgadas, marca, SO, HDMI, HDR, definicion);
        this.menu = menu;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    @Override
    public void MostrarMEnu() {
        System.out.println("Hola soy el menu de LG");
    }

    public void MostrarEspecificaciones(){
        System.out.println("Marca: "+ getMarca() +
                      " , pualgadas: "+ 45+
                        " SO: "+ getSO()+
                        " HDMI: "+ getHDMI()+
                        " HDR: " + getHDR()+
                        " Definición: " + getDefinicion()+
                        " Menu WebOS: "+ getMenu());

    }
}
