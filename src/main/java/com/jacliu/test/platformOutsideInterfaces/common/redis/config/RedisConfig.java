package com.jacliu.test.platformOutsideInterfaces.common.redis.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;

import redis.clients.jedis.JedisPoolConfig;

@Configuration
public class RedisConfig {

	@Bean(name = "zmTestRedisTemlate")
	public StringRedisTemplate zmTestRedisTemlate(@Value("${spring.redis.zm-test.host}") String hostName,
			@Value("${spring.redis.zm-test.port}") int port, @Value("${spring.redis.zm-test.password}") String password,
			@Value("${spring.redis.zm-test.database}") int index,
			@Value("${spring.redis.jedis.pool.max-idle}") int maxIdle,
			@Value("${spring.redis.jedis.pool.max-active}") int maxTotal,
			@Value("${spring.redis.jedis.pool.testOnBorrow}") boolean testOnBorrow,
			@Value("${spring.redis.jedis.pool.testOnReturn}") boolean testOnReturn,
			@Value("${spring.redis.jedis.pool.max-wait}") long maxWaitMillis) {

		StringRedisTemplate temple = new StringRedisTemplate();
		// 设置序列化
		this.setSerializers(temple);
		temple.setConnectionFactory(this.connectionFactory(hostName, port, password, maxIdle, maxTotal, index,
				testOnBorrow, testOnReturn, maxWaitMillis));

		return temple;
	}

	@Bean(name = "zmDevRedisTemlate")
	public StringRedisTemplate zmDevRedisTemlate(@Value("${spring.redis.zm-dev.host}") String hostName,
			@Value("${spring.redis.zm-dev.port}") int port, @Value("${spring.redis.zm-dev.password}") String password,
			@Value("${spring.redis.zm-dev.database}") int index,
			@Value("${spring.redis.jedis.pool.max-idle}") int maxIdle,
			@Value("${spring.redis.jedis.pool.max-active}") int maxTotal,
			@Value("${spring.redis.jedis.pool.testOnBorrow}") boolean testOnBorrow,
			@Value("${spring.redis.jedis.pool.testOnReturn}") boolean testOnReturn,
			@Value("${spring.redis.jedis.pool.max-wait}") long maxWaitMillis) {

		StringRedisTemplate temple = new StringRedisTemplate();
		// 设置序列化
		this.setSerializers(temple);
		temple.setConnectionFactory(this.connectionFactory(hostName, port, password, maxIdle, maxTotal, index,
				testOnBorrow, testOnReturn, maxWaitMillis));

		return temple;
	}

	private void setSerializers(StringRedisTemplate temple) {
		Jackson2JsonRedisSerializer<Object> jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer<Object>(
				Object.class);
		ObjectMapper om = new ObjectMapper();
		om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
		om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
		jackson2JsonRedisSerializer.setObjectMapper(om);

		// RedisSerializer<?> stringSerializer = new StringRedisSerializer();
		// temple.setKeySerializer(stringSerializer);// key序列化
		// temple.setValueSerializer(jackson2JsonRedisSerializer);// value序列化
		// temple.setHashKeySerializer(stringSerializer);// Hash key序列化
		// temple.setHashValueSerializer(jackson2JsonRedisSerializer);// Hash value序列化
	}

	@SuppressWarnings("deprecation")
	public RedisConnectionFactory connectionFactory(String hostName, int port, String password, int maxIdle,
			int maxTotal, int index, boolean testOnBorrow, boolean testOnReturn, long maxWaitMillis) {
		JedisConnectionFactory jedis = new JedisConnectionFactory();
		jedis.setHostName(hostName);
		jedis.setPort(port);
		jedis.setPassword(password);
		jedis.setDatabase(index);
		jedis.setPoolConfig(this.poolCofig(maxIdle, maxTotal, testOnBorrow, testOnReturn, maxWaitMillis));
		// 初始化连接pool
		jedis.afterPropertiesSet();
		RedisConnectionFactory factory = jedis;
		return factory;
	}

	public JedisPoolConfig poolCofig(int maxIdle, int maxTotal, boolean testOnBorrow, boolean testOnReturn,
			long maxWaitMillis) {
		JedisPoolConfig poolCofig = new JedisPoolConfig();
		poolCofig.setMaxIdle(maxIdle);
		poolCofig.setMaxTotal(maxTotal);
		poolCofig.setMaxWaitMillis(maxWaitMillis);
		poolCofig.setTestOnBorrow(testOnBorrow);
		poolCofig.setTestOnReturn(testOnReturn);
		return poolCofig;
	}
}