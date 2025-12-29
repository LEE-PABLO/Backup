
public class ProxySub extends A{
	ActualSub actual;
	void a(){ 
		//코드추가:전처리 
		actual.a();
		//코드추가:후처리 
	}
}

