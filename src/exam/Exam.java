/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exam {

  
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("File.txt"));
            String dateString = br.readLine();
            br.close();

            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            Date birthday = format.parse(dateString);

            int age = calculateAge(birthday);
            System.out.println("Your age is: " + age + " years");

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    public static int calculateAge(Date birthday) {
        Date currentDate = new Date();

        int years = currentDate.getYear() - birthday.getYear();
        int currentMonth = currentDate.getMonth();
        int birthMonth = birthday.getMonth();
        if (birthMonth > currentMonth || (birthMonth == currentMonth && birthday.getDate() > currentDate.getDate())) {
            years--;
        }
        return years;

    }
}
