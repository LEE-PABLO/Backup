
public class SingletonTest {

	public static void main(String[] args) {
		// 1. 첫 번째 호출 - 이때 생성되어야 함
        AppSettings settings1 = AppSettings.getInstance();
        
        // 2. 두 번째 호출 - 이미 만들어진 걸 줘야 함
        AppSettings settings2 = AppSettings.getInstance();

        // 3. 검증: 두 변수가 가리키는 주소값이 같아야 함
        System.out.println(settings1 == settings2); // true

	}

}
