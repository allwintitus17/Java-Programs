import java.io.*;

public class demo{
    public static void main(String[] args){
        System.out.println("WELCOME TO THE 3D MODELS CALCULATOR");
        System.out.println("cuboid");
        int length=10;
        int breath=5;
        int height=7;
        int area=4;
        int radius=5;
      
        System.out.println("CUBOID");
        System.out.println("Volume:"+length*breath*height);
        System.out.println("Curved Surface Area:"+2*height*(length+breath));
        System.out.println("Total Surface Area:"+2*(length*breath)+(breath*height)+(height*length));

        System.out.println("CUBE");
        System.out.println("Volume:"+area*area);
        System.out.println("Curved Surface Area:"+4*(area*area));
        System.out.println("Total Surface Area:"+6*(area*area));

        System.out.println("Right Circular cylinder");
        System.out.println("Volume:"+3.14*(radius*radius)*height);
        System.out.println("Curved Surface Area:"+2*3.14*(radius*height));
        System.out.println("Total Surface Area:"+2*2*3.14*radius*(radius+height));

        System.out.println("sphere");
        System.out.println("Volume:"+length*breath*height);
        System.out.println("Curved Surface Area:"+2*height*(length+breath));
        System.out.println("Total Surface Area:"+2*(length*breath)+(breath*height)+(height*length));

        System.out.println("Right circular cone");
        System.out.println("Volume:"+4/3*3.14*radius*radius*radius);
        System.out.println("Curved Surface Area:"+4*3.14*(radius*radius));
        System.out.println("Total Surface Area:"+4*3.14*(radius*radius));

        System.out.println("Hemisphere");
        System.out.println("Volume:"+2/3*3.14*(radius*radius));
        System.out.println("Curved Surface Area:"+2*3.14*(radius*radius));
        System.out.println("Total Surface Area:"+3*3.14*(radius*radius));

    }
}