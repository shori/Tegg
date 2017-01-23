/**
 * 
 */
package com.tutorialspoint;

/**
 * @author hp
 *
 */
public class PrototypePOJO 
{

	private String message;
	private int count;

	/**
	 * @return the message
	 */
	public void getMessage() {
		System.out.println("Your prototype message : " + message);
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}

	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}
	
	
	
	
	
	
}
