/* Exercise04_Konfig
 * Calculates 2 numbers with each other
 * Author: Laura Brcina
 * Last Change: 17.05.2023
 */

package at.campus02.bsd;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Main{
    private static Logger logger = LogManager.getLogger();

    public static void main(String[]args){
        Calculator cal = new Calculator();

        System.out.println(cal.add(3.3,4.5));
        System.out.println(cal.divide(6,3));
        System.out.println(cal.minus(8.5,6.5));
        System.out.println(cal.multiply(2.5, 4.0));


        logger.error("It is an errorLogger");
        logger.info("It is an infoLogger");
    }
}
