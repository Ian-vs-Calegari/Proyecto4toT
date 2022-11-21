import java.util.Scanner;
public class proyectoV2 {
		Scanner t = new Scanner(System.in);
		Scanner teclado = new Scanner(System.in);
		String [] catA = new String[5];
		String [] catB = new String[5];
		String [] catC = new String[5];
		String [] catD = new String[5];
		String [] catE = new String[5];
		String [] catF = new String[5];
		String [] todos = new String[30];
		String [] paradas = new String[20];
		String ci = "";
		String nombre = "";
		String categoria = "";
		String telefono = "";
		String codigo = "";
		int opcion = 0;
		
//-------------------------------------------------------------------------------------------------------------------------------------------------
		public void menuPrincipal() {
			do {
				System.out.println(" ");
				System.out.println("¿Qué desea hacer?");
				System.out.println("   1-Ir al menu pasajeros");
				System.out.println("   2-Ir al menu paradas");
				System.out.println("   3-Salir");
				System.out.println("--------------------------");
				System.out.print("Elije: ");
				opcion = t.nextInt();
				System.out.println(" ");
				
				switch(opcion) {
				case 1:
					menuPasajeros();
					break;
				case 2:
					menuParadas();
					break;
				case 3:
					opcion=3;
					break;
				default:
					System.out.println("Esa opcion no existe, elija otra");
					opcion=t.nextInt();
				}
				
			}while(opcion!=3);
		}
//-------------------------------------------------------------------------------------------------------------------------------------------------
		public void menuPasajeros() {
			do {
				System.out.println(" ");
				System.out.println("¿Qué desea hacer?");
				System.out.println("   1-Registrar Pasajero");
				System.out.println("   2-Buscar Pasajero");
				System.out.println("   3-Mostrar Pasajero Por Categoria");
				System.out.println("   4-Salir al Menu Principal");
				System.out.println("   5-Salir del Programa");
				System.out.println("--------------------------");
				System.out.print("Elije: ");
				opcion = t.nextInt();
				System.out.println(" ");
				
				switch(opcion) {
				case 1:
					registrarPasajero();
					break;
				case 2:
					buscarPasajero();
					break;
				case 3:
					mostrarPasajeroPorCategoria();
					break;
				case 4:
					menuPrincipal();
					break;
				case 5:
					opcion=5;
					break;
				default:
					System.out.println("Esa opcion no existe, elija otra");
					opcion=t.nextInt();
				}
				
			}while(opcion!=5);
		}
			
//-------------------------------------------------------------------------------------------------------------------------------------------------
        public void menuParadas() {
        	do {
				System.out.println(" ");
				System.out.println("¿Qué desea hacer?");
				System.out.println("   1-Registrar Parada");
				System.out.println("   2-Registrar Conexion");
				System.out.println("   3-Registrar Linea de Omnibus");
				System.out.println("   4-Mostrar Parada con Mayor Distancia");
				System.out.println("   5-Mostrar Parada con Menor Distancia");
				System.out.println("   6-Salir al Menu Principal");
				System.out.println("   7-Salir del Programa");
				System.out.println("--------------------------");
				System.out.print("Elije: ");
				opcion = t.nextInt();
				System.out.println(" ");
				
				switch(opcion) {
				case 1:
					registrarParada();
					break;
				case 2:
					registrarConexion();
					break;
				case 3:
					registrarLineaOmnibus();
					break;
				case 4:
					paradaMayorDistancia();
					break;
				case 5:
					paradaMenorDistancia();
					break;
				case 6:
					menuPrincipal();
					break;
				case 7:
					opcion=7;
					break;
				default:
					System.out.println("Esa opcion no existe, elija otra");
					opcion=t.nextInt();
				}
				
			}while(opcion!=7);
        	
        }
//-------------------------------------------------------------------------------------------------------------------------------------------------
        public void registrarPasajero() {
        	
        }
//-------------------------------------------------------------------------------------------------------------------------------------------------
        public void buscarPasajero() {
        	
        }
//-------------------------------------------------------------------------------------------------------------------------------------------------
	    public void mostrarPasajeroPorCategoria() {
	    	
	    }
//-------------------------------------------------------------------------------------------------------------------------------------------------
	    public void registrarParada() {
	    	
	    }
//-------------------------------------------------------------------------------------------------------------------------------------------------
	    public void registrarConexion() {
	    	
	    }
//-------------------------------------------------------------------------------------------------------------------------------------------------
	    public void registrarLineaOmnibus() {
	    	
	    }
//-------------------------------------------------------------------------------------------------------------------------------------------------
	    public void paradaMayorDistancia() {
	    	
	    }
//-------------------------------------------------------------------------------------------------------------------------------------------------
	    public void paradaMenorDistancia() {
	    	
	    }
//-------------------------------------------------------------------------------------------------------------------------------------------------
	    
	    
	    
	    
			public static void main(String[] args) {
		proyectoV2 IanC = new proyectoV2();
		IanC.menuPrincipal();
	}
}

