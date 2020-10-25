
public class Cliente {
	private String nombre;
	private String numeroDeCuenta;
	private double saldo;
	
	public Cliente(String nombre,String numeroDeCuenta,double saldo){
		this.nombre=nombre;
		this.numeroDeCuenta=numeroDeCuenta;
		this.saldo=saldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumeroDeCuenta() {
		return numeroDeCuenta;
	}

	public void setNumeroDeCuenta(String numeroDeCuenta) {
		this.numeroDeCuenta = numeroDeCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((numeroDeCuenta == null) ? 0 : numeroDeCuenta.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (numeroDeCuenta == null) {
			if (other.numeroDeCuenta != null)
				return false;
		} else if (!numeroDeCuenta.equals(other.numeroDeCuenta))
			return false;
		return true;
	}
	
	
}
