import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
class Main {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=obj.nextInt();
        
        List<String> nums=new ArrayList<>();
        
        for(int i=1;i <= n;i++){
            if(i%3 == 0 && i%5 == 0) {
                nums.add("FizzBuzz");
            } else if(i%5==0) {
                nums.add("Buzz");
            } else if(i%3==0) {
                nums.add("Fizz");
            } else {
                nums.add(String.valueOf(i));
            }
        }
        
        System.out.println(nums);
        }
    }
