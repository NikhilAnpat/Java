package Association;

import java.util.Scanner;

public class TestTeam 
{

	public static void main(String[] args) 
	{

				Scanner sc=new Scanner(System.in);
				int choice;
				do {
				System.out.println("1. add new team\n2. display all\n 3. search by captain\n 4. search by skill\n5. exit :");
				System.out.println("Choice: ");
				choice=sc.nextInt();
				switch(choice) {
				case 1:
					TeamServices.addnewTeam();
					break;
				case 2:
					TeamServices.displayall();
					break;
				case 3:
					System.out.println("Enter captain name to search");
					String cname=sc.next();
					Team t=TeamServices.searchByCaption(cname);
					//if team found then display it
					if(t!=null) {
					System.out.println(t);
					}
					else {
						System.out.println("note found");
					}
					break;
				case 4:
					System.out.println("enetr skill to search");
					String skill=sc.next();
					TeamServices.searchBySkill(skill);
					break;
				case 5:
					sc.close();
					System.out.println("Thank you for visiting......");
					break;
				default:
					System.out.println("wrong choice.....");
				}
				
			}while(choice!=5);
		}
}
