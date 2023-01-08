package com.assignment.task3;
import java.util.Scanner;
public class ques3 {
    public static void main(String[]args){
        int r,sum=0,temp;
        System.out.println("Input a number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        temp=num;
        while(num>0){
            r=num%10;
            sum=(sum*10)+r;
            num=num/10;
        }
        if(temp==sum){
            System.out.println("Palindrome number");

        }
        else{
            System.out.println("It is not palindrome");
        }


    }
}
