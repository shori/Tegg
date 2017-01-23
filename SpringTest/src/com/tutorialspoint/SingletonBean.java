package com.tutorialspoint;

public class SingletonBean
{
  private String keyw;

/**
 * @return the keyw
 */
public void getKeyw() {
	System.out.println("Your keyw : " + keyw);
}

/**
 * @param keyw the keyw to set
 */
public void setKeyw(String keyw) {
	this.keyw = keyw;
}
	
}
