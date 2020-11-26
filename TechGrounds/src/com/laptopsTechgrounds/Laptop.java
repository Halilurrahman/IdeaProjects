package com.laptopsTechgrounds;

import java.util.Comparator;


public class Laptop {
    private String brand;
    private String model;
    private int price;

    public Laptop(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static Comparator<Laptop> BrandComparatorAToZ = new Comparator<Laptop>() {

        public int compare(Laptop l1, Laptop l2) {
            String LaptopBrand1 = l1.getBrand().toUpperCase();
            String LaptopBrand2 = l2.getBrand().toUpperCase();

            //ascending order
            return LaptopBrand1.compareTo(LaptopBrand2);

            //descending order
            //return StudentName2.compareTo(StudentName1);
        }
    };
    public static Comparator<Laptop> BrandComparatorZToA = new Comparator<Laptop>() {

        public int compare(Laptop l1, Laptop l2) {
            String LaptopBrand1 = l1.getBrand().toUpperCase();
            String LaptopBrand2 = l2.getBrand().toUpperCase();

            //ascending order
//            return LaptopBrand1.compareTo(LaptopBrand2);

            //descending order
            return LaptopBrand2.compareTo(LaptopBrand1);
        }
    };
    /*Comparator for sorting the list by roll no*/
    public static Comparator<Laptop> SortLaptopByPriceLowToHigh = new Comparator<Laptop>() {

        public int compare(Laptop s1, Laptop s2) {

            int price1 = s1.getPrice();
            int price2 = s2.getPrice();

            /*For ascending order*/
            return price1 - price2;

            /*For descending order*/
            //price2-price1;
        }

    };
    public static Comparator<Laptop> SortLaptopByPriceHighToLow = new Comparator<Laptop>() {

        public int compare(Laptop s1, Laptop s2) {

            int price1 = s1.getPrice();
            int price2 = s2.getPrice();


            /*For descending order*/
            return price2-price1;
        }};
    @Override
    public String toString() {
        return "Brand: " + brand + "\nModel: " + model + "\nPrice= $" + price+"\n";
    }

}

