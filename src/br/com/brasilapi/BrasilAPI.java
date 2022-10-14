package br.com.brasilapi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Map;

import javax.net.ssl.HttpsURLConnection;

import com.google.gson.Gson;

import br.com.brasilapi.api.CEP;
import br.com.brasilapi.api.CEP2;
import br.com.brasilapi.api.CNPJ;
import br.com.brasilapi.api.DDD;
import br.com.brasilapi.api.Feriados;
import br.com.brasilapi.api.FipeMarcas;
import br.com.brasilapi.api.FipePreco;
import br.com.brasilapi.api.IBGEMunicipios;
import br.com.brasilapi.api.IBGEUF;
import br.com.brasilapi.api.NCM;
import br.com.brasilapi.api.RegistroBR;

public class BrasilAPI {
	private boolean enableLog;
	private Gson gson;
	
	public BrasilAPI() {
		this(false);
	}
	
	public BrasilAPI(boolean enableLog) {
		this.enableLog = enableLog;
		this.gson = new Gson();
	}
	
	public CEP cep(String cep) {
		String json = connection("cep/v1/", cep);
		return gson.fromJson(json, CEP.class);
	}
	
	public CEP2 cep2(String cep2) {
		String json = connection("cep/v2/", cep2);
		return gson.fromJson(json, CEP2.class);
	}
	
	public CNPJ cnpj(String cnpj) {
		String json = connection("cnpj/v1/", cnpj);
		return gson.fromJson(json, CNPJ.class);
	}
	
	public DDD ddd(String ddd) {
		String json = connection("ddd/v1/", ddd);
		return gson.fromJson(json, DDD.class);
	}
	
	public Feriados[] feriados(String feriados) {
		String json = connection("feriados/v1/", feriados);
		return gson.fromJson(json, Feriados[].class);
	}
	
	public NCM[] ncm() {
		String json = connection("api/ncm/v1", "");
		return gson.fromJson(json, NCM[].class);
	}
	
	public NCM[] ncm(String ncm) {
		String json = connection("api/ncm/v1/", ncm);
		return gson.fromJson(json, NCM[].class);
	}
	
	public NCM[] ncmSearch(String ncm) {
		String json = connection("api/ncm/v1?search=", ncm);
		return gson.fromJson(json, NCM[].class);
	}
	
	public RegistroBR registroBR(String registroBR) {
		String json = connection("registrobr/v1/", registroBR);
		return gson.fromJson(json, RegistroBR.class);
	}
	
	public FipeMarcas[] fipeMarcas(String fipeMarcas) {
		String json = connection("fipe/marcas/v1/", fipeMarcas);
		return gson.fromJson(json, FipeMarcas[].class);
	}
	
	public FipePreco[] fipePreco(String fipePreco) {
		String json = connection("fipe/preco/v1/", fipePreco);
		return gson.fromJson(json, FipePreco[].class);
	}
	
	public Map<?, ?> fipeTabelas(String fipeTabelas) {
		return api("fipe/tabelas/v1", fipeTabelas);
	}
	
	public IBGEMunicipios[] ibgeMunicipios(String ibgeMunicipios) {
		String json = connection("ibge/municipios/v1/", ibgeMunicipios);
		return gson.fromJson(json, IBGEMunicipios[].class);
	}
	
	public IBGEUF ibgeUf(String ibgeUf) {
		String json = connection("ibge/uf/v1/", ibgeUf);
		return gson.fromJson(json, IBGEUF.class);
	}
	
	
	private Map<?, ?> api(String urlParameter, String cod) {
		cod = cod.replaceAll("/","");
		String json = connection(urlParameter, cod);
		return gson.fromJson(json, Map.class);
	}
	
	private String connection(String urlParameter, String code) {
		return Service.connection(urlParameter, code, this.enableLog);
	}
	
	private static class Service {
		
		private static String connection(String urlParameter, String code, boolean enableLog) {
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
				
				if (enableLog) {
					System.out.println(json);
				}

				conector.disconnect();

			} catch (Exception e) {
				e.printStackTrace();
			}
			
			return json;
		}
		
	}
	
}
