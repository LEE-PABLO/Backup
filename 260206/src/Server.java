import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(8888)) { // 1. 가게 오픈 (포트 8888)
            System.out.println("📢 서버: 채팅방 문 열었습니다. 손님 대기 중...");

            // 2. 손님 올 때까지 대기 (여기서 멈춤!)
            Socket socket = server.accept(); 
            System.out.println("🎉 서버: 손님 입장! (" + socket.getInetAddress() + ")");

            // 3. 손님과 대화할 빨대(Stream) 꽂기
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // 4. 손님 말 듣고 그대로 따라하기 (Echo)
            String msg = in.readLine(); // 손님 말 듣기
            System.out.println("🎧 받은 메시지: " + msg);
            
            out.println("서버: " + msg + " (반사!)"); // 다시 보내기

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
