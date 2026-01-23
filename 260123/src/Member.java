import java.util.Set;

public class Member {
	private String id;
	private String name;
	private String email;
	private String phone;
	private int age;
	private Member() {}
		public static class Builder{
			private String id;
			private String name;
			private String email;
			private String phone;
			private int age;
			public Builder(String id, String name){
				this.id=id; this.name=name;}
			public Builder email(String email) {
				this.email=email; return this;}
			public Builder phone(String phone) {
				this.phone=phone; return this;}
			public Builder age(int age) {
				this.age=age; return this;}
			public Member build() {
				Member member=new Member();
				member.id=this.id;
				member.name=this.name;
				member.email=this.email;
				member.phone=this.phone;
				member.age=this.age;
				return member;}
					}
		@Override // "나 지금 부모꺼 덮어쓰기 하는 중이야"라고 표시
		public String toString() {
		    return "Member [id=" + id + ", name=" + name + ", email=" + email + 
		           ", phone=" + phone + ", age=" + age + "]";
		}
}
