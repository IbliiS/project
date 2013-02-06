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
	
	public void agrandir(){
		int tab2[][]=new int [this.tab.length+20][this.tab.length+20];
		for(int i=0;i<this.tab.length;i++){
			for(int j=0;j<this.tab.length;j++){
				tab2[i][j]=tab[i][j];
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
	
}