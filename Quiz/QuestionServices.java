import java.util.Scanner;

public class QuestionServices {
    Question[] questions=new Question[5];
    int selected[]=new int[5];

    public QuestionServices(){
        questions[0]=new Question(1,"what is size of int","2","4","1","8",2);
        questions[1]=new Question(2,"In which memory a string is stored,when we create a sting using new operator","stack","string memory","heap memory","random storage space",3);
        questions[2]=new Question(3,"which of the following is not the java pimitive type","char","float","double","byte",2);
        questions[3]=new Question(4,"Evaluate the following expression :\n ++z+y-y+z+x++","24","23","20","25",4);
        questions[4]=new Question(5,"which of these classes are the direct subclasses of the Throwable class","RuntimeException and Error class","Exception and VirtualMachineErrorClass","Error and Exception class","IoException and VirtualMachineErrorclass",3);

    }
    public void playQuiz(){
        int i=0;
        for(Question q:questions){
            System.out.println("Question No:"+q.getId());
            System.out.println(q.getQuestion());
            System.out.println("1) "+q.getOpt1());
            System.out.println("2) "+q.getOpt2());
            System.out.println("3) "+q.getOpt3());
            System.out.println("4) "+q.getOpt4());
            Scanner input= new Scanner(System.in); 
            System.out.print("Enter the option of your answer :");
            selected[i]=input.nextInt();
            i++;
        }
    }
        public void printscore(){
            int score=0;
            for(int i=0;i<questions.length;i++){
                Question que=questions[i];
                int actualanswer=que.getAns();
                int userAnswer=selected[i];

                if(actualanswer==userAnswer){
                    score++;
                }
            }
            System.out.println("Your total score is:"+score);
        }


    }

