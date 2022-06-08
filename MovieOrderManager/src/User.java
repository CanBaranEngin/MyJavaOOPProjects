import java.util.ArrayList;

public class User {
    private int id;
    private String name;
    private String password;
    private double money;
    private int credit;
    private ArrayList<String> movieList = new ArrayList<>();



    public User(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.money=50;
        this.credit=20;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public ArrayList<String> getMovieList() {
        return movieList;
    }

    public void setMovieList(ArrayList<String> movieList) {
        this.movieList = movieList;
    }
}
