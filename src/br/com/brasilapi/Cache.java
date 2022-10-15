package br.com.brasilapi;

import java.util.HashMap;
import java.util.Map;

class Cache {
	protected static boolean enableCache = false;
	protected static Long cacheTime = 10000L;
	private static Map<EModels, Map<String, Object>> mapCache = new HashMap<>();
	
	protected Cache() {
		
	}
	
	protected static void setEnableCache(boolean enableCache) {
		Cache.enableCache = enableCache;
	}
	
	protected static void setCacheTime(Long time) {
		Cache.enableCache = true;
		Cache.cacheTime = time;
	}
	
	protected static void setCache(EModels model, String code, Object obj) {
		if (!mapCache.containsKey(model)) {
			Map<String, Object> mapObj = new HashMap<>();
			mapCache.put(model, mapObj);
		}
		
		mapCache.get(model).put(code, obj);
	}
	
	protected static Object getCache(EModels model, String code) {
		if (!mapCache.containsKey(model)) {
			return null;
		}
		
		return mapCache.get(model).get(code);
	}
	
}
