package Computer;

public class Ecran implements VGA{
    @Override
    public void print(String message) {
        System.out.println("*******EC*********");
        System.out.println(message);
        System.out.println("*******EC*********");
    }

}
