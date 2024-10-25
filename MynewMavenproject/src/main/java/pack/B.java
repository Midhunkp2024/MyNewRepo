package pack;

public class B extends A{
    String college="CET";
public void test() {
System.out.println("Tests");
}

	public static void main(String[] args) {
		
			B b =new B();
			System.out.println(b.a);
			b.run();
}

}
