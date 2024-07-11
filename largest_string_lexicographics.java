
public class largest_string_lexicographics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1[]= {"apple","mango","bannana"};
		String largest=s1[0];
		for(int i=1;i<s1.length;i++) {
			if(largest.compareTo(s1[i])<0) {
				largest=s1[i];
			}
		}
		System.out.println(largest);
	}

}
