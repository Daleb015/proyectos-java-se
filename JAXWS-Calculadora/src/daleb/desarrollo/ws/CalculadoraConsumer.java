package daleb.desarrollo.ws;

public class CalculadoraConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculadoraImplService calculadoraservice = new CalculadoraImplService();
		Calculadora consumer = calculadoraservice.getCalculadoraImplPort();
		System.out.println("Suma");
		System.out.println(consumer.operacion(1, 6, 4));
		
		System.out.println("Resta");
		System.out.println(consumer.operacion(2, 6, 4));
		
		System.out.println("Multiplicación");
		System.out.println(consumer.operacion(3, 6, 4));
		
		System.out.println("División");
		System.out.println(consumer.operacion(4, 6, 4));
	}

}
