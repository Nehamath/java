class jailRunner{
public static void main(String[] ars)
{
String location="ballari";
String name="Central jail";
int yearofconstruction=1872;

jail Jail=new jail(location,name,yearofconstruction);
System.out.println(Jail.location);
System.out.println(Jail.name);
System.out.println(Jail.yearofconstruction);


}
}