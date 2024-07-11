
public class substring {
	public static void sub_string(String str) {
		System.out.println(str.substring(0,4));
	}
	public static void sub_string1(String str) {
		int si=0;
		int ei=4;
		for(int i=si;i<ei;i++) {
			System.out.println(str.charAt(i));
		}
	}
	public static void main(String args[]) {
		sub_string("rakesh");
		sub_string1("rakesh");
		String s1="raki";
		String s2=new String("raki");
		if(s1.equals(s2)) {
			System.out.println("true");
		}
	}

}
