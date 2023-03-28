import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EmpresaTrasnporte {
	private String nombre;
	private String ubicacion;
	private ArrayList<Bus> buses = new ArrayList<Bus>();

	public String getUbicacion() {
		return this.ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public void comprarBus() {
		Scanner teclado = new Scanner(System.in);
		String marca;
		String color;
		int añoDeFabricacion;
		int numero;
		System.out.println("Ingrese la marca del bus que comprara: ");
		marca = teclado.nextLine();
		System.out.println("Ingrese el color del bus: ");
		color = teclado.nextLine();
		System.out.println("Ingrese el año de fabricación: ");
		añoDeFabricacion = teclado.nextInt();
		System.out.println("Ingrese el numero del bus: ");
		numero = teclado.nextInt();
		Bus bus = new Bus(marca,color,añoDeFabricacion,numero);
		buses.add(bus);
	}

	public void darDeBajaBus() {
		Scanner teclado = new Scanner(System.in);
		int numero;
		System.out.println("Ingrese el número del bus que quiere dar de baja: ");
		numero = teclado.nextInt();
		for (Bus bus: buses) {
			if(bus.getNumero() == numero){
				buses.remove(bus);
				System.out.println("El bus ha sido dado de baja.");
			}
		}
	}

	public void mostrarBuses(){
		for (Bus bus : buses){
			System.out.println(bus.toString());
		}
	}

	public void menu(){
		System.out.println("1) Comprar bus.");
		System.out.println("2) Dar de baja un bus.");
		System.out.println("3) Mostrar buses.");
		System.out.println("4) Salir del manu.");
		System.out.println("Seleccione una de las opciones: ");
	}

	public void opcionesMenu(){
		Scanner teclado = new Scanner(System.in);
		int opcion = 0;
		do {
			try{
				menu();
				opcion = teclado.nextInt();
				if(opcion < 1 || opcion > 4){
					teclado.nextLine();
					System.err.println("Opción ingresada no valida, por favor intente de nuevo");
				}
				switch (opcion){
					case 1:{
						comprarBus();
						break;
					}
					case 2:{
						darDeBajaBus();
						break;
					}
					case 3:{
						mostrarBuses();
					}
				}
			}catch(InputMismatchException e){
				teclado.nextLine();
				System.err.println("Opción ingresada no valida, por favor intente de nuevo");
			}
		}while(opcion != 4);
		salirMenu();
	}

	public void salirMenu() {
		System.out.println("\n Ha salido del menu");
	}
}