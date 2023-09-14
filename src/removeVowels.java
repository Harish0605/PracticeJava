import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class removeVowels {

	public static void main(String[] args) {
		String s = "Test Automation Central";
		Pattern p = Pattern.compile("[^aeiouAEIUO]");
		Matcher m = p.matcher(s);
		while(m.find()) {
			System.out.println(m.group());
		}
		
		
		
		
	}

}
