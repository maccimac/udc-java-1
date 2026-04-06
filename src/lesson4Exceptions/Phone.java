package lesson4Exceptions;

public class Phone {
    String phoneType;
    String phoneNumber;

    public Phone(String phoneType, String phoneNumber){
        if(phoneType == null || phoneNumber == null){
            throw new IllegalArgumentException("Phone type or number cannot be null");
        }
        this.phoneType = phoneType;
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPhoneType() {
        return phoneType;
    }

    @Override
    public String toString() {
//        return super.toString();
        return "Phone number is " + phoneNumber + ". Phone type is " + phoneType + ".";
    }
}
