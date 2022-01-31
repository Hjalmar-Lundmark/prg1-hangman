import javax.swing.*;
import java.util.Arrays;

public class hangman {
    public static void main(String[] args) {
        String ord = "yxa";
        String gissning = "";
        String fel = "";
        int antal_fel = 0;
        int kvar;

        char[] ord2 = new char[ord.length()];
        for (int i = 0; i < ord.length(); i++){
            ord2[i] = '_';
        }

        char[] ordArray = new char[ord.length()];
        for (int i = 0; i < ord.length(); i++){
            ordArray[i] = ord.charAt(i);
        }

        System.out.println("Ordet är: ");
        System.out.println(ord2);
        System.out.println("Ordet är " + ord.length() + " bokstäver långt");
        System.out.println("");
        for (int i = 0; i < 69; i++){
            gissning = JOptionPane.showInputDialog("Bokstav?" + "(Bara en bokstav eller hela ordet)");
            char charGissning = gissning.charAt(0);
            if (ord.contains(gissning)){
                ord2[ord.indexOf(gissning)] = charGissning;

                System.out.println("Gissningen är rätt");
                if (gissning.equals(ord) || Arrays.equals(ord2,ordArray)){
                    break;
                }
            } else {
                System.out.println("Gissningen är fel");
                antal_fel += 1;
                fel = fel + gissning + ' ';
                if (antal_fel == 9){
                    break;
                }
            }
            System.out.println("Ordet är: ");
            System.out.println(ord2);
            System.out.println("Bokstäver som blivit fel: " + fel);
            kvar = 9-antal_fel;
            System.out.println("Felaktiga gissningar kvar: " + kvar);
            System.out.println("");
        }

        if (gissning.equals(ord) || Arrays.equals(ord2,ordArray)){
            System.out.println("Du vann!");
            System.out.println("Ordet var: " + ord);
        } else {
            if (antal_fel == 9){
                System.out.println("Du förlorade!");
                System.out.println("Ordet var: " + ord);
            } else {
                System.out.println("ERROR");
            }
        }
    }
}
