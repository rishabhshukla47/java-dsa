// Calculate exponential of a number

package recursion;

class Power {

    public static void main(String[] args) {
        System.out.println(new Power().powerOfNum(2, 3));
    }

    public int powerOfNum(int base, int exp){

        // ----- For Negative exp, change type to float -------- 
        // if(exp < 0){
        //     return 1/base * powerOfNum(base, exp + 1);
        // }

        // ------ Other base condition -------
        // if(exp == 1){
        //     return base;
        // }
        
        if(exp < 0){
            return -1;
        }    

        if(exp == 0){
            return 1;
        }

        return base * powerOfNum(base, exp - 1);

    }

}