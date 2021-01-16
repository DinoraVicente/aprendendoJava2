package application;

import entities.Order.Client;
import entities.Order.Order;
import entities.Order.OrderItem;
import entities.Order.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ProgramOrder {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdfBirth = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data:");

        System.out.print("Name: ");
        String clientName = sc.nextLine();
        System.out.print("Email: ");
        String clientEmail = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date clientBirth = sdfBirth.parse(sc.next());

        Client client = new Client(clientName, clientEmail, clientBirth);

        System.out.println();
        System.out.println("Enter order data: ");
        System.out.print("Status (PENDING_PAYMENT, PROCESSING, SHIPPED, DELIVERED): ");
        OrderStatus orderStatus = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(), orderStatus, client);

        System.out.print("How many items to this order? ");
        int items = sc.nextInt();

        for(int i=0; i<items; i++){
            System.out.println();
            System.out.printf("Enter #%d item data: %n", i+1);
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int productQuantity = sc.nextInt();

            Product product = new Product(productName, productPrice);

            OrderItem orderItem = new OrderItem(product, productPrice, productQuantity);

            order.addItem(orderItem);
        }

        System.out.println();
        System.out.println(order);

        sc.close();
    }
}
