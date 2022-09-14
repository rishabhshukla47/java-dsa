package arrays;

public class BestScores {
    
    public static void main(String[] args) {
        BestScores obj = new BestScores();
        Integer[] arr = {1, 4, 56, 34, 23, 76, 32};
        System.out.println(obj.firstSecond(arr));
    }

    public String firstSecond(Integer[] myArray) {
        for(int i = 0; i < 2; i++){
            for(int j = 0; j <myArray.length-1-i; j++){
                if(myArray[j] > myArray[j+1]){
                    int temp = myArray[j];
                    myArray[j] = myArray[j+1];
                    myArray[j+1] = temp;
                }
            }
        }
        return myArray[myArray.length-1] + " " + myArray[myArray.length-2];
      }

}
