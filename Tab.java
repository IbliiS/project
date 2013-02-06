public class Tab{
	int [][] tab;
	//les cellules mortes valent 0 et vivantes valent 1
	
	public Tab{
		tab=new int[20][20];
		for(int i=0;i<this.tab.length;i++){
			for(int j=0;j<this.tab.length;j++){
				tab[i][j]=0;
			}
		}
	}
	
	//a modifier pour centrer le tableau
	public void agrandir(){
		int tab2[][]=new int [this.tab.length+20][this.tab.length+20];
		for(int i=0;i<this.tab.length;i++){
			for(int j=0;j<this.tab.length;j++){
				tab2[i+10][j+10]=tab[i][j];
			}
		}
		tab=tab2;
	}
	
	//savoir si une cellule morte peut naitre
	public bool verifVoisinNaissance(int i,int j){
		int cpt=0;
		if(i==0){
			if(j==0){
				if(tab[i][j+1]==1)
					cpt++;
				if(tab[i+1][j]==1)
					cpt++;
				if(tab[i+1][j+1]==1)
					cpt++;
			}
			else if(j==tab.length-1){
				if(tab[i][j-1]==1)
					cpt++;
				if(tab[i+1][j]==1)
					cpt++;
				if(tab[i+1][j-1]==1)
					cpt++;
			}
			else{
				//i==0 et j qlcq
				if(tab[i][j-1]==1)
					cpt++;
				if(tab[i][j+1]==1)
					cpt++;
				if(tab[i+1][j]==1)
					cpt++;
				if(tab[i+1][j+1]==1)
					cpt++;
				if(tab[i+1][j-1]==1)
					cpt++;
			}
			
		}
		else if(i==tab.length-1){
			if(j==0){
				if(tab[i-1][j]==1)
					cpt++;
				if(tab[i-1][j+1]==1)
					cpt++;
				if(tab[i][j+1]==1)
					cpt++;
			}
			else if(j==tab.length-1){
				if(tab[i-1][j]==1)
					cpt++;
				if(tab[i-1][j-1]==1)
					cpt++;
				if(tab[i][j-1]==1)
					cpt++;
			}
			else{
				//i==tab.length-1 et j qlcq
				if(tab[i-1][j]==1)
					cpt++;
				if(tab[i-1][j-1]==1)
					cpt++;
				if(tab[i-1][j+1]==1)
					cpt++;
				if(tab[i][j-1]==1)
					cpt++;
				if(tab[i][j+1]==1)
					cpt++;
			}
		}
		else{
			if(j==0){
				//i qlcq et j==0
				if(tab[i-1][j]==1)
					cpt++;
				if(tab[i-1][j+1]==1)
					cpt++;
				if(tab[i][j+1]==1)
					cpt++;
				if(tab[i+1][j]==1)
					cpt++;
				if(tab[i+1][j+1]==1)
					cpt++;
				
			}
			else if(j==tab.length-1){
				//i qlcq et j==tab.length-1
				if(tab[i-1][j]==1)
					cpt++;
				if(tab[i-1][j-1]==1)
					cpt++;
				if(tab[i][j-1]==1)
					cpt++;
				if(tab[i+1][j]==1)
					cpt++;
				if(tab[i+1][j-1]==1)
					cpt++;
			}
			else{
				//i qlqc et j qlcq
				if(tab[i-1][j]==1)
					cpt++;
				if(tab[i-1][j-1]==1)
					cpt++;
				if(tab[i-1][j+1]==1)
					cpt++;
				if(tab[i][j-1]==1)
					cpt++;
				if(tab[i][j+1]==1)
					cpt++;
				if(tab[i+1][j]==1)
					cpt++;
				if(tab[i+1][j+1]==1)
					cpt++;
				if(tab[i+1][j-1]==1)
					cpt++;
			}	
		}
		return (cpt==3);
	}
	
	//savoir si une cellule vivante peut continuer a vivre
	public bool verifVoisinVivante(int i,int j){
		int cpt=0;
		if(i==0){
			if(j==0){
				if(tab[i][j+1]==1)
					cpt++;
				if(tab[i+1][j]==1)
					cpt++;
				if(tab[i+1][j+1]==1)
					cpt++;
			}
			else if(j==tab.length-1){
				if(tab[i][j-1]==1)
					cpt++;
				if(tab[i+1][j]==1)
					cpt++;
				if(tab[i+1][j-1]==1)
					cpt++;
			}
			else{
				//i==0 et j qlcq
				if(tab[i][j-1]==1)
					cpt++;
				if(tab[i][j+1]==1)
					cpt++;
				if(tab[i+1][j]==1)
					cpt++;
				if(tab[i+1][j+1]==1)
					cpt++;
				if(tab[i+1][j-1]==1)
					cpt++;
			}
			
		}
		else if(i==tab.length-1){
			if(j==0){
				if(tab[i-1][j]==1)
					cpt++;
				if(tab[i-1][j+1]==1)
					cpt++;
				if(tab[i][j+1]==1)
					cpt++;
			}
			else if(j==tab.length-1){
				if(tab[i-1][j]==1)
					cpt++;
				if(tab[i-1][j-1]==1)
					cpt++;
				if(tab[i][j-1]==1)
					cpt++;
			}
			else{
				//i==tab.length-1 et j qlcq
				if(tab[i-1][j]==1)
					cpt++;
				if(tab[i-1][j-1]==1)
					cpt++;
				if(tab[i-1][j+1]==1)
					cpt++;
				if(tab[i][j-1]==1)
					cpt++;
				if(tab[i][j+1]==1)
					cpt++;
			}
		}
		else{
			if(j==0){
				//i qlcq et j==0
				if(tab[i-1][j]==1)
					cpt++;
				if(tab[i-1][j+1]==1)
					cpt++;
				if(tab[i][j+1]==1)
					cpt++;
				if(tab[i+1][j]==1)
					cpt++;
				if(tab[i+1][j+1]==1)
					cpt++;
				
			}
			else if(j==tab.length-1){
				//i qlcq et j==tab.length-1
				if(tab[i-1][j]==1)
					cpt++;
				if(tab[i-1][j-1]==1)
					cpt++;
				if(tab[i][j-1]==1)
					cpt++;
				if(tab[i+1][j]==1)
					cpt++;
				if(tab[i+1][j-1]==1)
					cpt++;
			}
			else{
				//i qlqc et j qlcq
				if(tab[i-1][j]==1)
					cpt++;
				if(tab[i-1][j-1]==1)
					cpt++;
				if(tab[i-1][j+1]==1)
					cpt++;
				if(tab[i][j-1]==1)
					cpt++;
				if(tab[i][j+1]==1)
					cpt++;
				if(tab[i+1][j]==1)
					cpt++;
				if(tab[i+1][j+1]==1)
					cpt++;
				if(tab[i+1][j-1]==1)
					cpt++;
			}	
		}
		return (cpt>=2);
	}
	
	//savoir si on doit agrandir ? oui si il y a + de 2 C sur un des cotés
	public bool doitOnAgrandir(){
		int i=0;
		int j=0;
		int cpt=0;
		for(j=0;j<tab.length;j++){
			if(tab[i][j]==1)
				cpt++;
			if(tab[j][i]==1)
				cpt++;
		}
		i=tab.length-1;
		for(j=0;j<tab.length;j++){
			if(tab[i][j]==1)
				cpt++;
			if(tab[j][i]==1)
				cpt++;
		}
		return (cpt>2);
	}
	
	public void naitreCel(int i, int j){
		tab[i][j]==1;
	}
	
	public void tuerCel(int i,int j){
		tab[i][j]==0;
	}
	
	public void afficher(){
		for(int i=0;i<tab.length;i++){
			System.out.print("|");
			for(int j=0;j<tab.length;j++){
				if(tab[i][j]==0){
					System.out.print(" ");
				}
				else{
					System.out.print("X");
				}
				System.out.print("|");
			}
			System.out.println("");
		}
	}
	
	public void unTour(){
		if(doitOnAgrandir()){
			agrandir();
		}
		for(int i=0;i<tab.length;i++){
			for(int j=0;j<tab.length;j++){
				if(tab[i][j]==1){
					if(!verifVoisinVivante(i,j)){
						tuerCel(i,j);
					}
				}
				if(tab[i][j]==0){
					if(verifVoisinNaissance(i,j)){
						naitreCel(i,j);
					}
				}
			}
		}
	}
	
}