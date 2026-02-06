import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
	public static void main(String[] args) {
        // 내 컴퓨터(localhost)의 8888번 포트로 접속 시도
        try (Socket socket = new Socket("127.0.0.1", 8888)) {
            
            // 빨대 꽂기
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // 메시지 전송
            out.println("안녕하세요!");
            
            // 서버 대답 듣기
            System.out.println("📩 " + in.readLine());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
