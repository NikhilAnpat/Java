package Association;

public class Player 
{
	private int pid;
	private String pname;
	private String skill;
	
	public Player()
	{
		this.pid=0;
		this.pname=null;
		this.skill=null;
	}
	
	public Player(int id,String pnm,String sk)
	{
		this.pid=id;
		this.pname=pnm;
		this.skill=sk;
		
	}
	
	public void setpid(int pid)
	{
		this.pid=pid;
	}
	
	public void setpname(String pnm)
	{
		this.pname=pnm;
	}
	
	public void setskill(String sk)
	{
		this.skill=sk;
	}
	
	public int getpid()
	{
		return pid;
	}
	
	public String getpname()
	{
		return pname;
	}
	
	public String getskill()
	{
		return skill;
	}
	
	public String toString()
	{
		return "Player id :"+pid+"Player Name : "+pname+"Player Skill : "+skill;
	}
	
}
