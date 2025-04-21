package Habitacion;

import Hotel.Habitaciones;

public class HabitacionSuite extends Habitaciones {

	private final int CAMA_SUPLETORIA = 30;

	private boolean servicioCamaSupletoria;

	public HabitacionSuite() {

	}

	public HabitacionSuite(int numeroHabitacion, double precio, boolean servicioCamaSupletoria) {
		super(numeroHabitacion, precio);
		this.servicioCamaSupletoria = servicioCamaSupletoria;

		if (servicioCamaSupletoria == true) {
			this.setPrecio(this.getPrecio() + CAMA_SUPLETORIA);
		}
	}

	public void setservicioCamaSupletoria(boolean camaSupletoria) {
		this.servicioCamaSupletoria = camaSupletoria;
	}

	public boolean getservicioCamaSupletoria() {
		return this.servicioCamaSupletoria;
	}

	

	
	
	@Override
	public String toString() {
	return super.toString() + "servicioCamaSupletoria=" + servicioCamaSupletoria + "";
	}

	@Override
	public void mostrarInfo() {
		
	}
}
