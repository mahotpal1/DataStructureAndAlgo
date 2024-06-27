class SetNthBit{
    private static int num;

    public static int setNth(int n){
        int newSet = (num|(1<<n));
        return newSet;
    }

    public static void main(String[] args) {
        num = 12;
        System.out.println("After setting 0th bit for 6: "+setNth(6));
    }
}