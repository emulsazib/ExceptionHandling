package TriangleException;

public class Main {
    public static void main(String[] args) {
        try{
            Triangle t1=new Triangle(2,2,6);
            checkTriangle(t1);
            System.out.println(t1.toString());
        }catch (IllegalTriangleException e){
            System.out.println(e);
        }


    }
    static void checkTriangle(Triangle t)throws IllegalTriangleException{
        if(t.getSideOne()+t.getSideTwo()<t.getSideThree()||t.getSideTwo()+t.getSideThree()<t.getSideOne()||t.getSideOne()+t.getSideThree()<t.getSideTwo()){
            throw new IllegalTriangleException("Triangle side error");
        }else {
            System.out.println("Okay!");
        }
    }
}
