
package benyaknya.bilanganprimakurangdarin;
import java.util.Scanner;
public class BenyaknyaBilanganprimakurangdariN {
    public static void main(String[] args) {
        
        System.out.print("Masukkan angka =  ");
        Scanner l= new Scanner (System.in);
        int angka =l.nextInt();
        int jum=0;
        int k=0;
        System.out.println("Bilangan prima kurang dari sama dengan "+angka);
        for (int i=2; i<=angka; i++){
            int j;   
            for (j=2; j<i; j++){
                if (i%j==0) break;         
            }
            if (j==i){
                System.out.print(i+" ");
            jum=jum+i;
            k++;
            }
        }
        System.out.println("");
        System.out.println("======================================================");
            System.out.println("jumlah bilangan prima kurang dari  "+angka+" = " +jum);
            System.out.println("===================================================");
            System.out.println("banyak bilangan prima kurang dari "+angka+  "  adalah "+k);   
    }
}
