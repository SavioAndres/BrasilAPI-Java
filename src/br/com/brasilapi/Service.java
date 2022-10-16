package br.com.brasilapi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

class Service {
	private static boolean enableLog = false;
	
	protected Service() {
	}
	
	protected static void setEnableLog(boolean enableLog) {
		Service.enableLog = enableLog;
	}
	
	protected static boolean getEnableLog() {
		return Service.enableLog;
	}
	
	protected static String connection(String urlParameter, String code) {
		String json = null;

		try {
			code = code.replaceAll("/","");
			
			URL url = new URL("https://brasilapi.com.br/api/" + urlParameter + code);
			
			if (Service.enableLog) {
				System.out.println("Acessando: " + url);
			}
			
			HttpsURLConnection conector = (HttpsURLConnection) url.openConnection();
			conector.setDoOutput(true);
			conector.setRequestMethod("GET");
			
			if (conector.getResponseCode() != 200) {
				System.err.print("ERROR. HTTP error code: " + conector.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((conector.getInputStream())));

			String output, retorno=""; 
			 
			while ((output = br.readLine()) != null) {
				retorno += output;
			}
			
			json = retorno;
			
			if (Service.enableLog) {
				System.out.println("Json retornado: " + json);
			}

			conector.disconnect();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return json;
	}
		
}
