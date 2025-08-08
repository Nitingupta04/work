class Hello {

    Logical_Ques lq = new Logical_Ques();

    static {
        System.out.println("-- SB in class Hello --");
    }

    {
        System.out.println("-- IB in class Hello --");
    }

}

class Logical_Ques {

    /*
     * static{
     * System.out.println("-- SB in class Logical_Ques --");
     * }
     * 
     * {
     * System.out.println("-- IB in class Logical_Ques --");
     * }
     */

    public static void main(String[] args) {
        int arr[] = new int[10];
        int length_of_arr = arr.length;
        int totalSumOfArray = 0;

        for (int i = 0; i < length_of_arr; i++) {
            arr[i] = i + 1;
        }

        /*for (int i = 0; i < length_of_arr; i++) {
            totalSumOfArray = totalSumOfArray + arr[i];
        }

        System.out.println("-- Total Sum Value of Array = " + totalSumOfArray);*/


        for(int i = length_of_arr-1; i > 0 ; i--){
            System.out.println("Index " + i + " = "+arr[i]);
        }

    }

}
