import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CohortTest {

    Cohort cohortClass = new Cohort();
    Student nick = new Student(1L, "Nick");
    Student tripp = new Student(2L, "Tripp");


    @Test
    public void addStudent(){
        cohortClass.addStudent(nick);
        assertEquals(nick.getName(),cohortClass.getStudents().get(0).getName() );
    }


    @Test
    public void viewList(){
        cohortClass.addStudent(nick);
        cohortClass.addStudent(tripp);
        assertEquals( 2 , cohortClass.getStudents().size());
    }

    @Test
    public void getAverage(){
        cohortClass.addStudent(nick);
        cohortClass.addStudent(tripp);
        nick.addGrade(50);
        nick.addGrade(100);
        tripp.addGrade(100);
        tripp.addGrade(50);
        assertEquals( 75, cohortClass.getCohortAverage(), 0 );
    }


}
