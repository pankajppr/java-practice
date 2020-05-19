package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListStreamsExample {

  public static void main(String[] args) {
    List<Product> productsList = new ArrayList<Product>();
    // Adding Products
    productsList.add(new Product(1, "HP Laptop", 25000f));
    productsList.add(new Product(2, "Dell Laptop", 30000f));
    productsList.add(new Product(3, "Lenevo Laptop", 28000f));
    productsList.add(new Product(4, "Sony Laptop", 28000f));
    productsList.add(new Product(5, "Apple Laptop", 90000f));
    List<Product> productPriceList2 = productsList.stream()
    											  .filter(p -> p.price > 28000)// filtering data
    											  .collect(Collectors.toList()); // collecting as list
    System.out.println(productPriceList2);


    productsList.stream()
    			.filter(product -> product.price == 30000)
    			.forEach(product -> System.out.println(product.name));
  }

}


class Product {
  int id;
  String name;
  float price;

  public Product(int id, String name, float price) {
    this.id = id;
    this.name = name;
    this.price = price;
  }

  @Override
  public String toString() {
    return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
  }


}
