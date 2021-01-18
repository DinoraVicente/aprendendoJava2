package entities.ExerciseProduct;

public class ImportedProduct extends Product{
    private Double customsFee;

    public ImportedProduct(){
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

//    public String priceTag(){
//
//    }
}
