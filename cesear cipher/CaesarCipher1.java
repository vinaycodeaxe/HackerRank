/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caesar.cipher.pkg1;

import java.util.Scanner;

/**
 *
 * @author ILLUMINATI
 */
public class CaesarCipher1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        //System.out.println("A: "+((int)'A')+"  Z: "+((int)'Z')+" a: "+((int)'a')+" z: "+((int)'z'));
        
        int n=in.nextInt();
        String[] s=in.next().split("");
       // String[] a={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        //String[] A={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        int len=s.length;
        int k=in.nextInt();
        int k1=k%26;
        for (int i = 0; i <len ; i++) {
            String f=s[i];
            int check=(int)f.charAt(0);
            if ((check>=65) && (check<=90)) {
                if ((check+k1)<=90) {
                    System.out.print(""+(char)(k1+check));
                }else{
                    int temp=k1+check-90;
                    System.out.print(""+(char)(64+temp));
                }
            }else if ((check>=97) && (check<=122)) {
                  if ((check+k1)<=122) {
                    System.out.print(""+(char)(k1+check));
                }else{
                    int temp=k1+check-122;
                    System.out.print(""+(char)(96+temp));
                }
            }else{
                System.out.print(""+f);
            }
{
                
            }
        }
    }
    
}
