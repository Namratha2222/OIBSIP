import java.util.Scanner;

class User {
    private String username;
    private String password;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

class MCQs {
    // Define MCQs, questions, options, and correct answers
}

class Exam {
    private User currentUser;
    private MCQs[] questions;
    private int timer; // Timer for exam duration

    public Exam(User user, MCQs[] questions, int timer) {
        this.currentUser = user;
        this.questions = questions;
        this.timer = timer;
    }

    public void startExam() {
        // Start the exam
    }

    public void selectAnswer(int questionNumber, String selectedAnswer) {
        // Method to select answers for MCQs
    }

    public void submitExam() {
        // Auto-submit exam after the timer expires
    }

    public void closeSession() {
        // Close the exam session and logout
    }
}

public class OnlineExaminationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Online Examination System!");

        User currentUser = new User();

        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        currentUser.setUsername(username);

        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        currentUser.setPassword(password);

        MCQs[] sampleQuestions = new MCQs[5]; // Assuming there are 5 MCQs

        Exam exam = new Exam(currentUser, sampleQuestions, 60); // 60 minutes timer
        exam.startExam();

        // Selecting answers
        exam.selectAnswer(1, "Option A"); // Selecting answer for question 1

        // Timer and auto-submit (Not implemented in this basic example)

        // Closing session and Logout
        exam.closeSession();
    }
}