/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package profAllan.ExemploArvore;

import java.util.*;

/**
 *
 * @author allan
 */
public class Principal {

    public static void main(String[] args) {
        Random rand = new Random();                     
        Arvore tree = new Arvore(); 
        
        for (int i = 0; i < 10; i++) {
            tree.insert(rand.nextInt(100), tree.root);  
        }
        System.out.println("\nPRE-ORDEM:");
        tree.preOrder(tree.root);                       
        System.out.println("\nIN-ORDEM:");
        tree.inOrder(tree.root);                        
        System.out.println("\nPOST-ORDEM:");
        tree.postOrder(tree.root);                      
    }
}
