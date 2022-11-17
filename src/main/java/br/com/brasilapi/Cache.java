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
			Log.setConsole("Salvo em Cache.");
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
			Log.setConsole("Obtido do Cache.");
			return obj;
		}

		return null;
	}

	/**
	 * Verifica e atualiza o Cache limpando e redefinido o tempo atual.
	 */
	private static void updateCache() {
		// Caso o tempo do Cache definido do Cache tenha excedido
		if (!mapCache.isEmpty() && System.currentTimeMillis() - startTime > cacheTime) {
			
			// Log do Cache a ser limpo
			Log.setConsole("Cache atual a ser limpo: " + mapCache.toString());
			
			// Limpar Cache
			mapCache.clear();
			
			// Atualizar tempo atual
			startTime = System.currentTimeMillis();

			// Log do Cache atual
			Log.setConsole("Tempo de " + cacheTime 
					+ " milissegundos excedido.\nCache limpo. Cache atual: " 
					+ mapCache.toString());
			
		}
	}

}
