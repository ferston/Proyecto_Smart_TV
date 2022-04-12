package SO_TV;

import smart_tv.Smart_TV;

public abstract class RokuTV extends Smart_TV {
    Boolean Navegador;
    boolean MemoriaInt;

    public Boolean getNavegador() {
        return Navegador;
    }

    public void setNavegador(Boolean navegador) {
        Navegador = navegador;
    }

    public boolean isMemoriaInt() {
        return MemoriaInt;
    }

    public void setMemoriaInt(boolean memoriaInt) {
        MemoriaInt = memoriaInt;
    }

    public RokuTV(int pulgadas, String marca, String SO, Boolean HDMI, Boolean HDR, String definicion, Boolean navegador, boolean memoriaInt) {
        super(pulgadas, marca, SO, HDMI, HDR, definicion);
        Navegador = navegador;
        MemoriaInt = memoriaInt;
    }
}
