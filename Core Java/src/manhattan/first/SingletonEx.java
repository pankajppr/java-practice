package manhattan.first;

class EagerSingleton{
	private static final EagerSingleton instance = new EagerSingleton();
	private EagerSingleton(){}
	
	public static EagerSingleton getInstance(){
		return instance;
	}	
}

class LazySingleton{
	private static LazySingleton instance;
	private LazySingleton(){}
	
	public static LazySingleton getInstance(){
		if(instance == null){
			instance = new LazySingleton();
		}
		return instance;
	}
}
public class SingletonEx {
	public static void main(String[] args) {	

	}

}
