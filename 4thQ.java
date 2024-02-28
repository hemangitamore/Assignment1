class Car {
    String color;
    String model;
    double price;
    public Car(String color,String model, double price) {
        this.color = color;
        this.model = model;
        this.price = price;
    }

    
    
     void display() {
        System.out.println("Color of car is:"+color);
        System.out.println("model of car is:"+model);
        System.out.println("Price of car is:"+price+"lakh");
    }

    public static void main(String args[]) {
        Car myCar = new Car("Red","Carmy",13.60);
        System.out.println("Details of car");
        myCar.display();

    }
}
