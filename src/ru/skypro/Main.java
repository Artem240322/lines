package ru.skypro;

public class Main {

    public static void main(String[] args) {
        String phone = "+920-111-22-33";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length() == 10) {
//            phone = '7' + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("Телефон слишком длинный");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Телефон слишком короткий");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Среди нас посторонний!!!");
        }
        System.out.println("phone =" + phone);
        String expektedPhon = "79201112233";
        if (phone.equals(expektedPhon)) {
            System.out.println("Успех");
        } else {
            System.out.println("Неудача");
        }
    }


    }

