import java.util.ArrayList;
import java.util.Scanner;

public class LittleHelper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> Soluiton= new ArrayList<String>();
        while (!scanner.nextLine().isEmpty()){
        String x = "'"+scanner.nextLine()+"'";
        Soluiton.add(x);
        }
        System.out.println(Soluiton);
    }
}
