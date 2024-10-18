package com.mycompany.uts;

public class Windows extends Laptop {
    public String fitur;

    public Windows() {

    }
    public Windows(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBaterai, String fitur) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBaterai);
        System.out.println("Fitur : " + fitur);
    }
}
