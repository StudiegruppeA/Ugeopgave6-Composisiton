package Assignment1;

public class Window {
    private int widthCM;
    private int heightCM;

    Window(int widthCM, int heightCM) {
        this.widthCM = widthCM;
        this.heightCM = heightCM;
    }

    public int getAreaCM2() {
        return widthCM * heightCM;
    }

    @Override
    public String toString() {
       return "[ Width: " + widthCM + " Height: " + heightCM + " Area cm²" + getAreaCM2() + " ]";
    }
}
