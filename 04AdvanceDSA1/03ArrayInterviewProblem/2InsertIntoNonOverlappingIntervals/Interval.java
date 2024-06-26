public class Interval{
    private int start;
    private int end;
    public Interval(int start, int end){
        this.start = start;
        this.end = end;
    }
    public Interval(Interval interval){
        this.start = interval.start;
        this.end = interval.end;
    }
    public int getStart(){
        return start;
    }
    public int getEnd(){
        return end;
    }
    public void setStart(int start){
        this.start = start;
    }
    public void setEnd(int end){
        this.end = end;
    }
}