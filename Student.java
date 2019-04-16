package lab;

public class Student {
	String name;
	String father;
	String mother;
	String roll;
	String reg;
	double cgpa;
	String password;
	
	public Student(String name,String father,String mother,String roll,String reg,double cgpa,String password) {
		
		this.name=name;
		this.father=father;
		this.mother=mother;
		this.roll=roll;
		this.reg=reg;
		this.cgpa=cgpa;
		this.password=password;
				
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getFather() {
		return father;
	}
	
	public void setFather(String f) {
		this.father=f;
	}
	
	public String getMother() {
		return mother;
	}
	
	public void setMother(String m) {
		this.mother=m;
	}
	
	public String getRoll() {
		return roll;
	}
	
	public void setRoll(String r) {
		this.roll=r;
	}
	public String getReg() {
		return reg;
	}
	
	public void setReg(String re) {
		this.reg=re;
	}
	
	public double getCGPA() {
		return cgpa;
	}
	
	public void setCGPA(double cg) {
		this.cgpa=cg;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String pass) {
		this.password=pass;
	}
}
