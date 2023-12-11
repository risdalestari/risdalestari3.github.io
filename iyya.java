import java.util.LinkedList;
import java.util.Queue;

public class iyya {

    public static void main(String[] args) {
        Queue<String> antrian = new LinkedList<>();
        
        antrian.add("bunga batik");
        antrian.add("bunga kamboja");
        antrian.add("bunga janda bolong");
        antrian.add("bunga anggrek");
        antrian.add("bunga matahari");

        System.out.println(antrian.offer("cantik"));
        System.out.println(antrian.remove("bunga kamboja"));
        System.out.println(antrian.remove("bunga janda bolong"));
        System.out.println(antrian.offer("semua bunga"));
        System.out.println(antrian.add("pokoknya semua bunga cantik"));
        System.out.println(antrian.peek());
        System.out.println(antrian);
    }
}
