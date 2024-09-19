package objects_and_classes.songs;

public class Song {
    private String typeList;
    private String title;
    private String time;

    //constructor -> creates instances of the class

    public Song(String typeList, String title, String time) {

        this.typeList = typeList;
        this.title = title;
        this.time = time;
    }

    public String getTitle(){
        return title;
    }

    public String getTypeList() {
        return typeList;
    }
}
