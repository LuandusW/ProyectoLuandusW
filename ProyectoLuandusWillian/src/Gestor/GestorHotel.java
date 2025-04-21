package Gestor;

import java.util.ArrayList;
import java.util.Scanner;

import Habitacion.HabitacionDoble;
import Habitacion.HabitacionFamiliar;
import Habitacion.HabitacionIndividuales;
import Habitacion.HabitacionSuite;
import Hotel.Habitaciones;
import Hotel.Hoteles;

public class GestorHotel implements Funcionamiento {

	private ArrayList<Hoteles> h = new ArrayList<>();
	private Scanner sc = new Scanner(System.in);

	public GestorHotel() {

	}

	public void hotelApp() {
		System.out.println("Gestor Hoteles.");
		menu();
		int opc = sc.nextInt();
		switch (opc) {
		case 1:
			crear();
			break;
		case 2:
			buscar();
			break;
		case 3:
			modificar();
			break;
		case 4:
			eliminar();
			break;

		default:
			System.out.println("Opcion no es valida.");
			break;
		}

	}

	public void menu() {
		// TODO Auto-generated method stub
		System.out.println("[1] - Crear Hotel.");
		System.out.println("[2] - Buscar Hotel.");
		System.out.println("[3] - Modificar Hotel.");
		System.out.println("[4] - Eliminar Hotel.");
	}

	public void menuModificar() {
		// private int codigo;
		// private String nombre;
		// private String direccion;
		// private String ciudad;
		System.out.println("[1] - Nombre.");
		System.out.println("[2] - Dirrecion.");
		System.out.println("[3] - Ciudad.");
	}

	public void crear() {
		// VALIDAR HOTELES PARA QUE NO SE CREEN IGUALES. VALIDAR POR ID.

		// private int codigo;
		// private String nombre;
		// private String direccion;
		// private String ciudad;
		boolean existe = false;

		System.out.println("Codigo hotel.");
		int codigoHotel = sc.nextInt();
		for (Hoteles hh : h) {
			if (codigoHotel == hh.getCodigo()) {
				existe = true;
				break;
			}
		}

		if (!existe) {
			sc.nextLine();
			System.out.println("Nombre hotel.");
			String nombreHotel = sc.nextLine().toLowerCase();
			System.out.println("Direccion hotel.");
			String direccionHotel = sc.nextLine().toLowerCase();
			System.out.println("Ciudad hotel.");
			String ciudadHotel = sc.next().toLowerCase();
			h.add(new Hoteles(codigoHotel, nombreHotel, direccionHotel, ciudadHotel));
			System.out.println("Hotel creado.");
		} else {
			System.out.println("Ya existe un hotel con este codigo.");
		}

	}

