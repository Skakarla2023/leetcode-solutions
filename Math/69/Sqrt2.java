
class SquareRoot{
    public static void main(String[] args){
        int a = 12;
        int b = 9;
        System.out.println("Square root of "+a+"is: "+ sqrt(a));
        System.out.println("Square root of "+b+"is: "+ sqrt(b));
    }
    public static int sqrt(int num){
        if(num<2){
            return num;
        }
        
        // use binary search method
        long low = 1;
        long high = num/2;
        long ans = 0;
        
        while(low <= high){
            long mid = low + (high-low)/2;
            long square = mid*mid;
            
            if(square == num){
                return (int)mid;
            }
            if(square<num){
                low = mid+1;
                ans = mid;
            }
            else{
                high = mid-1;
            }
        }
        return (int)ans;
    }
}
