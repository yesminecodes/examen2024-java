package exam2024;

public class User {
	private String name;
	private boolean isSub;
	Content[]watchedContent;
	private int nbWatch=0;
	final int max=100;
	public User(String name,boolean isSub) {
		this.name=name;
		this.isSub=isSub;
		watchedContent=new Content[max];
	}
	public boolean canPlay(Content content) {
		if(isSub==true ||isSub==false && content.isFree==true ) {
			return true;
		}
		else {
			return false;
		}
	}
	public void addWatchedContent(Content content) {
		if(nbWatch<max) {
			watchedContent[nbWatch]=content;
			nbWatch++;
		}
		else {
			System.out.println("tableau est pleine");
		}
	}
	public String[] getWatchedGenres() {
		String[]genres=new String[nbWatch];
		int k=0;
		for(int i=0;i<nbWatch;i++) {
			boolean existe=false;
			
			for(int j=0;j<k;j++) {
				if(genres[j].equals(watchedContent[i].genre)){
					existe=true;break;
				}
			}
			if(existe==false) {
			genres[k]=watchedContent[i].genre;
			k++;}}
		 
	
	    return genres;
	}
	
}
