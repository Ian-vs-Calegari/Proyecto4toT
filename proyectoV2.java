import java.util.Scanner;
public class proyectoV2 {
	
//	------------------------------------------- Color Codes
    private static String cyan = "\033[36m"; 
    private static String red = "\033[31m"; 
    private static String green = "\033[32m"; 
    private static String white = "\033[37m";
//	------------------------------------------- Color Codes
    
		Scanner t = new Scanner(System.in);
		Scanner n = new Scanner(System.in);
		Scanner teclado = new Scanner(System.in);
		String [] catA = new String[5];
		String [] catB = new String[5];
		String [] catC = new String[5];
		String [] catD = new String[5];
		String [] catE = new String[5];
		String [] catF = new String[5];
		String [] todos = new String[30];
		String [] paradas = new String[20];
		String [] conexion = new String[30];
		String ci = "";
		String nombre = "";
		String categoria = "";
		String telefono = "";
		String codigo = "";
		int siono = 0;
		int opcion = 0;
		int x=0;
		int a=0,b=0,c=0,d=0,e=0,f=0;
		int sumaP=0;
		
//-------------------------------------------------------------------------------------------------------------------------------------------------
		public void menuPrincipal() {
			do {
				System.out.println(" ");
				System.out.println("Que desea hacer?");
				System.out.println("   1-Ir al menu pasajeros");
				System.out.println("   2-Ir al menu paradas");
				System.out.println("   3-Salir");
				System.out.println("--------------------------");
				System.out.print("Elije: ");
				opcion = n.nextInt();
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
					opcion=n.nextInt();
				}
				
			}while(opcion!=3);
		}
//-------------------------------------------------------------------------------------------------------------------------------------------------
		public void menuPasajeros() {
			do {
				System.out.println(" ");
				System.out.println("Que desea hacer?");
				System.out.println("   1-Registrar Pasajero");
				System.out.println("   2-Buscar Pasajero");
				System.out.println("   3-Mostrar Pasajero Por Categoria");
				System.out.println("   4-Salir al Menu Principal");
				System.out.println("   5-Salir del Programa");
				System.out.println("--------------------------");
				System.out.print("Elije: ");
				opcion = n.nextInt();
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
					opcion=n.nextInt();
				}
				
			}while(opcion!=5);
		}
			
//-------------------------------------------------------------------------------------------------------------------------------------------------
        public void menuParadas() {
        	do {
				System.out.println(" ");
				System.out.println("Que desea hacer?");
				System.out.println("   1-Registrar Parada");
				System.out.println("   2-Registrar Conexion");
				System.out.println("   3-Registrar Linea de Omnibus");
				System.out.println("   4-Mostrar Parada con Mayor Distancia");
				System.out.println("   5-Mostrar Parada con Menor Distancia");
				System.out.println("   6-Salir al Menu Principal");
				System.out.println("   7-Salir del Programa");
				System.out.println("--------------------------");
				System.out.print("Elije: ");
				opcion = n.nextInt();
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
					opcion=n.nextInt();
				}
				
			}while(opcion!=7);
        	
        }
