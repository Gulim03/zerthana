package tapsyrma;

public class Main {
    public static void main(String[] args) {
        Shkaf shkaf = new Shkaf("big");
        Shkaf shkaf1 = new Shkaf(5);
        Books books = new Books(54);
        outputInfo(shkaf);
        outputInfo(shkaf1);
        outputInfo(books);
    }

    public static void outputInfo(Mebel mebel){
        mebel.showInfo();
    }
}
