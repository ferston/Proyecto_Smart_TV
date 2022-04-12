package Marcas;

import SO_TV.RokuTV;

public class TCL extends RokuTV {

 String menu;

    public TCL(int pulgadas, String marca, String SO, Boolean HDMI, Boolean HDR, String definicion, Boolean navegador, boolean memoriaInt, String menu) {
        super(pulgadas, marca, SO, HDMI, HDR, definicion, navegador, memoriaInt);
        this.menu = menu;
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
                        " Navegador:" + getNavegador()+
                        " Memoria int:" +isMemoriaInt()+
                        " Menu WebOS: "+ getMenu());

    }
}

