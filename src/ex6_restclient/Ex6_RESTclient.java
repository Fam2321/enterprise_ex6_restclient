/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex6_restclient;

import util.Ex6JerseyClient;

/**
 *
 * @author 60050257
 */
public class Ex6_RESTclient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ex6JerseyClient obj = new Ex6JerseyClient();
        System.out.println(obj.getArea("5"));
        System.out.println(obj.getCircumference("5"));
    }
    
}
