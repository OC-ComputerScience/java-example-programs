public class Triangle extends Shape
{

	private int base;
	private int height;

	public Triangle(int base, int height)
	{
	  this.base = base;
	  this.height = height;
	}
	
	public double getArea()
	{
		return .5*getBase()*getHeight();
	}

	
	public String toString()
	{
		return super.toString()+" Triangle: "+getHeight()+" height with base "+getBase();
	}

  public int getBase() {
    return base;
  }

  public void setBase(int base) {
    this.base = base;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  

}