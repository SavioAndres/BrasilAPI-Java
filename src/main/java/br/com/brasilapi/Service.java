package br.com.brasilapi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

class Service {
	private static HttpsURLConnection connection;
	
	protected Service() {
	}
	
	protected static HttpsURLConnection getHttpsURLConnection() {
		return connection;
	}

	protected static String connection(String urlParameter) {
		String json = null;

		try {
			URL url = new URL("https://brasilapi.com.br/api/" + urlParameter);

			Log.setConsole("Acessando: " + url);

			connection = (HttpsURLConnection) url.openConnection();
			connection.setDoOutput(true);
			connection.setRequestMethod("GET");

			if (Log.getEnable() && connection.getResponseCode() != HttpsURLConnection.HTTP_OK) {
				Log.setConsoleError("ERROR. HTTP error code: " + connection.getResponseCode() + "\n");
			}
			
			BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));

			String output, retorno = "";

			while ((output = br.readLine()) != null) {
				retorno += output;
			}

			json = retorno;

			Log.setConsole("Json retornado: " + json);
			
		} catch (IOException e) {
			//conector.disconnect();
			//e.printStackTrace();
		}

		return json;
	}

}
