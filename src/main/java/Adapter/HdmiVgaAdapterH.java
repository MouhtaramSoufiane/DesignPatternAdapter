package Adapter;

import Computer.TV;
import Computer.VGA;

public class HdmiVgaAdapterH extends TV implements VGA {
    @Override
    public void print(String message) {
        System.out.println("+++++++++++++++++++");
        byte[] data=message.getBytes();
        super.view(data);
        System.out.println("+++++++++++++++++++");
    }

}
