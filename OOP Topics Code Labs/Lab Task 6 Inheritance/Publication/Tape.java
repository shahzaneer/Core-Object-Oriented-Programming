public class Tape extends Publication{
    private int playingTime;

    public Tape(){
        super();
    }

    public Tape(String title , double price ,int playingTime){
        super(title, price);
        this.playingTime = playingTime;
    }

    public void setPlayingTime(int playingTime){
        this.playingTime = playingTime;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("The playing time in minutes is "+playingTime);

    }
}
