public class FooCorporation
{

    public static void main(String[] args) {
        FC(8.20,47);
    }



    public static void FC(double pay, int hours)
    {
        double totalPay = pay*hours;
        System.out.println("Total pay of the employee is " + totalPay +"$");

        if (pay==7.50 && (hours<=35){
            System.out.println(" this is employee1");

        } else if (pay==8.20 && hours==47) {
            System.out.println(" this is employee2");
        }

            else if (pay==10.00 && hours==73) {
            System.out.println(" this is employee3");
        }else if(pay>40){
               double overtime  =  (pay)* 1.5;
            System.out.println(" he works" + "which is overtime");
        }
            System.out.println( -1);
        }
    }

