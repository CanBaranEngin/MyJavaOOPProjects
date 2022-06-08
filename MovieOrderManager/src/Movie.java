import java.util.ArrayList;

public class Movie {
    private int id;
    private String name;
    private double price;
    private int credit;

    public Movie(int id, String name, double price,int credit) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.credit = credit;
    }

    public Movie() {
    }



    public ArrayList<Movie> movies(){

        ArrayList<Movie> movieList = new ArrayList<>();

        movieList.add(new Movie(1,"Lord of the Rings",8,2));
        movieList.add(new Movie(2,"Fight Club",10,3));
        movieList.add(new Movie(3,"Into the Wild",7,1));
        return movieList;

    }

    public Movie getWeaponObjByID(int id){
        for(Movie m:movies()){
            if(m.getId() == id) {
                return m;
            }
        }
        return null;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }
}
