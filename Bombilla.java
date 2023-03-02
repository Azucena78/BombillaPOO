package com.cursoceat.BombillaPOO;

public class Bombilla {
	public static boolean interruptorGeneral = true;
	private boolean interruptor;
	
//	constructor vacio, para crear el objeto bombilla en estado apagado
	public Bombilla() {
		this.interruptor = false;
	}
//	metodo enciende o apaga segun este el interruptor
	public void encederApagar() {
		if (this.interruptor) {
			this.interruptor = false;
		}else {
			this.interruptor = true;
		}
	}
//	metodo para encender la bombilla
	public void enciende() {
		interruptor = true;
	}
//	metodo para apagar la bombilla
	public void apagar() {
		this.interruptor = false;
	}
//	metodo para cambiar el estado
	public boolean estado() {
		return interruptorGeneral && this.interruptor;
//	el estado es true si el interruptor de la bombilla y el general están activados	
	}
//	metodo para mostrar el estado
	public String muestraEstado() {
		return estado() ? "Encendida" : "Apagada";
//		dependiendo del estado se devuelve la cadena "Encendida o "Apagada
	}
}
