/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.genererowanietablicrejestracyjnych;

import java.util.Random;

/**
 *
 * @author hp
 */
public class LicencePlateDrawing {
    public static String generateLicencePlate() {
        char firstLetter = Main.oznaczenieWybranegoWojewodztwa.charAt(0);
        
        Random random = new Random();
        StringBuilder licencePlate = new StringBuilder();
        licencePlate.append(firstLetter);
        for (int i = 0; i < 2; i++) {
            char randomChar = (char) (random.nextInt(26) + 'A');
            licencePlate.append(randomChar);
        }
        
        for (int i = 0; i < 5; i++) {
            int randomDigit = random.nextInt(10);
            licencePlate.append(randomDigit);
        }
        
        return licencePlate.toString();
    }
}
