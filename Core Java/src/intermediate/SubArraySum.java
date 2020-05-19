package intermediate;
import java.util.HashSet;
import java.util.Set;

public class SubArraySum {
    static Set<String> s=new HashSet<String>();
    public static void main(String[] args) {
           String inputString="123451";
           int requiredSum=6;
           
           findPairs(inputString.toCharArray(),requiredSum);
           System.out.println("in inputString("+inputString+") following subString "+s+" have sum="+requiredSum);
           
    }
    
    /**
     * find substring whose sum matches required sum.
     */
    static void findPairs(char ar[], int requiredSum){
           
           for(int i=0;i<ar.length-1;i++){
                  int sum=0;
                  for(int j=i;j<ar.length;j++){
                        sum=sum+Integer.parseInt(String.valueOf(ar[j]));
                        
                        if(sum>requiredSum){
                               break;
                        }
                        else if (sum==requiredSum){
                               int iRef=i;
                               char subArray[]=new char[j-i+1];
                               for(int k=0;k<j-i+1;k++){
                                      subArray[k]=ar[iRef++];
                               }
                               s.add(new String(subArray));
                               break;
                        }
                        
                  }
           }
    }
 
}
