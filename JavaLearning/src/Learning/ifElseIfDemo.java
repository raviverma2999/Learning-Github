package Learning;

public class ifElseIfDemo {

	public static void main(String[] args) {
		
		int Marks=70;
		
		if(Marks<35) {
			
			System.out.println("Grade C");
		}
		else if (Marks>=35 && Marks<=60) {
			
			System.out.println("Grade B");
		}
		
		else if (Marks>60) {
			
			System.out.println("Grade A");
		}

	}

}
