@RestnovoController
public class HealthController {

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of(
            "status", "UP",
            "timestamp", LocalDateTime.now().toString(),
            "service", "Delivery API",
            "javaVersion", System.getProperty("java.version")
        );
    }

    @GetMapping("/info")
    public AppInfo info() {
        return new AppInfo("Delivery Tech API", "1.0.0", "Fabricia", "JDK 21", "Spring Boot 3.2.x");
    }

    public record AppInfo(String application, String version, String developer, String javaVersion, String framework) {}
}