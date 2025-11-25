package exam2024;

public class Serie extends Content{
	private int nbep;
	private int dureep;
	public Serie(String title,String genre,boolean isFree,int nbep,int dureep) {
		super(title,genre,isFree);
		this.nbep=nbep;
		this.dureep=dureep;
	}
	public void afficheDetails() {
		String mot;
		if(isFree==true) {
			mot="Oui";
		}
		else {mot="Non";}
		System.out.println("contenu : Serie , nombre episodes "+nbep+" durée episode "+dureep+" genre "+genre+" free: "+mot);
		
	}
	public int getDuration() {
		return dureep;
		
	}
	

}
