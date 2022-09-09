public class ControlFlow {

    public static void main(String[] args) {
        boolean isCold = true; // true of false
        // variable scope
        if(isCold){ // executive only if isCold is true
            System.out.println("It's cold, wear a coat!");
        }

        boolean isLightGreen = false;
        boolean isLightYellow = false;
        if (isLightGreen){
            double carSpeed = 100;
            System.out.println("Drive!");
            System.out.println("Current speed is "+carSpeed);
        } else if (isLightYellow){
            System.out.println("Slow down!");
        }else {
            System.out.println("Stop!");
        }

        // boolean expressions
        boolean b3 = 3 < 5; // true
        boolean b4 = 3 == 5; //false
        // == equal and != not equal

        int ticketPrice = 10;
        int age = 70;
        boolean isStudent = false;

        /* if (age <= 15){
            ticketPrice = 5;
        } else if (age > 60){
            ticketPrice = 5;
        } else if (isStudent){
            ticketPrice = 5;
        } */
        if (age <= 15 || age > 60 || isStudent){
            ticketPrice = 5;
        }
        System.out.println(ticketPrice);

        // logical operators:
        // and &&, or ||, not !
        // order of logical operators is:
        // parentheses, !, &&, ||

        // nested if statements
        boolean action = true;
        boolean romance = true;
        boolean horror = false;
        boolean comedy = true;
        if(action && romance){
            System.out.println("This movies includes action and romance");
            if (comedy || horror){
                System.out.println("This also includes comedy or horror");
            }
        }

        // coffeeMachine code
        int passcode = 555;
        String coffeeType;

        /*if (passcode == 555){
            coffeeType = "Espresso";
        } else if (passcode == 312){
            coffeeType = "Vanilla latte";
        } else if (passcode == 629){
            coffeeType = "Drip coffee";
        } else {
            coffeeType = "Unknown";
        }*/

        // switch statement
        switch (passcode){
            case 555: coffeeType = "Espresso";
            break;
            case 312: coffeeType = "Vanilla latte";
            break;
            case 629: coffeeType = "Drip coffee";
            break;
            default: coffeeType = "Unknown";
            break;
        }
        System.out.println(coffeeType);

    }


}
