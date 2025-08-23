import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class MenstrualApp{

	public static void main(String... arg){

Scanner input = new Scanner(System.in);

System.out.println("Enter last menstruation starting date(Date/Month/Year): ");
String lastMenstruation = input.next();

System.out.println("Enter your cycle Length: ");
int cycleLength = input.nextInt();

System.out.println("Enter your period Length: ");
int periodLength = input.nextInt();

System.out.print(calculateNextPeriod(lastMenstruation, cycleLength));
	}



public static LocalDate calculateNextPeriod(String lastPeriodDate, int cycleLength){
	
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"):
	LocalDate date = LocalDate.parse(lastPeriodDate, formatter);

}


//public static int calculateOvulation(){


//}

//public static int getSafePeriods(){


//}


}