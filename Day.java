public class SwitchExample {
    public static void main(String[] args) 
    {
       
        String dayType;

   
        switch (day) {
            case 1:
                dayType = "Monday";
                break;
            case 2:
                dayType = "Tuesday";
                break;
            case 3:
                dayType = "Wednesday";
                break;
            case 4:
                dayType = "Thursday";
                break;
            case 5:
                dayType = "Friday";
                break;
            case 6:
                dayType = "Saturday";
                break;
            case 7:
                dayType = "Sunday";
                break;
            default:
                dayType = "Invalid day";
                break;
        }

        System.out.println("The day is: " + dayType);
    }
}

