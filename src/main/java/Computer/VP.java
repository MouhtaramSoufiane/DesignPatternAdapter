package Computer;

public class VP implements VGA{
    @Override
    public void print(String message) {
        System.out.println("********Computer.VP*********");
        System.out.println(message);
        System.out.println("********Computer.VP********");
    }
}
