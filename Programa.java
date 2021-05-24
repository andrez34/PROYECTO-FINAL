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