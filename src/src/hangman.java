import javax.swing.*;

public class hangman {
    public static void main(String[] args) {
        String ord = "yxa";
        String ord2 = "";
        int vinst = 0;
        String fel = "";
        int antal_fel = 0;
        String usedWords = "";
        int kvar = 0;
        int indexOf = 0;

        for (int o = 0; o < ord.length(); o++){
            if (ord.charAt(o) == ' '){
                ord2 = ord2 + ' ';
            } else {
                ord2 = ord2 + '_';
            }
        }

        System.out.println("Ordet är: " + ord2);
        System.out.println("Ordet är " + ord.length() + " bokstäver långt");
        for (int i = 0; i < 69; i++){
            String gissning = JOptionPane.showInputDialog("Bokstav?" + "(Bara en bokstav)");
            char charGissning = gissning.charAt(0);
            if (ord.contains(gissning)){
                indexOf = ord.indexOf(gissning);
                ord2 = ord2.replace(ord2.charAt(indexOf), charGissning);


                usedWords = usedWords + gissning;
                vinst +=1;
                System.out.println("Gissningen är rätt");
                if (vinst == ord.length()){
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
            System.out.println("Ordet är: " + ord2);
            System.out.println("Använda bokstäver: "+ usedWords + " av ett ord på " + ord.length() + " bokstäver");
            System.out.println("Bokstäver som blivit fel: " + fel);
            kvar = 9-antal_fel;
            System.out.println("Felaktiga gissningar kvar: " + kvar);
            System.out.println("");
        }
        if (vinst == ord.length()){
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
