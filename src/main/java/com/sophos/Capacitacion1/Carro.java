package com.sophos.Capacitacion1;

public class Carro extends Vehiculo {
	
	String Color;

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}
	
	public void asignarCarro() {
		
	    
	       setCantllantas(4); 
	       setColor("azul");
	       setTipoFuenteEnergia("gasolina");
	}
	
	public void escribirCarro() {
		
		System.out.println("el color del carro es: "+getColor());
		System.out.println("el numero de llantas del carro es : "+getCantllantas());
		System.out.println("la fuente de energía del carro es : "+getTipoFuenteEnergia());
	}

}
