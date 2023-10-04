import java.util.Scanner;

public class Pemilihan2Percobaan222 {
    public static void main (String [] args)
    {

        Scanner input22 = new Scanner(System.in);

        int totalSudut, sudut1, sudut2, sudut3;

        System.out.println("Masukkan Sudut 1: ");
        sudut1 = input22.nextInt();
        System.out.println("Masukkan Sudut 2: ");
        sudut2 = input22.nextInt();
        System.out.println("Masukkan Sudut 3: ");
        sudut3 = input22.nextInt();

        totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180)
        {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90))
                System.out.println("Segitiga Tersebut Adalah Segitiga Siku-Siku");
            else
                System.out.println("Segitiga Tersebut Bukan Segitiga Siku-Siku");
        }
        else
        {
            System.out.println("Bukan Segitiga");
        }
    }
}
