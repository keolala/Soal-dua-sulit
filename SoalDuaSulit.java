import java.util.Scanner;
public class SoalDuaSulit {
public static void main (String [] args) {
    Scanner input = new Scanner (System.in);
    System.out.println("Masukkan jumlah baris matriks: ");
    int baris = input.nextInt();
    System.out.println("Masukkan jumlah kolom matriks: ");
    int kolom = input.nextInt();
    int [][] matriksA = new int [baris] [kolom];
    int [][] matriksB = new int [baris] [kolom];
    int [] [] hasil = new int [baris] [kolom];
    System.out.println("Masukkan elemen matriks A: ");
   for (int i = 0 ; i < baris ; i++) {
        for (int j = 0 ; j < kolom ; j++) {
            System.out.println("A[" +i + "]" + "[" +j + "] =");
            matriksA [i] [j] = input.nextInt();
        }
    }
 for (int i = 0 ; i < baris ; i++) {
        for (int j = 0 ; j < kolom ; j++) {
            System.out.println("B[" +i + "]" + "[" +j + "] =");
            matriksB [i] [j] = input.nextInt();
        }
    }
 for (int i = 0 ; i < baris ; i++) {
        for (int j = 0 ; j < kolom ; j++) {
            hasil [i] [j] = matriksA [i] [j] + matriksB [i] [j];
        }
    }
    System.out.println("Hasil penjumlahan matriks A + B adalah: ");
    for (int i = 0 ; i < baris ; i++) {
        for (int j = 0 ; j < kolom ; j++) {
            System.out.println(hasil [i] [j]);
        }
        System.out.println();
        }  
      }
}
