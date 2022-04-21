public class Question {
    private int id;
    private String questionStatement;
    private String answer;

    public Question() {
    }

    public Question(int id, String questionStatement) {
        this.id = id;
        this.questionStatement = questionStatement;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", questionStatement='" + getQuestionStatement() + "'" +
            ", answer='" + getAnswer() + "'" +
            "}";
    }
    

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestionStatement() {
        return this.questionStatement;
    }

    public void setQuestionStatement(String questionStatement) {
        this.questionStatement = questionStatement;
    }

    public String getAnswer() {
        return this.answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }


}