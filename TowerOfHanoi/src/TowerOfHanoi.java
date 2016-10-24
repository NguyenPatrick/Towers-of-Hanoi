import java.util.Scanner;

// http://www.javawithus.com/programs/towers-of-hanoi

public class TowerOfHanoi {

	
	public static int restrictInputToInt()
	{
		Scanner scan = new Scanner(System.in);
		boolean isValid = false;
		int input = 0;
		
		// process
		while(isValid == false)
		{
			try {
				input = Integer.parseInt(scan.nextLine());
				isValid = true;		
			} 
			
			catch (NumberFormatException error) 
			{
				
				System.err.println("NOT AN INT YOU " +
		   		 "FAT USELESS SACK OF YANKEE DANKEE DOODLE SHITE!");		    
			}
		}
		return input;
	}
	
   public void solve(int blockNumber, String stackPosStart, String stackPosMid, String stackPosEnd) {
       
	   if (blockNumber == 0)
	   {
		   System.err.println("CAN'T HAVE ZERO BLOCKS YOU "  +
		   		 "FAT USELESS SACK OF YANKEE DANKEE DOODLE SHITE!");
	   }	   
	   else if (blockNumber == 1) 
       {
           System.out.println(stackPosStart + " -> " + stackPosEnd);
       } 
       else 
       {
           solve(blockNumber - 1, stackPosStart, stackPosEnd, stackPosMid);
           System.out.println(stackPosStart + " -> " + stackPosEnd);
           solve(blockNumber - 1, stackPosMid, stackPosStart, stackPosEnd);
       }
   }

   public static void main(String[] args) {
	   
       TowerOfHanoi towersOfHanoi = new TowerOfHanoi();
       System.out.print("Enter Number of Blocks: ");
       int numberOfBlocks = restrictInputToInt();
       towersOfHanoi.solve(numberOfBlocks, "A", "B", "C");
   }
}