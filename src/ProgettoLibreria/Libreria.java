package ProgettoLibreria;

import java.util.ArrayList;

public class Libreria {
    
    private ArrayList<Scaffali> scaffali;
    
    public Libreria() {
        this.scaffali = new ArrayList<>();
    }
    
    public void AggiungiScaffale(Scaffali scaffale) {
        scaffali.add(scaffale); 
    }
    
    public void RimuoviScaffale(Scaffali scaffale) {
        scaffali.remove(scaffale); 
    }
    
    public void getScaffale(int indice) {
        if (indice >= 0 && indice < scaffali.size()) {
        	System.out.println("Lo scaffale con indice " + indice + " esiste.");
        } else {
            System.out.println("Lo scaffale con indice " + indice + " non esiste.");
        }
 
    }
     
    public int TotaliScaffale() {
        return scaffali.size(); 
    
    }
    
    public int aggiungiLibro (Libro libro) {
		for (int i=0; i< scaffali.size(); i++) {
			Scaffali s = scaffali.get(i);
			if(s.aggiungiLibro(libro))
				return i;
		}
		return -1;
	}
    
    
    @Override
    public String toString() {
        String result = "Composizione della libreria:\n";
        for (int i = 0; i < scaffali.size(); i++) {
            result += "Scaffale " + i + ":\n" + scaffali.get(i) + "\n";
        }
        return result;
    }
    
    

}