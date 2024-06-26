import java.util.ArrayList;

public class BruteForce{
    private ArrayList<Interval> intervals;

    public BruteForce(ArrayList<Interval> interval){
        this.intervals = interval;
    }

    public ArrayList<Interval> getMergedOverlappingIntervals(){
        ArrayList<Interval> mergedIntervals = new ArrayList<Interval>();
        // Let's first keep the answer to be the first value present int the list
        Interval _current = this.intervals.get(0);
        // Loop from 1st to end of interval list
        for(int i=1; i<this.intervals.size(); i++){
            // check if ending value of interval is greater than starting value of current
            // Means Overlapping
            if(this.intervals.get(i).getStart() <= _current.getEnd()){
                _current.setEnd(Math.max(this.intervals.get(i).getEnd(), _current.getEnd()));
            }else{
                // In case of non overlapping add it to the list and make it coming index as current
                Interval newInterval = new Interval(_current);
                mergedIntervals.add(newInterval);
                _current = this.intervals.get(i);
            }
        }
        // Add the last calculated interval in the answer list
        Interval newInterval = new Interval(_current);
        mergedIntervals.add(newInterval);

        return mergedIntervals;
    }
}