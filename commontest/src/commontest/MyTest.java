package commontest;

public class MyTest {

	public static void main(String[] args) {
		
		tryMine();	
	}
	
	public static String test(){
		for(int i=1;i<5000;i++){
			System.out.println(i);
		}
		return "test";
	}
	
	public static String test2(){
		for(int i=1;i<5000;i++){
			System.out.println("hello");
		}
		return "test";
	}
	
	public static String tryMine(){
		try{
			
			System.out.println("return֮ǰ");
			System.out.println(1/0);
			return test();
		}catch(Exception e){
			
			System.out.println(e.getMessage());	
			throw e;
		}finally{
			
			return test2();
		}	
	}
	
	

}
