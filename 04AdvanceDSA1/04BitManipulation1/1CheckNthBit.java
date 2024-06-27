class CheckNthBith{
    private static int num;

    public static boolean checkNthBit(int n){
        if( (num & (1 << n)) == 0){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {

        num = 16;
        if(checkNthBit(3)){
            System.out.println("Set");
        }else{
            System.out.println("Unset");
        }
    }
}