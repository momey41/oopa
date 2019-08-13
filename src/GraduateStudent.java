public class GraduateStudent extends Student{
    private String studyLevel;
    private String thesisAdviser;
    
    public void oralExanation(){
        System.out.println("oralExamination");
    }
    public void thesisExanation(){
        System.out.println("thesisExanation");
    }
    
    
    @Override
    public void payment(){
        System.out.println();
    
    }
    
}//end class
