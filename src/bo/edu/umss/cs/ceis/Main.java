package bo.edu.umss.cs.ceis;

public class Main {

    public static void main(String[] args) {
	    Ventana ventana = new Ventana("Iniciar Sesion");
	    ventana.insertarNombre("pepito");
	    ventana.insertarPassword("1234");
	    boolean respuesta = ventana.validar();

	    if (respuesta){
	        System.out.println("Bienvenido");
        }
        else{
	        System.out.println("Datos Incorrectos");
        }
    }
}
