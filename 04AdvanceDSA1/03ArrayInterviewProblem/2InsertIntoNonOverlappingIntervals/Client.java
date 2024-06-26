import java.util.*;

class Client{
    public static void main(String[] args) {
        ArrayList<Interval> intervals = new ArrayList<Interval>(
                Arrays.asList(
                        new Interval(1, 4),
                        new Interval(7, 9),
                        new Interval(11, 15),
                        new Interval(19, 21)
                )
        );
        BruteForce bruteForce = new BruteForce(intervals);
        Interval _current = new Interval(5, 12);
        ArrayList<Interval> intervals1 = bruteForce.getMergedOverlappingIntervals(_current);
        for(int i=0; i<intervals1.size(); i++){
            System.out.println(intervals1.get(i).getStart() + " " + intervals1.get(i).getEnd());
        }
        return;
    }
}