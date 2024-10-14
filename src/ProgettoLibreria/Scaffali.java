package ProgettoLibreria;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Scaffali {
	
	private int capienzaMassima;	
	private ArrayList<Libro> libri;

	public Scaffali(int CapMax) {
		
		this.libri= new ArrayList<>();
		this.capienzaMassima = CapMax;
	}
	
    public boolean aggiungiLibro(Libro libro) {
        if (libri.size() < capienzaMassima) {
            libri.add(libro);
            System.out.println("Libro aggiunto");
        } else {
            System.out.println("Scaffale pieno, non è possibile aggiungere altri libri.");
        }
        return false;
    }

    public void rimuoviLibro(Libro libro) {
        libri.remove(libro);
        System.out.println("Il libro rimosso è: " + libro.getTitolo());
    }
    
   
    public void cercarepertitolo(String titolo) {
        for (int i = 0; i < libri.size(); i++) {
            if (libri.get(i).getTitolo().equals(titolo)) {
                System.out.println("Il libro è stato trovato: " + titolo);
            }
        }
    }
    
    
    public int TotaliLibri() {
        return libri.size(); 
    
    }
    
    @Override
    public String toString() {
        String lbl = "Ecco la composizione dello scaffale:\n";
        for (Libro libro : libri) {
            lbl += libro.toString() + "\n";
        }
        return lbl;    
    }
    
    
    public boolean EsportaScaffale(String dove) {
    	
    	File f = new File(dove); 
    	try {
    		PrintWriter out = new PrintWriter(f);
    		out.println("File esportato con backup dello scaffale");
    		out.println(this.toString());
    		out.close();
    		
    		return true;
    	}
    	
    	catch(FileNotFoundException e){
    		e.printStackTrace();
    	}
    	
    	
    	return false;
    }
      
}