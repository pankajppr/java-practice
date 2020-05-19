
public class FindArrayIndex {
	static int vals [] ={0,0,0,0,0,0,0,1,1,1,1,1,1};
	static int find = 1;
	static int index;
 public static void main(String args[]){ 
	String s = Integer.toString(5);
	String s1 = Boolean.toString(false);
	 for(int i=0; i<vals.length; i++){
		 if(vals[i] == find){
			 System.out.println("startIndex"+i);
			 break;
		 }
	 }
	 findIndex(0,vals.length-1);
	 System.out.println(index);
 }
 
    public static void findIndex(int start, int end){
    	if(end>start){
    		if(start+1 == end){
    			index = end;
    			return;
    		}
    		if(vals[(end+start)/2] == find && vals[((end+start)/2) -1] < find){
    			index = (end+start)/2;
    			return;
    		}
    		if(vals[(end+start)/2] < find ){
    			findIndex((end+start)/2, end);
    		}
    		else{
    			findIndex(start, (end+start)/2-1);
    		}
    	}
    }
}
