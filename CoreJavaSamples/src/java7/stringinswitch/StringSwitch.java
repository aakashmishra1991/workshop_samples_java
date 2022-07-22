package java7.stringinswitch;

public class StringSwitch {

    public static void main(String[] args) {

        String currency = "USD";
        Integer currencyInt = currency.equals("USD")? 1 : 2;

        // pre Java 7
        switch (currencyInt){
            case 1:
                System.out.println("The currency is USD");
                break;
            case 2:
                System.out.println("The currency is INR");
                break;
            default:
                System.out.println("The currency is USD by default");
        }

        // Java 7
        switch (currency){
            case "USD":
                System.out.println("The currency is USD");
                break;
            case "INR":
                System.out.println("The currency is INR");
                break;
            default:
                System.out.println("The currency is USD by default");
        }

    }

}
