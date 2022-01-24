import javax.swing.*;

public class hangman {
    public static void main(String[] args) {
        String ord = "yxa";
        int vinst = 0;
        String fel = "";
        int antal_fel = 0;
        String usedWords = "";
        int kvar;

        char[] ord3 = new char[ord.length()];
        for (int u = 0; u < ord.length(); u++){
            ord3[u] = '_';
        }


        System.out.println("Ordet är: ");
        System.out.println(ord3);
        System.out.println("Ordet är " + ord.length() + " bokstäver långt");
        System.out.println("");
        for (int i = 0; i < 69; i++){
            String gissning = JOptionPane.showInputDialog("Bokstav?" + "(Bara en bokstav)");
            char charGissning = gissning.charAt(0);
            if (ord.contains(gissning)){
                ord3[ord.indexOf(gissning)] = charGissning;

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
            System.out.println("Ordet är: ");
            System.out.println(ord3);
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
