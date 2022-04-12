package SO_TV;

import smart_tv.Smart_TV;

public  abstract class AndoirdTV extends Smart_TV {

     String pantalla;
     boolean Lan;
     boolean Antena;

    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }

    public boolean isLan() {
        return Lan;
    }

    public void setLan(boolean lan) {
        Lan = lan;
    }

    public boolean isAntena() {
        return Antena;
    }

    public void setAntena(boolean antena) {
        Antena = antena;
    }

    public AndoirdTV(int pulgadas, String marca, String SO, Boolean HDMI, Boolean HDR, String definicion, String pantalla, boolean lan, boolean antena) {
        super(pulgadas, marca, SO, HDMI, HDR, definicion);
        this.pantalla = pantalla;
        Lan = lan;
        Antena = antena;
    }
}



