import java.util.Scanner;
public class string{
        public static void main(String[] args){
                Scanner s=new Scanner(System.in);
                System.out.println("Enter the number of strings");
                int n=s.nextInt();
                s.nextLine();
                String[] string=new String[n];
                for(int i=0;i<n;i++){
                        System.out.println("Enter string"+i+":");
                        string[i]=s.nextLine();
                        }
                System.out.println("Enter the string to be searched:");
                String ser=s.nextLine();
                int index = -1;
                for (int i = 0; i < n; i++) {
                if (string[i].equals(ser)) {
                        index = i;
                        break;
                        }
                }
                if (index != -1) {
                        System.out.println("String found at index: " + index);
                        } else {
                        System.out.println("String not found.");
                        }
                s.close();
                }
        }
