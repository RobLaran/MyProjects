package Interface.Searchable;

public class Webpage implements Searchable{
    private String url;
    private String content;

    public Webpage(String url, String content){
        this.url = url;
        this.content = content;
    }

    public boolean search(String input){
        System.out.println("You are searching at " + url);
        return content.toLowerCase().contains(input.toLowerCase());
        
    }

}
