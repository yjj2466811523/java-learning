import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        //Create a list to store cities
        ArrayList<String> cityList= new ArrayList<>();
        cityList.add("London");
        cityList.add("Denver");
        cityList.add("Beijing");
        cityList.add("Hangzhou");
        System.out.println("List size? "+cityList.size());//size?
        System.out.println("Is Hangzhou in the cityList ? "+cityList.contains("Hangzhou"));//contains?
        System.out.println("Is the list empty? "+cityList.isEmpty());
        cityList.add(2,"Guangzhou");
        cityList.remove("London");
        cityList.remove(1);
        System.out.println(cityList.toString());
        for(int i =cityList.size()-1;i>0;i--){
            System.out.print(cityList.get(i)+" ");
        }
        System.out.println();

        ArrayList<CircleFromSimpleGeometricObject> list = new ArrayList<>();

        list.add(new CircleFromSimpleGeometricObject(2));
        list.add(new CircleFromSimpleGeometricObject(3));

        System.out.println("The area of the circle? "+list.get(0).getArea());

    }
}
