package uk.abstractit.test;

public enum Units implements Speakable {
	ZERO(0, "Zero"),
	ONE(1, "one"),
	TWO(2, "two"),
	THREE(3, "three"),
	FOUR(4, "four"),
	FIVE(5, "five"),
	SIX(6, "six"),
	SEVEN(7, "seven"),
	EIGHT(8, "eight"),
	NINE(9, "nine"),
	TEN(10, "ten"),
	ELEVEN(11, "eleven"),
	TWELVE(12, "twelve"),
	THIRTEEN(13, "thirteen"),
	FOURTEEN(14, "fourteen"),
	FIFTEEN(15, "fifteen"),
	SIXTEEN(16, "sixteen"),
	SEVENTEEN(17, "seventeen"),
	EIGHTEEN(18, "eighteen"),
	NINETEEN(19, "nineteen");
	
	private int intValue;
	private String word;
	
	private Units(int intValue, String word) {
		this.intValue = intValue;
		this.word = word;
	}

	@Override
	public String getWord() {
		return word;
	}
	
	public static Units fromInt(int i) {
		for(Units unit : Units.values()) {
			if(unit.intValue == i) {
				return unit;
			}
		}
		return null;
	}
	public static Units fromInt(int i, boolean unitsOnly) {
		for(Units unit : Units.values()) {
			if(unit.intValue == i) {
				return unit;
			}
		}
		return null;
	}
}
