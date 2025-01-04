import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CurrencyConverter {

    private static final String API_URL = "https://v6.exchangerate-api.com/v6/SUA-API-AQUI/latest/";

    public double getExchangeRate(String fromCurrency, String toCurrency) {
        try {
            URL url = new URL(API_URL + fromCurrency);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            InputStreamReader reader = new InputStreamReader(connection.getInputStream());
            JsonObject jsonObject = JsonParser.parseReader(reader).getAsJsonObject();

            JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");
            return conversionRates.get(toCurrency).getAsDouble();
        } catch (Exception e) {
            System.out.println("Erro ao obter a taxa de câmbio: " + e.getMessage());
            return -1;
        }
    }
}
