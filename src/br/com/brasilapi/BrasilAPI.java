package br.com.brasilapi;

import java.util.Map;

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
	private static Gson gson = new Gson();
	
	public static void setEnableLog(boolean enableLog) {
		Service.setEnableLog(enableLog);
	}
	
	public static void setEnableCache(boolean enableCache) {
		Cache.setEnableCache(enableCache);
	}
	
	public static void setCacheTime(Long time) {
		Cache.setCacheTime(time);
	}
	
	public static CEP cep(String cep) {
		String json = connection("cep/v1/", cep);
		return gson.fromJson(json, CEP.class);
	}
	
	public static CEP2 cep2(String cep2) {
		String json = connection("cep/v2/", cep2);
		return gson.fromJson(json, CEP2.class);
	}
	
	public static CNPJ cnpj(String cnpj) {
		String json = connection("cnpj/v1/", cnpj);
		return gson.fromJson(json, CNPJ.class);
	}
	
	public static DDD ddd(String ddd) {
		String json = connection("ddd/v1/", ddd);
		return gson.fromJson(json, DDD.class);
	}
	
	public static Feriados[] feriados(String feriados) {
		String json = connection("feriados/v1/", feriados);
		return gson.fromJson(json, Feriados[].class);
	}
	
	public static NCM[] ncm() {
		String json = connection("api/ncm/v1", "");
		return gson.fromJson(json, NCM[].class);
	}
	
	public static NCM[] ncm(String ncm) {
		String json = connection("api/ncm/v1/", ncm);
		return gson.fromJson(json, NCM[].class);
	}
	
	public static NCM[] ncmSearch(String ncm) {
		String json = connection("api/ncm/v1?search=", ncm);
		return gson.fromJson(json, NCM[].class);
	}
	
	public static RegistroBR registroBR(String registroBR) {
		String json = connection("registrobr/v1/", registroBR);
		return gson.fromJson(json, RegistroBR.class);
	}
	
	public static FipeMarcas[] fipeMarcas(String fipeMarcas) {
		String json = connection("fipe/marcas/v1/", fipeMarcas);
		return gson.fromJson(json, FipeMarcas[].class);
	}
	
	public static FipePreco[] fipePreco(String fipePreco) {
		String json = connection("fipe/preco/v1/", fipePreco);
		return gson.fromJson(json, FipePreco[].class);
	}
	
	public static Map<?, ?> fipeTabelas(String fipeTabelas) {
		return api("fipe/tabelas/v1", fipeTabelas);
	}
	
	public static IBGEMunicipios[] ibgeMunicipios(String ibgeMunicipios) {
		
		if (Cache.enableCache) {
			IBGEMunicipios[] iBGEMunicipios = (IBGEMunicipios[]) Cache.getCache(EModels.IBGE_MUNICIPIOS, ibgeMunicipios);
			
			if (iBGEMunicipios == null) {
				String json = connection("ibge/municipios/v1/", ibgeMunicipios);
				iBGEMunicipios = gson.fromJson(json, IBGEMunicipios[].class);
				Cache.setCache(EModels.IBGE_MUNICIPIOS, ibgeMunicipios, iBGEMunicipios);
			}
			return (IBGEMunicipios[]) iBGEMunicipios.clone();
		} else {
			String json = connection("ibge/municipios/v1/", ibgeMunicipios);
			return gson.fromJson(json, IBGEMunicipios[].class);
		}
		
		
		
	}
	
	public static IBGEUF ibgeUf(String ibgeUf) {
		
		if (Cache.enableCache) {
			IBGEUF iBGEUF = (IBGEUF) Cache.getCache(EModels.IBGE_UF, ibgeUf);
			
			if (iBGEUF == null) {
				String json = connection("ibge/uf/v1/", ibgeUf);
				iBGEUF = gson.fromJson(json, IBGEUF.class);
				Cache.setCache(EModels.IBGE_UF, ibgeUf, iBGEUF);
			}
			try {
				return (IBGEUF) iBGEUF.clone();
			} catch (CloneNotSupportedException e) {
				return null;
			}
		} else {
			String json = connection("ibge/uf/v1/", ibgeUf);
			return gson.fromJson(json, IBGEUF.class);
		}
	}
	
	
	private static Map<?, ?> api(String urlParameter, String cod) {
		cod = cod.replaceAll("/","");
		String json = connection(urlParameter, cod);
		return gson.fromJson(json, Map.class);
	}
	
	private static String connection(String urlParameter, String code) {
		
		
		return Service.connection(urlParameter, code);
	}
	
}
