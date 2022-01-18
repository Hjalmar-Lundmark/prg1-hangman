import javax.swing.*;

public class hangman {
    public static void main(String[] args) {
        String ord = "yxa";
        int length = ord.length();
        int vinst = 0;
        String fel = "";
        int antal_fel = 0;
        String usedWords = "";
        int kvar = 0;

        System.out.println("Ordet är " + ord.length() + " bokstäver långt");
        for (int i = 0; i < 69; i++){
            String gissning = JOptionPane.showInputDialog("Bokstav?" + "(Bara en bokstav)");
            if (ord.contains(gissning)){
                usedWords = usedWords + gissning;
                vinst +=1;
                System.out.println("Gissningen är rätt");
                if (vinst == length){
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
            System.out.println("Använda bokstäver: "+ usedWords + " av ett ord på " + ord.length() + " bokstäver");
            System.out.println("Bokstäver som blivit fel: " + fel);
            kvar = 9-antal_fel;
            System.out.println("Felaktiga gissningar kvar: " + kvar);
            System.out.println("");
        }
        if (vinst == length){
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
