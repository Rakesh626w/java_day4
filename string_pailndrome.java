
public class string_pailndrome {
	public static boolean pailndrome(String str) {
		for(int i=0;i<str.length()/2;i++) {
			int n=str.length();
			if(str.charAt(i)!=str.charAt(n-1-i)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 boolean a=pailndrome("noo");
		 System.out.println(a);
	}

}
