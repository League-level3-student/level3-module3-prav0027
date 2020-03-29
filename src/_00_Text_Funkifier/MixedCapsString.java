package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString {

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String output = "";
		int addfirst = s.charAt(0)+32;
		output = Character.toString((char) addfirst);
		for (int i = 1; i < s.length(); i++) {
			if (i % 2 == 1) {
				if (s.charAt(i) == ' ') {
					output = output + s.charAt(i);
				} 
				else if (s.charAt(i) < 97) {
					int add = s.charAt(i) + 32;
					output = output + (char) add;
				} 
				else {
					int add = s.charAt(i) - 32;
					output = output + (char) add;
				}
			} 
			else {
				output = output + s.charAt(i);
			}
		}

		return output;
	}

}
