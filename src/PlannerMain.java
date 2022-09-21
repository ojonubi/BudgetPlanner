import java.util.Scanner;
import java.util.ArrayList;

public class PlannerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Helloworld");
		int type;
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Integer> income = new ArrayList<>();
		int totalIncome = 0;
		
		
		
		ArrayList<Integer>expense = new ArrayList<>();
		int totalExpense = 0;
		
		
		do{
			System.out.println("type 1 - income \n"
					+ "type 2 - expenses \n"
					+ "type 3 - transaction log");
			System.out.print("Enter a type: ");
			
			type = scan.nextInt();
			
			
			//request values for user income and calculate the total
			if(type == 1) {
				System.out.println("Enter income value: ");
				income.add(scan.nextInt());
				
				for(int i:income) {
					totalIncome += i;
				}
				
			}
			else if(type ==2) {
				//request values for expenses
				System.out.println("Enter Expense value: ");
				expense.add(scan.nextInt());
				
				for(int i:expense) {
					totalExpense += i;
				}
				
			}
			else {
				//provide transaction log
				
				
			}
			
			
			
			System.out.println(income);
			System.out.println(totalIncome);
			
			System.out.println(expense);
			System.out.println(totalExpense);
			
		}while(type<3);
	}

}
