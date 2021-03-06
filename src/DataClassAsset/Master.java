package DataClassAsset;

public class Master extends Bachelor {
    private String tutor;

    public Master(String name, String ID, String gender, String major, String dorm, String tutor) {
        super(name, ID, gender, major, dorm);
        this.tutor = tutor;
    }


    //对抽象方法的具体化
    public String getTutor() {
        return tutor;
    }

    @Override
    public byte getTag() {
        return MA;
    }

    @Override
    public String getVali() {
        return "硕士";
    }
}
