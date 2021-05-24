import java.util.*;

public class Programa{

	//Clase para caracteres especiales.
	public static String convertirUnicode(String letra,String cadena){
		
		StringBuilder str = new StringBuilder(cadena);
		int indice = -1;
		char caracter = 0;
		indice = str.lastIndexOf(letra);
		
		if(indice>=0 )
		{
			switch(letra){
				case "Á": caracter = '\u00C1';
						  break;
				case "á": caracter = '\u00E1';
					      break;
				case "é": caracter = '\u00E9';
					      break;
				case "í": caracter = '\u00ED';
					      break;
		        case "ó": caracter = '\u00F3';
					      break;
			    case "ú": caracter = '\u00FA';
					      break;
				case "ñ": caracter = '\u00F1';
					      break;
			}
			str.replace(indice,indice+1,""+caracter);
		}

		return str.toString();
	}

	//Clase para imprimir los caracteres especiales.
	public static void imprimir(String cadena)
	{
		String str; 
		str = convertirUnicode("Á",cadena);
		str = convertirUnicode("á",str);
		str = convertirUnicode("é",str);
		str = convertirUnicode("í",str);
		str = convertirUnicode("ó",str);
		str = convertirUnicode("ú",str);
		str = convertirUnicode("ñ",str);

		System.out.println(str);
	}

	//Clase que muestra la letra de las canciones y en la cual se le quita el punto y coma al archivo.
	public static StringBuilder obtenerLetraCancion(int inicio,int fin, String[]data)
	{
		StringBuilder str = new StringBuilder();
		StringTokenizer temp;

		for(int i = inicio; i<=fin; i++)
		{
			temp = new StringTokenizer(data[i],";");
			int aleatorio = (int)(Math.random() * 9);

                    switch(aleatorio){
                        case 0: System.out.print("                                                                 	 ");
                        break;
                        case 1: System.out.print("                                                                 	 ");
                        break;
                        case 2: System.out.print("                                                                 	 ");
                        break;
                        case 3: System.out.print("                                                                 	 ");
                        break;
                        case 4: System.out.print("                                                                 	 ");
                        break;
                        case 5: System.out.print("                                                                 	 ");
                        break;
                        case 6: System.out.print("                                                                 	 ");
                        break;
                        case 7: System.out.print("                                                                 	 ");
                        break;
                        case 8: System.out.print("                                                                 	 ");
                        break;
                        case 9: System.out.print("                                                                 	 ");
                        break;
                    }
			while(temp.hasMoreTokens())
			{
				System.out.print(temp.nextToken()+" ");
			}
			System.out.println();
			try {
				Thread.sleep(1500);
			} catch (Exception e) {
			}
		}
		return str;
	}

