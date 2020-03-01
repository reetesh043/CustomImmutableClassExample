/**
 * 
 */
package com.java.immutable.test;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.java.immutable.model.Address;
import com.java.immutable.model.CustomImmutableClass;

/**
 * @author reekumar0
 */
public class CustomImmutableClassTest {

    public static void main(String[] args) {

        Address address1 = new Address();
        address1.setAddressLine1("address Line1");
        address1.setAddressLine2("address Line2");
        address1.setCity("Mumbai");
        

        Address address2 = new Address();
        address2.setAddressLine1("address Line1");
        address2.setAddressLine2("address Line2");
        address2.setCity("Bangalore");

        List<String> skills = new ArrayList<>();
        skills.add("Core Java");
        skills.add("Kafka");
        skills.add("Apache Spark");

        CustomImmutableClass e1 = new CustomImmutableClass(1001, "Kumar", new BigDecimal("1200.00"), getDob("04/02/1986"), address1, skills);
        CustomImmutableClass e2 = new CustomImmutableClass(1002, "Reetesh", new BigDecimal("4000.00"), getDob("25/02/1985"), address2, skills);

        System.out.println(e1);
        System.out.println(e2);

        System.out.println("----------------------------------------------------------");
        e1.getAddress().setCity("London");
        System.out.println(e1);
    }

    private static Date getDob(String dob) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            return dateFormat.parse(dob);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
