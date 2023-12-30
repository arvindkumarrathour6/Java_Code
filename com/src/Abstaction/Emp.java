package Abstaction;

public abstract class Emp {
	abstract void work();
	public void Extracarriculum() {
		System.out.println("Employee done our work!!!");
	}

}
class Emp1 extends Emp{
	String Employee;
	Emp1(String Employee){
		this.Employee=Employee;
	}
	@Override
	void work() {
		System.out.println(this.Employee+" is doing work");
	}
}
class Emp2 extends Emp{
	String Employee;
	Emp2(String Employee){
		this.Employee=Employee;
	}
	@Override
	void work() {
		System.out.println(this.Employee+" is doing work");
	}
}
class Manager extends Emp{
	String manager;
	Manager(String manager){
		this.manager=manager;
	}
	@Override
	void work() {
		System.out.println(this.manager+" manager given work to our Employee- ");
	}
}

