package ProgettoLibreria;

public class TestLibreria {

    public static void main(String[] args) {
        
    	
        // Creazione dei libri
        Libro libro = new Libro("Citazioni del Presidente","Mao Tsé-Tung", false);
        Libro libro1 = new Libro("Se questo è un uomo", "Primo Levi", false);
        Libro libro2 = new Libro("Il nome della Rosa", "Umberto Eco", false);
        Libro libro3 = new Libro("Il piccolo Principe", "Antoine de Saint-Exupéry", false);
        
        
        System.out.println(libro);
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);
       
        
        System.out.println();
      
        //Creazione della libreria e la creazione dello scaffale per farlo aggiungere alla libreria
        Libreria libreria = new Libreria();
        
        Scaffali scaffale1 = new Scaffali(8);
      
        libreria.AggiungiScaffale(scaffale1);
        libreria.AggiungiScaffale(scaffale1);
        libreria.AggiungiScaffale(scaffale1);
        libreria.AggiungiScaffale(scaffale1);
        libreria.AggiungiScaffale(scaffale1);
        libreria.RimuoviScaffale(scaffale1);
        libreria.RimuoviScaffale(scaffale1);
        
        libreria.getScaffale(3);
        
        System.out.println("Numero totale di scaffali: " + libreria.TotaliScaffale());
       
    
        // Creazione degli scaffali
        Scaffali scaffale = new Scaffali(10);
    
        // Aggiunta di un libro
        scaffale.aggiungiLibro(libro);
        scaffale.aggiungiLibro(libro1);
        scaffale.aggiungiLibro(libro2);
        scaffale.aggiungiLibro(libro3);
        scaffale.aggiungiLibro(libro3);
        scaffale.aggiungiLibro(libro3);
        scaffale.aggiungiLibro(libro3);
        scaffale.aggiungiLibro(libro3);
        System.out.println();
        
        // Rimozione di un libro
        scaffale.rimuoviLibro(libro);
        scaffale.rimuoviLibro(libro1);
        scaffale.rimuoviLibro(libro2);
        
        
        System.out.println("Numero totale di libri: " + scaffale.TotaliLibri());
        
        // Cerca per titolo del libro
        System.out.println();
        scaffale.cercarepertitolo("Il piccolo Principe");
        
        
    
    }
}