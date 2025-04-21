package Gestor;

import java.util.ArrayList;
import java.util.Scanner;

import Habitacion.HabitacionDoble;
import Habitacion.HabitacionFamiliar;
import Habitacion.HabitacionIndividuales;
import Habitacion.HabitacionSuite;
import Hotel.Habitaciones;
import Hotel.Hoteles;

public class GestorHabitacion implements Funcionamiento {

	private ArrayList<Hoteles> h = new ArrayList<>();
	private Scanner sc = new Scanner(System.in);

	public GestorHabitacion() {
	}

	public void habitacionApp() {
		System.out.println("Gestor Habitaciones");
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
			System.out.println("Opcion incorrecta.");
			break;

		}

	}

	public void menu() {
		System.out.println("[1] - Crear habitacion.");
		System.out.println("[2] - Buscar habitacion.");
		System.out.println("[3] - Modificar habitacion.");
		System.out.println("[4] - Eliminar habitacion.");
	}

	private void menuHabitaciones() {
		System.out.println("[1] - Habitacion Individual.");
		System.out.println("[2] - Habitacion Doble.");
		System.out.println("[3] - Habitacion Familiar.");
		System.out.println("[4] - Habitacion Suite.");
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

		//
		// Asumiendo que hotel1 es un objeto de tipo Hoteles
		hotel1.getHabitacionIndividual().add(new HabitacionIndividuales(2, 120.0, true));
		hotel1.getHabitacionIndividual().add(new HabitacionIndividuales(3, 150.0, false));
		hotel1.getHabitacionIndividual().add(new HabitacionIndividuales(4, 130.0, true));
		hotel1.getHabitacionIndividual().add(new HabitacionIndividuales(5, 110.0, false));

		// Habitaciones Hotel 1
		hotel1.getHabitacionIndividual().add(new HabitacionIndividuales(1, 100.0, false));
		hotel1.getHabitacionDoble().add(new HabitacionDoble(2, 150.0, true));
		hotel1.getHabitacionFamiliar().add(new HabitacionFamiliar(3, 200.0, true));
		hotel1.getHabitacionSuite().add(new HabitacionSuite(4, 300.0, true));
		hotel1.getHabitacionSuite().add(new HabitacionSuite(5, 320.0, false));

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

	public void crear() {
		double precio;
		boolean comparteBano;
		for (Hoteles hh : h) {
			System.out.println("ID:" + hh.getCodigo() + " Nombre:" + hh.getNombre());
		}

		System.out.println("Introduce el id del hotel.");
		int idHotel = sc.nextInt();

		for (Hoteles hh : h) {
			if (idHotel == hh.getCodigo()) {

				menuHabitaciones();
				int crear = sc.nextInt();

				System.out.println("Introduce el numero de la habitacion.");
				int idHabitacion = sc.nextInt();

				if (existeHabitacion(hh, idHabitacion)) {
					System.out.println("Ya existe una habitación con ese número en este hotel.");
					break;
				}

				System.out.println("Introduce el precio de la habitacion.");
				precio = sc.nextDouble();

				switch (crear) {
				case 1:
					hh.getHabitacionIndividual().add(new HabitacionIndividuales(idHabitacion, precio, false));
					System.out.println("Habitacion creada.");

					break;
				case 2:
					System.out.println("Tiene bano compartido.");
					System.out.println("[1] - Si");
					System.out.println("[2] - No");
					int opcBano = sc.nextInt();

					if (opcBano == 1) {
						comparteBano = true;
						hh.getHabitacionDoble().add(new HabitacionDoble(idHabitacion, precio, comparteBano));

						System.out.println("Habitacion creada.");
					} else if (opcBano == 2) {
						comparteBano = false;
						hh.getHabitacionDoble().add(new HabitacionDoble(idHabitacion, precio, comparteBano));
						System.out.println("Habitacion creada.");
					} else {
						System.out.println("Opc invalida.");
					}

					break;
				case 3:
					System.out.println("Deseas el servicio de camas supletorias ?");
					System.out.println("[1] - Cama Supletorias.");
					System.out.println("[2] - Sin cama Supletorias.");
					int opcCama = sc.nextInt();
					if (opcCama == 1) {
						hh.getHabitacionFamiliar().add(new HabitacionFamiliar(idHabitacion, precio, true));
						System.out.println("Habitacion creada.");
					} else if (opcCama == 2) {
						hh.getHabitacionFamiliar().add(new HabitacionFamiliar(idHabitacion, precio, false));
						System.out.println("Habitacion creada.");
					} else {
						System.out.println("Opcion invalida.");
					}
					break;
				case 4:
					System.out.println("Deseas el servicio de camas supletorias ?");
					System.out.println("[1] - Cama Supletorias.");
					System.out.println("[2] - Sin cama Supletorias.");
					opcCama = sc.nextInt();
					if (opcCama == 1) {
						hh.getHabitacionSuite().add(new HabitacionSuite(idHabitacion, precio, true));
						System.out.println("Habitacion creada.");
					} else if (opcCama == 2) {
						hh.getHabitacionSuite().add(new HabitacionSuite(idHabitacion, precio, false));
						System.out.println("Habitacion creada.");
					} else {
						System.out.println("Opcion invalida.");
					}

					break;

				}

			}
		}
	}

	private boolean existeHabitacion(Hoteles hotel, int idHabitacion) {
		for (HabitacionIndividuales h : hotel.getHabitacionIndividual()) {
			if (h.getnumeroHabitacion() == idHabitacion) {
				return true;
			}
		}
		for (HabitacionDoble h : hotel.getHabitacionDoble()) {
			if (h.getnumeroHabitacion() == idHabitacion) {
				return true;
			}
		}
		for (HabitacionFamiliar h : hotel.getHabitacionFamiliar()) {
			if (h.getnumeroHabitacion() == idHabitacion) {
				return true;
			}
		}
		for (HabitacionSuite h : hotel.getHabitacionSuite()) {
			if (h.getnumeroHabitacion() == idHabitacion) {
				return true;
			}
		}

		return false;
	}

	public void buscar() {

		for (Hoteles hh : h) {
			System.out.println("ID:" + hh.getCodigo() + " Nombre:" + hh.getNombre());
		}

		System.out.println("Introduce el id del hotel.");
		int idHotel = sc.nextInt();

		for (Hoteles hh : h) {
			if (hh.getCodigo() == idHotel) {

				System.out.println(hh);

			}
		}

	}

	public void modificar() {
		double nuevoPrecio;
		int opc;

		for (Hoteles hh : h) {
			System.out.println("ID:" + hh.getCodigo() + " Nombre:" + hh.getNombre());
		}
		System.out.println("Introduce el id del hotel.");
		int idHotel = sc.nextInt();
		boolean existe = false;
		for (Hoteles hh : h) {

			if (idHotel == hh.getCodigo()) {
				System.out.println("Tipo de habitacion que deseas modificar.");
				menuHabitaciones();
				int modificar = sc.nextInt();
				if (modificar == 1) {
					System.out.println(hh.getCodigo() + hh.getNombre() + hh.getHabitacionIndividual());
				} else if (modificar == 2) {
					System.out.println(hh.getCodigo() + hh.getNombre() + hh.getHabitacionDoble());
				} else if (modificar == 3) {
					System.out.println(hh.getCodigo() + hh.getNombre() + hh.getHabitacionFamiliar());
				} else if (modificar == 4) {
					System.out.println(hh.getCodigo() + hh.getNombre() + hh.getHabitacionSuite());
				}

				System.out.println("Introduce el id de la habitacion.");
				int idHabitacion = sc.nextInt();

				switch (modificar) {
				case 1:

					for (HabitacionIndividuales hbi : hh.getHabitacionIndividual()) {
						if (idHabitacion == hbi.getnumeroHabitacion()) {
							System.out.println("Introduce el precio.");
							nuevoPrecio = sc.nextDouble();
							hbi.setPrecio(nuevoPrecio);
							System.out.println("Habitacion individual modificada.");
							existe = true;
						}

					}
					if (!existe) {
						System.out.println("No existe la habitacion con ese id.");
					}
					break;

				case 2:
					for (HabitacionDoble hbd : hh.getHabitacionDoble()) {
						if (idHabitacion == hbd.getnumeroHabitacion()) {
							System.out.println("Que deseas modificar.");
							System.out.println("[1] - Precio.");
							System.out.println("[2] - Baño compartido.");
							opc = sc.nextInt();
							if (opc == 1) {
								System.out.println("Introduce el precio.");
								nuevoPrecio = sc.nextDouble();
								hbd.setPrecio(nuevoPrecio);
								System.out.println("Habitaciondoble modificada.");
							} else if (opc == 2) {
								System.out.println("Deseas compartir baño ? s/n");
								String opcBano = sc.next().toLowerCase();
								if (opcBano.equals("s")) {
									hbd.setcomparteBano(true);
									System.out.println("Habitacion Doble modificada.");
								} else if (opcBano.equals("n")) {
									hbd.setcomparteBano(false);
									System.out.println("Habitacion Doble modificada.");
								} else {
									System.out.println("Opcion invalida.");
								}
							}
							existe = true;
						}

					}
					if (!existe) {
						System.out.println("No existe la habitacion con ese id.");
					}
					break;
				case 3:
					for (HabitacionFamiliar hbf : hh.getHabitacionFamiliar()) {
						if (idHabitacion == hbf.getnumeroHabitacion()) {
							System.out.println("Que deseas modificar.");
							System.out.println("[1] - Precio.");
							System.out.println("[2] - Servicio cama supletoria.");
							opc = sc.nextInt();

							if (opc == 1) {
								System.out.println("Introduce el precio.");
								nuevoPrecio = sc.nextDouble();
								hbf.setPrecio(nuevoPrecio);
								System.out.println("Habitacion Familiar modificada.");
							} else if (opc == 2) {
								System.out.println("Deseas añadir el servicio de cama supletoria. s/n");
								System.out.println("Deseas compartir baño ? s/n");
								String opcBano = sc.next().toLowerCase();
								if (opcBano.equals("s")) {
									hbf.setservicioCamaSupletoria(true);
									System.out.println("Habitacion Familiar modificada.");
								} else if (opcBano.equals("n")) {
									hbf.setservicioCamaSupletoria(false);
									System.out.println("Habitacion Familiar modificada.");
								} else {
									System.out.println("Opcion invalida.");
								}

							}
							existe = true;
						}

					}
					if (!existe) {
						System.out.println("No existe la habitacion con ese id.");
					}
					break;
				case 4:
					for (HabitacionSuite hbs : hh.getHabitacionSuite()) {
						if (idHabitacion == hbs.getnumeroHabitacion()) {
							System.out.println("Que deseas modificar.");
							System.out.println("[1] - Precio.");
							System.out.println("[2] - Servicio cama supletoria.");
							opc = sc.nextInt();
							if (opc == 1) {
								System.out.println("Introduce el precio.");
								nuevoPrecio = sc.nextDouble();
								hbs.setPrecio(nuevoPrecio);
								System.out.println("Habitacion Suite modificada.");
							} else if (opc == 2) {
								System.out.println("Deseas añadir el servicio de cama supletoria. s/n");
								System.out.println("Deseas compartir baño ? s/n");
								String opcBano = sc.next().toLowerCase();
								if (opcBano.equals("s")) {
									System.out.println("Habitacion Suite modificada.");
									hbs.setservicioCamaSupletoria(true);
								} else if (opcBano.equals("n")) {
									System.out.println("Habitacion Suite modificada.");
									hbs.setservicioCamaSupletoria(false);
								} else {
									System.out.println("Opcion invalida.");
								}

							}

						}
						existe = true;

					}
					if (!existe) {
						System.out.println("No existe la habitacion con ese id.");
					}

					break;

				}

			}

		}

	}

	public void eliminar() {
		boolean existe = false;
		int nHabitacion;
		for (Hoteles hh : h) {
			System.out.println("ID:" + hh.getCodigo() + "Nombre:" + hh.getNombre());
		}
		System.out.println("Introduce el id del hotel.");
		int idHotel = sc.nextInt();

		for (Hoteles hh : h) {
			if (idHotel == hh.getCodigo()) {
				System.out.println("Que tipo de habitacion quieres eliminar ?");
				menuHabitaciones();
				int opc = sc.nextInt();
				switch (opc) {
				case 1:
					for (HabitacionIndividuales hbi : hh.getHabitacionIndividual()) {
						System.out.println(hbi);
					}
					System.out.println("Introduce el numero de la habitacion.");
					nHabitacion = sc.nextInt();

					for (int i = 0; i < hh.getHabitacionIndividual().size(); i++) {
						if (hh.getHabitacionIndividual().get(i).getnumeroHabitacion() == nHabitacion) {
							hh.getHabitacionIndividual().remove(i);
							System.out.println("Habitacion eliminada.");
							existe = true;

						}
					}

					if (!existe) {
						System.out.println("No existe ese numero de habitacion.");
					}

					break;
				case 2:
					for (HabitacionDoble hd : hh.getHabitacionDoble()) {
						System.out.println(hd);
					}

					System.out.println("Introduce el numero de la habitacion.");
					nHabitacion = sc.nextInt();

					for (int i = 0; i < hh.getHabitacionDoble().size(); i++) {
						if (hh.getHabitacionDoble().get(i).getnumeroHabitacion() == nHabitacion) {
							hh.getHabitacionDoble().remove(i);
							System.out.println("Habitacion eliminada.");
							existe = true;
						}
					}
					if (!existe) {
						System.out.println("No existe ese numero de habitacion.");
					}

					break;
				case 3:
					for (HabitacionFamiliar hf : hh.getHabitacionFamiliar()) {
						System.out.println(hf);
					}

					System.out.println("Introduce el numero de la habitacion.");
					nHabitacion = sc.nextInt();

					for (int i = 0; i < hh.getHabitacionFamiliar().size(); i++) {

						if (hh.getHabitacionFamiliar().get(i).getnumeroHabitacion() == nHabitacion) {
							hh.getHabitacionFamiliar().remove(i);
							System.out.println("Habitacion eliminada.");
							existe = true;
						}

					}
					if (!existe) {
						System.out.println("No existe ese numero de habitacion.");
					}

					break;
				case 4:

					for (HabitacionSuite hs : hh.getHabitacionSuite()) {
						System.out.println(hs);
					}

					System.out.println("Introduce el numero de la habitacion.");
					nHabitacion = sc.nextInt();

					for (int i = 0; i < hh.getHabitacionSuite().size(); i++) {
						if (hh.getHabitacionSuite().get(i).getnumeroHabitacion() == nHabitacion) {
							hh.getHabitacionSuite().remove(i);
							System.out.println("Habitacion eliminada.");
							existe = true;

						}
					}

					if (!existe) {
						System.out.println("No existe ese numero de habitacion.");
					}

					break;
				}

			}
		}

	}

}
