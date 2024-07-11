
public class string_creation {
	public static void one_char_in_str() {
		String str="ranjith";
		for(int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i)+" ");
		}
		System.out.println();

	}
	public static void concatination(String str,String st) {
		System.out.println(str+st+" concatination");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="rakesh";
		System.out.println(str);
		String st=new String("raki");
		System.out.println(st);
		System.out.println(str.length());
		System.out.println(st.length());
		System.out.println(str.charAt(0));
		System.out.println(st.charAt(3));
		one_char_in_str();
		concatination(str,st);
	}

}
