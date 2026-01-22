import java.util.concurrent.*;

public class ConcurrencyTest {
    public static void main(String[] args) throws InterruptedException {
        int initialStock = 100;
        int userCount = 1000;
        
        // 여러분이 구현할 클래스
        TicketService service = new TicketService(initialStock); 
        
        // 멀티스레드 환경 구성 (1000명이 동시에 달려드는 상황)
        ExecutorService executorService = Executors.newFixedThreadPool(32);
        CountDownLatch latch = new CountDownLatch(userCount); // 모든 스레드가 끝날 때까지 대기용

        for (int i = 0; i < userCount; i++) {
            executorService.submit(() -> {
                try {
                    service.decrease(); // 티켓 구매 시도!
                } finally {
                    latch.countDown();
                }
            });
        }

        latch.await(); // 모든 요청이 끝날 때까지 메인 스레드 대기
        executorService.shutdown();
        
        System.out.println("최종 남은 티켓: " + service.getStock()); 
        // 여기서 정확히 0이 나와야 정답!
    }
}