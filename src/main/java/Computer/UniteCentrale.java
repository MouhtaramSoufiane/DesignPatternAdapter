package Computer;

public class UniteCentrale{
    private VGA vga;

    public  void print(String message){
        System.out.println("******************");
        vga.print(message);
        System.out.println("******************");
    }

    public void setVga(VGA vga) {
        this.vga = vga;
    }
}
