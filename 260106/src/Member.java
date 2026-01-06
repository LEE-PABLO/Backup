
public class Member {
	String memberID;
	int SSN;
	public String toString() {
		return memberID+"@"+SSN;
	}
	public boolean equals(Object obj) {
		return this.SSN==((Student)obj).SSN;}
	
}