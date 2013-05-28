package uk.abstractit.test;

public enum Group implements Speakable {
	HUNDRED(2, "hundred"),
	THOUSAND(3, "thousand"),
	MILLION(6, "million");
	
	private int numZeroes;
	private String word;
	
	private Group(int numZeroes, String word) {
		this.numZeroes = numZeroes;
		this.word = word;
	}
	
	public Group fromInt(int i) {
		for(Group group : Group.values()) {
			if(group.numZeroes == i) {
				return group;
			}
		}
		return null;
	}

	@Override
	public String getWord() {
		return word;
	}

}
