package Marcas;

import SO_TV.AndoirdTV;

public class Sony extends AndoirdTV {
 String menu;

    public Sony(int pulgadas, String marca, String SO, Boolean HDMI, Boolean HDR, String definicion, String pantalla, boolean lan, boolean antena) {
        super(pulgadas, marca, SO, HDMI, HDR, definicion, pantalla, lan, antena);
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public void MostrarEspecificaciones(){
        System.out.println("Marca: "+ getMarca() +
                      " , pualgadas: "+ 58+
                        " SO: "+ getSO()+
                        " HDMI: "+ getHDMI()+
                        " HDR: " + getHDR()+
                        " Definición: " + getDefinicion()+
                        " LAN: " + isLan()+
                        " Antena: " + isAntena()+
                        " Menu WebOS: "+ getMenu());

    }
}