	//Clase de menu del usuario
	public static void menu()
		{
			System.out.println("										──────▄▀▄─────▄▀▄");
			System.out.println("										─▄▄──█░░░░░░░░░░░█──▄▄");	
			System.out.println("										█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█");
			System.out.println(" 				██████████████████████████████████████████████████████████████████████████████████████████████████████████████████	");						
			System.out.println(" 				█░░▄▀░░██░░▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀▄▀░░███░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░██░░▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█	");									 
			System.out.println(" 				█░░▄▀░░██░░▄▀░░░░█░░▄▀░░░░░░▄▀░░█░░▄▀░░░░░░░░▄▀░░███░░▄▀░░░░░░▄▀░░█░░▄▀░░░░░░▄▀░░█░░▄▀░░██░░▄▀░░░░█░░▄▀░░░░░░░░░░█	");			 						 
			System.out.println(" 				█░░▄▀░░██░░▄▀░░███░░▄▀░░██░░▄▀░░█░░▄▀░░████░░▄▀░░███░░▄▀░░██░░▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀░░██░░▄▀░░███░░▄▀░░█████████	");									 
			System.out.println(" 				█░░▄▀░░░░░░▄▀░░███░░▄▀░░░░░░▄▀░░█░░▄▀░░░░░░░░▄▀░░███░░▄▀░░░░░░▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀░░░░░░▄▀░░███░░▄▀░░░░░░░░░░█	");
			System.out.println(" 				█░░▄▀▄▀▄▀▄▀▄▀░░███░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀▄▀░░███░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░███░░▄▀▄▀▄▀▄▀▄▀░░█	");
			System.out.println("				█░░▄▀░░░░░░▄▀░░███░░▄▀░░░░░░▄▀░░█░░▄▀░░░░░░▄▀░░░░███░░▄▀░░░░░░▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀░░░░░░▄▀░░███░░▄▀░░░░░░░░░░█ ");
			System.out.println(" 				█░░▄▀░░░░░░▄▀░░███░░▄▀░░░░░░▄▀░░█░░▄▀░░░░░░▄▀░░░░███░░▄▀░░░░░░▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀░░░░░░▄▀░░███░░▄▀░░░░░░░░░░█	");
			System.out.println(" 				█░░▄▀░░██░░▄▀░░███░░▄▀░░██░░▄▀░░█░░▄▀░░██░░▄▀░░█████░░▄▀░░██░░▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀░░██░░▄▀░░███░░▄▀░░█████████	");
			System.out.println(" 				█░░▄▀░░██░░▄▀░░░░█░░▄▀░░██░░▄▀░░█░░▄▀░░██░░▄▀░░░░░░█░░▄▀░░██░░▄▀░░█░░▄▀░░░░░░▄▀░░█░░▄▀░░██░░▄▀░░░░█░░▄▀░░░░░░░░░░█	");
			System.out.println(" 				█░░▄▀░░██░░▄▀▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀░░██░░▄▀▄▀▄▀░░█░░▄▀░░██░░▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀░░██░░▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█	");
			System.out.println(" 				█░░░░░░██░░░░░░░░█░░░░░░██░░░░░░█░░░░░░██░░░░░░░░░░█░░░░░░██░░░░░░█░░░░░░░░░░░░░░█░░░░░░██░░░░░░░░█░░░░░░░░░░░░░░█	");
			System.out.println(" 				██████████████████████████████████████████████████████████████████████████████████████████████████████████████████	\n");
			System.out.println("							-----------Bienvenidos al Karaoke, por favor seleccione una opcion-----------");
			System.out.println("							|		1. Reproducir cancion aleatoriamente con letra		    | ");
			System.out.println("                            				|        	2. Reproducir cancion aleatoriamente sin letra              | ");
			System.out.println("							|		3. Reproducir una cancion con su letra.                     |");
			System.out.println("                            				|        	4. Reproducir una cancion sin letra.                        |");
			System.out.println("							|		5. Detener Canción.                                 	    |");
			System.out.println("							|		6. Salir.                                           	    |");
			System.out.println("                            				-----------------------------------------------------------------------------");
			System.out.print("                              				KARAOKE:");
		}
	
