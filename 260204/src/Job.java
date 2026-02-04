
public class Job extends Thread{
	String workName;
	public Job(String workName) {this.workName=workName;}
	@Override
	public void run() {
			for(int i=1;i<=5;i++) {
				System.out.printf("%s 작업 처리 중....\n", workName);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}	
}
