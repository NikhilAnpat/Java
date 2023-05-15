import java util.scanner;
class Addition
{
//instance variables
int i,j;
//acceptData()
public void acceptData()
{
	scanner s = new scanner(system.in);
	system.out.print("Enter a 1st number");
	i=s.nextint();
	system.out.print("Enter a 2nd number");
	j=s.nextint();
	
}
public void doAddition()
{
	int c=i+j;
	system.out.println("Addition is :" +c);
	system.out.println("Addition is :" +(i+j));
}

public static void main(string[]argc)
{
	Addition a = new Addition();
	a.acceptData();

	a.doAddition();
}