package Hotel;

import java.util.ArrayList;

import Habitacion.HabitacionDoble;
import Habitacion.HabitacionFamiliar;
import Habitacion.HabitacionIndividuales;
import Habitacion.HabitacionSuite;

/**
 * @version 1.0
 */

public class Hoteles {
	/**
	 * @author Luandus Willian Rodrigues Da Silva
	 */
	private int codigo;
	private String nombre;
	private String direccion;
	private String ciudad;
	private ArrayList<HabitacionDoble> habitacionDoble;
	private ArrayList<HabitacionFamiliar> habitacionFamiliar;
	private ArrayList<HabitacionIndividuales> habitacionIndividual;
	private ArrayList<HabitacionSuite> habitacionSuite;

	public Hoteles() {

	}

	public Hoteles(int codigo, String nombre, String direccion, String ciudad) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.habitacionIndividual = new ArrayList<HabitacionIndividuales>();
		this.habitacionDoble = new ArrayList<HabitacionDoble>();
		this.habitacionFamiliar = new ArrayList<HabitacionFamiliar>();
		this.habitacionSuite = new ArrayList<HabitacionSuite>();

	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCodigo() {
		return this.codigo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public ArrayList<HabitacionDoble> getHabitacionDoble() {
		return habitacionDoble;
	}

	public void setHabitacionDoble(ArrayList<HabitacionDoble> habitacionesDoble) {
		this.habitacionDoble = habitacionesDoble;
	}

	public ArrayList<HabitacionFamiliar> getHabitacionFamiliar() {
		return habitacionFamiliar;
	}

	public void setHabitacionFamiliar(ArrayList<HabitacionFamiliar> habitacionFamiliar) {
		this.habitacionFamiliar = habitacionFamiliar;
	}

	public ArrayList<HabitacionIndividuales> getHabitacionIndividual() {
		return habitacionIndividual;
	}

	public void setHabitacionIndividual(ArrayList<HabitacionIndividuales> habitacionIndividual) {
		this.habitacionIndividual = habitacionIndividual;
	}

	public ArrayList<HabitacionSuite> getHabitacionSuite() {
		return habitacionSuite;
	}

	public void setHabitacionSuite(ArrayList<HabitacionSuite> habitacionSuite) {
		this.habitacionSuite = habitacionSuite;
	}

	@Override
	public String toString() {
		return "Hotel [codigo=" + codigo + ", nombre=" + nombre + ", direccion=" + direccion + ", ciudad=" + ciudad
				+ ", habitacionIndividual=" + habitacionIndividual + ", habitacionesDoble=" + habitacionDoble
				+ ", habitacionFamiliar=" + habitacionFamiliar + ", habitacionSuite=" + habitacionSuite + "]";
	}

}
