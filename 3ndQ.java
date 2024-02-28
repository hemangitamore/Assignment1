class Student {
    String name;
    int sub1;
    int sub2;
    int sub3;
   

    public Student(String name,int sub1,int sub2,int sub3) {
        this.name = name;
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    void assignValue(String n,int s1,int s2,int s3) {
         name=n;
         sub1=s1;
         sub2=s2;
         sub3=s3;

        
    }
    
    void avrage(){
    int avg=((s1+s2+s3)/3);
     return avg;
}

    public static void main(String args[]) {
        Student student1 =new Student();
        student1.assignValue("Hemangi",45,35,78)
      
        
        System.out.println("Student "+student1.name +"Marks average is"+student1.avrage());
         
        


    }
}
