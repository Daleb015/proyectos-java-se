import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class CuentasUsuarios {

	public static void main(String[] args) {
		Cliente cl1 = new Cliente("Juan","10225986",1000);
		Cliente cl2 = new Cliente("Alfonso","9586",7000);
		Cliente cl3 = new Cliente("Pedro","1022",2000);
		Cliente cl4 = new Cliente("julio Iglesias","1054444",1000000);
		Cliente cl5 = new Cliente("julio Iglesias","1054444",1000000);
		
		Set<Cliente> clientesBanco = new HashSet<Cliente>();
		
		clientesBanco.add(cl1);
		clientesBanco.add(cl2);
		clientesBanco.add(cl3);
		clientesBanco.add(cl4);
		clientesBanco.add(cl5);
		
		/*for(Cliente tmp:clientesBanco){
			//System.out.println("El clientes es: "+tmp.getNombre()+" El numero de cuenta es: "+tmp.getNumeroDeCuenta()+" El saldo es: "+tmp.getSaldo());
			if(tmp.getNombre().equals("julio Iglesias")){
				clientesBanco.remove(tmp);
			}
		}*/
		
		
		
		Iterator<Cliente> it=clientesBanco.iterator(); 
		while(it.hasNext()){
			String nombre=it.next().getNombre();
			if(nombre.equals("julio Iglesias")){
				it.remove();
			}
		}
		for(Cliente tmp:clientesBanco){
			System.out.println("El clientes es: "+tmp.getNombre()+" El numero de cuenta es: "+tmp.getNumeroDeCuenta()+" El saldo es: "+tmp.getSaldo());
			
		}
	}

}
