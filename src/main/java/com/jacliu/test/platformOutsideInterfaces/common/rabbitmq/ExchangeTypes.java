package com.jacliu.test.platformOutsideInterfaces.common.rabbitmq;

/**
 * Constants for the standard Exchange type names.
 *
 * @author Mark Fisher
 * @author Gary Russell
 */
public abstract class ExchangeTypes {

	public static final String DIRECT = "direct";

	public static final String TOPIC = "topic";

	public static final String FANOUT = "fanout";

	public static final String HEADERS = "headers";

	public static final String SYSTEM = "system";

	/**
	 * The constant to represent {@code x-delayed-message} exchange mode.
	 * 
	 * @deprecated since 1.6.4, it's not a user-available exchange type, the delayed
	 *             {@code boolean} is used for that.
	 */
	@Deprecated
	public static final String DELAYED = "x-delayed-message";
}