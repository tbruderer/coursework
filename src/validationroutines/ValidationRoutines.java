
package validationroutines;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author 1-tbruderer
 */
public class ValidationRoutines {
    
    public static void isNull(String inNull)
    {
     if (inNull.equals("Null"))
     {
         System.out.println("False");
     } else {
     }
        
    }

    /**
     *
     * @param inPost
     * @return
     */
    public static Boolean ValidatePostcode(String inPost)
    {   
        String regex = "^[Gg][Ii][Rr] 0[Aa]{2})|((([A-Za-z][0-9]{1,2})|(([A-Za-z][A-Ha-hJ-Yj-y][0-9]{1,2})|(([A-Za-z][0-9][A-Za-z])|([A-Za-z][A-Ha-hJ-Yj-y][0-9][A-Za-z]?))))\s?[0-9][A-Za-z]{2}^";
        Pattern postcode = Pattern.compile(regex);
        isNull(inPost);
        Matcher m = postcode.matcher(inPost);
        return m.matches();
    }
}