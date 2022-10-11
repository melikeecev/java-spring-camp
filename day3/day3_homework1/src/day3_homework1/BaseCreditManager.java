package day3_homework1;

abstract class BaseCreditManager implements ICreditManager{
	
	public abstract void calculate();
	
	public void save() {
		System.out.println("Kaydedildi");
	}
}
