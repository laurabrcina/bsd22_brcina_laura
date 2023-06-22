/* Exercise04_Konfig
 * Calculates 2 numbers with each other
 * Author: Laura Brcina
 * Last Change: 17.05.2023
 */

package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    private static Logger logger = LogManager.getLogger();
    /**
     * addition of two numbers
     * @author Laura Brcina
     * @param number1 first summand as double
     * @param number2 second summand as  double
     * @return to the sum for number1 and number2
     */
    public double add(double number1,double number2){
        logger.debug("Methode add aufgerufen mit "+ number1 + " und " + number2);
        double result= number1+number2;
        return result;
    }
    /**
     * difference of two numbers
     * @author Laura Brcina
     * @param number1 first minuend as double
     * @param number2 second subtrahend as double
     * @return difference of number1 and number2
     */
    public double minus(double number1, double number2){
        logger.debug("Methode minus aufgerufen mit "+ number1 + " und " + number2);
        double result = number1-number2;
        return result ;
    }
    /**
     * division of two numbers
     * @author Laura Brcina
     * @param number1 first dividend as double
     * @param number2 second divisor as double. Not allowed to be 0
     * @return quotient of number1 and number2
     * @throws ArithmeticException if number2 equals 0
     */
    public double divide(double number1, double number2){
        logger.debug("Methode divide aufgerufen mit "+ number1 + " und " + number2);

        if(number2 == 0){
            logger.error("Division / 0");
            throw new ArithmeticException("Division /0");
        }

        double result = number1/number2;
        return result;
    }
    /**
     * multiplication of two numbers
     * @author Laura Brcina
     * @param number1 first factor as double
     * @param number2 second factor as  double
     * @return product of number1 and number2
     */
    public double multiply(double number1, double number2){
        logger.debug("Methode multiply aufgerufen mit "+ number1 + " und " + number2);
        double result= number1*number2;
        return result;
    }
    /**
     * factorial of a number
     * @author Laura Brcina
     * @param number as integer of which the factorial is calculated
     * @return 0 if number less than 0, 1 if number equals 0 else factorial for number.
     */
    public int factorial(int number){
        logger.debug("Methode factorial aufgerufen mit " + number);
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

