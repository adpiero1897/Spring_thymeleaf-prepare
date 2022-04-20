package ru.gb.thymeleafprepare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.gb.thymeleafprepare.entity.Product;
import ru.gb.thymeleafprepare.entity.enums.Status;
import ru.gb.thymeleafprepare.service.ProductService;

import java.math.BigDecimal;
import java.time.LocalDate;


/*1. Сделайте в таблице со списком всех товаров кнопку для добавления товара в корзину.
        2. Сделайте страницу для отображения всех товаров в корзине.
        3. Рядом с каждым товаром в таблице списка продуктов в корзине сделать кнопку “Удалить”, при нажатии на которую
         товар должен быть удален из базы (удаляется связка между Cart и Product).
        4. * Попробуйте реализовать количество товаров в таблице со списком товаров product/all и количество каждого
        продукта в корзине
        5. ** Сделать так чтобы товар добавлялся по одной штуке в корзину и там накапливался, и чтобы в корзине тоже
         можно было управлять количеством товаров*/


@SpringBootApplication
public class ThymeleafPrepareApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(ThymeleafPrepareApplication.class, args);
        ProductService productService = context.getBean(ProductService.class);
//
//        productService.findAll();
//
//        final Product product = productService.save(Product.builder()
//                        .cost(new BigDecimal(50.0))
//                        .status(Status.ACTIVE)
//                        .title("Test")
//                        .manufactureDate(LocalDate.now())
//                .build());
//
//        System.out.println("До " + productService.findById(product.getId()));
//
//        productService.deleteById(product.getId());
//
//        System.out.println("После " + productService.findById(product.getId()));


    }

}
