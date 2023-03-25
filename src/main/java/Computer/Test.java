package Computer;

import Adapter.HdmiVgaAdapter;
import Adapter.HdmiVgaAdapterH;

public class Test {
    public static void main(String[] args) {




        UniteCentrale uniteCentrale3=new UniteCentrale();
        uniteCentrale3.setVga(new VP());
        uniteCentrale3.print("travers VP");
        UniteCentrale uniteCentrale=new UniteCentrale();
        HdmiVgaAdapter hdmiVgaAdapter=new HdmiVgaAdapter();
        uniteCentrale.setVga(hdmiVgaAdapter);
        hdmiVgaAdapter.setHdmi(new TV());
        uniteCentrale.print("Salam");



        HdmiVgaAdapter hdmiVgaAdapter1=new HdmiVgaAdapter();
        hdmiVgaAdapter1.setHdmi(new SuperVP());

        UniteCentrale uniteCentrale1=new UniteCentrale();
        uniteCentrale1.setVga(hdmiVgaAdapter1);
        uniteCentrale1.print("im here");




        HdmiVgaAdapterH hdmiVgaAdapterH=new HdmiVgaAdapterH();
        UniteCentrale uniteCentrale2=new UniteCentrale();
        uniteCentrale2.setVga(hdmiVgaAdapterH);
        uniteCentrale2.print("salam sdia");




    }
}
