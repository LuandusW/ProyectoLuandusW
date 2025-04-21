package Hotel;

import java.util.ArrayList;

public abstract class Habitaciones {

	private int numeroHabitacion;
	private double precio;
	protected ArrayList<Reservas> reserva;

	public Habitaciones() {

	}

	public Habitaciones(int numeroHabitacion, double precio) {
		this.numeroHabitacion = numeroHabitacion;
		this.precio = precio;
		this.reserva = new ArrayList<Reservas>();

	}

	public void setnumeroHabitacion(int numeroHabitacion) {
		this.numeroHabitacion = numeroHabitacion;
	}

	public int getnumeroHabitacion() {
		return this.numeroHabitacion;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setReserva() {

	}

	public ArrayList<Reservas> getReserva() {
		return this.reserva;
	}

	public abstract void mostrarInfo();

	@Override
	public String toString() {
		return "numeroHabitacion=" + numeroHabitacion + ", precio=" + precio + ", reserva=" + reserva
				+ " ";
	}

	
	
	

}
