public class TextBook extends Book{
    private String subject;
    private int gradeLevel;

    public TextBook(String title,String author,int pages,String subject,int gradeLevel) {

        super(title,author,pages);
        this.subject = subject;
        this.gradeLevel = gradeLevel;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
        System.out.println("Grade: " + gradeLevel);
    }
    public void showSubject() {
        System.out.println("Subject: " + subject);
    }
    @Override
    public int calculateReadingLoad() {
        return super.calculateReadingLoad() + 5;

    }

    @Override
    public String toString() {
        return String.format("%s\nSubject: %s\nGrade: %d",super.toString(),subject,gradeLevel);
    }
}
