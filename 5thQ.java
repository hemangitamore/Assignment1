class Person {
    int age;
    int height;
    int weight;
    public Person(int age,int height, int weight) {
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

   public Person(){
     this.age=25;
     this.height=5;
     this.weight=57;
}
    


    
    
     void Person1display() {
        System.out.println("age of person1:"+age);
        System.out.println("height of person1:"+height+"feet");
        System.out.println("weight of person1:"+weight+"kg");
    }

    void Person2display() {
        System.out.println("age of person2:"+age);
        System.out.println("height of person2:"+height+"feet");
        System.out.println("weight of person2:"+weight+"kg");
    }

    public static void main(String args[]) {
        Person person1=new Person(24,5,50);
        Person person2=new Person(23,4,48);
        System.out.println("Details of Person1:");
        person1.Person1display();
        System.out.println("Details of Person1:");
        person2.Person2display();

    }
}
