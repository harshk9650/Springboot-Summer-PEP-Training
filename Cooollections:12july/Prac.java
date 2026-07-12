package Cooollections;

interface Paarent{
    void magic();
    public static void magix(){
        System.out.println("Here is magix");
    }
}

class Cchild implements  Paarent{
    @Override
    public void magic() {
        System.out.println("pkka nhi kch bhi");
    }
}
public class Prac {
    static void main(String[] args) {
        Paarent paarent = new Cchild();
        paarent.magic();

    }
}
