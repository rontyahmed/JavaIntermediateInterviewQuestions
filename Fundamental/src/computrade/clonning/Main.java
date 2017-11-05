package computrade.clonning;

public class Main {
	
	public static void main(String... args){
		
		new Main().run();
	}
	
	
	public void run(){
		
		Address immutableAdress = new Address(16, "Pine st." , "Los Angeles", "California");
		Student immutableStudent = new Student(123,"Clinton",immutableAdress);
		System.out.println("This is my immutable student:\n" + immutableStudent);
		
		Student cloneableStudent = immutableStudent.clone();
		
		Address adress = immutableStudent.getAdress();
		adress.setStreet("Apple st.");
		
		System.out.println("This is my immutable student ?:\n" + immutableStudent);
		
		
		//System.out.println("Are cloned objects are equals? " + immutableStudent.equals(cloneableStudent));
		//System.out.println("Are cloned objects are the same? " + (immutableStudent==cloneableStudent));
		//System.out.println("Are Adress objects are the same? " + (immutableStudent.getAdress()==cloneableStudent.getAdress()));
		
		
	}

}
