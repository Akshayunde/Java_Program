/*  Title  : Check Armstrong number
    Author : Akshay unde
    Date   : 16/02/2020
*/
   
 public class Armstrong 
    {
        public static void main(String[] args) {
            int number = 371, originalNumber, remainder, result = 0;
            originalNumber = number;
            while (originalNumber != 0)
            {
                remainder = originalNumber % 10;
                result += Math.pow(remainder, 3);
                originalNumber /= 10;
            }
            if(result == number)
                System.out.println(number + " is an Armstrong number.");
            else
                System.out.println(number + " is not an Armstrong number.");
        }
    }
/* Output
          371 is an Armstrong number.  */
