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
    // toString �������� ��� ������ � Java, �� �� ��������� �� ���������� ���-�� ����� ����-��� � ������� "Animal@1540e19d"
    // ����� �� ������� ��, ��� ��� ����������, �� ����� ��� �������������� � �������� ��, ��� ��� ����������
    @Override
    public String toString() {
        return this.Number + " " + this.Animal + " " + this.Weight + " " + this.Lifetime;
    }
}