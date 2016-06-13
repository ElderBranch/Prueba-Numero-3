/**
 * 
 */
package cl.curso.java.prueba_tres.mfuentes;

import java.util.Date;

/**
 * @author matia
 *
 */
public class Viaje implements Comparable<Viaje>{

	private Date fechaViaje;
	private int saldoTarjeta;
	private int valorViaje;
	
	public Viaje() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param fechaViaje
	 * @param saldoTarjeta
	 * @param valorViaje
	 */
	public Viaje(Date fechaViaje, int saldoTarjeta, int valorViaje) {
		super();
		this.fechaViaje = fechaViaje;
		this.saldoTarjeta = saldoTarjeta;
		this.valorViaje = valorViaje;
	}

	/**
	 * @return the fechaViaje
	 */
	public Date getFechaViaje() {
		return fechaViaje;
	}

	/**
	 * @param fechaViaje the fechaViaje to set
	 */
	public void setFechaViaje(Date fechaViaje) {
		this.fechaViaje = fechaViaje;
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
	 * @return the valorViaje
	 */
	public int getValorViaje() {
		return valorViaje;
	}

	/**
	 * @param valorViaje the valorViaje to set
	 */
	public void setValorViaje(int valorViaje) {
		this.valorViaje = valorViaje;
	}

	public int compareTo(Viaje o) {
		return this.getFechaViaje().compareTo(o.getFechaViaje());
	}
	
	@Override
	public String toString() {
		return 	"Fecha Viaje: " + this.getFechaViaje() +
				"\n Saldo Tarjeta: " + this.getSaldoTarjeta() +
				"\n Pago Viaje: " + this.getValorViaje(); 
	}
}
