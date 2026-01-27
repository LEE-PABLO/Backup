
public class AdvancedSettings {
	private AdvancedSettings() {
        System.out.println("무거운 설정 로딩 중...");
    }

    // 1. static 내부 클래스 (Holder)
    // 이 클래스는 getInstance()가 호출되기 전까지는 절대 메모리에 로딩되지 않습니다.
    private static class SettingsHolder {
        // 2. JVM의 클래스 로더 매커니즘 덕분에 이 라인은 '원자적'으로 실행됨이 보장됩니다.
        // 즉, synchronized 없어도 안전하게 딱 한 번만 실행됩니다.
        private static final AdvancedSettings INSTANCE = new AdvancedSettings();
    }

    public static AdvancedSettings getInstance() {
        // 3. 여기서 Holder를 부르는 순간 내부 클래스가 로딩되며 객체가 생성됩니다.
        return SettingsHolder.INSTANCE;
    }
}
