package lesson5Exceptions;

public class PhoneExceptionTester {

    public static void main(String[] args) {
        String[] numbers = new String[] {
            "123", "456", null
        };

        for(int i = 0; i < numbers.length; i++){
            Phone ph = null;
            try{
                ph = new Phone("Nokie", numbers[i]);
            }
            catch (Exception e){
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                System.out.println(e.getCause());
                 ph = new Phone("Err", "1245");
            }
            finally {
                if( ph != null){
                    System.out.println(ph.toString());
                }

            }
        }
    }
}
