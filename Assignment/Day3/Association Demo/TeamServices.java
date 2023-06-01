package Association;

import java.util.Scanner;

public class TeamServices 
{
	public static Team[] tlist;
	public static int cnt;
	
	static
	{
		tlist=new Team[15];
		cnt=0;
	}
	
	public static void addnewTeam()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the team ID");
		int tid=sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter the Team name :");
		String tnm=sc.nextLine();
		
		System.out.println("Enter the captain id:");
		int cpid=sc.nextInt();
		
		System.out.println("Enter the captain name");
		String pname=sc.next();
		
		System.out.println("Enter the captain Skill");
		String skill=sc.next();
		
		Player cp=new Player(cpid,pname,skill);
		
		Player [] arr=new Player[3];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter player id");
			cpid=sc.nextInt();
			
			System.out.println("enter player name");
			 pname=sc.next();
			 
			System.out.println("enter player skill");
			 skill=sc.next();
			 
			 arr[i]=new Player(cpid,pname,skill);
			  
		}
		//add new team object in the array
		tlist[cnt]=new Team(tid,tnm,cp,arr);
		cnt++;
	}
	
	public static void displayall()
	{
		for(int i=0;i<cnt;i++)
		{
			System.out.println(tlist[i]);
		}
	}
	
	public static Team searchByCaption(String cname)
	{
		for(int i=0;i<cnt;i++)
		{
			String name =tlist[i].getCapt().getpname();
			if(name.equals(cname));
			{
				return tlist[i];
			}
		}
		return null;
	}
	
	public static void searchBySkill(String skill)
	{
		for(int i=0;i<cnt;i++)
		{
			for(int j=0;j<tlist[i].getPlist().length;j++)
			{
				if(tlist[i].getPlist()[j].getskill().equals(skill))
				{
					System.out.println(tlist[i].getPlist()[j].getpname());
				}
			}
		}
	}
}
