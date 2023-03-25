package Computer;

public class SuperVP implements VGA,Hdmi{
    @Override
    public void view(byte[] data) {
        String message=new String(data);
        System.out.println("@@@@@@@@@@@@Super VP HDMI@@@@@@@@@@");
        System.out.println(message);
        System.out.println("@@@@@@@@@@@@Super VP HDMI@@@@@@@@@@");
    }
    @Override
    public void print(String message) {
        System.out.println("??????????Super VP VGA?????????");
        System.out.println(message);
        System.out.println("??????????Super VP VGA?????????");
    }
}
