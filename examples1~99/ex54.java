package examples;

public class ex54 {

	public static void main(String[] args) {
		
		String str = "java programming is good!";
		System.out.println("문자열의 길이:"+str.length());
	
		System.out.println(str.replaceAll("good", "perfect"));

		System.out.println(str.substring(5,16));
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			if (str.charAt(i) == 'i') {
				count++;
			}
			
		}
		System.out.print("i 갯수 :" + count );
	}

}
