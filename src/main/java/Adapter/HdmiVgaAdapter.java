package Adapter;
import Computer.Hdmi;
import Computer.TV;
import Computer.VGA;

public class HdmiVgaAdapter extends TV implements VGA{
    private Hdmi hdmi;
    @Override
    public void print(String message) {
        System.out.println("+++++++++++++++++++");
        byte[] data=message.getBytes();
        hdmi.view(data);
        System.out.println("+++++++++++++++++++");
    }

    public void setHdmi(Hdmi hdmi) {
        this.hdmi = hdmi;
    }
}
