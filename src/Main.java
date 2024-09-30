//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.lang.constant.PackageDesc;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String D = "Donkey";
        String R = "Elephant";
        String I = "Person";
        String O = "Other";

        Scanner Scanner = new Scanner(System.in);

        System.out.print("Enter first letter of your party Affiliation [D,R,I,O for other ]: ");
        String PA = Scanner.nextLine();

        if (D.equals(PA)) {
            System.out.println(" Your party Affiliation is Democrat Donkey ");
            System.out.flush();

        } else if (PA == R) {
            System.out.println(" Your party Affiliation is Republican " + R);
            System.out.flush();

        } else if (PA == I) {
            System.out.println(" Your party Affiliation is Republican " + R);
        System.out.flush();

    }else if (PA == O)
        {System.out.println(" Your party Affiliation is Republican " + R);}
        System.out.flush();
    }
}