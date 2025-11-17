package modelos;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiBuscaCotacao {

    public Cotacao buscaCotacao(String moeda) {
        String endereco = "https://v6.exchangerate-api.com/v6/0496f45596094d97e538d1c0/latest/" + moeda;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .GET()
                    .build();
            HttpResponse<String> reponse = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json = reponse.body();
            Gson gson = new Gson();
            Cotacao cotacao = gson.fromJson(json, Cotacao.class);
            System.out.println(cotacao);
        } catch(IOException | InterruptedException e) {
            throw new RuntimeException("Ocorreu o erro:");
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return null;

    }
}