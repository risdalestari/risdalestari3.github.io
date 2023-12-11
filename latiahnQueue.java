import java.util.LinkedList;
import java.util.Queue;

public class latiahnQueue {
    public static void main(String[] args) {
        Queue<String> antrian = new LinkedList<>();

        antrian.add("bunga matahari");
        antrian.add("bunga anggrek");
        antrian.add("bunga teratai");
        antrian.add("bunga janda bolong");
        antrian.add("bunga kaktus");
        antrian.add("bunga mawar");
        antrian.add("bunga melati");

        System.out.println(antrian.remove("bunga janda bolong"));
        System.out.println(antrian.add("semua bunga sangat cantik"));
        System.out.println(antrian.peek());
        System.out.println(antrian.peek());
        System.out.println(antrian.peek());
        System.out.println(antrian.peek());
        System.out.println(antrian.peek());
        System.out.println(antrian.peek());
        System.out.println(antrian.peek());
        System.out.println(antrian);

    }
    
}
