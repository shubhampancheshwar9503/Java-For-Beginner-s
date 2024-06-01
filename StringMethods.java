package com.company;

import java.lang.annotation.AnnotationTypeMismatchException;

public class CWH_14_String_Methods {

    public static void main(String[] args) {
        String name = "Shubham";
        // System.out.println(name);
        int value = name.length();
        // System.out.println(value);

        // String lstring = name.toLowerCase();
        // System.out.println(lstring);

        // String ustring = name.toUpperCase();
        // System.out.println(ustring);

        // String nonTrimmedString = "     Shubham     ";
        // System.out.println(nonTrimmedString);

        // String trimmedString = nonTrimmedString.trim();
        // System.out.println(trimmedString);

        // System.out.println(name.substring(3));
        // System.out.println(name.substring(1,5));

        // System.out.println(name.replace('S', 'p'));
        // System.out.println(name.replace("Shu","bham"));

        // System.out.println(name.startsWith("Shub"));
        // System.out.println(name.endsWith("bham"));

        // System.out.println(name.charAt(4));

        String modifiedName = "Shubhamham";
        // System.out.println(modifiedName.indexOf("ham"));
        // System.out.println(modifiedName.indexOf("ham",4));
        // System.out.println(modifiedName.lastIndexOf("ham",7));

        // System.out.println(name.equals("Shubham"));
        System.out.println(name.equalsIgnoreCase("ShuBham"));
        System.out.println("I am escape sequence\tdouble quote");

    }

}
