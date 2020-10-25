
public class Libro {
	public Libro(String nombre,String  autor,int ISBN){
		this.nombre=nombre;
		this.autor=autor;
		this.ISBN=ISBN;
	}
	
	public String getDatos(){
		return "El titulo es: "+nombre+". El autor es: "+autor+" y el isbn es: "+ISBN;
	}
	
	/*public boolean equals(Libro e){
		boolean elnombre=false;
		boolean elautor=false;
		boolean elISBN=false;
		if(this.nombre.equals(e.nombre)){
			elnombre=true;
		}
		if(this.autor.equals(e.autor)){
			elautor=true;
		}
		if(this.ISBN==e.ISBN){
			elISBN=true;
		}
		if(elnombre==true&&elautor==true&&elISBN==true){
			return true;
		}else{
			return false;
		}
				
	}
	
	public boolean equals(Object obj){
		if(obj instanceof Libro){
			Libro e = (Libro)obj;
			boolean elnombre=false;
			boolean elautor=false;
			boolean elISBN=false;
			if(this.nombre.equals(e.nombre)){
				elnombre=true;
			}
			if(this.autor.equals(e.autor)){
				elautor=true;
			}
			if(this.ISBN==e.ISBN){
				elISBN=true;
			}
			if(elnombre==true&&elautor==true&&elISBN==true){
				return true;
			}else{
				return false;
			}
			
		}else{
			return false;
		}
	}*/
	
	
	private String nombre;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ISBN;
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		Libro other = (Libro) obj;
		if (ISBN != other.ISBN)
			return false;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	private String autor;
	private int ISBN;
}
