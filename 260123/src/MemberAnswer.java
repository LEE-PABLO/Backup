public class MemberAnswer {
	private final String id;
    private final String name;
    private final String email;
    private final String phone;
    private final int age;
		private MemberAnswer(Builder builder) {
		this.id = builder.id;
        this.name = builder.name;
        this.email = builder.email;
        this.phone = builder.phone;
        this.age = builder.age;}
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
				public MemberAnswer build() {
					return new MemberAnswer(this);}
				
						}
			public String toString() {
			    return "Member [id=" + id + ", name=" + name + ", email=" + email + 
			           ", phone=" + phone + ", age=" + age + "]";
			}
	}

