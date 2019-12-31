import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static int db;
    public static String[] betu=new String[100];
    public static String[] kod=new String[100];

    public static void main(String[] args) {
        beolvas("morzeabc.txt");
        hanyKarakter();
        karakterBekeres();

    }

    private static void karakterBekeres() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérek egy karaktert: ");
        String kar = sc.next();
        /*for (int i = 0; i <db ; i++) {
            if (betu[i].contains(kar)) {
                System.out.println("A(z) "+kar+" betű morzekódja: "+kod[i]);
            }
            else {
                System.out.println("Nem található a kódtárban ilyen karakter");
            }
        } */
    }

    private static void hanyKarakter() {
        System.out.println("3. feladat: A morze abc "+db+" db karakter kódját tartalmazza.");
    }

    private static void beolvas(String filename) {
        try {
            System.setProperty("file.encoding","UTF8");
            BufferedReader br = new BufferedReader(new FileReader("morzeabc.txt"));
            String sor=br.readLine();
            while ((sor = br.readLine()) != null) {
                db++;
                //System.out.println(sor);
            }
            br.close();
            System.out.println("A fájl beolvasása sikeres!");
        }
        catch (IOException ioe) {
            System.out.println("A fájl beolvasása sikertelen!");
        }
    }
}
