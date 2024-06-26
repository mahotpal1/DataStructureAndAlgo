import java.util.ArrayList;

public class BruteForce{
    private ArrayList<Interval> intervals;

    public BruteForce(ArrayList<Interval> interval){
        this.intervals = interval;
    }

    public ArrayList<Interval> getMergedOverlappingIntervals(Interval interval){
        ArrayList<Interval> mergedIntervals = new ArrayList<Interval>();
        // Let's first keep the answer to be the first value present int the list
        Interval _current = interval;
        // Loop from 0 to end of interval list
        for(int i=0; i<this.intervals.size(); i++){
            if(this.intervals.get(i).getEnd() <= _current.getStart()){
                mergedIntervals.add(this.intervals.get(i));
            }else if(_current.getEnd() <= this.intervals.get(i).getStart()){
                mergedIntervals.add(_current);
                while(i<this.intervals.size()){
                    mergedIntervals.add(this.intervals.get(i));
                    i++;
                }
                return mergedIntervals;
            }else {
                _current.setStart(Math.min(_current.getStart(), this.intervals.get(i).getStart()));
                _current.setEnd(Math.max(_current.getEnd(), this.intervals.get(i).getEnd()));
            }
        }
        mergedIntervals.add(_current);

        return mergedIntervals;
    }
}