public class Arrays {

    public int[] nums;
    public int total;


    public static void main(String[] args) {
        System.out.println("Welcome to Awesome Arrays");

        new Arrays();
    }

    public Arrays(){

        nums = new int[10];
        nums[9] = 11;
        nums[8] = 10;
        nums[7] = 9;
        nums[6] = 8;
        nums[5] = 7;
        nums[4] = 6;
        nums[3] = 5;
        nums[2] = 4;
        nums[1] = 3;
        nums[0] = 2;


        //todo: use a for loop to fill the array with random numbers [1,100]
        //todo: add numbers to all buckets in labels 0-8
        System.out.println(nums[9]);
        displayArray();
        randomNums();
        sumArray();
        averageNum();
        maxNum();
    }
    //todo: make a method called displayArray that prints all of the numbers in the array
    //only use one sout

    public void displayArray(){
        for(int x=0; x<nums.length; x++){
            System.out.println(x+" : "+nums[x]);
        }
    }

    public void randomNums(){
       for(int c = 0; c < nums.length; c++) {
           nums[c] = (int) (Math.random() * 100) + 1;
       }
    }

    //todo: make a method called sumArray that adds all the numbers in num together
    //hint: use a for loop
    //sout the answer

    public void sumArray(){
        //int total = 0;
        for(int n = 0; n < nums.length; n++){
            total = total + nums[n];
        }
        System.out.println(total);
    }

    public void averageNum(){
        int average = 0;
        for(int a = 0; a < nums.length; a++){
            average = (average + total)/nums[a];

        }

        System.out.println(average);
    }

    public void maxNum(){
        int max = 0;
        for(int m = nums.length;;){
            max = max + m;
        }

      //  System.out.println(max);
    }

   // public void minNum(){
        //int min = 0;
        //for(int k = nums)


    // }
}
