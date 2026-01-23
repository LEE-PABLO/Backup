
public class BuilderTest {

	public static void main(String[] args) {
		// 필수값(id, name)은 생성 시점에 강제!
        // 나머지는 .email() 처럼 물 흐르듯 연결!
        Member member = new Member.Builder("user1", "김코딩")
                            .email("code@test.com")
                            .age(25) // 전화번호는 안 넣었으니 null 또는 기본값이어야 함
                            .build();

        System.out.println(member.toString());
	}

}
