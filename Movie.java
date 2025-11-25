package exam2024;

public class Movie extends Content{
	private int duration;
	public Movie(String title,String genre,boolean isFree,int duration) {
		super(title,genre,isFree);
		this.duration=duration;
	}
	public void afficheDetails() {
		String mot;
		if(isFree==true) {
			mot="Oui";
		}
		else {mot="Non";}
		System.out.println("contenu : Movie ,durée "+duration+" titre "+title+" genre "+genre+" free: "+mot);
		
	}
	public int getDuration() {
		return duration;
		
	}
	
	

}
