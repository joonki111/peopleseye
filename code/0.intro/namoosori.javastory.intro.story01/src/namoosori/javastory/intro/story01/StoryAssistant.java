package namoosori.javastory.intro.story01;

public class StoryAssistant {
	//
	public void tellMeSayHelloStory() {
		// 
		String yourName = "Hanseol"; 
		Student student = inviteStudent(yourName); 
		Adviser adviser = inviteAdviser(); 
		adviser.asignStudent(student);
		
		adviser.sayHello(); 
	}
	
	private Student inviteStudent(String yourName) {
		// 
		Student student = new Student(yourName); 
		return student; 
	}
	
	private Adviser inviteAdviser() {
		// 
		Adviser adviser = new Adviser(); 
		return adviser; 
	}

	public static void main(String[] args) {
		// 
		StoryAssistant storyAssistant = new StoryAssistant(); 
		storyAssistant.tellMeSayHelloStory(); 
	}
}