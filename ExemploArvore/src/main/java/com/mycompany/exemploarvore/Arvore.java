/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package profAllan.ExemploArvore;

/**
 *
 * @author allan
 */
public class Arvore {

    No root = null;

    void insert(int info, No place) {
        if (place == null) {
            root = new No(info);
            System.out.print(" " + info);
        } else if (info < place.info) {
            if (place.left == null) {
                place.left = new No(info);
                System.out.print(" " + info);
            } else {
                insert(info, place.left);
            }
        } else if (info > place.info) {
            if (place.right == null) {
                place.right = new No(info);
                System.out.print(" " + info);
            } else {
                insert(info, place.right);
            }
        }
    }

    
    
    
    void preOrder(No place) {
        System.out.print(" " + place.info);
        if (place.left != null) {
            preOrder(place.left);
        }
        if (place.right != null) {
            preOrder(place.right);
        }
    }

    void inOrder(No place) {
        if (place.left != null) {
            inOrder(place.left);
        }
        System.out.print(" " + place.info);
        if (place.right != null) {
            inOrder(place.right);
        }
    }

    void postOrder(No place) {
        if (place.left != null) {
            postOrder(place.left);
        }
        if (place.right != null) {
            postOrder(place.right);
        }
        System.out.print(" " + place.info);
    }
}
