package Day_14.HackerRank_Problems;
class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    Person(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    public void printPerson() {
        System.out.println("Name: " + lastName + ", " + firstName);
        System.out.println("ID: " + idNumber);
    }
}

class Student extends Person {
    private int[] testScores;

    Student(String firstName, String lastName, int id, int[] scores) {
        super(firstName, lastName, id);
        this.testScores = scores;
    }

    char calculate() {
        int sum = 0;
        for (int score : testScores) {
            sum += score;
        }
        int avg = sum / testScores.length;

        if (avg >= 90) return 'O';
        else if (avg >= 80) return 'E'; // Exceeds Expectations
        else if (avg >= 70) return 'A'; // Acceptable
        else if (avg >= 55) return 'P'; // Poor
        else if (avg >= 40) return 'D'; // Dreadful
        else return 'T'; // Troll
    }
}

public class GradingSystem {
    public static void main(String[] args){
        String firstName = "Heraldo";
        String lastName = "Memelli";
        int id = 8135627;
        int[] scores = {100, 80};

        Student s = new Student(firstName, lastName, id, scores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}