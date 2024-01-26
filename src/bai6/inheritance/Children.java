package bai6.inheritance;

public class Children extends parent{
    private int childId;

    public Children () {

    }

    public Children(int childIdValue){
        this.childId = childIdValue;
    }

    public void setChildId(int childIdValue) {
        this.childId = childIdValue;
    }

    public int getChildId () {
        return this.childId;
    }
}
