import java.util.*;

class Client{
    public static void main(String[] args) {
        ArrayList<Interval> intervals = new ArrayList<Interval>(
                Arrays.asList(
                        new Interval(0,2),
                        new Interval(1,4),
                        new Interval(5,6),
                        new Interval(6,8),
                        new Interval(7,10),
                        new Interval(8,9),
                        new Interval(12,14)
                )
        );
        BruteForce bruteForce = new BruteForce(intervals);
        ArrayList<Interval> intervals1 = bruteForce.getMergedOverlappingIntervals();
        for(int i=0; i<intervals1.size(); i++){
            System.out.println(intervals1.get(i).getStart() + " " + intervals1.get(i).getEnd());
        }
        return;
    }
}