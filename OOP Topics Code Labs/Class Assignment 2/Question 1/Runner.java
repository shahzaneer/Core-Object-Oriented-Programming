public class Runner {
    public static void main(String[] args) {
        Student s1 = new Student("Shahzaneer Ahmed", 19, "0579", "pakistan123");
        int id = 1;
        Question q1 = new Question(id, "Religious views  ? ");
        Question q2 = new Question(++id, "Political views  ? ");
        Question q3 = new Question(++id, " Best Friend ?");
        Question q4 = new Question(++id, "Biggest inspiration ?");
        Question q5 = new Question(++id, "Favourite Personality from Past ?");
        Question q6 = new Question(++id, "Favourite personality Current  ?");
        Question q7 = new Question(++id, "Your Mentor ? ");
        Question q8 = new Question(++id, "your life goals ?");
        Question q9 = new Question(++id, "One thing you feels nostalgic about ? ");
        Question q10 = new Question(++id, "biggest Strength ? ");

        


        Exam e1 = new Exam(new Question[] { q1, q2, q3, q4, q5, q6, q7, q8, q9, q10 }, s1);
        e1.takeExam();
        e1.displayStatus();
        // System.out.println(e1.getStudent()); 
        // System.out.println(e1.getQuestion());

    }
}
