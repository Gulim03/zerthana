package tapsyrma;

public class Shkaf implements Mebel {
    public int shelves;
    public String volume;

    public Shkaf(int shelves){
        this.shelves = shelves;
    }

    public void showInfo() {
        System.out.println("Polkalardyn sany: " + this.shelves);
    }
    public Shkaf(String volume){
        this.volume = volume;
    }

    public void showInfo() {
        System.out.println("Shkaftyn olshemi: " + this.volume);
    }


}

