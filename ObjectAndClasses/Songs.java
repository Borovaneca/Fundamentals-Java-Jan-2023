package Fundamentals.OOP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Songs {

    static class Song {

        private String typeList;
        private String name;
        private String time;

        public Song(String typeList, String name, String time) {
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }

        public String getTypeList() {
            return this.typeList;
        }

        public String getName() {
            return this.name;
        }

        public String getTime() {
            return this.time;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Song> listSongs = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String currentLine = scanner.nextLine();
            String[] inputSongArr = currentLine.split("_");

            Song song = new Song(inputSongArr[0], inputSongArr[1], inputSongArr[2]);

            listSongs.add(song);
        }
        String command = scanner.nextLine();
        if (command.equals("all")) {
            for (Song item : listSongs) {
                System.out.println(item.getName());
            }
        } else {
            for (Song item : listSongs) {
                if (item.getTypeList().equals(command)) {
                    System.out.println(item.getName());
                }
            }
        }
    }
}