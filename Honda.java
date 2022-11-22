public class Honda implements Motocycle {

    String name;
    int speed;
    public Honda(){

    }
    public Honda clone(){
        return new Honda(name,speed);

    }
    public Honda(String name, int speed){
        this.name=name;
        this.speed=speed;

    }

    //this method for clone 
    @Override
    public Motocycle makeclone() {
        Motocycle hondaObjcet = null;
        try {
            hondaObjcet=(Motocycle)super.clone();
        } catch (CloneNotSupportedException e) {
            
            e.printStackTrace();
        }
        return hondaObjcet;
    }

    @Override
    public void setName(String name) {
        
        this.name=name;
        
    }

    @Override
    public String getName() {
       
        return name;
    }

    @Override
    public void setSpeed(int speed) {
        
        this.speed = speed;
        
    }

    @Override
    public int getSpeed() {
        
        return speed;
    }
    
    @Override
    public void showinfo() {
        System.out.println(name);
        System.out.println(speed);
    }
    
}
