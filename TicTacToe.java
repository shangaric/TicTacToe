import java.util.Scanner;


public class TicTacToe {
	
	//Board structure:
	public static String ticTacBoard[][]= {{"00","01","02"},{"10","11","12"},{"20","21","22"}};
	
	public static int playerCount = 0;
	
	public static void print() {
		for (int i=0;i<ticTacBoard.length;i++) {
			for(int j=0;j<ticTacBoard[i].length;j++) {
				System.out.print(ticTacBoard[i][j]+" | ");
			}
		System.out.println();
		}
		
	}
	
	//to get the values of x and y of the box(i.e) xy=01
	public static void greetingMsg(Scanner sc) {
		int x = 0;
		int y = 0;
		System.out.println(playerCount%2==0?"Player X":"Player O");
		System.out.print("Enter i value: ");
		x =  sc.nextInt();
		System.out.print("Enter j value: ");
		y =  sc.nextInt();
		System.out.println(insert(x,y,playerCount % 2 == 0 ?"X":"O"));
	}
	
	//check the possibilities
	public static boolean check(){
		//row
		for(int i =0;i<3;i++) {
			if(ticTacBoard[i][0].equals(ticTacBoard[i][1]) 
			&& ticTacBoard[i][2].equals(ticTacBoard[i][1]) 
			&& !ticTacBoard[i][2].equals("")) {
					return true;
				
			}
		}
		
		//diagonal
		if(ticTacBoard[0][2].equals(ticTacBoard[1][1]) 
		&& ticTacBoard[1][1].equals(ticTacBoard[2][0]) 
		&& !ticTacBoard[0][2].equals("")) {
			return true;
		}
		
		if(ticTacBoard[0][0].equals(ticTacBoard[1][1]) 
		&& ticTacBoard[1][1].equals(ticTacBoard[2][2]) 
		&& !ticTacBoard[0][0].equals("")) {
			return true;
		}
		return false;
	}
	
	public static String insert(int x, int y,String playerName) {
		if((x<3 && x>=0) && (y<3 && y>=0)) {
			//User can only place one value in one box
			if(!ticTacBoard[x][y].equals("X")  && !ticTacBoard[x][y].equals("O")) {
				ticTacBoard[x][y] = playerName;
				print();
				playerCount++;
				if(check()) {
					System.out.println(playerName+ " Wins!");
					System.exit(0);
					
				}else if(playerCount == 9){
					System.out.println("Its a Draw.!");
					System.exit(0);
				}
				return "Inserted";		
				
			}else{
				return "Already Occupied";
			}
		}
		return "Unexpected Place";
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			greetingMsg(sc);
		}
	}
}
