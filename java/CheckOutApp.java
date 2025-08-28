import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalTime;


public class ChechOutApp{
	public static void main(String...arg){

Scanner scanner = new Scanner(System.in);

ArrayList<String> products = new ArrayList<>(); 
ArrayList<Integer> quantities = new ArrayList<>();
ArrayList<Integer> prices = new ArrayList<>();
ArrayList<Double> totals = new ArrayList<>();


System.out.println("Please input your name: ");
String customerName = scanner.next();

double subTotal = 0;

boolean decision = true;
while(decision){

System.out.println("Enter item to include to cart: ");
String item = scanner.next();
products.add(item);

System.out.println("How many piece are you buying: ");
int quantity = scanner.nextInt();
quantities.add(quantity);

System.out.println("Please input item price per unit: ");
int price = scanner.nextInt();
prices.add(price);


double total = quantity * price;
totals.add(total);

System.out.print("Do you want to add more item ?: ");
String addItem = scanner.next().toUpperCase();

	if(!addItem.equals("YES")){
		decision = false;
}

}

subTotal = 0;
for(int count = 0; count < totals.size(); count++){
	subTotal += totals.get(count);
}


System.out.println("SEMICOLON STORES");
System.out.println("MAIN BRANCH");
System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
System.out.println("TEL: 03293828343");
LocalDate currentDate = LocalDate.now();
LocalTime currentTime = LocalTime.now();
System.out.println("Date : " + currentDate + " " + currentTime);
System.out.print("Cashiers' name: ");
String cashierName = scanner.next();
System.out.println("Customer Name: " + customerName);

System.out.println("================================================================");

System.out.println("ITEM\t QTY\t PRICE\t TOTAL(NGN)");
System.out.println("------------------------------------------------------------------------");
for(int index = 0; index < products.size(); index++){

	System.out.println(products.get(index) + "\t" + quantities.get(index) + "\t" + prices.get(index) + "\t" + totals.get(index));
	}
System.out.println("--------------------------------------------------------------------");
System.out.println("Sub Total: " + subTotal);
System.out.print("Enter Discount: ");
double discount = scanner.nextDouble();
double vat = 7.50/100 * subTotal;
System.out.println("VAT @ 17.50%: " + vat);
double billTotal = subTotal + vat - discount;
System.out.println("================================================================");
System.out.println("Bill Total: " + billTotal);
System.out.println("================================================================");
System.out.println("THIS IS NOT A RECIEPT KINDLY PAY: " + billTotal);
System.out.println("================================================================");
System.out.print("How much did the customer give to you?: ");
double payment = scanner.nextDouble();

System.out.println("SEMICOLON STORES");
System.out.println("MAIN BRANCH");
System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
System.out.println("TEL: 03293828343");
currentDate = LocalDate.now();
currentTime = LocalTime.now();
System.out.println("Date : " + currentDate + " " + currentTime);
System.out.print("Cashiers' name: " + cashierName);
System.out.print("Customer Name: " + customerName);
System.out.print("================================================================");
System.out.println("ITEM\t QTY\t PRICE\t TOTAL(NGN)");
System.out.print("--------------------------------------------------------------------");
for(int index = 0; index < products.size(); index++){

	System.out.println(products.get(index) + "\t" + quantities.get(index) + "\t" + prices.get(index) + "\t" + totals.get(index));
	}
System.out.println("---------------------------------------------------------------");
System.out.println("Sub Total: " + subTotal);
System.out.println("Discount: " + discount);
System.out.println("VAT @ 17.50%: " + vat);
System.out.println("Bill Total: " + billTotal);
System.out.println("================================================================");
System.out.println("Bill Total: " + billTotal);

System.out.println("Amount paid: " + payment);
System.out.println("Balance: " + (payment - billTotal));
System.out.println("================================================================");
System.out.println("THANK YOU FOR YOUR PATRONAGE");
System.out.print("================================================================");
}
	}