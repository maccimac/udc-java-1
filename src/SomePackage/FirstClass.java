package SomePackage;

/**
 * This is the description.
 * Reviewing java concepts
 *
 * @author Macci
 */
public class FirstClass {

    /**
     * Method description
     *
     * @param str message
     * @return value between appostrophes
     */

    public String print(String str){
        System.out.print(str);
        return '"' + str + '"';
    }


    public static void main(){
        System.out.print("Hello");
    }
}
