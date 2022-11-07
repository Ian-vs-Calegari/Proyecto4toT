import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Proyecto {
	int opcion=0,a=0,b=0,c=0,d=0,e=0,f=0;
    private static String cyan = "\033[36m"; 
    private static String red = "\033[31m"; 
    private static String green = "\033[32m"; 
    private static String white = "\033[37m";
	Scanner teclado = new Scanner(System.in);
	String [] catA = new String[5];
	String [] catB = new String[5];
	String [] catC = new String[5];
	String [] catD = new String[5];
	String [] catE = new String[5];
	String [] catF = new String[5];
	String [] pasTodos = new String[30];
	String [] Paradas = new String[20];
	String CI;
	String Nombre;
	String Categoria;
	String Telefono;
	String codigo;
	
//	--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public void menuPrincipal(){ 
		do {
			System.out.println("Que desea hacer:");
			System.out.println("");
			System.out.println("1-Ir al menu Pasajeros");
			System.out.println("2-Registrar Paradas");
			System.out.println("3-Registrar Conexiones");
			System.out.println("");
			System.out.print("Elija una opcion: ");
			opcion=teclado.nextInt();
			System.out.println("");
			switch (opcion) {
			case 0:
				System.out.println("Saliendo...");
				break;
			case 1:
				menuPasajeros();	
				break;
			case 2:
				registrarParada();	
				break;
			case 3:
				registrarConexiones();	
				break;
			default:
				
				System.out.println("Elija un opcion dentro del limite establecido");
			}
		}while(opcion!=0);
	
		
	}
//	--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

	
	public void menuPasajeros(){ 
		do {
			System.out.println("Que desea hacer:");
			System.out.println("");
			System.out.println("1-Registrar Pasajeros");
			System.out.println("2-Mostrar Pasajeros Por Categoria");
			System.out.println("3-Buscar Pasajeros Por Cedula");
			System.out.println("");
			System.out.print("Elija una opcion: ");
			opcion=teclado.nextInt();
			System.out.println("");
			switch (opcion) {
			case 0:
				System.out.println("Saliendo...");
				break;
			case 1:
				registrarPasajeros();	
				break;
			case 2:
				mostrarPasajeroPorCategoria();
				break;
			case 3:
				buscarPasajeroPorCedula();
			default:
				System.out.println("Elija un opcion dentro del limite establecido");
			}
		}while(opcion!=0);



	} 
