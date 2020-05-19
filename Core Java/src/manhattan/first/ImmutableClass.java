package manhattan.first;

import java.lang.reflect.Field;

//Program for immutable class.
 final class Immutable { // class must be final, so cannot create the subclass
	 private final int val; // final instance variable, so the value cannot be changes later
	 
	 public Immutable(int val){ // public constructor	 		
		 this.val = val;
	}
	 
	 public int getValue(){ // public getter method, no need of setter method value cannon be changed
		 return val;
	 }
// Extend the SecurityManager class and override this method to restrict reflection access
//	 @Override
//	 public void checkPackageAccess(String pkg){
//
//	     // don't allow the use of the reflection package
//	     if(pkg.equals("java.lang.reflect")){
//	         throw new SecurityException("Reflection is not allowed!");
//	     }
//	 }
}
// With the use of reflection the value of the final class can be changed
 public class ImmutableClass{
	 public static void main(String[] args){
		 Immutable im = new Immutable(10);
		 System.out.println(im.getValue());
		 try {
			Field  f = im.getClass().getDeclaredField("val");
			f.setAccessible(true);
	        f.set(im, 11);
		} catch (SecurityException | IllegalArgumentException | ReflectiveOperationException e ) {
			e.printStackTrace();
		}
		 System.out.println(im.getValue());
	 }
	 
 }
 
 class MySecurityManager extends SecurityManager{
	 @Override
	 public void checkPackageAccess(String pkg){

	     // don't allow the use of the reflection package
	     if(pkg.equals("java.lang.reflect")){
	         throw new SecurityException("Reflection is not allowed!");
	     }
	 }
 }