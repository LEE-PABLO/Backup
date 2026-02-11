import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		HashMap<String, String> map=new HashMap<>();
		UserRepository ur=new UserRepository(map);
		ur.save("user1", "홍길동");
		ur.save("user2", "이순신");
		System.out.printf("찾은 회원: %s\n",ur.findName("user1"));
		System.out.printf("찾은 회원: %s\n",ur.findName("user99"));
	}

}
