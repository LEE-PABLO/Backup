package Animal;

public class AnimalTester {

	public static void main(String[] args) {
		Lion lion=new Lion();
		Animal animal=lion;
		if (animal instanceof Lion) {
		lion = (Lion)animal;
		lion.sleep();
		}
		if (animal instanceof Tiger) {
			Tiger tiger=(Tiger)animal;
			tiger.sleep();
		}//cf.그냥 마구 잡이로 변경시 문법적으로는 가능하나 실 구동 환경에서는 exception 발생 가능성 농후
	}

}
