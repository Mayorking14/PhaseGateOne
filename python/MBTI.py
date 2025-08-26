
name = input("Enter your full name: ")
print("Welcome " + name)

questions = ["1. (A) expend energy, enjoy groups (B) conserve energy, enjoy one-on-one",
"2. (A) interpret literally (B) look for meaning and possibilities",
"3. (A) logical, thinking, questioning (B) empathic, feeling, accommodating",
"4. (A) organized, orderly (B) flexible, adaptable",
"5. (A) more outgoing, think out loud (B) more reserved, think to yourself",
"6. (A) practical, realistic, experimental (B) imaginative, innovative, theoretical",
"7. (A) candid, straightforward, frank (B) tactful, kind, encouraging",
"8. (A) plan, schedule (B) unplanned, spontaneous",
"9. (A) seek many tasks, public activities, interaction with others (B) seek private, solitary activities with quiet to concentrate",
"10. (A) standard, usual, conventional (B) different, novel, unique",
"11. (A) firm, tend to criticize, hold the line (B) gentle, tend to appreciate, conciliate",
"12. (A) regulated, structured (B) easygoing, live and let live",
"13. (A) external, communicative, express yourself (B) internal, reticent, keep to yourself",
"14. (A) focus on here and now (B) look to the future, global perspective, big picture",
"15. (A) tough minded, just (B) tender hearted, merciful",
"16. (A) preparation, plan ahead (B) go with the flow, adapt as you go",
"17. (A) active, initiate (B) reflective, deliberate",
"18. (A) facts, things, what is (B) ideas, dreams, what could be, philosophical",
"19. (A) matter of fact, issue oriented (B) sensitive, people oriented, compassionate",
"20. (A) control, govern (B) latitude, freedom"
]


answers = []

for question in questions:
	while True:
        	option = input(question + " (A/B): ").upper()
        	if option in ["A", "B"]:
            		answers.append(option)
            		break
print("Enter only A or B")


E = I = S = N = T = F = J = P = 0


for index in [0, 4, 8, 12, 16]:
	if answers[index] == "A":
        	E += 1
	else:
		I += 1

for index in [1, 5, 9, 13, 17]:
	if answers[index] == "A":
		S += 1
	else:
		N += 1

for index in [2, 6, 10, 14, 18]:
    if answers[index] == "A":
        T += 1
    else:
        F += 1


for index in [3, 7, 11, 15, 19]:
    if answers[index] == "A":
        J += 1
    else:
        P += 1


result_mbti = ""
result_mbti += "E" if E >= I else "I"
result_mbti += "S" if S >= N else "N"
result_mbti += "T" if T >= F else "F"
result_mbti += "J" if J >= P else "P"


mbti_descriptions = {
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
}


print("\nHello " + name)
print("Your MBTI result is " + result_mbti)
print(mbti_descriptions[result_mbti])