	//Comienzo del programa.
	public static void main(String[] args) {

		//Declaracion de variables.
		Audio audio = new Audio();
		int seleccion_actual = 0;
		int centinela = 0;	
		int indice_cancion = 0;
		int inicio_letra = 0, fin_letra = 0;
		String [] canciones;
		String [][] info_canciones;
		StringBuilder letra_cancion;

		canciones = ConsoleFile.readBigFile("recursos/letras.csv");
		info_canciones = ConsoleData.dataList(canciones);

		//Comienzo del programa y de las opciones del usuario.
		try{
			
			do{

				//Se imprime el menu cada vez que el usuario escoge una respuesta.
				System.out.println();
				menu();
				centinela = ConsoleInput.getInt();


				//Opcion Numero 1 del menu del usuario.
				if(centinela == 1)
				{
					seleccion_actual = RandomHelper.random(0,info_canciones.length-1);
					audio.seleccionarCancion(info_canciones[seleccion_actual][ConsoleData.RUTA_CANCION]);
					audio.reproducir(); 
					
					System.out.println("\n									 Usted esta escuchando: "+info_canciones[seleccion_actual][ConsoleData.NOMBRE_CANCION]+ "."); 
					System.out.println("\n                      							 Del autor : "+ info_canciones[seleccion_actual][ConsoleData.AUTOR_CANCION]+".");
					System.out.println("\n									 Esta es la letra de la cancion :\n");
		
					inicio_letra = ConsoleInput.stringToInt(info_canciones[seleccion_actual][ConsoleData.INICIO_CANCION]);
					fin_letra = ConsoleInput.stringToInt(info_canciones[seleccion_actual][ConsoleData.FIN_CANCION]);

					letra_cancion = obtenerLetraCancion(inicio_letra,fin_letra,canciones);
					System.out.println();
					
				}

				//Opcion Numero 2 del menu del usuario.
				if(centinela == 2)
				{
					seleccion_actual = RandomHelper.random(0,info_canciones.length-1);
					audio.seleccionarCancion(info_canciones[seleccion_actual][ConsoleData.RUTA_CANCION]);
					audio.reproducir();

					System.out.println("\n									  Usted esta escuchando: "+info_canciones[seleccion_actual][ConsoleData.NOMBRE_CANCION]+ ".");
					System.out.println(" 									  Del autor : "+ info_canciones[seleccion_actual][ConsoleData.AUTOR_CANCION]+".");
				}
				
				//Opcion Numero 3 del menu del usario.
				if(centinela == 3)
				{
					for(int i=0;i<info_canciones.length;i++)
					{
							System.out.println("                            						Cancion # "+i+ " : "+info_canciones[i][ConsoleData.NOMBRE_CANCION]);
					}
						System.out.print("\n                                    			Ingrese el indice de la cancion, entre 0 y "+(info_canciones.length-1)+":");
						indice_cancion = ConsoleInput.getInt();
						audio.seleccionarCancion(info_canciones[indice_cancion][ConsoleData.RUTA_CANCION]);
						audio.reproducir();
						imprimir("\n                                      					El autor de esta cancion es: "+ info_canciones[indice_cancion][ConsoleData.AUTOR_CANCION]);
						System.out.println("\n                          						La letra de la cancion que usted ha escogido es esta: \n"); 

					inicio_letra = ConsoleInput.stringToInt(info_canciones[indice_cancion][ConsoleData.INICIO_CANCION]);
					fin_letra = ConsoleInput.stringToInt(info_canciones[indice_cancion][ConsoleData.FIN_CANCION]);
					letra_cancion = obtenerLetraCancion(inicio_letra,fin_letra,canciones);
					
				}
			
				//Opcion Numero 4 del menu del usuario.
				if(centinela == 4)
					{
						for(int i=0;i<info_canciones.length;i++)
					{
						System.out.println("									Cancion # "+i+ " : "+info_canciones[i][ConsoleData.NOMBRE_CANCION]);
					}
						System.out.print("\n							Ingrese indice de la cancion, entre 0 y "+(info_canciones.length-1)+":");
						indice_cancion = ConsoleInput.getInt();
						audio.seleccionarCancion(info_canciones[indice_cancion][ConsoleData.RUTA_CANCION]);
						audio.reproducir();
						System.out.println("\n                                   			Usted esta escuchando: "+info_canciones[indice_cancion][ConsoleData.NOMBRE_CANCION]);
						System.out.println("                                            		Del autor: "+info_canciones[indice_cancion][ConsoleData.AUTOR_CANCION]);
					}

				//Opcion Numero 5 del menu del usuario.
				if(centinela == 5)
				{
					System.out.println("										Usted ha detenido la cancion.");
					audio.detener();
				}

  			//Opcion de salida del usuario.
			}while(centinela!=6);
		}
		catch(Exception e)
		{
			System.out.println("Ocurrio un error en el programa : "+ e);
		}
		finally{
			audio.detener();
		}
	}
}