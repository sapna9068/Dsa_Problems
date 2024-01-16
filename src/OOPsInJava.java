
 class BankAccount{
    public String username;
    private String password;
     void setPassword(String pwd){
        this.password=pwd;
    }

     public String getPassword() {
         return password;
     }
 }



public class OOPsInJava {

    public static void main(String[] args) {
        Student st=new Student("sapna",23,67.9);
        Student st2=new Student("saaaapna",26,673.9);

        BankAccount b=new BankAccount();
        b.username="sapnakashyap";
        b.setPassword("sfyhykgadhh");
        System.out.println(b.getPassword());
        System.out.println(b.username);











//        System.out.println(st.marks+" "+ st.rollno+" "+st.name);
//        System.out.println(st2.marks+" "+ st2.rollno+" "+st2.name);

    }
}
