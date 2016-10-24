public class Main {
	
	
	 public static void moveBlocks(TowerBlock[] blockArray)
	  {
		  
	  }
	  
	 
  public static void main(String[] args) {

	  int numberOfBlocks = 3;
	  
	  TowerBlock Block1 = new TowerBlock(1, 1, 3);
	  TowerBlock Block2 = new TowerBlock(2, 1, 2);
	  TowerBlock Block3 = new TowerBlock(3, 1, 1);
	  
	  TowerBlock[] arrayOfTowerBlocks= new TowerBlock[numberOfBlocks];

	  
	  
	  moveBlocks(arrayOfTowerBlocks);
  }
	  
	 

  public static void doTowers(int topN, char from, char inter, char to) {
    if (topN == 1){
      System.out.println("Disk 1 from " + from + " to " + to);
    }else {
      doTowers(topN - 1, from, to, inter);
      System.out.println("Disk " + topN + " from " + from + " to " + to);
      doTowers(topN - 1, inter, from, to);
    }
  }
}