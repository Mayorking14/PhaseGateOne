import java.util.Scanner;

import java.time.LocalDate

public class MenstrualApp{
Scanner input = new Scanner(System.in);
	public static void main(String... arg){

System.out.println("Enter last menstruation starting date(year/month/day): ");
String lastMenstruation = input.next();

System.out.println("Enter your period cycleLength: ");
int cycleLength = input.nextInt();



	}

public static int calculateNextPeriod(LocalDate date, int cycleLength){

	date.plusDays(cycleLength);
}

public static int calculateOvulation(){


}

public static int getSafePeriods(){


}


}