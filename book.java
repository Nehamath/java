class book
{
public static void main(String[] bok)
{
books ref=new books();
String f1=ref.type;
System.out.println(f1);
double f2=ref.price;
System.out.println(f2); 
String f3=ref.author;
System.out.println(f3); 

ref.type="Shortstories";
 f1=ref.type;
System.out.println(f1);
ref.price=3000;
System.out.println(ref.price);

}
}