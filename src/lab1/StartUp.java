/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab1;

/**
 *
 * @author gcorcoran
 */
public class StartUp {
    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        System.out.println(invoice.getDueDate());
        System.out.println(invoice.getDueDateAsString());
    }
}
