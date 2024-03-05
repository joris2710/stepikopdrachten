import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentUtilTest {

    StudentUtil stutil = new StudentUtil();
    @Test
    void calculateAverage() {
        assertEquals(0.0, stutil.calculateAverage(new ArrayList<>()));
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(2);
        grades.add(4);
        assertEquals(3, stutil.calculateAverage(grades));
    }

    @Test
    void findBestStudent() {
        ArrayList<String> students = new ArrayList<>();
        // 2 studenten toevoegen
        students.add("Bassie");
        students.add("Adriaan");
        // nu maken we 2 cijferlijsten aan voor bassie & adriaan, met 3 cijfers pp
        ArrayList<Integer> bassieCijfers = new ArrayList<>();
        bassieCijfers.add(5);
        bassieCijfers.add(8);
        bassieCijfers.add(5);
        ArrayList<Integer> adriaanCijfers = new ArrayList<>();
        adriaanCijfers.add(4);
        adriaanCijfers.add(10);
        adriaanCijfers.add(7);
        // cijferlijsten in de onderstaande arraylist smijten
        ArrayList<ArrayList<Integer>> grades = new ArrayList<>();
        grades.add(bassieCijfers);
        grades.add(adriaanCijfers);
        assertEquals("Adriaan", stutil.findBestStudent(students, grades));
    }

    @Test
    void getSortedGrades() {
        ArrayList<Integer> adriaanCijfers = new ArrayList<>();
        adriaanCijfers.add(4);
        adriaanCijfers.add(10);
        adriaanCijfers.add(7);
        ArrayList<Integer> sortedGrades = stutil.getSortedGrades(adriaanCijfers);
        assertEquals(10, sortedGrades.getLast());
    }

    @Test
    void isPassingGrade() {
        assertTrue(stutil.isPassingGrade(80));
        assertTrue(stutil.isPassingGrade(60));
        assertFalse(stutil.isPassingGrade(50));
        assertFalse(stutil.isPassingGrade(-200));
    }
}