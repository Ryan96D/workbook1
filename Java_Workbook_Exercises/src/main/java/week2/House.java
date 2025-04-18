package week2;

public class House {

    String color;
    double price;
    int doors;
    String material;
    boolean isLocked;
    int floors;
    String location;

    public void details(){
        System.out.println();
        System.out.println("Details:\n");
        System.out.println("Color: "+color+"\n"+
                "Price: $"+String.format("%.2f",price)+"\n"+
                "Door amount: "+doors+"\n"+
                "Material make: "+material+"\n"+
                "is it locked?: "+isLocked+"\n"+
                "How many floors?: "+floors+"\n"+
                "Location: "+location+"\n");
    }

    public void houseParty(){
        System.out.println("  ♬♬ ヽ(๑╹◡╹๑)ﾉ ♬♬   The house is now open to guests!  ♬＼(^。^ )/♬ ");

    }
}
