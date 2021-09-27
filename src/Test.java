import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        int cash = 100;
        int n = 8;
        int price = 45;

        int vitraty = n * price;

        if (cash >= vitraty){
            System.out.println("Йдемо в кіно" + vitraty);
        } else {
            System.out.println("Не йдемо в кіно");
        }

        String vubir = cash >= vitraty ? "Yes" : "No";
        System.out.println(vubir);



        if (price % 2 == 1){
            System.out.println("neparne");
        }else {
            System.out.println("parne");
        }

        String s = price%2 == 0 ? "":"";

    }
}
