
public class HelloUser {
	public String userName;
	
	public HelloUser(String name){
		userName = name;
	}
	
	public void greetUser(){
		System.out.println("Hello " + userName + "!");
	}
	
}
