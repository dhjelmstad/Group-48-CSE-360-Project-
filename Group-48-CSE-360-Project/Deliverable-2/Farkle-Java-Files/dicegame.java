/*
 * @Author: Ryan & Kartik
 * @Version1: 4/14/16
 * 
 * Class Description: This class creates 6 dice. They are then given a random number and then displayed. 
 * The UI class uses this class.
 */
public class dicegame 
{	
	// This method rolls 6 dice. It creates 6 dice and stores them into an array. they are then put into a different list and 
	// Then displayed.
	public void roll(){
		Boolean t = true;
		
		while (t) {
		    int dice1=(int)(Math.random()*6+1);
		    int dice2=(int)(Math.random()*6+1);
		    int dice3=(int)(Math.random()*6+1);
		    int dice4=(int)(Math.random()*6+1);
		    int dice5=(int)(Math.random()*6+1);
		    int dice6=(int)(Math.random()*6+1);
		    int sum = dice1 + dice2;
		    int [] dieList = new int[6];
		    int [] tempList = new int[6];
		    dieList[0] = dice1;
		    dieList[1] = dice2;
		    dieList[2] = dice3;
		    dieList[3] = dice4;
		    dieList[4] = dice5;
		    dieList[5] = dice6;
		    
		    String diceString = "" + dice1 + dice2 + dice3 + dice4 + dice5 + dice6;
		    System.out.println("You have rolled: ");
		    for(int i = 0; i < dieList.length; i++)
		    {
		    	System.out.print(dieList[i] + " ");
		    }
			System.out.println("");
		    for(int i = 0; i < dieList.length; i++)
		    {
		    	tempList[i] = dieList[i];
		    }
		    t = false;
		}
    }
	
	
}
