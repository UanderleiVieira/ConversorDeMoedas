package modelos;

import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiBuscaCotacao {

    public Cotacao buscaCotacao() {
        String endereco = "https://v6.exchangerate-api.com/v6/0496f45596094d97e538d1c0/latest/USD";

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();

            Gson gson = new Gson();
            return gson.fromJson(json, Cotacao.class);

        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar cotação: " + e.getMessage());
        }
    }
}
