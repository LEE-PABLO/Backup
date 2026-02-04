
public class Main {
	public static void main(String[] args) {
        Job job1 = new Job("라면");
        Job job2 = new Job("청소");

     
        job1.start();
        job2.start();

        try {
            job1.join(); 
            job2.join(); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("✅ 모든 작업 완료! (퇴근하자)");
    }
}
