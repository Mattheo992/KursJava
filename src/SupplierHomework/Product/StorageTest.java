package SupplierHomework.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StorageTest {
    public static void main(String[] args) {
        List<ProductInStorage> productInStorage = new ArrayList<>();
        productInStorage.add(new ProductInStorage("Tv 65 cali", "Sharp", 3499.99, false));
        productInStorage.add(new ProductInStorage("Głośnik bluetooth", "JBL", 149.99, true));
        productInStorage.add(new ProductInStorage("Tv 55 cali", "Samsung", 2499.49, true));
        productInStorage.add(new ProductInStorage("McBook Air M2", "Apple", 5649.99, true));
        Predicate<ProductInStorage> isProductValid = product -> product.getPrice() < 3500 && product.isAvailableAtStock();
        List<ProductInStorage> availableProducts = productInStorage.stream()
                .filter(isProductValid)
                .toList();
        List<ProductInStorage> onlyAvailableProducts = validProduct(productInStorage, isProductValid);
        System.out.println(availableProducts);
        System.out.println();
        System.err.println(onlyAvailableProducts);
        System.out.println(productInStorage);
    }

    public static List<ProductInStorage> validProduct(List<ProductInStorage> products, Predicate<ProductInStorage> isAvailable) {
        List<ProductInStorage> availableProducts = new ArrayList<>();
        for (ProductInStorage product : products) {
            if (isAvailable.test(product)) {
                availableProducts.add(product);
            }
        }
        return availableProducts;
    }
}

