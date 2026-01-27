package record;

public class RecordTest {
	public static void main(String[] args) {
        // 1. 정상 생성
        Student s1 = new Student("김철수", 85);
        System.out.println(s1); // 출력: Student[name=김철수, score=85] (자동 생성됨!)
        System.out.println("합격 여부: " + s1.isPass()); // true

        // 2. 데이터 불변 확인 (Setter가 없어야 함)
        // s1.setScore(90); // 컴파일 에러가 나야 정상!

        // 3. 예외 테스트
        new Student("이상한학생", 101); // 예외 발생!
    }
}
