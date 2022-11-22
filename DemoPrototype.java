public class DemoPrototype {
    public static void main(String[] args) {
       
        Clonefac clonemaker = new Clonefac();
        
        Honda bike = new Honda();
        System.out.println("Before clone");
        bike.setName("cbr1000");
        bike.setSpeed(1000);
        bike.showinfo();

        Honda clonebike = (Honda) clonemaker.getclone(bike);
        System.out.println("After clone");
        clonebike.showinfo();
        //test change value
        System.out.println("Test change value");
        clonebike.setName("cbr500");
        clonebike.setSpeed(500);
        clonebike.showinfo();
    }
    
}
