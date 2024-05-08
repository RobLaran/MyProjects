package Interface.Searchable;

public class Main {
    public static void main(String[] args) {
        Searchable doc = new Document("Odin is cool!");
        Searchable web = new Webpage("www.google.com", "Life is hard");

        String search1 = "ODIN";
        String search2 = "LiFe";
        
        System.out.println("Document contains keyword \'" + search1 + "\': " + doc.search(search1));        
        System.out.println("Webpage contains keyword \'" + search2 + "\': " + web.search(search2));        
    }
}
