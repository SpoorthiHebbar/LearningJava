package collectionframework.hashmaps;

public class HashCodeandEquals {

	public static void main(String[] args) {
		Pen p1 = new Pen("blue",10);
		Pen p2 = new Pen("blue",10);
		//Pen p3 = p2;
		
		System.out.println(p1.equals(p2));
		//System.out.println(p2.equals(p3));

	}

}
class Pen{
	String color;
	int price;
	
	public Pen(String col,int price) {
		this.color= col;
		this.price= price;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pen other = (Pen) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (price != other.price)
			return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + price;
		return result;
	}
}