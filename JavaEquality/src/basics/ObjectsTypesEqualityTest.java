package basics;

public class ObjectsTypesEqualityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String ("Java");
		String s2 = "Java";
		
		System.out.println(s1==s2);//reference ou identity test (endere�o)
		System.out.println(s1.equals(s2));//equivalence (valor)
	}

}
