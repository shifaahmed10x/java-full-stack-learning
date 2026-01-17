

import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    String selection[] = new String[5];
    public QuestionService(){
        questions[0]=new Question(1,"What is your name","a.Shifa","b.Zubiya","c.Arshad","d.Sara","a.Shifa");
        questions[1]=new Question(2,"What is your language","a.Java","b.Python","c.C","d.C++","a.Java");
        questions[2]=new Question(1,"What is your name","a.Shifa","b.Zubiya","c.Arshad","d.Sara","a.Shifa");
        questions[3]=new Question(2,"What is your language","a.Java","b.Python","c.C","d.C++","a.Java");
        questions[4]=new Question(1,"What is your name","a.Shifa","b.Zubiya","c.Arshad","d.Sara","a.Shifa");
    }


    public void playQuiz(){
        int i=0;
        Scanner sc = new Scanner(System.in);

        for(Question q:questions)
        {

            System.out.println("Question no : "+q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOp1());
            System.out.println(q.getOp2());
            System.out.println(q.getOp3());
            System.out.println(q.getOp4());

            selection[i] = sc.nextLine();
            i++;
        }
        for(String s:selection){
            System.out.println("You selected: " + s);        }
    }
    public  void printScore()
    {
        int score =0;
        for(int i =0;i< questions.length;i++){
            Question que = questions[i];
            String answer = que.getAnswer();
            String  useranswer = selection[i];

            if(answer.equals(useranswer)){
                score++;
            }

        }
        System.out.println("yOUR SCORE IS :"+score);
    }

}
