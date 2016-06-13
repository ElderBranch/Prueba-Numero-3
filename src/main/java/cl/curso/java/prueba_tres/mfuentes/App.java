package cl.curso.java.prueba_tres.mfuentes;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ArrayList<Viaje> listaViajes = new ArrayList<Viaje>();
        TarjetaBip nuevaTarjeta = new TarjetaBip(2345, 1400, listaViajes);
        PagarViaje pagarThread = new PagarViaje(nuevaTarjeta, 700);
        
        nuevaTarjeta.pagarViaje(700);
        nuevaTarjeta.pagarViaje(700);
        pagarThread.start();
        
        nuevaTarjeta.imprimir();
    }
}
