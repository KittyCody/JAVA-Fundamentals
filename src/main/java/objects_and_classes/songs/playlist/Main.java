package objects_and_classes.songs.playlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countSongs = Integer.parseInt(scanner.nextLine());
        List<Song> songsList = new ArrayList<Song>();

        for(int count = 1; count <= countSongs; count++) {
             String data = scanner.nextLine();
           String[] songData = data.split("_");
            String typeList = songData[0];
                    String title = songData[1];
                    String time = songData[2];


                    Song song = new Song(typeList, title, time);
                    songsList.add(song);
        }

        String command = scanner.nextLine();

        if(command.equals("all")) {
            for(Song song : songsList) {
                System.out.println(song.getTitle());
            }
        } else{
            for(Song song : songsList) {
                if(song.getTypeList().equals(command)){
                    System.out.println(song.getTitle());
                }
            }
        }
        scanner.close();
    }
}
