/**
 * 
 */
package de.act.common.interfaces;

import de.act.common.jmstypes.SerializableObject;

/**
 * @author Henry
 *
 */
public interface IActernityGatewayClient {

	void sendToCentral(String stringTopic, SerializableObject objectMessage);
}