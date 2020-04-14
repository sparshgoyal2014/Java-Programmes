package com.company;

public class PC {
    private Case aCase;
    private Monitor monitor;
    protected Motherboard motherboard;

    public PC(Case aCase, Monitor monitor, Motherboard motherboard) {
        this.aCase = aCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp(){
        aCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        // fancy graphics

        monitor.drawPixel(1200,1500, "Blue");
    }

}
