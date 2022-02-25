// class Person {
      
//     String name;
//     private String getName(){ return name; }

//     String address;
//     private String getName(){ return address; }
     
//     Person(String name){
      
//         this.name=name;
//     }

//     Person(String address){
//     	this.address=address;
//     }
   
//     public void display(){
//         System.out.println("Name: " + name, "Address: " + address);
//     }
// }


// class Student {
// 	String program;
// 	private String getName(){ return program; }

// 	String year;
// 	private String getName(){ return year; }

// 	String fee;
// 	private String getName(){return fee; }

// }










public class Point {
	private int x;
	private int y;

	public Point (int x, int y) {
		Point();
	}

	public String toString() {
		return "Point coordinates: (" + x + "," + y + ")";
	}

	public float getX() {

	}

    public float getY() {

    }

    public void setX(float x) {

    }

    public void setY(float y) {

    }

    public void setXY(float x, float y) {

    }

}


public class TestPoint {
   public static void main(String[] args) {
      Point p1 = new Point(0.0f, 0.0f);   
      
   }
}


class MovablePoint extends Point {
	private int xSpeed;
	private int ySpeed;

	public PointSpeed (float xSpeed, float ySpeed) {
		Point();
	}


	public float getXSpeed() {
		super.getX();
	}

    public float getYSpeed() {
    	super.getY();
    }

    public void setXSpeed(float xSpeed) {
    	super.setX();
    }

    public void setYSpeed(float ySpeed) {
    	super.setY();
    }

    public void setXYSpeed(float xSpeed, float ySpeed) {
    	super.setXY();
    }

}