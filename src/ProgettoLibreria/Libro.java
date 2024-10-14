package ProgettoLibreria;

public class Libro {

	private String Titolo;
	private String Autore;
	private boolean LibroLetto;
	
	
	public Libro(String titolo, String autore, boolean libroletto ) {
		this.Titolo = titolo;
		this.Autore = autore;
		this.LibroLetto = libroletto;
	}
	
	public Libro(String titolo, String autore) {
		this.Titolo = titolo;
		this.Autore = autore;
		this.LibroLetto = false ;
	}


	public String getTitolo() {
		return Titolo;
	}


	public void setTitolo(String titolo) {
		Titolo = titolo;
	}


	public String getAutore() {
		return Autore;
	}


	public void setAutore(String autore) {
		Autore = autore;
	}


	public boolean isLibroLetto() {
		return LibroLetto;
	}


	public void setLibroLetto(boolean libroLetto) {
		LibroLetto = libroLetto;
	}

	
	
	 @Override
	    public String toString() {
	        String lbl = this.Autore + " " + this.Titolo;
	        if (this.LibroLetto) {
	            lbl += " , letto";
	        } else {
	            lbl += " , non è letto";
	        }
	        return lbl;
	    }
}
