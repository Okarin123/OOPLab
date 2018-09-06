import java.io.BufferedReader; 
import java.io.InputStreamReader; 
import java.io.*;

class Reverseprint{


	char Array[]; 
	int N;
	
	Reverseprint() throws IOException  //Constructor
		{
		Array= new char[10]; 
		BufferedReader buffer= new BufferedReader (new InputStreamReader(System.in));

		System.out.print("Enter a max of 10 characters. Press '.' to stop entering characters.\nEnter the string of characters: ");
		this.Array[0]= (char)buffer.read();
		this.N=1;
				
		while ((this.Array[this.N-1]!='.')&(N<=10))	
			{
			this.Array[this.N]=(char)buffer.read();
			this.N++;
			}	
		}

	void printresult ()  throws IOException //Method 1
		{
		for (int i=this.N-1; i>=0; i--)
			System.out.println(this.Array[i]); 
		}
	}

class ex1 {
		
	public static void main(String args[])  throws IOException {

	Reverseprint object= new Reverseprint();
	object.printresult();
	}
}
	
