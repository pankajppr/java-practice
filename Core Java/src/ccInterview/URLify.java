package ccInterview;

public class URLify {

	public static void main(String[] args) {
		String input = "Mr John Smith";
		StringBuilder sb = new StringBuilder();
		for(char c : input.toCharArray()){
			if(c == ' ')
				sb.append("%20");
			else
				sb.append(c);
		}
		System.out.println(sb.toString());
	}

}
