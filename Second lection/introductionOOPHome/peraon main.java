
public class IntroductionOOPHome {

	public static void main(String[] args) {
		Person p1 = new Person("Ivan", 1867);
		Person p2 = new Person("Brain", 1993);
		Person p3 = new Person("Ban", 1956);
		Person p4 = new Person("Java", 1970);
		Person p5 = new Person(null, 0);
		p5.Input();
		
		print(p1, p2, p3, p4);
		p1.PersonAge();
	}
	private static void print(Person p1, Person p2, Person p3,Person p4) {
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);

	}
}
