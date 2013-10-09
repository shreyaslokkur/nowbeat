
package com.nowbeat.enums;

public enum Weekend {
	/**
	 * Week End - Monday
	 */
	MON(2),
	/**
	 * Week End - Tuesday
	 */
	TUE(3),
	/**
	 * Week End - Wednesday
	 */
	WED(4),
	/**
	 * Week End - Thursday
	 */
	THU(5),
	/**
	 * Week End - Friday
	 */
	FRI(6),
	/**
	 * Week End - Saturday
	 */
	SAT(7),
	/**
	 * Week End - Sunday
	 */
	SUN(1),
	/**
	 * Week End - Not Applicable
	 */
	NA(0);
	
	private int value;

    private Weekend(int value) {
    	this.value = value;
    }

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
