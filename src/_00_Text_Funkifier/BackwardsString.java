package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String[] wordRay;
		String output = "";
		int wordcount=1;
		String stringcopy = s;
		int spaceindex = stringcopy.indexOf(" ");
		while(spaceindex!=-1) {
		stringcopy = stringcopy.substring(spaceindex+1);
		spaceindex = stringcopy.indexOf(" ");
		wordcount++;
		}
		stringcopy = s;
		
		wordRay = new String[wordcount];
		spaceindex = stringcopy.indexOf(" ");
		for(int i=0; i<wordcount-1; i++) {
			wordRay[i] = stringcopy.substring(0, stringcopy.indexOf(" "));
			stringcopy = stringcopy.substring(spaceindex+1);
			spaceindex = stringcopy.indexOf(" ");
		}
		wordRay[wordcount-1] = stringcopy;
		
		for(int j=wordRay.length-1; j>=0; j--) {
			for(int k = wordRay[j].length()-1; k>=0; k--) {
				output = output+wordRay[j].charAt(k);
			}
			output = output+" ";
		}
		System.out.println(output);
		return output;
	}

}
