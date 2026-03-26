public class ScienceTextBook extends TextBook{
    private String branch;
    private boolean labRequired;

    public ScienceTextBook(String title,String author,int pages,String subject,int gradeLevel,String branch,boolean labRequired) {

        super(title,author,pages,subject,gradeLevel);

        this.branch = branch;
        this.labRequired = labRequired;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Branch: " + branch);
        System.out.println("Lab Required: " + labRequired);
    }

    @Override
    public int calculateReadingLoad() {
        return super.calculateReadingLoad()+5;
    }

    public void doExperiment() {
        if (labRequired) {
            System.out.println("Performing science experiment...");

        } else {
            System.out.println("No lab required.");
        }
    }

    @Override
    public String toString() {
        return String.format("%s\nBranch: %s\nLab Required: %b",super.toString(),branch,labRequired);
    }
}
