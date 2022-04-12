package Marcas;

import SO_TV.TizenOS;

public class Samsung extends TizenOS {
    String Modelo;

    public Samsung(int pulgadas, String marca, String SO, Boolean HDMI, Boolean HDR, String definicion, String cuentaSamsung, String modelo) {
        super(pulgadas, marca, SO, HDMI, HDR, definicion, cuentaSamsung);
        Modelo = modelo;
    }
}
