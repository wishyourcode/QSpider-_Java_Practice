package relationship;

public class CollegeDriver {
    public static void main(String[] args) {
        College Col1 = new College("QSpider", 500);
        Col1.displayCollege();
        Col1.setcollegeName("Tiwari college");
        System.out.println(Col1.getcollegeName());
        Col1.displayCollege();
        System.out.println(Col1.S1.getname());
        Col1.S1.setrollNo(20);
        Col1.S1.setrollNo(99).displayStudent();
        Col1.setstudentCount(1000).displayCollege();
    }
}
