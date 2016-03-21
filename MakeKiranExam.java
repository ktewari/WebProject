



import java.util.Vector;

public class MakeKiranExam {
	 
    public static Exam justDoIt() {
        Vector<Question> questions = new Vector<Question>();
        Exam exam = new Exam("Fish Quiz", questions);
        
        {
            Question question = new Question();
            question.setQuery(("What is Kiran's Favourite Bird?"));
            question.setChoiceA(("Pigeon"));
            question.setChoiceB(("Crow"));
            question.setChoiceC(("Peacock"));
            question.setChoiceD(("Cuckoo"));
            question.setAnswer(("d"));
            questions.addElement(question);
        }
        {
            Question question = new Question();
            question.setQuery(("What is Kiran's hobby"));
            question.setChoiceA(("Learning New Things"));
            question.setChoiceB(("Listening Music"));
            question.setChoiceC(("Reading Books"));
            question.setChoiceD(("Travelling"));
            question.setAnswer(("c"));
            questions.addElement(question);
        }
        return exam;
    }

}
