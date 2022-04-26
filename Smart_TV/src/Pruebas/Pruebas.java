package Pruebas;

import Marcas.Lg;

public class Pruebas {
    public static void main(String[] args) {
        System.out.println("Creando una pantalla LG");
        Lg lg1 = new Lg(45,"Lg","WebOs",true,false,"4k","Menu Lg Web OS");
        System.out.println("Las especificaciones de la pantalla son:");
        lg1.MostrarEspecificaciones();
        System.out.println("Acciones de la pantalla lg");
        lg1.Encender();
        lg1.Netflix();
        lg1.MostrarMEnu();
        lg1.Apagar();

    }
}
