class Grade extends Student{
   private int score;
   
   Grade(String fname,String lname,int p, int scr){
         super(fname, lname, p);
         score = scr;
   }
    
   public String calculate() {
       String grade;
       
       if (score < 40) {
          grade = "D"; 
       } else if (score >= 40 && score < 60) {
          grade = "B"; 
       } else if (score >= 60 && score < 75) {
          grade = "A"; 
       } else if (score >= 75 && score < 90) {
          grade = "E"; 
       } else {
          grade = "O"; 
       } 
       
       return grade;
   }

    
}