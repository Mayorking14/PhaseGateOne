import java.util.Scanner;
import java.util.ArrayList;

public class Mbti{
	public static void main(String... arg){

Scanner input = new Scanner(System.in);
System.out.println("Enter your full name: ");
String name = input.nextLine();
System.out.println("Welcome " + name);

String[] questions = {"1. (A) expend enerrgy, enjoy groups (B).conserve energy, enjoy one-on-one",

"2. (A) interorete literally (B) look for meaning and possiblities",

"3. (A) logical, thinking,questioning (B)empathic,feeling,accomodating", 

"4. (A) Organized, orderly (B)flexible,adaptable", 

"5. (A)more outgoing, think out loud (B)more reserved, think to yourself",

"6. (A) practical,realistic,experimental (B)imaginative,innovative,theoretial",

"7. (A) candid,straight forward,frank (B)tactful,kind,encouraging",

"8 (A) plan, shedule (B)unplanned,spontaneous",

"9. (A) seek many tasks,public activities,interaction with others  (B)seek private,solitary activities with quiet to concentrate",

"10. (A) standard,usual,conventional (B)different,novel,unique",

"11. (A) firm, tend to criticize, hold the line (B)gentle, tend to appreciate,conciliate",

"12. (A) regulated, structured (B)easygoing, live and let live",

"13. (A) external,communicative, express yourself  (B)internal, reticent,keep to yourself",

"14 (A) focus on here and now  (B)look to the future,global perspective,big picture",

"15. (A) tough minded, just  (B)tender hearted,merciful",

"16 (A) preparation, plan ahead (B)go with the flow, adapt as you go",

"17. (A) active, initiate  (B)reflective,dliberate",

"18. (A) facts,things,what is  (B)ideas,dreams,what could be,philosophical",

"19 (A) matter of fact,issue oriented  (B)sensitive,people oriented,compassionate",

"20 (A) control,govern  (B)latitude,freedom"};




 
ArrayList<String> answers = new ArrayList<String>();

for(int count = 0; count < questions.length; count++){

while(true){
	System.out.println(questions[count] + "(A/B): ");
String option = input.next().toUpperCase();

if(option.equals("A") || option.equals("B")){
	answers.add(option);
	break;
}
else{
	System.out.println("Invalid input, please enter A or B");
}
}	
}
		
int E = 0, I = 0;
int S = 0, N = 0;
int T = 0, F = 0;
int J = 0, P = 0;

if(answers.get(0).equals("A")) E++; else I++;
if(answers.get(4).equals("A")) E++; else I++;
if(answers.get(8).equals("A")) E++; else I++;
if(answers.get(12).equals("A")) E++; else I++;
if(answers.get(16).equals("A")) E++; else I++;

if(answers.get(1).equals("A")) S++; else N++;
if(answers.get(5).equals("A")) S++; else N++;
if(answers.get(9).equals("A")) S++; else N++;
if(answers.get(13).equals("A")) S++; else N++;
if(answers.get(17).equals("A")) S++; else N++;

if(answers.get(2).equals("A")) T++; else F++;
if(answers.get(6).equals("A")) T++; else F++;
if(answers.get(10).equals("A")) T++; else F++;
if(answers.get(14).equals("A")) T++; else F++;
if(answers.get(18).equals("A")) T++; else F++;

if(answers.get(3).equals("A")) J++; else P++;
if(answers.get(7).equals("A")) J++; else P++;
if(answers.get(11).equals("A")) J++; else P++;
if(answers.get(15).equals("A")) J++; else P++;
if(answers.get(19).equals("A")) J++; else P++;

String resultMbti = "";

resultMbti += (E >= I) ? "E" : "I";
resultMbti += (S >= N) ? "S" : "N";
resultMbti += (T >= F) ? "T" : "F";
resultMbti += (J >= P) ? "J" : "P";



String[] mbtiTypes = {"INTJ", "INTP", "ENTJ", "ENTP", "INFJ", "INFP", "ENFJ", "ENFP", "ISTJ", "ISFJ", "ESTJ", "ESFJ", "ISTP", "ISFP", "ESTP", "ESFP" 
};

String[] mbtiDescriptions = {"Innovative, independent, strategic, logical, reserved, insightful. Driven by their own original ideas to achieve improvements.", "Intellectual, logical, precise, reserved, flexible, imaginative. Original thinkers who enjoy speculation and creative problem solving.", "Strategic, logical, efficient, outgoing, ambitious, independent. Effective organizers of people and long-range planners.", "Inventive, enthusiastic, strategic, enterprising, inquisitive, versatile. Enjoy new ideas and challenges, value inspiration.", "Idealistic, organized, insightful, dependable, compassionate, gentle. Seek harmony and cooperation; enjoy intellectual stimulation.", "Sensitive, creative, idealistic, perceptive, caring, loyal. Value inner harmony and personal growth, focus on dreams and possibilities.", "Caring, enthusiastic, idealistic, organized, diplomatic, responsible. Skilled communicators who value connection with people.", "Enthusiastic, creative, spontaneous, optimistic, supportive, playful. Value inspiration, enjoy starting new projects, see potential in others.", "Responsible, sincere, analytical, reserved, realistic, systematic. Hardworking and trustworthy with sound practical judgment.","Warm, considerate, gentle, responsible, pragmatic, thorough. Devoted caretakers who enjoy being helpful to others.","Efficient, outgoing, analytical, systematic, dependable, realistic. Like to run the show and get things done in an orderly fashion.","Friendly, outgoing, reliable, conscientious, organized, practical. Seek to be helpful and please others, enjoy being active and productive.","Action-oriented, logical, analytical, spontaneous, reserved, independent. Enjoy adventure, skilled at understanding things.","Gentle, sensitive, nurturing, helpful, flexible, realistic. Seek to create a personal environment that is both beautiful and practical.","Outgoing, realistic, action-oriented, curious, versatile, spontaneous. Pragmatic problem solvers and skillful negotiators.","Playful, enthusiastic, friendly, spontaneous, tactful, flexible. Have a strong common sense, enjoy helping people in tangible ways."
};

          for (int Personality = 0; Personality < mbtiTypes.length; Personality++) {

if(resultMbti.equals(mbtiTypes[Personality])){

System.out.println("Hello " + name);
System.out.println(mbtiTypes[Personality] + ": " + mbtiDescriptions[Personality]);
}
	}
}
}