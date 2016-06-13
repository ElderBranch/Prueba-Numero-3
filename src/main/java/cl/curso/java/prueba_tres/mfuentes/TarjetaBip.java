/**
 * 
 */
package cl.curso.java.prueba_tres.mfuentes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

/**
 * @author matiasF
 *
 */
public class TarjetaBip {

	private int numeroTarjeta;
	private int saldoTarjeta;
	private ArrayList<Viaje> viajesTarjeta;
	
	public TarjetaBip() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param numeroTarjeta
	 * @param saldoTarjeta
	 * @param viajesTarjeta
	 */
	public TarjetaBip(int numeroTarjeta, int saldoTarjeta, ArrayList<Viaje> viajesTarjeta) {
		super();
		this.numeroTarjeta = numeroTarjeta;
		this.saldoTarjeta = saldoTarjeta;
		this.viajesTarjeta = viajesTarjeta;
	}

	/**
	 * @return the numeroTarjeta
	 */
	public int getNumeroTarjeta() {
		return numeroTarjeta;
	}

	/**
	 * @param numeroTarjeta the numeroTarjeta to set
	 */
	public void setNumeroTarjeta(int numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	/**
	 * @return the saldoTarjeta
	 */
	public int getSaldoTarjeta() {
		return saldoTarjeta;
	}

	/**
	 * @param saldoTarjeta the saldoTarjeta to set
	 */
	public void setSaldoTarjeta(int saldoTarjeta) {
		this.saldoTarjeta = saldoTarjeta;
	}

	/**
	 * @return the viajesTarjeta
	 */
	public ArrayList<Viaje> getViajesTarjeta() {
		return viajesTarjeta;
	}

	/**
	 * @param viajesTarjeta the viajesTarjeta to set
	 */
	public void setViajesTarjeta(ArrayList<Viaje> viajesTarjeta) {
		this.viajesTarjeta = viajesTarjeta;
	}
	// Recarga el saldo de la tarjeta
	public void recargar(int monto){
		this.setSaldoTarjeta(this.getSaldoTarjeta() + monto);
		System.out.println("Nuevo Saldo: " + this.getSaldoTarjeta());
	}
	// Paga el viaje usando el saldo de la tarjeta
	public synchronized void pagarViaje(int valorViaje){
		if(this.getSaldoTarjeta() >= valorViaje){
			this.setSaldoTarjeta(this.getSaldoTarjeta() - valorViaje);
			System.out.println(this.getSaldoTarjeta());
			this.getViajesTarjeta().add(new Viaje(new Date(), this.getSaldoTarjeta(), valorViaje));
		} else {
			throw new SinSaldoException("Saldo Insuficiente");
		}
	}
	// Imprime los datos y atributos de la tarjeta.
	public void imprimir(){
		System.out.println("Numero Tarjeta : " + this.getNumeroTarjeta() + "\n Saldo Tarjeta : " + this.getSaldoTarjeta());
		Collections.sort(this.getViajesTarjeta());
		for( Viaje viaje : this.getViajesTarjeta()){
			System.out.println(viaje);
		}
	}
}
