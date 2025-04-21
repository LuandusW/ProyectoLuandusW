package Hotel;

import java.util.Date;

public class Reservas {
	private final double INCREMENTO_VIP = 0.20;
	private Date fechaInicio;
	private Date fechaFin;
	private String dni;
	private boolean pagado;
	boolean vip;

	public Reservas() {

	}

	public Reservas(Date fechaInicio, Date fechaFin, String dni, boolean pagado) {
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.dni = dni;
		this.pagado = pagado;
		
	}

	public void setfechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getfechaInicio() {
		return this.fechaInicio;
	}

	public void setfechaFin(Date fechaFin) {
		this.fechaInicio = fechaFin;
	}

	public Date getfechaFin() {
		return this.fechaFin;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDni() {
		return this.dni;
	}

	public void setPagado(boolean pagado) {
		this.pagado = pagado;
	}

	public boolean getPagado() {
		return this.pagado;
	}

}
