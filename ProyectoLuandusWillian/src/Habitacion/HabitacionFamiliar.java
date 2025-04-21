package Habitacion;

import Hotel.Habitaciones;

public class HabitacionFamiliar extends Habitaciones {

	private final int CAMA_SUPLETORIAS = 30;

	private boolean servicioCamaSupletoria;

	public HabitacionFamiliar() {

	}

	public HabitacionFamiliar(int numeroHabitacion, double precio, boolean servicioCamaSupletoria) {
		super(numeroHabitacion, precio);
		this.servicioCamaSupletoria = servicioCamaSupletoria;

		if (servicioCamaSupletoria == true) {
			this.setPrecio(this.getPrecio() + CAMA_SUPLETORIAS);
		}
	}

	public void setservicioCamaSupletoria(boolean camaSupletoria) {
		this.servicioCamaSupletoria = camaSupletoria;
	}

	public boolean getservicioCamaSupletoria() {
		return this.servicioCamaSupletoria;
	}
	@Override
	public void mostrarInfo() {
		
	}

	@Override
	public String toString() {
		return super.toString() +  "servicioCamaSupletoria=" + servicioCamaSupletoria + "";
	}
	
	

}
