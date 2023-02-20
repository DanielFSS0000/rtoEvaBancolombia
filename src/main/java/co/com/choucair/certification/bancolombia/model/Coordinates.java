package co.com.choucair.certification.bancolombia.model;

public class Coordinates {
    private int [] btnarry = {120,162,191,52,21,185,198,192,80,82,182,18};
    private int [] sumarray = {1439,1681,1668,1136,1726,1512,1602,1159,1560,1350,1530,1263};

    private int repite = 12;

    public int getRepite(){return repite;}

    public int [] getSumArray(){
        this.sumarray = sumarray;
        return sumarray;
    }

    public int [] getBtnArray(){
        this.btnarry = btnarry;
        return btnarry;
    }
}
