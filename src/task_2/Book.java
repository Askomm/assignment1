package task_2;
public class Book{
    private int id;
    private static int idGen = 1;
    private String title;
    private String author;
    private int year;
    private boolean available;


    public Book(){
        id = idGen++;
        available = true;
    }
    public Book(String title,String author,int year,boolean available){
        this();
        setTitle(title);
        setAuthor(author);
        setYear(year);

    }

    public int getID(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getYear(){
        return year;
    }
    public boolean getAvailable(){
        return available;
    }

    public void setTitle(String title){
        if(title == null || title.isEmpty()){
            throw new IllegalArgumentException ("No title of the book");
        }
        this.title= title;
    }
    public void setAuthor(String author){
        if(author == null || author.isEmpty()){
            throw new IllegalArgumentException ("No author of the book");
        }
        this.author = author;
    }
    public void setYear(int year){
        if(year<1500 || year>2025){
            throw new IllegalArgumentException("Wrong year of the book");
        }
        this.year = year;

    }
    public void AsBorrowed(){
        this.available = false;
    }
    public void AsReturned(){
        this.available = true;
    }


    @Override
    public String toString(){
        return "Id:"+id +
                "\ntitle:" + title + "\nauthor:"+ author + "\nyear:" + year + "\navailable:" + available;
    }


}