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

    public double add(double number1,double number2){
        logger.debug("Methode add aufgerufen mit "+ number1 + " und " + number2);
        double result= number1+number2;
        return result;
    }
    public double minus(double number1, double number2){
        logger.debug("Methode minus aufgerufen mit "+ number1 + " und " + number2);
        double result = number1-number2;
        return result ;
    }
    public double divide(double number1, double number2){
        logger.debug("Methode divide aufgerufen mit "+ number1 + " und " + number2);

        if(number2 == 0){
            logger.error("Division / 0");
            throw new ArithmeticException("Division /0");
        }

        double result = number1/number2;
        return result;
    }
    public double multiply(double number1, double number2){
        logger.debug("Methode multiply aufgerufen mit "+ number1 + " und " + number2);
        double result= number1*number2;
        return result;
    }

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

