
public class touppercase {
	public static String upper(String str) {
		StringBuilder st=new StringBuilder("");
		char ch=Character.toUpperCase(str.charAt(0));
		st.append(ch);
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				st.append(str.charAt(i));
				i++;
				st.append(Character.toUpperCase(str.charAt(i)));
			}else {
				st.append(str.charAt(i));
			}
		}
		return st.toString();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="i am rakesh";
		System.out.println(upper(str));
	}

}
