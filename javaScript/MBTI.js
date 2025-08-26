const prompt = require('prompt-sync')();
let name = prompt("Enter your full name: ")
console.log("Welcome " + name)

let questions = ["1. (A) expend enerrgy, enjoy groups (B).conserve energy, enjoy one-on-one",

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

"20 (A) control,govern  (B)latitude,freedom"]






let answers = []

for(let count = 0; count < questions.length; count++){
while(true){
	let option = prompt(questions[count] + "(A/B): ").toUpperCase();

if(option === "A" || option === "B"){
answers.push(option)
	break;
}
console.log("Enter only A or B")

}
	
}
		
let E = 0, I = 0;
let S = 0, N = 0;
let T = 0, F = 0;
let J = 0, P = 0;

answers[0] === "A" ? E++ : I++
answers[4] === "A" ? E++ : I++
answers[8] === "A" ? E++ : I++
answers[12] === "A" ? E++ : I++
answers[16] === "A" ? E++ : I++

answers[1] === "A" ? S++ : N++
answers[5] === "A" ? S++ : N++
answers[9] === "A" ? S++ : N++
answers[13] === "A" ? S++ : N++
answers[17] === "A" ? S++ : N++

answers[2] === "A" ? T++ : F++
answers[6] === "A" ? T++ : F++
answers[10] === "A" ? T++ : F++
answers[14] === "A" ? T++ : F++
answers[18] === "A" ? T++ : F++

answers[3] === "A" ? J++ : P++
answers[7] === "A" ? J++ : P++
answers[11] === "A" ? J++ : P++
answers[15] === "A" ? J++ : P++
answers[19] === "A" ? J++ : P++

let resultMbti = ""

resultMbti += (E >= I) ? "E" : "I"
resultMbti += (S >= N) ? "S" : "N"
resultMbti += (T >= F) ? "T" : "F"
resultMbti += (J >= P) ? "J" : "P"


const mbtiDescriptions = {
    "INTJ": "Innovative, independent, strategic, logical, reserved, insightful. Driven by their own original ideas to achieve improvements.",
    "INTP": "Intellectual, logical, precise, reserved, flexible, imaginative. Original thinkers who enjoy speculation and creative problem solving.",
    "ENTJ": "Strategic, logical, efficient, outgoing, ambitious, independent. Effective organizers of people and long-range planners.",
    "ENTP": "Inventive, enthusiastic, strategic, enterprising, inquisitive, versatile. Enjoy new ideas and challenges, value inspiration.",

    "INFJ": "Idealistic, organized, insightful, dependable, compassionate, gentle. Seek harmony and cooperation; enjoy intellectual stimulation.",
    "INFP": "Sensitive, creative, idealistic, perceptive, caring, loyal. Value inner harmony and personal growth, focus on dreams and possibilities.",
    "ENFJ": "Caring, enthusiastic, idealistic, organized, diplomatic, responsible. Skilled communicators who value connection with people.",
    "ENFP": "Enthusiastic, creative, spontaneous, optimistic, supportive, playful. Value inspiration, enjoy starting new projects, see potential in others.",

    "ISTJ": "Responsible, sincere, analytical, reserved, realistic, systematic. Hardworking and trustworthy with sound practical judgment.",
    "ISFJ": "Warm, considerate, gentle, responsible, pragmatic, thorough. Devoted caretakers who enjoy being helpful to others.",
    "ESTJ": "Efficient, outgoing, analytical, systematic, dependable, realistic. Like to run the show and get things done in an orderly fashion.",
    "ESFJ": "Friendly, outgoing, reliable, conscientious, organized, practical. Seek to be helpful and please others, enjoy being active and productive.",

    "ISTP": "Action-oriented, logical, analytical, spontaneous, reserved, independent. Enjoy adventure, skilled at understanding things.",
    "ISFP": "Gentle, sensitive, nurturing, helpful, flexible, realistic. Seek to create a personal environment that is both beautiful and practical.",
    "ESTP": "Outgoing, realistic, action-oriented, curious, versatile, spontaneous. Pragmatic problem solvers and skillful negotiators.",
    "ESFP": "Playful, enthusiastic, friendly, spontaneous, tactful, flexible. Have a strong common sense, enjoy helping people in tangible ways."
};





console.log("Hello " + name)
console.log("Your MBTI result is " + resultMbti)
console.log(mbtiDescriptions[resultMbti])









