public class HelloUser {
	public HelloUser(String name) {
		userName = name;
	}

	private String userName;
	
	public void greetUser() {
		System.out.format("Hello " + userName + "!");
	}
		
}