package Clases_propias;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MetodosGenericos {

	public static void main(String[] args) {
		String[] nombres = {"Ana","Jose","Maria","Pedro"};
		System.out.println(MisMatrices.getElemento(nombres));
		System.out.print(MisMatrices.getMenor(nombres));
		Empleado paco = new Empleado("Paco",45,1000);
		Empleado camilo = new Empleado("Camilo",30,3000);
		Empleado[] listaTrabajo = new Empleado[2];
		listaTrabajo[0]=paco;
		listaTrabajo[1]=camilo;
		System.out.println(MisMatrices.getMenor(listaTrabajo));
		
		GregorianCalendar fecha[] ={new GregorianCalendar(2015,07,12),new GregorianCalendar(2015,07,10)};  
		System.out.println(MisMatrices.getMenor(fecha).get(Calendar.DATE));
	}

}

class MisMatrices{
	public MisMatrices(){
		
	}
	
	public static <T> String getElemento(T[]a){
		return "El array tiene: "+a.length;
		
		
	}
	
	public static <T extends Comparable> T getMenor(T[]a){
		if(a==null || a.length==0)
		{
			return null;
		}
		
		T elementoMenor=a[0];
		for(int i=1;i<a.length;i++){
			if(elementoMenor.compareTo(a[i])>0){
				elementoMenor=a[i];
			}
		}
		return elementoMenor;
		
		
	}
}
