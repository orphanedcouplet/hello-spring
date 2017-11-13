package org.launchcode.hellospring.controllers;

public class Message {
    public static String createMessage(String lang, String name) {

        String message;

        if (lang.equals("sp")) {
            message = "Hola " + name;
        } else if (lang.equals("fr")) {
            message = "Bonjour " + name;
        } else if (lang.equals("ger")) {
            message = "Hallo " + name;
        } else if (lang.equals("esp")) {
            message = "Saluton " + name;
        } else if (lang.equals("bos")) {
            message = "Zdravo " + name;
        } else if (lang.equals("cz")) {
            message = "Ahoj " + name;
        } else {
            message = "Hello " + name;
        }

        return message;
    }

}
