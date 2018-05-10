
public class Member {

	private String id;
	private String password;
	private String name;
	private int userLevel;
	private String phoneNumber;
	
	Member(String id, String password, String name, int userLevel, String phoneNumber){
		this.id = id;
		this.password = password;
		this.name = name;
		this.userLevel = userLevel;
		this.phoneNumber = phoneNumber;
	}

	
	void login(String id, String password) {
		
	}

	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}
	
	public int getUserLevel() {
		return userLevel;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	
}
