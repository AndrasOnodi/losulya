/*
* File: App.java
* Author: Ónodi András Péter
* Copyright: 2025, Ónodi András Péter
* Group: Szoft II-2-N
* Date: 2025-03-31
* Github: https://github.com/AndrasOnodi/
* Licenc: MIT
*/

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Név: Ónodi András Péter\n");
        System.out.println("Egy ló súlyának kiszámolása.\n");
        Losulya suly = new Losulya();
        suly.sulyMeres();
    }
}