//	--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public void registrarPasajeros() {
		
		
		String extra=teclado.nextLine();
		for(int veces=0; veces<pasTodos.length;veces++) {
			System.out.println("");
			System.out.println("Registre un Nuevo Pasajero: ");
			System.out.println("");
		System.out.print("Ingrese C.I.: "+"\033[36m");
		CI = teclado.nextLine();
		System.out.println("----------");
		
		System.out.print("Ingrese Nombre: "+"\033[36m");
		Nombre = teclado.nextLine();
		System.out.println("----------");
		
		System.out.print("Ingrese Numero de Telefono: "+"\033[36m");
		Telefono=teclado.nextLine();
		System.out.println("----------");
		
		System.out.print("Ingrese Categoria: "+"\033[36m");
		Categoria = teclado.nextLine();
		System.out.println("----------");
		
		pasTodos[veces]="C.I.: "+CI+"\nNombre: "+Nombre+"\nTelefono: "+Telefono+"\nCategoria: "+Categoria;
		
		System.out.println(pasTodos[veces]);
		if(CI.length()<1 || Nombre.length()<1 || Telefono.length()<1 || Categoria.length()<1) {
			System.out.println("");
			System.out.println("\033[31mError al registrar, datos nulos o vacios");
			System.out.println("");
			if(CI.length()<1) {
				System.out.print("\033[37mIngrese Cedula de Identidad: "+"\033[36m");
				CI = teclado.nextLine();
				System.out.println("");
			}
			if(Nombre.length()<1) {
				System.out.print("\033[37mIngrese Nombre: "+"\033[36m");
				Nombre = teclado.nextLine();
				System.out.println("");
			}
			if(Telefono.length()<1) {
				System.out.print("\033[37mIngrese Numero de Telefono: "+"\033[36m");
				Telefono = teclado.nextLine();
				System.out.println("");
			}
			if(Categoria.length()<1) {
				System.out.print("\033[37mIngrese Categoria: "+"\033[36m");
				Categoria = teclado.nextLine();
				System.out.println("");
			}
			pasTodos[veces]="C.I.: "+"033[36m"+CI+"\033[37m"+"\nNombre: "+"\033[36m"+Nombre+"\033[37m"+"\nTelefono: "+"\033[36m"+Telefono+"\033[37m"+"\nCategoria: "+"\033[36m"+Categoria;
		}
		if(CI.length()>=1 && Nombre.length()>=1 && Telefono.length()>=1 && Categoria.length()>=1) {
			System.out.println("");
			System.out.println("\033[32mEl Pasajero fue registrado exitosamente");
			System.out.println("");
		}
		
		if(a<5){
		if(Categoria.equalsIgnoreCase("a")) {
			catA[a]="C.I.: "+"033[36m"+CI+"\033[37m"+"\nNombre: "+"\033[36m"+Nombre+"\033[37m"+"\nTelefono: "+"\033[36m"+Telefono+"\033[37m"+"\nCategoria: "+"\033[36m"+Categoria;
			a++;
		}
		}if(a==4) {
			System.out.println("En esta categoria ya no hay espacio");
			a++;
		}
		if(b<5){
			if(Categoria.equalsIgnoreCase("b")) {
				catB[b]="C.I.: "+"033[36m"+CI+"\033[37m"+"\nNombre: "+"\033[36m"+Nombre+"\033[37m"+"\nTelefono: "+"\033[36m"+Telefono+"\033[37m"+"\nCategoria: "+"\033[36m"+Categoria;
				b++;
			}
			}if(b==4) {
				System.out.println("En esta categoria ya no hay espacio");
				b++;
			}
			if(c<5){
				if(Categoria.equalsIgnoreCase("c")) {
					catC[c]="C.I.: "+"033[36m"+CI+"\033[37m"+"\nNombre: "+"\033[36m"+Nombre+"\033[37m"+"\nTelefono: "+"\033[36m"+Telefono+"\033[37m"+"\nCategoria: "+"\033[36m"+Categoria;
					c++;
				}
				}if(c==4) {
					System.out.println("En esta categoria ya no hay espacio");
					c++;
				}
				if(d<5){
					if(Categoria.equalsIgnoreCase("d")) {
						catD[d]="C.I.: "+"033[36m"+CI+"\033[37m"+"\nNombre: "+"\033[36m"+Nombre+"\033[37m"+"\nTelefono: "+"\033[36m"+Telefono+"\033[37m"+"\nCategoria: "+"\033[36m"+Categoria;
						d++;
					}
					}if(d==4) {
						System.out.println("En esta categoria ya no hay espacio");
						d++;
					}
					if(e<5){
						if(Categoria.equalsIgnoreCase("e")) {
							catE[e]="C.I.: "+"033[36m"+CI+"\033[37m"+"\nNombre: "+"\033[36m"+Nombre+"\033[37m"+"\nTelefono: "+"\033[36m"+Telefono+"\033[37m"+"\nCategoria: "+"\033[36m"+Categoria;
							e++;
						}
						}if(e==4) {
							System.out.println("En esta categoria ya no hay espacio");
							e++;
						}
						if(f<5){
							if(Categoria.equalsIgnoreCase("f")) {
								catF[f]="C.I.: "+"033[36m"+CI+"\033[37m"+"\nNombre: "+"\033[36m"+Nombre+"\033[37m"+"\nTelefono: "+"\033[36m"+Telefono+"\033[37m"+"\nCategoria: "+"\033[36m"+Categoria;
								f++;
							}
							}if(f==4) {
								System.out.println("En esta categoria ya no hay espacio");
								f++;
							}
							
		}
	}
	
