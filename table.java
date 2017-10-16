
public class table{
    public static void main(String[] args){
        makeTop();
        makerows();
        System.out.println();
    }
    public static void makeTop(){
        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println("==\t\tStudentpoints\t\t==");
        System.out.println("------------------------------------------");
        System.out.println("Name\t\t\tLab\tBonus\tTotal");
        System.out.println("----\t\t\t---\t-----\t-----");
    }
    public static void makerows(){
        populateOneRow("Joe", 43, 7);
        populateOneRow("william",50,8);
        populateOneRow("Mary",39,10);
        populateOneRow("Fidel",500,375);
    }
    public static void populateOneRow(String name, int lab, int bonus){
        System.out.println(name + "\t\t\t"+ lab +"\t" +bonus + "\t" + (bonus + lab));
        
    }
}