//-------------------------------------------------------------------------------------------------------------------------------------------------
        public void registrarPasajero() {
        	if(x<30) {
        	do {
        		System.out.print("Ingrese Numero de Cedula:");
        		ci=t.nextLine();
        		while(ci.length()<7) {
         			System.out.println("");
        			System.out.println("Numero de Cedula No Valido, digitos insuficientes");
        			System.out.print("Ingrese Otra: ");
        			ci=teclado.nextLine();
        			
   
        		}
        		
        		System.out.print("Ingrese Nombre:");
        		nombre=t.nextLine();
        		while(nombre.length()<3) {
        			System.out.println("Nombre no válido, demasiado corto");
        			System.out.print("Ingrese otro: ");
        			nombre=t.nextLine();
        			
        		}
        		
        		System.out.print("Ingrese Numero de Telefono:");
        		telefono=t.nextLine();
        		while(telefono.length()<5) {
        			System.out.println("Numero de telefono no válido, demasiado corto");
        			System.out.print("Ingrese otro: ");
        			telefono=t.nextLine();
        			
        		}
        		
        		System.out.print("Ingrese Categoria:");
        		categoria=t.nextLine();
        		while(nombre.length()<1) {
        			System.out.println("Ups, omitio este dato");
        			System.out.print("Ingrese categoria: ");
        			nombre=t.nextLine();
        			
        		}
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        		if(a<5) {
        			if(categoria.equalsIgnoreCase("a")) {
        				catA[a]="Cedula: " + "|" +ci + "|" + "\nNombre: "  + "|" + nombre  + "|" + "\nTelefono: "  + "|" + telefono  + "|" + "\nCategoria: "  + "|" + categoria;
        				a++;
        				if(a==4) {
        					System.out.println("En esta categoria ya no hay espacio");
        					a++;
        				}
        				
        			}
        		}
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        		if(b<5) {
        			if(categoria.equalsIgnoreCase("b")) {
        				catB[b]="Cedula: " + "|" +ci + "|" + "\nNombre: "  + "|" + nombre  + "|" + "\nTelefono: "  + "|" + telefono  + "|" + "\nCategoria: "  + "|" + categoria;
        				b++;
        				if(b==4) {
        					System.out.println("En esta categoria ya no hay espacio");
        					b++;
        				}
        				
        			}
        		}
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        		if(c<5) {
        			if(categoria.equalsIgnoreCase("c")) {
        				catC[c]="Cedula: " + "|" +ci + "|" + "\nNombre: "  + "|" + nombre  + "|" + "\nTelefono: "  + "|" + telefono  + "|" + "\nCategoria: "  + "|" + categoria;
        				c++;
        				if(c==4) {
        					System.out.println("En esta categoria ya no hay espacio");
        					a++;
        				}
        				
        			}
        		}
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        		if(d<5) {
        			if(categoria.equalsIgnoreCase("d")) {
        				catD[d]="Cedula: " + "|" +ci + "|" + "\nNombre: "  + "|" + nombre  + "|" + "\nTelefono: "  + "|" + telefono  + "|" + "\nCategoria: "  + "|" + categoria;
        				d++;
        				if(d==4) {
        					System.out.println("En esta categoria ya no hay espacio");
        					d++;
        				}
        				
        			}
        		}
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        		if(e<5) {
        			if(categoria.equalsIgnoreCase("e")) {
        				catE[e]="Cedula: " + "|" +ci + "|" + "\nNombre: "  + "|" + nombre  + "|" + "\nTelefono: "  + "|" + telefono  + "|" + "\nCategoria: "  + "|" + categoria;
        				e++;
        				if(e==4) {
        					System.out.println("En esta categoria ya no hay espacio");
        					e++;
        				}
        				
        			}
        		}
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        		if(f<5) {
        			if(categoria.equalsIgnoreCase("f")) {
        				catF[f]="Cedula: " + "|" +ci + "|" + "\nNombre: "  + "|" + nombre  + "|" + "\nTelefono: "  + "|" + telefono  + "|" + "\nCategoria: "  + "|" + categoria;
        				f++;
        				if(f==4) {
        					System.out.println("En esta categoria ya no hay espacio");
        					f++;
        				}
        				
        			}
        		}
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        		
        		
        		todos[x]="Cedula: " + "|" +ci + "|" + "\nNombre: "  + "|" + nombre  + "|" + "\nTelefono: "  + "|" + telefono  + "|" + "\nCategoria: "  + "|" + categoria;
        		System.out.println("El Pasajero Fue Registrado Exitosamente");
        		x++;
        		System.out.println(" ");
        		if(x>=30) {
            		System.out.println(" ");
            		System.out.println("Ya no se pueden registrar mas pasajeros, espacio insuficiente");
            		System.out.println(" ");
                	menuPasajeros();
        		}
        		System.out.print("Desea Continuar? 1-Si / 0-No: ");
        		siono=n.nextInt();
        		System.out.println(" ");
        		if(siono==1) {
        			registrarPasajero();
        		}
        		
        		
        	}while(siono!=0);
        	menuPasajeros();
        	
        	}

        	
        }
//-------------------------------------------------------------------------------------------------------------------------------------------------
        public void buscarPasajero() {
        	ci="0";
        	System.out.print("Cedula del Pasajero a Buscar: ");
        	ci=t.nextLine();
        	System.out.println(" ");
        	
        	for(int pos=0;pos<todos.length;pos++) {
        		
//        		en los paréntesis de abajo va lo que separe los términos
        		
        		String buscador[] = todos[pos].split("\\|");
        		if(ci.equals(buscador[1])) {
        			System.out.println(buscador[0] + buscador[1] + " " + buscador[2]  + buscador[3]  + " " + buscador[4]  + buscador[5]  + " " + buscador[6]  + buscador[7]);
        			System.out.println("Pasajero Encontrado Exitosamente");
        		}
        	System.out.println(" ");
        	menuPasajeros();
        	
        }
        }
//-------------------------------------------------------------------------------------------------------------------------------------------------
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
//-------------------------------------------------------------------------------------------------------------------------------------------------
	    public void registrarParada() {
	    	System.out.println("Registrar Paradas Hasta decir BASTA");
	    	System.out.println(" ");

	    	do {
	    		System.out.print("Ingrese el Nombre de la Parada: ");
	    		nombre=t.nextLine();
	    		paradas[sumaP]="Nombre: "+nombre;
	    		sumaP++;
	    		
	    		System.out.print("Ingrese el Codigo de la Parada: ");
	    		codigo=t.nextLine();
	    		sumaP++;
	    		
	    		System.out.println(" ");
	    		System.out.print("Desea seguir registrando paradas? 1-Si / 0-No: ");
	    		opcion=0;
	    		System.out.println(" ");
	    	}while(opcion!=0);
	    	menuParadas();
	    	
	    	
	    	
	    }
//-------------------------------------------------------------------------------------------------------------------------------------------------
	    public void registrarConexion() {
	    	String pOrigen = " " , pDestino = " " , km =" ";
	    	opcion = 0;
	    	System.out.println("Registrar Conexiones Hasta decir BASTA");
	    	do {
	    		System.out.print("Ingrese Codigo de Parada Origen: ");
	    		pOrigen=t.nextLine();
	    		System.out.println(" ");
	    		
	    		System.out.print("Ingrese Codigo de Parada Destino: ");
	    		pDestino=t.nextLine();
	    		System.out.println(" ");
	    		
	    		
	    	}while(siono!=0);
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
