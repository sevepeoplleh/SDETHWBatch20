package org.example.e28;

public class E28SimpleCalculatorElseIf {
    public static void main(String[] args) {
        String operator="*";

        int num1=5;
        int num2=10;

        if(operator.equals("+")){
            int result=num1+num2;
            System.out.println("The sum is: "+result);
        }else if(operator.equals("-")){
            int result=num1-num2;
            System.out.println("The difference is: "+result);
        }else if(operator.equals("*")){
            int result=num1*num2;
            System.out.println("The product is: "+result);
        } else if (operator.equals("/")) {
            int result=num1/num2;
            System.out.println("The quotient is: "+result);
        }else{
            System.out.println("Invalid operator");
        }
        // Declare a variable for operator and assign a value


        // Declare two variables for numbers and assign values


        // Perform the corresponding arithmetic operation

    }
}
