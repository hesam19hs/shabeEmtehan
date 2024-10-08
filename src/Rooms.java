public class Rooms {
    private String number;
    private String bedNum;
    private String option;
    public Rooms(String number, String bedNum, String option) {
        this.number = number;
        this.bedNum = bedNum;
        this.option = option;
    }
    @Override
    public String toString() {
        return "Rooms{" +
                "number='" + number + '\'' +
                ", bedNum='" + bedNum + '\'' +
                ", option='" + option + '\'' +
                '}';
    }
}
