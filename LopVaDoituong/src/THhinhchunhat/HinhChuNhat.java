package THhinhchunhat;

public class HinhChuNhat {
    int width;
    int height;

    public HinhChuNhat() {
    }

    public HinhChuNhat(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public int getArea() {
        return this.width*this.height;
    }
    public int getPerimeter() {
        return (this.width+this.height)*2;
    }
    public String display() {
        return "THhinhchunhat.HinhChuNhat{"+"width="+width+", height="+height+"}";
    }
}
