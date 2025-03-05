class Course{
    private String courseName;
    private int duration;

    public Course(String courseName, int duration){
        this.courseName = courseName;
        this.duration = duration;
    }

    public void showDetails(){
        System.out.println("Course Name : "+courseName);
        System.out.println("Duration : "+duration);
    }
}

class OnlineCourse extends Course{
    private String platform;
    private boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded){
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void showDetails(){
        super.showDetails();
        System.out.println("Platform : "+platform);
        System.out.println("Recorded : "+(isRecorded ? "Yes" : "No"));
    }
}

class PaidOnlineCourse extends OnlineCourse{
    private double fee;
    private double discount;

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public double getFinalPrice() {
        return fee - (fee * discount / 100);
    }

    @Override
    public void showDetails(){
        super.showDetails();
        System.out.println("Fee : "+fee);
        System.out.println("Discount : "+discount);
        System.out.println("Final Fee : "+getFinalPrice());
    }
    
}
public class EducationalCourse {
    public static void main(String[] args) {
        Course course = new Course("Java", 50);
        OnlineCourse onlineCourse = new OnlineCourse("Java", 48, "Youtube", true);
        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("Java", 58, "Coursera", false, 4999.50,20.5);

        course.showDetails();
        System.out.println();
        onlineCourse.showDetails();
        System.out.println();
        paidOnlineCourse.showDetails();

    } 
}
