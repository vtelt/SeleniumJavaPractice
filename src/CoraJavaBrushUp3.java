
public class CoraJavaBrushUp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "test";
		String s2 = new String("welcome");
		
		String st = "Rahul Shetty Academy";
		String[] splittedString = st.split(" ");
		
		//System.out.println(splittedString[0]);
		//System.out.println(splittedString[1]);
		//System.out.println(splittedString[2]);
		
		for(int i = st.length()-1;i>=0; i--)
		{
			System.out.println(st.charAt(i));
		}
		
	}

}
