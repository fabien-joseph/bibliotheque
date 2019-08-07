package com.bibliotheque.webapp;

import io.swagger.client.api.UtilisateurApi;
import io.swagger.client.model.Utilisateur;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

@SpringBootApplication
public class WebappApplication {

	public static void main(String[] args) throws IOException {
		/*
		Retrofit retrofit = new Retrofit.Builder().baseUrl("http://localhost:9090/fab24/bibliotheque-livres/1.0.0/")
				.addConverterFactory(GsonConverterFactory.create()).build();
		UtilisateurApi service = retrofit.create(UtilisateurApi.class);

		service.updateUtilisateurWithForm(1L, "test", "test", 16);

		System.out.println(service.getUtilisateurById(0L).execute().code());

		 */

		SpringApplication.run(WebappApplication.class, args);
	}

}
