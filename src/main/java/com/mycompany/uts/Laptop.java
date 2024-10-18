package com.mycompany.uts;

/**
 * Laptop
 */
public class Laptop extends Komputer{
    public String jnsBaterai;

    public Laptop(){

    }

    public Laptop(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBaterai) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.jnsBaterai = jnsBaterai;
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Jns. Baterai : " + jnsBaterai);
    }
}