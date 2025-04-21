package App;

import java.util.Scanner;

import Gestor.GestorHabitacion;
import Gestor.GestorHotel;
import Hotel.Hoteles;

public class AppHoteles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Hoteles h = new Hoteles();
		GestorHotel gh = new GestorHotel();
		GestorHabitacion ghb = new GestorHabitacion();
		String txt = "";
		boolean continuar = true;

		gh.cargarHotelesDebug();
		ghb.cargarHotelesDebug();


		while (continuar) {
			System.out.println("Gestor de Hoteles.");
			System.out.println("Elijes la opcion que quieres gestionar.");
			System.out.println("[1] - Hotel.");
			System.out.println("[2] - Habitacion.");
			System.out.println("[3] - Reserva.");
			int opc = sc.nextInt();

			switch (opc) {
			case 1:
				gh.hotelApp();
				break;
			case 2:
				ghb.habitacionApp();
				break;
			case 3:
				break;
			}

			if (txt.equalsIgnoreCase("n")) {
				continuar = false;
			}

		}

	}

}
