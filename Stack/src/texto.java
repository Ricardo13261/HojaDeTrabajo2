import java.io.*;     //libreria para la lectura de archivos

public class texto {
int dato1;
private char dato2;
private String operacion, operando;
private char[] cadena_caracteres;

public texto(){
	cadena_caracteres= new char[100];
}
public void leer(String nombreArchivo) {
	try{
		FileReader nombre= new FileReader(nombreArchivo);		//indicamos que archivo debe leer
		BufferedReader espacio= new BufferedReader(nombre);		//creamos un espacio para memoria para guardar informacion
		operacion= espacio.readLine();							//lee la linea

		cadena_caracteres = operacion.toCharArray();			//los convierte array
		System.out.println("Documento leido: "+operacion);		
		
		int i=0;
		while (i<5){
			//comparaciones que se enviaran a la pila
			if(cadena_caracteres[i]==' '){
				i++;
			}else if(cadena_caracteres[i]=='+'){
				operando ="+";
				i++;
			}else if(cadena_caracteres[i]=='-'){
				operando ="+";
				i++;
			}else if(cadena_caracteres[i]=='*'){
				operando ="*";
				i++;
			}else if(cadena_caracteres[i]=='/'){
				operando ="/";
				i++;
			}else{
				dato1=cadena_caracteres[i]-48;
				i++;
			}
			
		}
		System.out.println(dato1+operando);
		
	}catch(Exception e){
		System.out.println("Error: "+e.getMessage());        //se atrapa la excepcion en caso no exista un .txt 
	}
	
}


}
