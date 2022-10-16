package br.com.brasilapi;

import java.util.HashMap;
import java.util.Map;

class Cache {
	private static boolean enableCache = false;
	private static Long startTime = System.currentTimeMillis();
	private static Long cacheTime = 600000L;
	private static Map<Class<?>, Map<String, Object>> mapCache = new HashMap<>();
	
	protected Cache() {
	}
	
	protected static void setEnableCache(boolean enableCache) {
		Cache.enableCache = enableCache;
	}
	
	protected static boolean getEnableCache() {
		return Cache.enableCache;
	}
	
	protected static void setCacheTime(Long time) {
		Cache.enableCache = true;
		Cache.cacheTime = time;
	}
	
	protected static Long getCacheTime() {
		return Cache.cacheTime;
	}
	
	protected static void setCache(Class<?> classAPIModel, String code, Object obj) {
		updateCache();
		
		if (!mapCache.containsKey(classAPIModel)) {
			Map<String, Object> mapObj = new HashMap<>();
			mapCache.put(classAPIModel, mapObj);
			if (Service.getEnableLog()) {
				System.out.println("Salvo em Cache.");
			}
		}
		
		mapCache.get(classAPIModel).put(code, obj);
	}
	
	protected static Object getCache(Class<?> classAPIModel, String code) {
		updateCache();
		
		if (!mapCache.containsKey(classAPIModel)) {
			return null;
		}
		
		Object obj = mapCache.get(classAPIModel).get(code);
		
		if (obj != null) {
			if (Service.getEnableLog()) {
				System.out.println("Obtido do Cache.");
			}
			return obj;
		}
		
		return null;
	}
	
	private static void updateCache() {
		if (System.currentTimeMillis() - startTime > cacheTime) {
			mapCache = new HashMap<>();
			startTime = System.currentTimeMillis();
			
			if (Service.getEnableLog()) {
				System.out.println("Tempo de " + cacheTime + " milissegundos excedido. Cache limpo.");
			}
		}
	}
	
}
