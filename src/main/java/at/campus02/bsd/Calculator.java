/* Exercise04_Konfig
 * Calculates 2 numbers with each other
 * Author: Laura Brcina
 * Last Change: 17.05.2023
 */

package at.campus02.bsd;

public class Calculator {
    public double add(double number1,double number2){
        double result= number1+number2;
        return result;
    }
    public double minus(double number1, double number2){
        double result = number1-number2;
        return result ;
    }
    public double divide(double number1, double number2){
        double result = number1/number2;
        return result;
    }
    public double multiply(double number1, double number2){
        double result= number1*number2;
        return result;
    }

    public int factorial(int number){
        if (number < 0) {
            return 0;
        }
        if (number == 0){
            return 1;
        }
        int result = 1;

        for (int i = 1; i <= number; i++){
            result = result * i;
        }
       return result;
    }
}

