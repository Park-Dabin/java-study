import java.util.Comparator;

public class StudentComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {

        if(!(o1 instanceof Student) || !(o2 instanceof Student))
            return 0;

        Student s1 = (Student) o1;
        Student s2 = (Student) o2;

        if(s1.avg > s2.avg)
            return -1;
        else if(s1.avg==s2.avg)
            return 0;
        else
            return 1;
    }
}
