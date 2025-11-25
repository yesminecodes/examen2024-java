package exam2024;

public class Test {
	public static void main(String []args) {
	StreamingPlatform plateforme=new StreamingPlatform(10,20);
	Movie m1=new Movie("Inception", "Sci-Fi", false, 148);
	Serie s=new Serie("Stranger Things", "Thriller", false, 25, 50);
	Movie m2=new Movie("Charlie Chaplin", "Comedy", true, 75);
	Serie s2=new Serie("Friends", "Comedy", true, 236, 22);
	plateforme.addContent(m1);
	plateforme.addContent(s);
	plateforme.addContent(m2);
	plateforme.addContent(s2);
		for(int j=0;j<4;j++) {
		plateforme.cont[j].afficheDetails();
		}
	User u1=new User("Yesmine",true);
	User u2=new User("Eya",false);
	plateforme.addUser(u2);
	plateforme.addUser(u1);

	try {
		plateforme.playContent(u2, s);
	}
	catch(AccessDeniedException e) {
		System.out.println("Erreur "+e.getMessage());
	}
	try {
		plateforme.playContent(u1, m1);
	}
	catch(AccessDeniedException e) {
		System.out.println("Erreur "+e.getMessage());
	}
	try {
		plateforme.findContent("xxxx");
	}
	catch(ContentNotFoundException e) {
		System.out.println("Erreur "+e.getMessage());
	}
	try {
		plateforme.findContent(s.title);
	}
	catch(ContentNotFoundException e) {
		System.out.println("Erreur "+e.getMessage());
	}
	

	}
}
