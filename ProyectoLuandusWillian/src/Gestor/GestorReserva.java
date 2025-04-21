package Gestor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import Habitacion.HabitacionIndividuales;
import Hotel.Habitaciones;
import Hotel.Hoteles;
import Hotel.Reservas;

public class GestorReserva implements Funcionamiento {
	private Scanner sc = new Scanner(System.in);
	private ArrayList<Hoteles> h;

	public void menu() {
		System.out.println("[1] - Crear Reserva.");
		System.out.println("[2] - Buscar Reserva.");
		System.out.println("[3] - Modificar Reserva.");
		System.out.println("[4] - Eliminar Reserva.");

	}

	private void menuHabitaciones() {
		System.out.println("[1] - Habitacion Individual.");
		System.out.println("[2] - Habitacion Doble.");
		System.out.println("[3] - Habitacion Familiar.");
		System.out.println("[4] - Habitacion Suite.");
	}

	public void crear() {
		// COMPROBAR SI YA TIENE FECHA PARA ESE DIA.
		// Date fechaInicio, Date fechaFin, String dni, boolean pagado
		boolean existe = false;
		for (Hoteles hh : h) {
			System.out.println(hh);
		}

		System.out.println("Introduce el id del hotel.");
		int idHotel = sc.nextInt();

		for (Hoteles hh : h) {
			if (hh.getCodigo() == idHotel) {
				menuHabitaciones();
				System.out.println("Introduce el tipo de habitacion para hacer una reserva.");
				int opc = sc.nextInt();

				switch (opc) {
				case 1:
					System.out.println("Introduce el numero de la habitacion.");
					System.out.println(
							"ID:" + hh.getCodigo() + " Nombre:" + hh.getNombre() + hh.getHabitacionIndividual());
					int numeroHabitacion = sc.nextInt();

					for (HabitacionIndividuales hbi : hh.getHabitacionIndividual()) {

						if (numeroHabitacion == hbi.getnumeroHabitacion()) {
							System.out.println("Introduce la fecha de ingreso. (dd/mm/yyyy");
							String fechaIng = sc.next();
							System.out.println("Introduce la fecha fin. (dd/mm/yyyy");
							String fechaFin = sc.next();
							System.out.println("Introduce el dni del cliente.");
							String dniCli = sc.next();
							System.out.println("La reserva esta pagada ? s/n");
							String pagado = sc.next().toLowerCase();

							SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

							Date fechaIngreso;
							Date fechaSalida;
							try {
								fechaIngreso = formatter.parse(fechaIng);
								fechaSalida = formatter.parse(fechaFin);
								if (pagado.equals("s")) {
									hbi.getReserva().add(new Reservas(fechaIngreso, fechaSalida, dniCli, true));
									existe = true;
								} else if (pagado.equals("n")) {
									hbi.getReserva().add(new Reservas(fechaIngreso, fechaSalida, dniCli, true));
									existe = true;
								} else {
									System.out.println("Opc no valida.");
									break;
								}
							} catch (ParseException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}

						}
					}

					if (!existe) {
						System.out.println("No existe la habitacion.");
					}

					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				}

			}
		}

	}

	public void buscar() {
		// TODO Auto-generated method stub

	}

	public void modificar() {
		// TODO Auto-generated method stub

	}

	public void eliminar() {
		// TODO Auto-generated method stub

	}

}