//	--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public void mostrarPasajeroPorCategoria() {
		do {
			System.out.println("Elija la categoria que desea ver");
			System.out.println("");
			System.out.println("1-A)Jubilados");
			System.out.println("2-B)Pensionistas");
			System.out.println("3-C)Estudiante A");
			System.out.println("4-D)Estudiante B");
			System.out.println("5-E)Docente");
			System.out.println("6-F)Comun");
			System.out.println("");
			System.out.println("Seleccione una por favor");
			opcion=teclado.nextInt();

			switch(opcion) {
			case 1:
				for(int x=0;x<catA.length;x++) {
				System.out.println(catA[x]);			
				}
				break;
			case 2:
				for(int x=0;x<catB.length;x++) {
				System.out.println(catB[x]);			
				}
				break;
			case 3:
				for(int x=0;x<catC.length;x++) {
				System.out.println(catC[x]);			
				}
				break;
			case 4:
				for(int x=0;x<catD.length;x++) {
				System.out.println(catD[x]);			
				}
				break;
			case 5:
				for(int x=0;x<catE.length;x++) {
				System.out.println(catE[x]);			
				}
				break;
			case 6:
				for(int x=0;x<catF.length;x++) {
				System.out.println(catF[x]);			
				}
				break;
				default:
					System.out.println("Elija un opcion dentro del limite establecido");
			}
			
	}while(opcion!=0);
		
	}
	
//	--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public void buscarPasajeroPorCedula() {
		
		
		
	}
//	--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
	public void registrarParada(){
		System.out.println("Registrar Paradas Hasta el aburrimiento");
		do {
			for(int suma=0; suma<Paradas.length;suma++) {
			System.out.println("Ingrese Nombre de la Parada: ");
			Nombre=teclado.nextLine();
			Nombre=teclado.nextLine();
			Paradas[suma]="Nombre: "+Nombre;
			suma++;
			System.out.println("Ingrese codigo de la parada: ");
			codigo=teclado.nextLine();
			Paradas[suma]="Código: "+codigo;
			}
			System.out.println("Para Salir anterior presione 1, o si quiere salir del programa presione 0, si desea continuar presione cualquier letra/numero");
			opcion=teclado.nextInt();
			if(opcion==1) {
			menuPrincipal();
			}
			if(opcion==0) {
				System.out.println("Saliendo...");
				}

		}while(opcion!=0);
	}
//	--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public void registrarConexiones(){
		String conexiones[]=new String[30];
		String paradaOrigen,paradaDestino,km;
		do {
			System.out.println("Registrar Conexiones Hasta el aburrimiento");
			System.out.println("");
				for (int pos=0; pos<conexiones.length;pos++) {
					System.out.println("Escriba el codigo de la parada de origen");
					paradaOrigen=teclado.nextLine();
					paradaOrigen=teclado.nextLine();
					if(paradaOrigen.equals(conexiones[pos])) {
						System.out.print("Esa parada ya fue ingresada, escoja otra: ");
						paradaOrigen=teclado.nextLine();
						System.out.println("");
					}
					System.out.println("Escriba el codigo de la parada de destino");
					paradaDestino=teclado.nextLine();
					if(paradaDestino.equals(conexiones[pos])) {
						System.out.print("Esa parada ya fue ingresada, escoja otra: ");
						paradaDestino=teclado.nextLine();
						System.out.println("");
					}
					System.out.println("Ahora Escriba la distancia entre ellas(en kilometros)");
					km=teclado.nextLine();
					for(int b = 0; b<3 ;b++) {
						conexiones[b]=paradaOrigen;
						System.out.println("Parada de Origen: "+conexiones[b]);
						b++;
						conexiones[b]=paradaDestino;
						System.out.println("Parada de Destino: "+conexiones[b]);
						b++;
						conexiones[b]=km;
						System.out.println("Distancia Entre Paradas: "+conexiones[b]);
						
						
					}
					System.out.println("Conexion registrada exitosamente");
					
	
				}	
				System.out.println("Para Salir anterior presione 1, o si quiere salir del programa presione 0, si desea continuar presione cualquier letra/numero");
				opcion=teclado.nextInt();
				if(opcion==1) {
				menuPrincipal();
				}
				if(opcion==0) {
					System.out.println("Saliendo...");
					}
				
				
		}while(opcion!=0);
		
	}
//	--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public void registrarLineaDeOmnibus() {
		
	
	}
//	--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public void paradasConMayorDistancia(){
		
		
	}
//	--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public void paradasConMenorDistancia() {
		
	}
//	--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	
	public static void main(String[] args) {
		Proyecto ianC = new Proyecto();
		ianC.menuPrincipal();
	}

}
