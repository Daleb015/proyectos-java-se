package usoThreads;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BancoSinSincronizar {

	public static void main(String[] args) {
		
		Banco b = new Banco();
		for(int i=0;i<100;i++){
			Runnable r = new EjecucionTransferencias(b,i,2000);
			Thread hilo = new Thread(r);
			hilo.start();
		}
	}
	
}

class Banco{
	public Banco(){
		cuentas = new double[100];
		for(int i=0;i<cuentas.length;i++){
			cuentas[i]=2000;
		}
		//saldoSuficiente=cierreBanco.newCondition();
	}
	
	public synchronized void transferencia(int cuentaOrigen,int cuentaDestino, double cantidad) throws InterruptedException{
		//cierreBanco.lock();
		//try{
		if(cuentas[cuentaOrigen]<cantidad){
			
			//saldoSuficiente.await();
			wait();
		}
		System.out.println(Thread.currentThread());
		cuentas[cuentaOrigen]-=cantidad; //Resta a la cuenta origen
		System.out.printf("%10.2f de %d para %d", cantidad,cuentaOrigen,cuentaDestino);
		cuentas[cuentaDestino]+=cantidad; //Suma a la cuenta destino
		System.out.printf("El saldo es: %10.2f", getSaldoTotal());
		//saldoSuficiente.signalAll();
		notifyAll();
		}//finally{
			//cierreBanco.unlock();
		//}
		//}
	
	public double getSaldoTotal(){
		double contador=0;
		for(int i=0;i<cuentas.length;i++){
			contador+=cuentas[i];
		}
		return contador;
	}
	
	
	private final double[] cuentas;
	
	//private Lock cierreBanco=new ReentrantLock();
	
	//private Condition saldoSuficiente;
	
}

class EjecucionTransferencias implements Runnable{
	public EjecucionTransferencias(Banco b, int de, double max){
		banco=b;
		deLaCuenta=de;
		cantidadMax=max;
	}
	@Override
	public void run() {
		try{
		while(true){
			int aleat=(int)(Math.random()*100);
			double cantidad=cantidadMax*Math.random();
			banco.transferencia(deLaCuenta, aleat, cantidad);
			
				Thread.sleep((int)Math.random()*10);
			}} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	private Banco banco;
	private int deLaCuenta;
	private double cantidadMax;
	
}
