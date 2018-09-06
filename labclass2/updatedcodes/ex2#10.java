import java.util.*; 

class MontyHall {

	Random rand= new Random();	

	int prize_door;
	int first_selected_door; 
	int revealed_door;
	int second_selected_door; 

	MontyHall()
		{
		this.prize_door= rand.nextInt(3); 
		this.first_selected_door= rand.nextInt(3); 		
		}

	boolean choose_once()
		{
		if (this.first_selected_door==this.prize_door)
			return true; 

		else 
			return false;
		}

	boolean choose_twice()
		{
		do 
			{
			this.revealed_door= rand.nextInt(3); 
			} while ((this.revealed_door==prize_door)||(this.revealed_door==this.first_selected_door));

		do	
			{
			this.second_selected_door= rand.nextInt(3); 
  
			} while ((this.second_selected_door== this.revealed_door)||(this.second_selected_door== this.first_selected_door)); 

		if (this.second_selected_door==this.prize_door)
			return true; 

		else 
			return false; 
		
		}	
	}

class ex10 {

	public static void main(String args[]){
	
		int win_once=0, win_twice=0; 
		boolean result_once, result_twice; 
		double probability_once, probability_twice;
 
		for(int i=0; i<10000; i++)
			{
			MontyHall obj= new MontyHall();
	
			result_once= obj.choose_once(); 
			result_twice= obj.choose_twice(); 

			if (result_once==true)
				win_once++; 
	
			if (result_twice==true)
				win_twice++; 
			}

		probability_once= (double) win_once/10000;
		probability_twice= (double) win_twice/10000;
 
		System.out.println("Probability of winning without changing doors: " + probability_once);
		System.out.println("Probability of winning when changing doors: " 	+ probability_twice);
		}
	} 
	

		 


		 		
		

	

	

	
	
	 
