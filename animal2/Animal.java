package animal2;

public class Animal{
	public int Number;
	public String Animal;
	public int Weight;
	public int Lifetime;
	    
	    public Animal (int Number, String Animal, int Weight, int Lifetime){
	        this.Number = Number;
	        this.Animal = Animal;
	        this.Weight = Weight;
	        this.Lifetime = Lifetime;
	    }
    // toString have all classes in Java, but by default it returns something like a bytecode for example "Animal@1540e19d"
    // In order to it can output  what we need, we can redefine it and output what we are interested in
    @Override
    public String toString() {
        return this.Number + " " + this.Animal + " " + this.Weight + " " + this.Lifetime;
    }
}