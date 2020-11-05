//jen obyrne final code
public class NinthGrader extends Student {

    //private Object teacher;
    private Object c;
    private Object d;

    public NinthGrader(String a, String b) // because there are three inpputs in the student one (only two bc it will
                                           // always be 2024)
    {
        super(a, b, 2024);  //has to either be none or three inputs because the student class has either 3 or 0
        this.c = c;
        this.d = c;
    }

    public NinthGrader() //no inputs bc there are none on one of the construcutors in student(needs to match one to one)
    {
        //super("John", "Smith", 2024);
        super();
    }
    @Override
    public void doSomething()
    {
        System.out.println("im studying for my physics test");
    }
    @Override //makes sure the class matches with the parent class
    public String toString()
    {
        String str = this.a() + " " + this.b() + " " + this.c() + "(Ninth Grader)";
        return str;
    }

    private String c() {
        return null;
    }

    private String b() {
        return null;
    }

    private String a() {
        return null;
    }
}