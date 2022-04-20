public class Question {
    private String id;
    private String questionStatement;
    private String answer;

    public Question() {
    }

    public Question(String id, String questionStatement, String answer) {
        this.id = id;
        this.questionStatement = questionStatement;
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", questionStatement='" + getQuestionStatement() + "'" +
            ", answer='" + getAnswer() + "'" +
            "}";
    }
    

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
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