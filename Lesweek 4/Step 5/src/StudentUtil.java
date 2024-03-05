import java.util.ArrayList;
import java.util.Collections;

public class StudentUtil {

    public double calculateAverage(ArrayList<Integer> grades) {
        if (grades == null || grades.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    public String findBestStudent(ArrayList<String> students, ArrayList<ArrayList<Integer>> grades) {
        if (students == null || grades == null || students.isEmpty() || grades.isEmpty()) {
            return null;
        }
        int bestStudentIndex = 0;
        double bestAverage = calculateAverage(grades.get(0));
        for (int i = 1; i < grades.size(); i++) {
            double average = calculateAverage(grades.get(i));
            if (average > bestAverage) {
                bestStudentIndex = i;
                bestAverage = average;
            }
        }
        return students.get(bestStudentIndex);
    }

    public ArrayList<Integer> getSortedGrades(ArrayList<Integer> grades) {
        if (grades == null || grades.isEmpty()) {
            return new ArrayList<Integer>();
        }
        ArrayList<Integer> sortedGrades = new ArrayList<Integer>(grades);
        Collections.sort(sortedGrades);
        return sortedGrades;
    }

    public boolean isPassingGrade(int grade) {
        return grade >= 60;
    }
}