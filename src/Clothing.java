public class Clothing {

    public double price;
    public String type;
    public String size;

    public Clothing()
    {   price =29.9;
        size = "medium";
        type = "t_shirt";

    }
public Clothing(double price,  String type, String size)
{
        this.size= size;
        this.price=price;
        this.type=type;
}
public void increasePrice()
{
   this.price= price + 5;
}
public void increasePrice(double x)
{
  this.price=price +x;
}public void details()
    {
        System.out.println("Item: " + type);
        System.out.println("Size: " + size);
        System.out.println("Price: " + price);
        System.out.println(" ");
    }





}

