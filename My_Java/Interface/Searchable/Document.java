package Interface.Searchable;

public class Document implements Searchable{
    private String content;

    public Document(String content){
        this.content = content;
    }

    public boolean search(String input){
        return content.toLowerCase().contains(input.toLowerCase());
    }


}
