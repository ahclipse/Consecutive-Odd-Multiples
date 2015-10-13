
public class consecutiveOdd {
	public static void main(String[] args){
		int target = 160701;
		boolean found = false;
		
		for(int i = 1; i < target; i++){
			if(i + (i+2) + (i+4) == target){
				System.out.print(i + " + " + (i+2) + " + " + (i+4));
				found = true;
			}
		}
		if(!found){
			System.out.println("Sorry none");
		}
	}
}
