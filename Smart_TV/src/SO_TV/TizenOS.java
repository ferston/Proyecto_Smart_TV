package SO_TV;

import smart_tv.Smart_TV;

public abstract class TizenOS extends Smart_TV {
    String CuentaSamsung;

    public TizenOS(int pulgadas, String marca, String SO, Boolean HDMI, Boolean HDR, String definicion, String cuentaSamsung) {
        super(pulgadas, marca, SO, HDMI, HDR, definicion);
        CuentaSamsung = cuentaSamsung;
    }
}
