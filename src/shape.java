abstract class shape {
    double dim1;
    double dim2;
    public shape(double x,double y){
        dim1=x;
        dim2=y;
    }
    abstract double area();
    public double getDim1(){
        return dim1;
    }
}
