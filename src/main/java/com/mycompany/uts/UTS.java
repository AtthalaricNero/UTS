
package com.mycompany.uts;


public class UTS {

    public static void main(String[] args) {
        Komputer komputer = new Komputer("MSI", 4, 500, "Intel Core i5");
        komputer.tampilData();
        System.out.println("========================");
        Laptop laptop = new Laptop("Lenovo", 8, 250, "Intel Core i7", "Lithium");
        laptop.tampilData();
        System.out.println("========================");
        Pc pc = new Pc("Acer", 3, 500, "Intel Core i3", 15);
        pc.tampilData();
        System.out.println("========================");
        Windows windows = new Windows("ASUS", 4, 500, "Intel Core i7", "Lithium", "Gaming");
        windows.tampilData();
        System.out.println("========================");
        Mac mac = new Mac("Apple Mac 1", 10, 500, "Apple Bionic 15", "Lithium", "Security");
        mac.tampilData();

    }
}
