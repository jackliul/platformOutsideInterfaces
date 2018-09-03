package com.jacliu.test.platformOutsideInterfaces.common.redis.service;

import java.util.Collection;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import com.jacliu.test.platformOutsideInterfaces.common.redis.util.JsonUtils;

@Component("zmDevRedisService")
public class ZmDevRedisServiceImpl implements IRedisService {

	@Autowired
	@Qualifier("zmDevRedisTemlate")
	private StringRedisTemplate zmDevRedisTemlate;

	@Override
	public <T> void put(String key, T obj) {
		zmDevRedisTemlate.opsForValue().set(key, JsonUtils.toJson(obj));
	}

	@Override
	public <T> void put(String key, T obj, int timeout) {
		put(key, obj, timeout, TimeUnit.MINUTES);
	}

	@Override
	public <T> void put(String key, T obj, int timeout, TimeUnit unit) {
		zmDevRedisTemlate.opsForValue().set(key, JsonUtils.toJson(obj), timeout, unit);
	}

	@Override
	public <T> T get(String key, Class<T> cls) {
		return JsonUtils.fromJson(zmDevRedisTemlate.opsForValue().get(key), cls);
	}

	@Override
	public <E, T extends Collection<E>> T get(String key, Class<E> cls, Class<T> collectionClass) {
		return JsonUtils.fromJson(zmDevRedisTemlate.opsForValue().get(key), cls, collectionClass);
	}

	@Override
	public <T> T putIfAbsent(String key, Class<T> cls, Supplier<T> supplier) {
		T t = get(key, cls);
		if (t == null) {
			t = supplier.get();
			if (t != null) {
				put(key, t);
			}
		}
		return t;
	}

	@Override
	public <T> T putIfAbsent(String key, Class<T> cls, Supplier<T> supplier, int timeout) {
		T t = get(key, cls);
		if (t == null) {
			t = supplier.get();
			if (t != null) {
				put(key, t, timeout);
			}
		}
		return t;
	}

	@Override
	public <T> T putIfAbsent(String key, Class<T> cls, Supplier<T> supplier, int timeout, TimeUnit unit) {
		T t = get(key, cls);
		if (t == null) {
			t = supplier.get();
			if (t != null) {
				put(key, t, timeout, unit);
			}
		}
		return t;
	}

	@Override
	public <T> T putIfAbsent(String key, Class<T> cls, Supplier<T> supplier, int timeout, TimeUnit unit,
			boolean refresh) {
		T t = get(key, cls);
		if (t == null) {
			t = supplier.get();
			if (t != null) {
				put(key, t, timeout, unit);
			}
		} else {
			if (refresh) {
				expire(key, timeout, unit);
			}
		}
		return t;
	}

	@Override
	public <E, T extends Collection<E>> T putIfAbsent(String key, Class<E> cls, Class<T> collectionCls,
			Supplier<T> supplier) {
		T t = get(key, cls, collectionCls);
		if (t == null || t.isEmpty()) {
			t = supplier.get();
			if (t != null && t.size() > 0) {
				put(key, t);
			}
		}
		return t;
	}

	@Override
	public <E, T extends Collection<E>> T putIfAbsent(String key, Class<E> cls, Class<T> collectionCls,
			Supplier<T> supplier, int timeout) {
		return putIfAbsent(key, cls, collectionCls, supplier, timeout, TimeUnit.SECONDS);
	}

	@Override
	public <E, T extends Collection<E>> T putIfAbsent(String key, Class<E> cls, Class<T> collectionCls,
			Supplier<T> supplier, int timeout, TimeUnit unit) {
		return putIfAbsent(key, cls, collectionCls, supplier, timeout, unit, false);
	}

	@Override
	public <E, T extends Collection<E>> T putIfAbsent(String key, Class<E> cls, Class<T> collectionCls,
			Supplier<T> supplier, int timeout, TimeUnit unit, boolean refresh) {
		T t = get(key, cls, collectionCls);
		if (t == null || t.isEmpty()) {
			t = supplier.get();
			if (t != null && t.size() > 0) {
				put(key, t, timeout, unit);
			}
		} else {
			if (refresh) {
				expire(key, timeout, unit);
			}
		}
		return t;
	}

	@Override
	public void delKeyByPrefix(String prefix) {
		if (prefix == null || "".equals(prefix))
			throw new RuntimeException("Del key by prefix, but prefix is null.");
		Set<String> keys = zmDevRedisTemlate.keys(prefix + "*");
		zmDevRedisTemlate.delete(keys);
	}

	@Override
	public void delKeyBySuffix(String suffix) {
		if (suffix == null || "".equals(suffix))
			throw new RuntimeException("del key by suffix ,but suffix is null.");
		Set<String> keys = zmDevRedisTemlate.keys("*" + suffix);
		zmDevRedisTemlate.delete(keys);
	}

	@Override
	public void hput(String key, String hashKey, Object value) {
		HashOperations<String, String, String> stringObjectObjectHashOperations = zmDevRedisTemlate.opsForHash();
		stringObjectObjectHashOperations.put(key, hashKey, value.toString());
	}

	@Override
	public String hget(String key, String hashKey) {
		HashOperations<String, String, String> stringObjectObjectHashOperations = zmDevRedisTemlate.opsForHash();
		String valObj = stringObjectObjectHashOperations.get(key, hashKey);
		if (valObj != null)
			return valObj;
		return null;
	}

	@Override
	public Long hdel(String key, String hashKey) {
		return zmDevRedisTemlate.opsForHash().delete(key, new Object[] { hashKey });
	}

	@Override
	public boolean exists(String key) {
		return zmDevRedisTemlate.hasKey(key);
	}

	@Override
	public void delete(String key) {
		zmDevRedisTemlate.delete(key);
	}

	@Override
	public boolean expire(String key, long timeout, TimeUnit timeUnit) {
		return zmDevRedisTemlate.expire(key, timeout, timeUnit);
	}

	@Override
	public boolean expire(String key, long timeout) {
		return expire(key, timeout, TimeUnit.MINUTES);
	}

	@Override
	public void put(String key, String value) {
		zmDevRedisTemlate.opsForValue().set(key, value);
	}

	@Override
	public void put(String key, String value, int timeout) {
		put(key, value, timeout, TimeUnit.MINUTES);
	}

	@Override
	public void put(String key, String value, int timeout, TimeUnit unit) {
		zmDevRedisTemlate.opsForValue().set(key, value, timeout, unit);
	}

	@Override
	public String get(String key) {
		return zmDevRedisTemlate.opsForValue().get(key);
	}

}
