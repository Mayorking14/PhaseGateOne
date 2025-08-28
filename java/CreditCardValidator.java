
import java.util.Scanner;
import java.util.Arrays;

public class CreditCardValidator{

	public static void main(String[] args){

Scanner input = new Scanner(System.in);


System.out.print("Enter card number: ");
String cardNumber = input.next();

if (cardNumber.length() >= 13 && cardNumber.length() <= 16) && isAllDigits(cardNumber){
                break;
} 
	else {
	System.out.println("Invalid input! Card number must be 13 to 16 digits and only numbers.");
	}
}

System.out.println(identifyFirstDigit(cardNumber));

System.out.println(identifyValidCard(cardNumber));

	}



public static String identifyFirstDigit(String card){

char firstNumber = card.charAt(0);


	if(firstNumber == ('4')){
		return "Credit card type: Visa Cards";
}
	else if(firstNumber == ('5')){
		return "Credit card type: Master Cards";
	}
	else if(firstNumber == ('6')){
		return "Credit card type: Discover Cards";
}
	else if(firstNumber == ('3') && card.charAt(1) == ('7')){
		return "Credit card type: American Express Cards";
} 
	else {
		return "unknown card type";
}
	

	}


public static String identifyValidCard(String card){
	
	String[] splitted =  card.split("");

int sumOfEvenPosition = 0;
int sumOfOddPosition = 0;
for (int count = splitted.length - 1; count >= 0; count--){
	
	int number = Character.getNumericValue(card.charAt(count));
	int secondIndex = splitted.length - count;

	if(secondIndex % 2 == 0){
		number *= 2;
if(number >= 10) {
	sumOfEvenPosition += (number / 10) + (number % 10);
	}
else {
	sumOfEvenPosition += number;
}	
}
}

for (int count = splitted.length - 1; count >= 0; count--){
	
	int number = Character.getNumericValue(card.charAt(count));

	if(secondIndex % 2 != 0){
		sumOfOddPosition += number;
	}
}
int totalSum = sumOfEvenPosition + sumOfOddPosition;

if(totalSum % 10 == 0){
	return "valid credit card";
	}
else{
return "invalid credit card";
}

}



=======
import java.util.Scanner;
import java.util.Arrays;

public class CreditCardValidator{

	public static void main(String[] args){

Scanner input = new Scanner(System.in);


System.out.print("Enter card number: ");
String cardNumber = input.next();

if (cardNumber.length() >= 13 && cardNumber.length() <= 16) && isAllDigits(cardNumber){
                break;
} 
	else {
	System.out.println("Invalid input! Card number must be 13 to 16 digits and only numbers.");
	}
}

System.out.println(identifyFirstDigit(cardNumber));

System.out.println(identifyValidCard(cardNumber));

	}



public static String identifyFirstDigit(String card){

char firstNumber = card.charAt(0);


	if(firstNumber == ('4')){
		return "Credit card type: Visa Cards";
}
	else if(firstNumber == ('5')){
		return "Credit card type: Master Cards";
	}
	else if(firstNumber == ('6')){
		return "Credit card type: Discover Cards";
}
	else if(firstNumber == ('3') && card.charAt(1) == ('7')){
		return "Credit card type: American Express Cards";
} 
	else {
		return "unknown card type";
}
	

	}


public static String identifyValidCard(String card){
	
	String[] splitted =  card.split("");

int sumOfEvenPosition = 0;
int sumOfOddPosition = 0;
for (int count = splitted.length - 1; count >= 0; count--){
	
	int number = Character.getNumericValue(card.charAt(count));
	int secondIndex = splitted.length - count;

	if(secondIndex % 2 == 0){
		number *= 2;
if(number >= 10) {
	sumOfEvenPosition += (number / 10) + (number % 10);
	}
else {
	sumOfEvenPosition += number;
}	
}
}

for (int count = splitted.length - 1; count >= 0; count--){
	
	int number = Character.getNumericValue(card.charAt(count));

	if(secondIndex % 2 != 0){
		sumOfOddPosition += number;
	}
}
int totalSum = sumOfEvenPosition + sumOfOddPosition;

if(totalSum % 10 == 0){
	return "valid credit card";
	}
else{
return "invalid credit card";
}

}



}