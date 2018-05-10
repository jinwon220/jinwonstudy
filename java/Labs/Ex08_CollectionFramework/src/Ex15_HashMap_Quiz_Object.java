import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

class QuizInfo{
    String question;
    String answer;
    String result;
    
	public QuizInfo(String question, String answer, String result) {
        this.question = question;
        this.answer = answer;
        this.result = result;
    }
    
    public String toString() {
        return "����:"+this.question+" ����:"+this.answer+" ä��:"+this.result;
    }
}

public class Ex15_HashMap_Quiz_Object {
	public static void main(String[] args) {
		HashMap<String, String> quiz = new HashMap<>();
        quiz.put("1+1", "2");
        quiz.put("1+2", "3");
        quiz.put("1+3", "4");
        
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        
        for(int i = 0 ; i < quiz.size() ; i++) {
            Set set = quiz.keySet();
            Object[] obj= set.toArray();
            System.out.println(obj[i]); //����
            //System.out.println(quiz.keySet().toArray()[i]);
            
            String answer = sc.nextLine();
            String result;
            if(!answer.equals(quiz.get(quiz.keySet().toArray()[i]))) {
            	result = "�����Դϴ�.";
            } else {
            	result = "�����Դϴ�.";
            	cnt++;
            }
            QuizInfo q = new QuizInfo((String)obj[i], answer, result);
            System.out.println(q.toString());
        }
        
        System.out.println("���� ���� ���� : " + cnt);
        
	}

}
