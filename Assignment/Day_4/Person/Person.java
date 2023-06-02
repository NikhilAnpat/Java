
public class Person {
	private int pid;
	private String pname;
	private String pmob;
	
	public Person() {
		pid=1001;
		pname="gangaram";
		pmob="23751237812";
	}
	
	public Person(int id,String name,String mob) {
		pid=id;
		pname=name;
		pmob=mob;
	}
	
//	public void setID(int id) {
//		this.pid=id;
//	}
//	public int getID() {
//		return pid;
//	}
//	
//	
//	public void setPersonname(String name) {
//		pname=name;
//	}
//	public String getPersonname() {
//		return pname;
//	}
//	
//	public void setPersonmob(String pmob) {
//		this.pmob=pmob;
//	}
//	
//	public String getPersonmob() {
//		return pmob;
//	}
		
	public String toString() {
		return "ID: "+pid+"\nPerson Name:"+pname+"\nMobile :"+pmob;
	}
	
	
	}

