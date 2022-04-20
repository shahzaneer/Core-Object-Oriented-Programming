import java.util.Scanner;

public class Exam {
    private Question[] question = new Question[10];
    private Student student;
    private double score;



    public Exam(Question[] question, Student student) {
        this.question = question;
        this.student = student;
    }



    public void takeExam() {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < this.question.length; i++) {
            if (question[i].getQuestionStatement() != null) {
                System.out.println("Question " + i + " is " + question[i].getQuestionStatement());
                String ans = input.nextLine();
                question[i].setAnswer(ans);

                if (question[i].getAnswer() != null) {
                    score += 10;
                }
            }

        }
    }
    
    public void displayStatus() {
        if (score >= 50) {
            System.out.println("Pass ");
        } else {
            System.out.println("fail ");
        }
    }
    

    public Question[] getQuestion() {
        return this.question;
    }

    public void setQuestion(Question[] question) {
        this.question = question;
    }

    public Student getStudent() {
        return this.student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public double getScore() {
        return this.score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "{" +
            ", student='" + getStudent().toString() + "'" +
            ", score='" + getScore() + "'" +
            "}";
    }


}
