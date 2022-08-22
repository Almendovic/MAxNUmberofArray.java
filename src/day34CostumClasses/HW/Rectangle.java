package day34CostumClasses.HW;

public class Rectangle {






        double base;
        double height;
        double perimeter;
        double area;



        public String toString() {
            return "Rectangle{" +
                    "base=" + base +
                    ", height=" + height +
                    ", perimeter=" + perimeter +
                    ", area=" + area +
                    '}';
        }

        public double calculatePerimeter(){
            perimeter=(2*base)+(2*height);



        return perimeter;}
        public double calculateArea(){

            area=height*base;

       return area ; }

    }














