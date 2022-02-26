package headfirst.designpatterns.prototype;

public class Client {
	public static void main(String[] args) {
		Prototype p1 = new ConcretePrototype1();
		Prototype p2 = new ConcretePrototype2();
		
		// ... later ...
		operation(p1);
		operation(p2);
	}
	
	public static Prototype operation(Prototype p) {
		// This code doesn't know or care what the concrete type of p is
		Prototype pCopy = null;
		try {
			pCopy = p.copy();
			// do something useful with pCopy
			System.out.println("Operating with pCopy!");
		} /*catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}*/
		catch (Exception e){
			e.printStackTrace();
		}
		return pCopy;
	}

	private static class Prototype {

		public Prototype copy() {
			return null;
		}
	}

	private static class ConcretePrototype1 extends Prototype {
	}

	private static class ConcretePrototype2 extends Prototype {
	}
}