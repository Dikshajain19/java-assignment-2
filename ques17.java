import java.util.Scanner;

class ques17 {
    public static void main(String a[]) {
        Scanner s = new Scanner(System.in); 
        System.out.println("Enter the number: "); 
        String n = s.nextLine();
        int sum=0;
        for(int i=0;i<n.length()-1;i++){
            int num= (n.charAt(i) - '0') * 10 + (n.charAt(i + 1) - '0');
            System.out.println(num);
            sum+=num;

        }
        System.out.println("the sum is "+sum);
        
      
        
    }
}
