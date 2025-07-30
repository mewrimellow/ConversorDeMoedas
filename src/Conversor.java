import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor {

    private static final String API = "7f267d36787a0219a28da313";
    public String converter(String moedaOriginal,String moedaFinal, double valor){

        URI link = URI.create("https://v6.exchangerate-api.com/v6/"+ API +"/pair/"
                + moedaOriginal+"/"+moedaFinal+"/"+ valor);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(String.valueOf(link)))
                .build();


        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            Moedas moeda = new Gson().fromJson(json, Moedas.class);

            double taxa = moeda.conversion_rate();

            double resultado = valor * taxa;

            return   String.format("O valor %.2f %s convertido para %s é de $ %.2f", valor, moedaOriginal, moedaFinal, resultado);
        } catch (Exception e){
            System.out.println(e.getMessage());
            throw new RuntimeException("Problema para obter o resultado.");
        }
    }
}
