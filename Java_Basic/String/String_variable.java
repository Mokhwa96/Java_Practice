class String_variable {
    public static void main(String[] args) {
        String name1 = "Mokhwa96";
        String name2 = "Kim Coding";
        String name3 = new String("Mokhwa96");
        String name4 = new String("Mokhwa96");

        System.out.println(name1);
        System.out.println(name3);

        boolean comparison1 = name1 == "Mokhwa96";      // true
        boolean comparison2 = name1 == name2;             // true
        boolean comparison3 = name1 == name3;             // false
        boolean comparison4 = name3 == name4;             // false
        boolean comparison5 = name1.equals("Mokhwa96"); // true
        boolean comparison6 = name1.equals(name3);        // true
        boolean comparison7 = name3.equals(name4);        // true
        System.out.println(comparison1); //
        System.out.println(comparison2);
        System.out.println(comparison3);
        System.out.println(comparison4);
        System.out.println(comparison5);
        System.out.println(comparison6);
        System.out.println(comparison7);

    }
}