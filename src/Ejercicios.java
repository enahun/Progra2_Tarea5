import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Ejercicios {

	//Escribe la variable contenido al inicio de un archivo que tiene como nombre nombre_archivo
	static void escribirString(String nombre_archivo, String contenido)
	{
		try //inicio de metodo try 
		{
			PrintWriter in= new PrintWriter(nombre_archivo); //crea la variable in, asigna los valores de  nombre_archivo
			in.write(contenido); //escribre los datos en contenido
			in.close();			//cierra el metodo PrintWriter
		}
		catch(FileNotFoundException e)	//inicio de catch por posibles errores
		{
			e.printStackTrace();
		}
		
	}
	
	//Escribe la variable contenido al inicio de un archivo que tiene como nombre nombre_archivo
	static void escribirInt(String nombre_archivo, int contenido)
	{

		try //inicio de metodo try 
		{
			PrintWriter in= new PrintWriter(nombre_archivo); //crea la variable in, asigna los valores de  nombre_archivo
			in.print(contenido); //escribre los datos en contenido
			in.close();			//cierra el metodo PrintWriter
		}
		catch(FileNotFoundException e)	//inicio de catch por posibles errores
		{
			e.printStackTrace();
		}
		
	}
	
	//Devuelve el primer entero contenido en el archivo con nombre nombre_archivo
	static int leerEntero(String nombre_archivo)
	{
		int leer; //declara variable tipo entero
		try	//inicio del manejo de excepciones
		{
			 Scanner in=new Scanner(new File(nombre_archivo)); //declaracion de variables Scanner
			 leer=in.nextInt(); //Asigna el valor del Scanner a leer
			 in.close(); //Cierra el metodo leer
			return leer;	//Retorna el valor entero de leer
		}
		catch(FileNotFoundException e) //inicio de catch por posibles errores
		{
			e.printStackTrace();
		}
		return -1;
	}
	
	//Devuelve la primera string contenida en el archivo con nombre nombre_archivo
	static String leerString(String nombre_archivo)
	{
		String leer; //declara variable tipo entero
		try	//inicio del manejo de excepciones
		{
			 Scanner in=new Scanner(new File(nombre_archivo)); //declaracion de variables Scanner
			 leer=in.nextLine(); //Asigna el valor del Scanner a leer
			 in.close(); //Cierra el metodo leer
			return leer;	//Retorna el valor String de leer
		}
		catch(FileNotFoundException e) //inicio de catch por posibles errores
		{
			e.printStackTrace();
		}
		return "";
	}
	
	//Devuelve el primer double contenido en el archivo con nombre nombre_archivo
	static double leerDouble(String nombre_archivo)
	{
		float leer; //declara variable tipo entero
		try	//inicio del manejo de excepciones
		{
			 Scanner in=new Scanner(new File(nombre_archivo)); //declaracion de variables Scanner
			 leer=in.nextFloat(); //Asigna el valor del Scanner a leer
			 in.close(); //Cierra el metodo leer
			return leer;	//Retorna el valor Float de leer
		}
		catch(FileNotFoundException e) //inicio de catch por posibles errores
		{
			e.printStackTrace();
		}
		return -1;
	}
	
	//Devuelve la cantidad de veces que buscada (dado) existe en el archivo con nombre nombre_archivo (dado)
	static int contar(String nombre_archivo, String buscada)
	{
		String leer;
		int x = 0;
		try	//inicio del manejo de excepciones
		{
			 Scanner in=new Scanner(new File(nombre_archivo)); //declaracion de variables Scanner
			 while(in.hasNext()) 
			 {
				//ayuda de referencia http://todoenjava.blogspot.com/2013/01/buscar-palabra-en-archivo-y-uso-de.html
				leer=in.next(); //Inicializa la variable leer
				 if(leer.equals(buscada)) //realiza la comparacion de la palabra buscada
					 x++; //Suma la variable cada vez que encuentra la palabra					 
			 }
			
			 in.close(); //Cierra el metodo leer
			return x;	//Retorna el valor de las veces encontrado
		}
		catch(FileNotFoundException e) //inicio de catch por posibles errores
		{
			e.printStackTrace();
		}
		return -1;
	}
	
	//Devuelve el promedio de los numeros almacenados en un archivo
	//Nota: el archivo unicamente contiene enteros
	static int getPromedio(String nombre_archivo)
	{
		try
		{
			int prom,num=0,x=0; //declaracion de variables para calculo del promedio
			Scanner leer = new Scanner(new File(nombre_archivo));	//declaracion de variables Scanner
			while(leer.hasNextLine()) //ciclo de busqueda de enteros en archivo
			{
				num=num+leer.nextInt(); //Asigna el valor de los enteros encontrados en el archivo
				x++; //Suma cada una de las veces que se encuentra un entero
			}
			leer.close(); //Cierra el metodo de lectura
			return prom=num/x; //retorna el promedio de los enteros
		}
		catch(FileNotFoundException e) //inicio de catch por posibles errores
		{
			e.printStackTrace();
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
