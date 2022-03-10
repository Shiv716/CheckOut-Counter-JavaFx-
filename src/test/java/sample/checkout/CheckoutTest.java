package sample.checkout;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sample.product.ProductRepository;

import static org.junit.Assert.*;

public class CheckoutTest {
    Checkout checkout=new Checkout();

    @Before
    public void setup(){
        checkout.getCheckoutList().add(ProductRepository.getProduct("P001"));
        checkout.getCheckoutList().add(ProductRepository.getProduct("P002"));
    }

    @Test
    public void getTotal() {
        String displayTotal=checkout.getTotal();
        Assert.assertNotNull(displayTotal);
        Assert.assertEquals("1.5",displayTotal);
    }
}