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
		}
		
		mapCache.get(classAPIModel).put(code, obj);
	}
	
	protected static Object getCache(Class<?> classAPIModel, String code) {
		updateCache();
		
		if (!mapCache.containsKey(classAPIModel)) {
			return null;
		}
		
		return mapCache.get(classAPIModel).get(code);
	}
	
	private static void updateCache() {
		if (System.currentTimeMillis() - startTime > cacheTime) {
			mapCache = new HashMap<>();
			startTime = System.currentTimeMillis();
		}
	}
	
}
