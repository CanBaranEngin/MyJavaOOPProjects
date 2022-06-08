import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Purchase {


    private User user;
    private Movie movie;

    public Purchase(User user) {
        this.user = user;

    }

    public void purchaseSystem(){
        menu();
    }
    public void menu(){
        Scanner inp = new Scanner(System.in);
        boolean stop=true;
        while(stop){
            System.out.println("Movie Subscription System  (1)  ");
            System.out.println("Movie List  (2)  ");
            System.out.println("Account Info  (3)  ");
            System.out.println("Movie renting and purchasing (4)  ");
            System.out.println("Exit  (5)  ");
            int select = inp.nextInt();

            switch(select){
                case 1 :
                    setUserCredit();
                    break;
                case 2 :
                    movie=new Movie();
                    movieList();
                    break;
                case 3 :
                    userInfo();
                    break;

                case 4:
                    movie=new Movie();
                    movieRenPur();
                    break;

                case 5:
                    stop=false;

            }

        }
    }
    public void setUserCredit(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Subscription or load money on the account  (S)ub/(L)oadMoney ");
        String select = inp.nextLine();
        if(select.equalsIgnoreCase("S") && this.user.getMoney()!=0){
            System.out.println("Congratulations you are now a part of our movie membership system");
            System.out.println("Now you can renting movie with your credit" );
            this.user.setCredit(20);
            this.user.setMoney(this.user.getMoney()-10);
            System.out.println("Your credit: " + this.user.getCredit());
            System.out.println("Your money: " + this.user.getMoney());

        }if(select.equalsIgnoreCase("L")){
            System.out.println("Please enter the money value which is load your account");
            double loadMoney = inp.nextDouble();
            this.user.setMoney(this.user.getMoney()+loadMoney);
            System.out.println("Money in your account: " + this.user.getMoney());

        }if(this.user.getMoney()==0){
            System.out.println("Money in your account is zero please enter L and go to the load money menu!!");
        }

    }

    public void movieList(){
        for(int i=0;i<movie.movies().size();i++){
            System.out.println("----------------------");
            System.out.println(movie.movies().get(i).getId());
            System.out.println(movie.movies().get(i).getName());
            System.out.println("Price: "+ movie.movies().get(i).getPrice());
            System.out.println("Credit: "+ movie.movies().get(i).getCredit());

            System.out.println("----------------------");
        }
    }

    public void memberShipInfo(){
        System.out.println("Credit in your account: "+ this.user.getCredit());
        System.out.println("Credit in your account: "+ this.user.getMoney());
    }

    public void movieRenPur(){
        Scanner inp = new Scanner(System.in);
        boolean stop=true;
        
        while(stop){
            System.out.println(" <<< (P)urchasing & (R)enting (E)xit >>> ");
            String choose = inp.nextLine();
            if(choose.equalsIgnoreCase("r")){
                if(this.user.getCredit()!=0){
                    movieList();
                    System.out.println("If you want to return the previous menu please enter (4)");
                    System.out.println();
                    System.out.println("Please enter id number of movie which you want to rent:  ");
                
                    int select = inp.nextInt();
                    if(select==4){
                        break;
                    }
                    if(this.user.getMovieList().contains(this.movie.movies().get(select-1).getName())){
                        System.out.println("You already have this movie please rent another movie ");
                    }
                    else{
                        this.user.getMovieList().add(this.movie.movies().get(select-1).getName());
                        this.user.setCredit(this.user.getCredit()-movie.movies().get(select-1).getCredit());
                        System.out.println("You rent a film which name is : " +this.movie.movies().get(select-1).getName());
                        System.out.println("Your film list is: " + this.user.getMovieList());
        
                    }
                
                    
        
                }
                if(this.user.getCredit()==0){
                    System.out.println("Credit in your account is zero please enter (1) and go to the Movie Subscription System menu!!");
                }

            }
            if(choose.equalsIgnoreCase("p")){
                if(this.user.getCredit()!=0){
                    movieList();
                    System.out.println("If you want to return the previous menu please enter (4)");
                    System.out.println();
                    System.out.println("Please enter id number of movie which you want to buy:  ");
                    int select = inp.nextInt();
                    if(select==4){
                        break;
                    }
                    if(this.user.getMovieList().contains(this.movie.movies().get(select-1).getName())){
                        System.out.println("You already have this movie please buy another movie ");
                    }else{
                        this.user.getMovieList().add(this.movie.movies().get(select-1).getName());
                        this.user.setMoney(this.user.getMoney()-movie.movies().get(select-1).getPrice());
                        System.out.println("You buy a film which name is : " +this.movie.movies().get(select-1).getName());
                        System.out.println("Your film list is: " + this.user.getMovieList());
        
                    }
                    
        
                }
                if(this.user.getMoney()==0){
                    System.out.println("Money in your account is zero please enter (1) and go to the Movie Subscription System menu!!");
                }


            }
            if(choose.equalsIgnoreCase("e")){
                stop=false;
            }
            
                
        }
       
    }

    public void userInfo(){
        System.out.println("-------------------------------");
        System.out.println("Your current credit: " + this.user.getCredit());
        System.out.println();
        System.out.println("Your current money: " + this.user.getMoney());
        System.out.println();
        System.out.println("List of movie that you have: " + this.user.getMovieList());
        System.out.println("-------------------------------");

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
