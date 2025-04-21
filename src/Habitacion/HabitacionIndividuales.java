package Habitacion;

import java.util.ArrayList;

import Hotel.Habitaciones;
import Hotel.Reservas;

public class HabitacionIndividuales extends Habitaciones {

	private boolean comparteBano;
	private ArrayList<Reservas> reserva;

	public HabitacionIndividuales(int numeroHabitacion, double precio, boolean comparteBano) {
		super(numeroHabitacion, precio);
		this.comparteBano = comparteBano;
		this.reserva = new ArrayList<Reservas>();
	}

	public void setcomparteBano(boolean comparteBano) {
		this.comparteBano = comparteBano;
	}

	public boolean getcomparteBano() {
		return this.comparteBano;
	}

	@Override
	public void mostrarInfo() {

		System.out.println();
	}

}