	public void cargarHotelesDebug() {
		// Crear hoteles
		Hoteles hotel1 = new Hoteles(1, "Hotel Sol", "Av. del Sol 123", "Lima");
		Hoteles hotel2 = new Hoteles(2, "Hotel Luna", "Calle de la Luna 456", "Cusco");
		Hoteles hotel3 = new Hoteles(3, "Hotel Estrella", "Av. Estrella 789", "Arequipa");
		Hoteles hotel4 = new Hoteles(4, "Hotel Mar", "Calle Mar 101", "Trujillo");
		Hoteles hotel5 = new Hoteles(5, "Hotel Andes", "Calle Andes 202", "Huaraz");
		Hoteles hotel6 = new Hoteles(6, "Hotel Brisa", "Av. Brisa Marina 303", "Piura");
		Hoteles hotel7 = new Hoteles(7, "Hotel Nube", "Calle Nube Alta 404", "Tarapoto");
		Hoteles hotel8 = new Hoteles(8, "Hotel Playa", "Av. Playa Sur 505", "Máncora");
		Hoteles hotel9 = new Hoteles(9, "Hotel Cielo", "Calle Cielo Azul 606", "Pucallpa");
		Hoteles hotel10 = new Hoteles(10, "Hotel Montaña", "Av. Montaña 707", "Ayacucho");

		// Agregar hoteles a la lista
		h.add(hotel1);
		h.add(hotel2);
		h.add(hotel3);
		h.add(hotel4);
		h.add(hotel5);
		h.add(hotel6);
		h.add(hotel7);
		h.add(hotel8);
		h.add(hotel9);
		h.add(hotel10);

		// Habitaciones Hotel 1
		hotel1.getHabitacionIndividual().add(new HabitacionIndividuales(1, 100.0, false));
		hotel1.getHabitacionDoble().add(new HabitacionDoble(2, 150.0, true));
		hotel1.getHabitacionFamiliar().add(new HabitacionFamiliar(3, 200.0, true));
		hotel1.getHabitacionSuite().add(new HabitacionSuite(4, 300.0, true));
		hotel1.getHabitacionSuite().add(new HabitacionSuite(5, 320.0, false));
		hotel1.getHabitacionIndividual().add(new HabitacionIndividuales(2, 120.0, true));
		hotel1.getHabitacionIndividual().add(new HabitacionIndividuales(3, 150.0, false));
		hotel1.getHabitacionIndividual().add(new HabitacionIndividuales(4, 130.0, true));
		hotel1.getHabitacionIndividual().add(new HabitacionIndividuales(5, 110.0, false));

		// Hotel 2
		hotel2.getHabitacionIndividual().add(new HabitacionIndividuales(6, 105.0, false));
		hotel2.getHabitacionDoble().add(new HabitacionDoble(7, 155.0, false));
		hotel2.getHabitacionFamiliar().add(new HabitacionFamiliar(8, 210.0, true));
		hotel2.getHabitacionSuite().add(new HabitacionSuite(9, 310.0, false));
		hotel2.getHabitacionSuite().add(new HabitacionSuite(10, 330.0, true));

		// Hotel 3
		hotel3.getHabitacionIndividual().add(new HabitacionIndividuales(11, 102.0, false));
		hotel3.getHabitacionDoble().add(new HabitacionDoble(12, 152.0, true));
		hotel3.getHabitacionFamiliar().add(new HabitacionFamiliar(13, 205.0, true));
		hotel3.getHabitacionSuite().add(new HabitacionSuite(14, 305.0, true));
		hotel3.getHabitacionSuite().add(new HabitacionSuite(15, 325.0, false));

		// Hotel 4
		hotel4.getHabitacionIndividual().add(new HabitacionIndividuales(16, 108.0, false));
		hotel4.getHabitacionDoble().add(new HabitacionDoble(17, 158.0, false));
		hotel4.getHabitacionFamiliar().add(new HabitacionFamiliar(18, 215.0, false));
		hotel4.getHabitacionSuite().add(new HabitacionSuite(19, 315.0, true));
		hotel4.getHabitacionSuite().add(new HabitacionSuite(20, 335.0, true));

		// Hotel 5
		hotel5.getHabitacionIndividual().add(new HabitacionIndividuales(21, 109.0, false));
		hotel5.getHabitacionDoble().add(new HabitacionDoble(22, 159.0, true));
		hotel5.getHabitacionFamiliar().add(new HabitacionFamiliar(23, 219.0, false));
		hotel5.getHabitacionSuite().add(new HabitacionSuite(24, 319.0, true));
		hotel5.getHabitacionSuite().add(new HabitacionSuite(25, 339.0, false));

		// Hotel 6
		hotel6.getHabitacionIndividual().add(new HabitacionIndividuales(26, 110.0, false));
		hotel6.getHabitacionDoble().add(new HabitacionDoble(27, 160.0, true));
		hotel6.getHabitacionFamiliar().add(new HabitacionFamiliar(28, 220.0, true));
		hotel6.getHabitacionSuite().add(new HabitacionSuite(29, 320.0, true));
		hotel6.getHabitacionSuite().add(new HabitacionSuite(30, 340.0, false));

		// Hotel 7
		hotel7.getHabitacionIndividual().add(new HabitacionIndividuales(31, 115.0, false));
		hotel7.getHabitacionDoble().add(new HabitacionDoble(32, 165.0, false));
		hotel7.getHabitacionFamiliar().add(new HabitacionFamiliar(33, 225.0, true));
		hotel7.getHabitacionSuite().add(new HabitacionSuite(34, 325.0, true));
		hotel7.getHabitacionSuite().add(new HabitacionSuite(35, 345.0, false));

		// Hotel 8
		hotel8.getHabitacionIndividual().add(new HabitacionIndividuales(36, 118.0, false));
		hotel8.getHabitacionDoble().add(new HabitacionDoble(37, 168.0, true));
		hotel8.getHabitacionFamiliar().add(new HabitacionFamiliar(38, 228.0, false));
		hotel8.getHabitacionSuite().add(new HabitacionSuite(39, 328.0, true));
		hotel8.getHabitacionSuite().add(new HabitacionSuite(40, 348.0, false));

		// Hotel 9
		hotel9.getHabitacionIndividual().add(new HabitacionIndividuales(41, 119.0, false));
		hotel9.getHabitacionDoble().add(new HabitacionDoble(42, 169.0, true));
		hotel9.getHabitacionFamiliar().add(new HabitacionFamiliar(43, 229.0, true));
		hotel9.getHabitacionSuite().add(new HabitacionSuite(44, 329.0, false));
		hotel9.getHabitacionSuite().add(new HabitacionSuite(45, 349.0, true));

		// Hotel 10
		hotel10.getHabitacionIndividual().add(new HabitacionIndividuales(46, 120.0, false));
		hotel10.getHabitacionDoble().add(new HabitacionDoble(47, 170.0, false));
		hotel10.getHabitacionFamiliar().add(new HabitacionFamiliar(48, 230.0, true));
		hotel10.getHabitacionSuite().add(new HabitacionSuite(49, 330.0, true));
		hotel10.getHabitacionSuite().add(new HabitacionSuite(50, 350.0, false));
	}

