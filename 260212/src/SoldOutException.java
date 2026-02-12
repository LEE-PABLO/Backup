public class SoldOutException extends Exception{
 public SoldOutException(String name) {super(name + " 재고가 부족합니다!");}
}
