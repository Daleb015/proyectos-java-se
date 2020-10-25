import java.util.*;
public class Prueba_Treeset {

	public static void main(String[] args) {
		/*TreeSet<String> ordenaPersonas=new TreeSet<String>();
		ordenaPersonas.add("Sandra");
		ordenaPersonas.add("Amanda");
		ordenaPersonas.add("Diana");
		for(String tmp:ordenaPersonas ){
			System.out.println(tmp);
		}*/
		
		Articulo primero=new Articulo(1,"Primero");
		Articulo segundo=new Articulo(200,"Segundo");
		Articulo tercero=new Articulo(3,"Tercero");
		TreeSet<Articulo> ordenaArticulos=new TreeSet<Articulo>();
		ordenaArticulos.add(tercero);
		ordenaArticulos.add(segundo);
		ordenaArticulos.add(primero);
		for(Articulo tmp:ordenaArticulos){
			System.out.println(tmp.getDescripcion());
		}
		
		//Articulo comparadorArticulos=new Articulo();
		//TreeSet<Articulo> ordenaArt=new TreeSet<Articulo>(comparadorArticulos);
		ComparadorArticulos comparadorArticulos = new ComparadorArticulos();
		TreeSet<Articulo> ordenaArt=new TreeSet<Articulo>(new Comparator<Articulo>(){

			@Override
			public int compare(Articulo o1, Articulo o2) {
				String descripcionA=o1.getDescripcion();
				String descripcionB=o2.getDescripcion();
				return descripcionA.compareTo(descripcionB);
			}
			
		});
		ordenaArt.add(primero);
		ordenaArt.add(segundo);
		ordenaArt.add(tercero);
		for(Articulo tmp:ordenaArt){
			System.out.println(tmp.getDescripcion());
		}
		
	}

		
}

class Articulo implements Comparable<Articulo>{//, //Comparator<Articulo>{
	public Articulo(int num, String desc){
		this.num=num;
		this.desc=desc;
	}
	/*public Articulo(){
		
	}*/

	
	@Override
	public int compareTo(Articulo o) {
		return num-o.num;
	}
	
	public String getDescripcion(){
		return desc;
	}
	private int num;
	private String desc;
	/*@Override
	public int compare(Articulo arg0, Articulo arg1) {
		// TODO Auto-generated method stub
		String descripcionA=arg0.getDescripcion();
		String descripcionB=arg1.getDescripcion();
		return descripcionA.compareTo(descripcionB);
	}*/
}

class ComparadorArticulos implements Comparator<Articulo>{

	@Override
	public int compare(Articulo o1, Articulo o2) {
		String descripcionA=o1.getDescripcion();
		String descripcionB=o2.getDescripcion();
		return descripcionA.compareTo(descripcionB);
	}
	
}