	public void buscar() {
		boolean encontrado = false;

		for (Hoteles hh : h) {
			System.out.println("ID: " + hh.getCodigo() + " Nombre: " + hh.getNombre());
		}

		System.out.println("Introduce el id del hotel que buscas.");
		int buscarHotel = sc.nextInt();

		for (int i = 0; i < h.size(); i++) {
			if (h.get(i).getCodigo() == buscarHotel) {

				Hoteles hotel = h.get(i);
				System.out.println("Habitaciones del hotel " + hotel.getNombre() + ":");

				if (!hotel.getHabitacionIndividual().isEmpty()) {
					System.out.println("Habitaciones Individuales:");
					for (HabitacionIndividuales hbi : hotel.getHabitacionIndividual()) {
						System.out.println(hbi);
					}
				}

				if (!hotel.getHabitacionDoble().isEmpty()) {
					System.out.println("Habitaciones Dobles:");
					for (HabitacionDoble hd : hotel.getHabitacionDoble()) {
						System.out.println(hd);
					}
				}

				if (!hotel.getHabitacionFamiliar().isEmpty()) {
					System.out.println("Habitaciones Familiares:");
					for (HabitacionFamiliar hf : hotel.getHabitacionFamiliar()) {
						System.out.println(hf);
					}
				}

				if (!hotel.getHabitacionSuite().isEmpty()) {
					System.out.println("Habitaciones Suite:");
					for (HabitacionSuite hs : hotel.getHabitacionSuite()) {
						System.out.println(hs);
					}
				}

				encontrado = true;
				break;
			}
		}

		if (!encontrado) {
			System.out.println("No existe un hotel con ese ID.");
		}
	}

	public void modificar() {
		sc.nextLine();

		for (Hoteles htt : h) {
			System.out.println(htt.getNombre());
		}

		System.out.println("Introduce el nombre del hotel que deseas modificar.");
		String buscarHotel = sc.nextLine().toLowerCase();

		for (int i = 0; i < h.size(); i++) {
			if (h.get(i).getNombre().toLowerCase().equals(buscarHotel)) {
				System.out.println("¿Qué deseas modificar?");
				menuModificar();

				int opc = sc.nextInt();
				sc.nextLine();

				switch (opc) {
				case 1:
					System.out.println("Introduce el nombre del hotel.");
					String nombreHotel = sc.nextLine();
					h.get(i).setNombre(nombreHotel);
					break;
				case 2:
					System.out.println("Introduce la direccion del hotel.");
					String direccion = sc.nextLine();
					h.get(i).setDireccion(direccion);
					break;
				case 3:
					System.out.println("Introduce la ciudad.");
					String ciudad = sc.nextLine();
					h.get(i).setCiudad(ciudad);
					break;
				default:
					System.out.println("Opcion no valida.");
					break;
				}
			} else {
				System.out.println("El hotel no existe.");
			}
		}

	}

	public void eliminar() {

		System.out.println("Introduce el id del hotel que deseas eliminar.");
		int idHotel = sc.nextInt();

		for (int i = 0; i < h.size(); i++) {

			if (h.get(i).getCodigo() == idHotel) {
				h.remove(i);
				System.out.println("Hotel eliminado.");
			}
		}

	}

	public void mostrarInfo() {
		for (Hoteles ht : h) {
			if (ht == null) {
				System.out.println("No tienes a ninguen hotel.");
			} else {

				System.out.println(ht);

			}
		}
	}

}
