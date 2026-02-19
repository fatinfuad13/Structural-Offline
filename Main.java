public class Main {

    public static void main(String[] args) {

        // -------------------------
        //  Create Lessons
        // -------------------------
        Lesson l1 = new Lesson("Linear Algebra", 2.0, 15.0);
        Lesson l2 = new Lesson("Calculus", 1.5, 12.0);
        Lesson l3 = new Lesson("Data Structures", 2.5, 18.0);
        Lesson l4 = new Lesson("Algorithms", 2.0, 20.0);
        Lesson l5 = new Lesson("Physics", 3.0, 25.0);
        Lesson l6 = new Lesson("Chemistry", 2.5, 22.0);

        // -------------------------
        //  Create Courses and add Lessons
        // -------------------------
        Course mathCourse = new Course("Math Foundations");
        mathCourse.addItem(l1);
        mathCourse.addItem(l2);

        Course csCourse = new Course("CS Core");
        csCourse.addItem(l3);
        csCourse.addItem(l4);

        Course phyCourse = new Course("Physics Course");
        phyCourse.addItem(l5);
        phyCourse.addItem(l6);

        // -------------------------
        //  Create Modules and add Courses
        // -------------------------
        Module module1 = new Module("STEM Module");
        module1.addItem(mathCourse);
        module1.addItem(csCourse);

        Module module2 = new Module("Science Module");
        module2.addItem(phyCourse);

        // -------------------------
        //  Apply Module Add-ons (Decorators)
        // -------------------------
        Content decoratedModule1 = new PracticeSet(module1);   
        decoratedModule1 = new LiveMentor(decoratedModule1);   

        Content decoratedModule2 = new PracticeSet(module2);   

        // -------------------------
        // Create Cart
        // -------------------------
        ContentCart cart = new ContentCart("Student Checkout", true); 
        cart.addItem(decoratedModule1);
        cart.addItem(decoratedModule2);

        // -------------------------
        // Apply Discounts (Decorators)
        // -------------------------
        Content discountedCart = new MultiModuleDiscount(cart);       
        discountedCart = new SpecialDiscount(discountedCart);        
        discountedCart = new DevelopingCountryDiscount(discountedCart); 

        // -------------------------
        // Show Full Details
        // -------------------------
        System.out.println("\n===== Checkout Summary =====\n");
        discountedCart.showDetails();
        System.out.println("\n=============================");
        System.out.printf("Final Price to Pay: $%.2f\n", discountedCart.calculatePrice());
        System.out.printf("Total Duration: %.1f hours\n", discountedCart.getDuration());
        System.out.println("=============================\n");
    }
}
