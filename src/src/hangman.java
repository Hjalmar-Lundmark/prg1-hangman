import javax.swing.*;
import java.util.Arrays;

public class hangman {
    public static void main(String[] args) {
        String ord = "ananas";
        String gissning = "";
        String fel = "";
        int antal_fel = 0;
        int kvar;
        char[] ord2 = hideWord(ord);
        char[] ordArray = makeArray(ord);

        System.out.println("Ordet är: ");
        System.out.println(ord2);
        System.out.println("Ordet är " + ord.length() + " bokstäver långt");
        System.out.println("");
        for (int i = 0; i < 69; i++){
            gissning = JOptionPane.showInputDialog("Bokstav?" + "(Bara en bokstav eller hela ordet)");
            char charGissning = gissning.charAt(0);
            if (ord.contains(gissning)){
                for (int o = 0; o < ord.length(); o++){
                    if (ord.charAt(o) == charGissning){
                        ord2[o] = charGissning;
                    }
                }
                //ord2[ord.indexOf(gissning)] = charGissning;

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

            if (antal_fel == 1){
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
            }
            if (antal_fel == 2){
                System.out.println("__________");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
            }
            if (antal_fel == 3){
                System.out.println("__________");
                System.out.println("|       |");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
            }
            if (antal_fel == 4){
                System.out.println("__________");
                System.out.println("|       |");
                System.out.println("|     {'_'}");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
            }
            if (antal_fel == 5){
                System.out.println("__________");
                System.out.println("|       |");
                System.out.println("|     {'_'}");
                System.out.println("|       |");
                System.out.println("|       |");
                System.out.println("|");
                System.out.println("|");
            }
            if (antal_fel == 6){
                System.out.println("__________");
                System.out.println("|       |");
                System.out.println("|     {'_'}");
                System.out.println("|       |");
                System.out.println("|       |");
                System.out.println("|      | |");
                System.out.println("|");
            }
            if (antal_fel == 7){
                System.out.println("__________");
                System.out.println("|       |");
                System.out.println("|     {'_'}");
                System.out.println("|      -|-");
                System.out.println("|       |");
                System.out.println("|      | |");
                System.out.println("|");
            }
            if (antal_fel == 8){
                System.out.println("__________");
                System.out.println("|       |");
                System.out.println("|     {'_'}");
                System.out.println("|      -|-");
                System.out.println("|       |");
                System.out.println("|      | |");
                System.out.println("|");
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

    public static char[] hideWord(String ord) {
        char[] ord2 = new char[ord.length()];
        for (int i = 0; i < ord.length(); i++){
            ord2[i] = '_';
        }
        return ord2;
    }

    public static char[] makeArray(String ord) {
        char[] ordArray = new char[ord.length()];
        for (int i = 0; i < ord.length(); i++){
            ordArray[i] = ord.charAt(i);
        }
        return ordArray;
    }
}
