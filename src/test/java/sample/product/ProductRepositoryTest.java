package sample.product;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductRepositoryTest {

    @Test
    public void getProductFound() {
        Product p=ProductRepository.getProduct("P001");
        Assert.assertNotNull("Product should not be null",p);
        Assert.assertEquals("CUP",p.getName());
    }

    @Test
    public void getProductNotFound() {
        Product p=ProductRepository.getProduct("X001");
        Assert.assertNull("product should  be null",p);
    }
}