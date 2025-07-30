import java.util.Map;

public record Moedas(String result, String base_code, String target_code,
                     double conversion_rate, double conversion_result) {
}
