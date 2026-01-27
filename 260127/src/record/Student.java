package record;

public record Student(String name,int score) {
	public Student{
		if(score<0||score>100) {throw new IllegalArgumentException("점수는 0~100 사이여야 합니다.");}
	}
	public boolean isPass() {return this.score>=60;}
}
