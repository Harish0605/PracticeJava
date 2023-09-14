package amodMahajan;

public class sortTheSentence {
	public static String sentenceSort(String ip) {
		String op = "";
		String[] words = ip.split(" ");
		for (int i = 0; i < words.length; i++) {
			for (int j = i + 1; j < words.length; j++) {
				if (Integer.parseInt(words[i].substring(words[i].length() - 1)) > Integer
						.parseInt(words[j].substring(words[j].length() - 1))) {
					String temp = words[j];
					words[j] = words[i];
					words[i] = temp;
				}
			}
		}
		for (String k : words) {
			op = op + k.substring(0, k.length() - 1)+" ";
		}		
		return op.trim();		
	}

	public static void main(String[] args) {
		String ip = "is2 sentence4 This1 a3";
		// String op = "This is a sentence";
		System.out.println(sentenceSort(ip));
	}

}
