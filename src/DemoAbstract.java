import java.util.Scanner;
public class DemoAbstract{
    public static void main(String[] args){
        System.out.println("Name the twp dimensions.");
        Scanner darkly = new Scanner(System.in);
        double a =darkly.nextInt();
        double b =darkly.nextInt();
        shape s1=new shape(dim1,);
        System.out.println("Area of the shape: "+s1.shape());
        s1.displayVolume();
    }
}
