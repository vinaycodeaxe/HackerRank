
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author ILLUMINATI
 */
public class Sherlock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        String s=in.next();
        Hashtable ht=new Hashtable();
        String[]  part=s.split("");
        for (int i = 0; i < part.length; i++) {
            if (ht.containsKey(part[i])) {
                    int num=(int)ht.get(part[i])+1;
                   ht.put(part[i], num);
            }else{
                ht.put(part[i],1);
            }
        }
        
//        ArrayList<Integer> check=new ArrayList<>();
        Hashtable ht1=new Hashtable();
        
        
        
       Set l=ht.keySet();
       
        for (Object l1 : l) {
            int count=(int)ht.get(l1);
            String str=(String)l1;
            if (ht1.containsKey(count)) {
                int num=(int)ht1.get(count)+1;
                ht1.put(count, num);
            }else{
                ht1.put(count,1 );
            }
        }
        
        
        if (ht1.size()==1) {
            System.out.println("YES");
        }else if (ht1.size()==2) {
             Set l1=ht1.keySet();
             Object[] index=new Object[2];
             int i=0;
             for (Object l11 : l1) {
                index[i]=l11;
                i++;
             }
             int count1=(int)ht1.get(index[0]);
             int count2=(int)ht1.get(index[1]);
             
             int count11=(int)index[0];
             int count21=(int)index[1];
             
             if (count1==1 || count2==1) {
                
             if ((count11==1)  || (count21==1)) {
                 System.out.println("YES");
            }else if (Math.abs(count11-count21)==1) {
                 System.out.println("YES");
            }else{
                 System.out.println("NO");
            }
            }else{
             
                 System.out.println("NO");
             }
             
             
        }else{
            System.out.println("NO");   
        }
        
    }
    
}
