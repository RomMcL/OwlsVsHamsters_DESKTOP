package den.rom;

public class CheckLuck {
	
	int nPvP = 4;	 	
	int []masPvP = new int[nPvP];
	int cubH1;
	int cubH2;
	int cubS1;
	int cubS2;
	int rezHam;
	int rezSov;
	static String lotWinner;
	static boolean proverDrawCub;
	
	public void brosokPvP() {
		 for(int i = 0; i < masPvP.length; i++) {                         
				masPvP[i] = 1 + (int) Math.round(Math.random()*5);              		
		}
		 
		 
		 cubS1 = masPvP[0];
		 cubS2 = masPvP[1];
		 cubH1 = masPvP[2];
		 cubH2 = masPvP[3];
		 
		 rezSov = cubS1 + cubS2;
		 rezHam = cubH1 + cubH2;
		 
		 		 
		 if(rezHam > rezSov) {
			 lotWinner = "Хомяк";
		 } else if(rezSov > rezHam) {
			 lotWinner = "Сова";
		 } else lotWinner = "Ничья!";
		 
		 if(rezHam == rezSov) {
			 proverDrawCub = true;		
		 } else proverDrawCub = false;
		 
//	System.out.println("1 кубик Совы == " + masPvP[0]);
//    System.out.println("2 кубик Совы == " + masPvP[1]);
//    System.out.println("1 кубик Хомяка == " + masPvP[2]);
//    System.out.println("2 кубик Хомяка == " + masPvP[3]); 
		 
	 }
	
	
}
