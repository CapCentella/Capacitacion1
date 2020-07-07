package com.sophos.Capacitacion1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        
       VariablesCondicionales.mayoriaEdad();
       
       Carro carro= new Carro();
       carro.asignarCarro();
       carro.escribirCarro();
       
       Driver obj = new Driver();
       obj.navegadorGoogle();
       obj.buscarDato();
       obj.cerrarNavegador();
    }
    
     
    public void ejecutor() {  //este lo cree para ejecutar la prueba unitaria
    	
    	VariablesCondicionales.mayoriaEdad();
        
        Carro carro= new Carro();
        carro.asignarCarro();
        carro.escribirCarro();
        
        Driver obj = new Driver();
        obj.navegadorGoogle();
        obj.cerrarNavegador();
    }
    
}
