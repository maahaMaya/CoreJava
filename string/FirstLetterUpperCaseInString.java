
public class FirstLetterUpperCaseInString {

	public static String toUpperCase(String str) {
		StringBuilder sb = new StringBuilder("");
		
		char ch = Character.toUpperCase(str.charAt(0));
		sb.append(ch);
		
		for(int i = 1; i< str.length(); i++) {
			if(str.charAt(i) == ' ' &&  i < (str.length() - 1)) {
				//add space in StringBuilder 
				sb.append(str.charAt(i));
				
				// move to after space index 
				i++;
				
				//convert uppercase & add (now index is at after blank space char) 
				sb.append(Character.toUpperCase(str.charAt(i)));
			}
			else {
				sb.append(str.charAt(i));
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		String str = "hi, i am sourav. ";
		
		System.out.println(toUpperCase(str));
	}

}
