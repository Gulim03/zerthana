package tapsyrma;

public class Books implements Mebel {

    public int kol_knig;

    public Books(int kol_knig){
        this.kol_knig = kol_knig;
    }

    public void showInfo() {
        System.out.println("Kitaptardyn sany: " + this.kol_knig);
    }

}
