public class CallStudent {
    public static void main(String[] args) {
        System.out.println("Hello World...");
        Student sarinee = new Student();
        System.out.println("Object sarinee = "+sarinee);
        sarinee.addCours();
        sarinee.dropCourse();
        sarinee.payment();
        sarinee.enrollment();       
        
        //crete object GraduateStudent
        GraduateStudent momey = new GraduateStudent();
        System.out.println("Object momey = "+momey);
        momey.oralExanation();
        momey.thesisExanation();
        momey.enrollment();
        momey.addCours();
        momey.dropCourse();
        momey.payment();
    }
}
