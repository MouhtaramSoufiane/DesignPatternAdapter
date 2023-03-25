package Computer;

public class TV implements Hdmi{

    @Override
    public void view(byte[] message) {
        System.out.println("--------------------");
        String data=new String(message);
        System.out.println(data);
        System.out.println("--------------------");

    }
}
