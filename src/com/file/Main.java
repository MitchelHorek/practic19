package com.file;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int value = 1;
        while (value != 0) {


            System.out.println("Введите: 1- запись. 2- вывод. 3- замена. 4- добавление. 0- выход.");
            value = Integer.parseInt(reader.readLine());
            switch (value) {
                case 1:
                case 3:
                    try {
                        FileWriter myWriter = new FileWriter("filename.txt");
                        System.out.println("Введите инф для зписи в файл:");
                        myWriter.write(reader.readLine());
                        myWriter.close();
                    } catch (IOException e) {
                        System.out.println("Ошибочка");
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    try {

                        System.out.println("Данные из файла:");
                        FileReader fr = new FileReader("filename.txt");
                        Scanner scan = new Scanner(fr);
                        while (scan.hasNextLine()) {
                            System.out.println(scan.nextLine());
                        }

                        fr.close();
                    } catch (IOException e) {
                        System.out.println("Ошибочка");
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    try {
                        FileWriter myWriter = new FileWriter("filename.txt", true);
                        System.out.println("Введите инф для зписи в файл:");
                        myWriter.write(reader.readLine());
                        myWriter.close();
                    } catch (IOException e) {
                        System.out.println("Ошибочка");
                        e.printStackTrace();
                    }
                    break;
            }

        }
    }
}
