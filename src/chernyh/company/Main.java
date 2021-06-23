package chernyh.company;

import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Vector vector1= new Vector(3,5,7);
        Vector vector2=new Vector(4,6,9);
        System.out.println(vector1.scalar(vector2));


	// write your code here
    }
}

class Vector {

    private final int x;
    private final int y;
    private final int z;
}
  public Vector (int x; int y; int z) {
    this.x=x;
    this.y=y;
    this.z=z;
  }

    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }
    public double scalarProduct(Vector vector) {
        return x * vector.x + y * vector.y + z * vector.z;
    }
    public Vector crossProduct(Vector vector) {
        return new Vector(
                y * vector.z - z * vector.y,
                z * vector.x - x * vector.z,
                x * vector.y - y * vector.x);
        public double cos(Vector vector) {
            return scalarProduct(vector) / (length() * vector.length());
        }
        public Vector add(Vector vector) {
            return new Vector(
                    x + vector.x,
                    y + vector.y,
                    z + vector.z
            );
        }

        public Vector subtract(Vector vector) {
            return new Vector(
                    x - vector.x,
                    y - vector.y,
                    z - vector.z
            );
        }
        public static Vector[] generate(int n){
            Vector[] vectors = new Vector[n];
            for(int i =0; i < n; i++){
                vectors[i] = new Vector(Math.random(), Math.random(), Math.random());
            }
            return vectors;

        }






