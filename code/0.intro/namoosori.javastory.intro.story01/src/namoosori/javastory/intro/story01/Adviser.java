package namoosori.javastory.intro.story01;

public class Adviser {
	//
	private Student student; 
	
	public Adviser() {
		// 
	}
	
	public void sayHello() {
		// 
		if (hasAsignedStudent()) {
			System.out.println(student.getName() + ", Welcome to object-full Java world!"); 
		} else {
			System.out.println("Sorry, I have no student to say hello."); 
		}
	}
	
	private boolean hasAsignedStudent() {
		//
		if(student != null) {
			return true; 
		}
		
		return false; 
	}
	
	public void asignStudent(Student student) {
		this.student = student; 
	}
}