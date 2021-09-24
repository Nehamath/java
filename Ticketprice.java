enum Ticketprice{

Gandhi(30,0.0f),Middle(50,0.5f),Balcony(100,1.0f),Box(150,2.0f);
int price;
float tax;
Ticketprice(int price,float tax)
{
this.price=price;
this.tax=tax;
}
}