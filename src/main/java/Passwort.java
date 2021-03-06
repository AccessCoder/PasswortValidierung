import java.util.ArrayList;
import java.util.Scanner;

public class Passwort {
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<String> forbiddenPW= new ArrayList<String>();
    public static void forbiddenList(){
        forbiddenPW.add("12345678");
        forbiddenPW.add("Passwort123!");
    }
    public static char[] Sonderzeichen = {'!', '"', '§', '$', '%', '&', '/', '(', ')', '=', '?', '`','²', '³', '{', '[', ']', '}', 'ß', '´', '+', '*', '~', '#', '-', '_', ',', ';', '.', ':', 'µ', '<','>', '|', '^', '°', '@', '€'};
    public static char[] Großbuchstaben = {'Q', 'W', 'E', 'R', 'T', 'Z', 'U', 'I', 'O', 'P', 'Ü', 'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'Ö', 'Ä', 'Y', 'X', 'C', 'V', 'B', 'N', 'M'};
    public static char[] Kleinbuchstaben = {'q', 'w', 'e', 'r', 't', 'z', 'u', 'i', 'o', 'p', 'ü', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'ö', 'ä', 'y', 'x', 'c', 'v', 'b', 'n', 'm'};
    public static char[] nums = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};

    public static boolean checkGroßbuchstabe(String Password){
        char[] password = Password.toCharArray();
        boolean valid = false;
        for (int i = 0;i<Password.length();i++){
            for (int x = 0;x<Großbuchstaben.length;x++){
                if (password[i] == Großbuchstaben[x]){
                    valid = true;
                }
            }
        }
        return valid;
    }
    public static boolean checkKleinbuchstabe(String Password){
        char[] password = Password.toCharArray();
        boolean valid = false;
        for (int i = 0;i<Password.length();i++){
            for (int x = 0;x<Kleinbuchstaben.length;x++){
                if (password[i] == Kleinbuchstaben[x]){
                    valid = true;
                }
            }
        }
        return valid;
    }
    public static boolean checkSonderzeichen(String Password){
        char[] password = Password.toCharArray();
        boolean valid = false;
        for (int i = 0;i<Password.length();i++){
            for (int x = 0;x<Sonderzeichen.length;x++){
                if (password[i] == Sonderzeichen[x]){
                    valid = true;
                }
            }
        }
        return valid;
    }
    public static boolean checkNums(String Password){
        char[] password = Password.toCharArray();
        boolean valid = false;
        for (int i = 0;i<Password.length();i++){
            for (int x = 0;x<nums.length;x++){
                if (password[i] == nums[x]){
                    valid = true;
                }
            }
        }
        return valid;
    }
    public static boolean isLongerThan7 (String Password){
        if (Password.length() > 7){
            return true;
        }else return false;
    }

    public static void main(String[] args) {
        if (isAllowed(reader())){
            System.out.println("Das Passwort ist valide");
        }else System.out.println("Das Passwort entspricht nicht unseren Sicherheitsbestimmungen, bitte beachte:\nmindestens 8 Zeichen lang\nmin ein Großbuchstabe\nmin ein Kleinbuchstabe\nmin eine Zahl\nmin ein Sonderzeichen.");
    }
    // Eingabe des Users einlesen (scanner)
    public static String reader(){
        System.out.println("Bitte geben Sie das zu validierende Passwort ein: ");
        return scanner.nextLine();
         }

    // Vergleich mit Datenbank der nicht erlaubten Passwörter und dem Safety Checker
    public static boolean isAllowed(String Password){
        if (forbiddenPW.contains(Password)){
            System.out.println("Das Passwort ist nicht gültig!");
            return false;
        }else return safetyCheck(Password);
    }

    // Gegenchecken ob Sicherheitsstandards erfüllt sind (ein Großbuchstabe, ein Kleinbuchstabe, eine Zahl und ein Sonderzeichen. Min 8 Zeichen lang)
    public static boolean safetyCheck(String Password){
        if (checkGroßbuchstabe(Password) && checkKleinbuchstabe(Password) && checkSonderzeichen(Password) && checkNums(Password) && isLongerThan7(Password)){
            return true;
        }else return false;
            }



}
