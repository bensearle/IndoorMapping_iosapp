package bensearle.mapper_3.Structures;

/**
 * Created by bensearle on 20/05/2016.
 */
public class Circle3D {
    public Point3D Centre;
    public double Radius;


    public Circle3D (double x, double y, double z, double r){
        Centre.X=x;
        Centre.Y=y;
        Centre.Z=z;
        Radius=r;
    }

    public Circle3D (Point3D centre, double r){
        Centre = centre;
        Radius=r;
    }

    /**
     * increase the radius by an amount
     * @param r
     * @return this object
     */
    public Circle3D RadiusIncrease(double r){
        Radius += r;
        return this;
    }
}
