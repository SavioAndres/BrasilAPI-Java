package br.com.brasilapi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Map;

import javax.net.ssl.HttpsURLConnection;

import com.google.gson.Gson;

import br.com.brasilapi.api.Cep;
import br.com.brasilapi.api.Cnpj;
import br.com.brasilapi.api.Ddd;
import br.com.brasilapi.api.FipeMarcas;
import br.com.brasilapi.api.FipePreco;
import br.com.brasilapi.api.IbgeMunicipios;
import br.com.brasilapi.api.IbgeUf;

public class BrasilAPI {
	private Gson gson;
	
	public BrasilAPI() {
		this.gson = new Gson();
	}
	
	public Cep cep(String cep) {
		String json = Connection.conectar("cep/v2/", cep);
		return gson.fromJson(json, Cep.class);
	}
	
	public Cnpj cnpj(String cnpj) {
		String json = Connection.conectar("cnpj/v1/", cnpj);
		return gson.fromJson(json, Cnpj.class);
	}
	
	public Ddd ddd(String ddd) {
		String json = Connection.conectar("ddd/v1/", ddd);
		return gson.fromJson(json, Ddd.class);
	}
	
	public Map<?, ?> feriados(String feriados) {
		return api("feriados/v1/", feriados);
	}
	
	public FipeMarcas[] fipeMarcas(String fipeMarcas) {
		String json = Connection.conectar("fipe/marcas/v1/", fipeMarcas);
		return gson.fromJson(json, FipeMarcas[].class);
	}
	
	public FipePreco[] fipePreco(String fipePreco) {
		String json = Connection.conectar("fipe/preco/v1/", fipePreco);
		return gson.fromJson(json, FipePreco[].class);
	}
	
	public Map<?, ?> fipeTabelas(String fipeTabelas) {
		return api("fipe/tabelas/v1", fipeTabelas);
	}
	
	public IbgeMunicipios[] ibgeMunicipios(String ibgeMunicipios) {
		String json = Connection.conectar("ibge/municipios/v1/", ibgeMunicipios);
		return gson.fromJson(json, IbgeMunicipios[].class);
	}
	
	public IbgeUf ibgeUf(String ibgeUf) {
		String json = Connection.conectar("ibge/uf/v1/", ibgeUf);
		return gson.fromJson(json, IbgeUf.class);
	}
	
	
	private Map<?, ?> api(String urlParameter, String cod) {
		cod = cod.replaceAll("/","");
		String json = Connection.conectar(urlParameter, cod);
		return gson.fromJson(json, Map.class);
	}
	
	protected static class Connection {
		
		protected static String conectar(String urlParameter, String code) {
			String json = null;

			try {
				code = code.replaceAll("/","");
				
				URL url = new URL("https://brasilapi.com.br/api/" + urlParameter + code);
				
				HttpsURLConnection conector = (HttpsURLConnection) url.openConnection();
				conector.setDoOutput(true);
				conector.setRequestMethod("GET");
				
				if (conector.getResponseCode() != 200) {
					System.out.print("ERROR... HTTP error code : " + conector.getResponseCode());
				}

				BufferedReader br = new BufferedReader(new InputStreamReader((conector.getInputStream())));

				String output, retorno=""; 
				 
				while ((output = br.readLine()) != null) {
					retorno+=output;
				}
				
				json = retorno;

				conector.disconnect();

			} catch (Exception e) {
				e.printStackTrace();
			}
			
			return json;
		}
		
	}
	
}
