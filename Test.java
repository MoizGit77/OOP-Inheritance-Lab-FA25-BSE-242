public class Test {
    public static void main(String[] args) {

        Book b1 = new Book("Java", "Ali", 100);
        b1.displayInfo();
        b1.openBook();
        System.out.println("Reading Load: " + b1.calculateReadingLoad());
        //System.out.println(b1);

        TextBook textBook1 = new TextBook("Math", "Ahmed", 200, "Mathematics", 10);

        textBook1.displayInfo();
        textBook1.openBook();
       // textBook1.showSubject();
        System.out.println("Reading Load: " + textBook1.calculateReadingLoad());
        //System.out.println(textBook1.toString());


        ScienceTextBook scienceTextBook1 = new ScienceTextBook("Physics Fundamentals", "Charlie", 250, "Physics", 12, "Mechanics", true);
        scienceTextBook1.displayInfo();
        scienceTextBook1.openBook();
        // scienceTextBook1.showSubject();
        scienceTextBook1.doExperiment();
        System.out.println("Reading Load: " + scienceTextBook1.calculateReadingLoad());
        //System.out.println(scienceTextBook1.toString());
    }
}