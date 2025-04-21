package Habitacion;

import Hotel.Habitaciones;

public class HabitacionDoble extends Habitaciones {

	private boolean comparteBano;

	public HabitacionDoble() {

	}

	public HabitacionDoble(int numeroHabitacion, double precio, boolean comparteBano) {
		super(numeroHabitacion, precio);
		this.comparteBano = comparteBano;

		if (comparteBano == true) {
			this.setPrecio(this.getPrecio() + this.getPrecio() * 0.15);
		}
	}

	public void setcomparteBano(boolean comparteBano) {
		this.comparteBano = comparteBano;
	}

	public boolean getcomparteBano() {
		return this.comparteBano;
	}

	@Override
	public String toString() {
		return super.toString() + "comparteBano=" + comparteBano + "";
	}

	@Override
	public void mostrarInfo() {

	}

}
