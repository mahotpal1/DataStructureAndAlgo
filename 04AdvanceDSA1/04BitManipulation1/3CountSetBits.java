
class CountSetBits{
    private static int num;

    public static int countSetBits(){
        int count=0;
        for(int i=0;i<num;i++){
            if((num&(1<<i)) != 0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        num = 16;
        System.out.println("Set bits in 16: " + countSetBits());
        num = 21;
        System.out.println("Set bits in 21: " + countSetBits());
        num = 6;
        System.out.println("Set bits in 6: " + countSetBits());
    }
}