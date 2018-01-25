package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Scanner;

@RestController
public class MainController {

    @RequestMapping("/")
    public String showIndex(){
        double sales_tax_due;
        double sales_amount;
        double sales_tax=0;
        int tax_code;
        System.out.println("Enter a value and then go to localhost:8082");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter sales amount:");
        sales_amount = keyboard.nextDouble();
        System.out.println("enter customer tax code:");
        tax_code = keyboard.nextInt();

        if(tax_code ==0)
        sales_tax=0;

        else if(tax_code==1)

       sales_tax=0.03;

        else if(tax_code==2)

        sales_tax=0.05;
        else
            System.out.println("you entered wrong tax code");
        sales_tax_due = sales_amount*(1+sales_tax);

        return "customer sales tax due is:" + sales_tax_due;


    }


}
