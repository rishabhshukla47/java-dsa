package arrays;

public class IsUnique {
    
    public static void main(String[] args) {
        
        IsUnique obj = new IsUnique();
        int arr[] = {1, 2, 3, 4, 5};
        System.out.print(obj.isUnique(arr));

    }

    public boolean isUnique(int[] arr){
        for(int i = 0; i< arr.length; i ++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    return false;
                }
            }
        }
        return true;
    }

}
