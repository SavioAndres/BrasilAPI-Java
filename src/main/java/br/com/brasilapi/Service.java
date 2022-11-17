package br.com.brasilapi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

class Service {
	private static HttpsURLConnection connector;
	
	protected Service() {
	}
	
	protected static HttpsURLConnection getHttpsURLConnection() {
		return connector;
	}

	protected static String connection(String urlParameter) {
		String json = null;

		try {
			URL url = new URL("https://brasilapi.com.br/api/" + urlParameter);

			Log.setConsole("Acessando: " + url);

			connector = (HttpsURLConnection) url.openConnection();
			connector.setDoOutput(true);
			connector.setRequestMethod("GET");

			if (Log.getEnable() && connector.getResponseCode() != HttpsURLConnection.HTTP_OK) {
				Log.setConsoleError("ERROR. HTTP error code: " + connector.getResponseCode() + "\n");
			}
			
			BufferedReader br = new BufferedReader(new InputStreamReader(connector.getInputStream(), "UTF-8"));

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
