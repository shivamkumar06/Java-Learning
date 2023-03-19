import java.time.LocalDate;

public class oops_demo_main {
    public static void main(String[] args) {
       User youngerUser = new User();
       youngerUser.name = "Robert Downey Jr";
       youngerUser.birthday = LocalDate.parse("1997-04-06");

        User olderUser = new User();
        olderUser.name = "Thor Odin Son";
        olderUser.birthday = LocalDate.parse("1901-04-06");

        System.out.println(youngerUser.name+" birthdate is "+youngerUser.birthday);
        System.out.println(youngerUser.age()+" is his current age");

        System.out.println(olderUser.name+" birthdate is "+olderUser.birthday);
        System.out.println(olderUser.age()+" is his current age");
    }
}
