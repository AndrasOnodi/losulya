/*
* File: Losulya.java
* Author: Ónodi András Péter
* Copyright: 2025, Ónodi András Péter
* Group: Szoft II-2-N
* Date: 2025-03-31
* Github: https://github.com/AndrasOnodi/
* Licenc: MIT
*/

import java.util.Scanner;

public class Losulya {
    public void sulyMeres() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Adja meg a ló mellkasának kerületét centiméterben: ");
        double elsoSzam = scanner.nextDouble();
        
        System.out.print("Adja meg a ló hosszát centiméterben: ");
        double masodikSzam = scanner.nextDouble();

        double eredmeny = (Math.pow(elsoSzam, elsoSzam) * masodikSzam )/ 11877;

        System.out.println("A megadott ló súlya: " + eredmeny+ " kiló!");

        scanner.close();
    }
}
