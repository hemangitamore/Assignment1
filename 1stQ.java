class Room {
    double height;
    double width;
    double breadth;

    public Room(double height, double width, double breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }

    public double volume() {
        return height * width * breadth;
    }

    public static void main(String args[]) {
        Room myRoom = new Room(9.0, 8.0, 7.0);
        System.out.println("Volume of myRoom is: " + myRoom.volume());
    }
}
