package SO_TV;

import smart_tv.Smart_TV;

public abstract class WebOs extends Smart_TV {

    public WebOs(int pulgadas, String marca, String SO, Boolean HDMI, Boolean HDR, String definicion) {
        super(pulgadas, marca, SO, HDMI, HDR, definicion);
    }
}
