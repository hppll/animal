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
    // toString обладают все классы в Java, но по умолчанию он возвращает что-то вроде байт-код к примеру "Animal@1540e19d"
    // Чтобы он выводил то, что нам необходимо, мы можем его переопределить и выводить то, что нам интересует
    @Override
    public String toString() {
        return this.Number + " " + this.Animal + " " + this.Weight + " " + this.Lifetime;
    }
}