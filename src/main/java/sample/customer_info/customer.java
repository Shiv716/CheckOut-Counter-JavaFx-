package sample.customer_info;

import java.util.HashMap;
import java.util.Map;

// This class contains all the valid details of existing customers with Loyalty card membership.

public class customer {
    private String name;
    private  int number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public  customer (String name , int number){
        this.name=name;
        this.number=number;
    }


        private static Map<Integer,customer > customerlist = new HashMap<>();

        static {
            customerlist.put(324, new customer("Sanry",324));
            customerlist.put(510, new customer("Amil",510));
            customerlist.put(890, new customer("Vidit",890));
            customerlist.put(999, new customer("Stacy",999));
        }

        public static Map<Integer, customer> getCustomerlist(){
            return customerlist;
        }
        public static customer getCustomer(int id) {
            return customerlist.get(id);
        }
    }

