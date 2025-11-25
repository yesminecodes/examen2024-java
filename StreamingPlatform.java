package exam2024;

public class StreamingPlatform {
	Content[]cont;
	User[]utl;
	private int nbut;
	private int nbct;
	private int capc;
	private int capu;
	public StreamingPlatform(int capc,int capu) {
		this.capc=capc;
		this.capu=capu;
		cont=new Content[capc];
		utl=new User[capu];
		
	}
	public void addContent(Content content) {
		if(nbct<capc) {
			cont[nbct]=content;
			nbct++;
		}
		else {
			System.out.println("tableau des contenu est pleine");
		}
		
	}
	public void addUser(User user) {
		if(nbut<capu) {
			utl[nbut]=user;
			nbut++;
		}
		else {
			System.out.println("tableau des utilisateurs est pleine");

		}
	}
	public Content findContent(String title) throws ContentNotFoundException {
	    for (int i = 0; i < nbct; i++) {
	        if (cont[i].title.trim().equalsIgnoreCase(title.trim())) {
	            System.out.println("Contenu trouvé");
	            return cont[i];
	        }
	    }
	    throw new ContentNotFoundException("Ce contenu n'a pas été trouvé");
	}

	public void playContent(User user, Content cnt) throws AccessDeniedException{
		if(user.canPlay(cnt)==true) {
			System.out.println("accées acceptée");
			user.addWatchedContent(cnt);
		}
		else {
			throw new AccessDeniedException("accées refusé");
		}
		
	}
	public Content[] getRecommendations(User user) {
		Content[]recm=new Content[10];
		int k=0;
		for(int i=0 ; i<user.getWatchedGenres().length ; i++) {
			for(int j=0;j<cont.length;j++) {
				if(cont[j].genre.equals(user.getWatchedGenres()[i])){
					
					int c=0;
					boolean existe=false;
					while(c<user.watchedContent.length && existe==false) {
						if(cont[j].equals(user.watchedContent[c])) {
							existe=true;
						
						}
						else {
						c++;
					}
				}
					boolean existercm=false;
					for(int x=0;x<k;x++) {
						if(recm[x].equals(cont[j])) {
							existercm=true;
							break;
						}
					}
					if(existe==false && k<recm.length && existercm==false) {
						recm[k]=cont[j];
						k++;
				}
					
				}
			}
			
			
		}
		return recm;
		
	}
	
	}
