package DataStructure.probs;

import java.util.Scanner;

public class BinarySearchTree {  
public static class Node{  
        int data;  
        Node left;  
        Node right;  
  
        public Node(int data){  
             
            this.data = data;  
            this.left = null;  
            this.right = null;  
        }  
      }  
  
       
      public Node root;  
  
      public BinarySearchTree(){  
          root = null;  
      }  
  
        
      public void insert(int data) {  
           
          Node newNode = new Node(data);  
  
          
          if(root == null){  
              root = newNode;  
              return;  
            }  
          else {  
               
              Node current = root, parent = null;  
  
              while(true) {  
                   
                  parent = current;  
  
                   
                  if(data < current.data) {  
                      current = current.left;  
                      if(current == null) {  
                          parent.left = newNode;  
                          return;  
                      }  
                  }  
                    
                  else {  
                      current = current.right;  
                      if(current == null) {  
                          parent.right = newNode;  
                          return;  
                      }  
                  }  
              }  
          }  
      }  
  
      
     
      
      public void inorderTraversal(Node node) {  
  
        
          if(root == null){  
              System.out.println("Tree is empty");  
              return;  
           }  
          else {  
  
              if(node.left!= null)  
                  inorderTraversal(node.left);  
              System.out.print(node.data + " ");  
              if(node.right!= null)  
                  inorderTraversal(node.right);  
  
          }  
      }  
      boolean search(int key)  { 
          root = search_Recursive(root, key); 
          if (root!= null)
              return true;
          else
              return false;
      } 
     
      //recursive insert function
      Node search_Recursive(Node root, int key)  { 
          // Base Cases: root is null or key is present at root 
          if (root==null || root.data==key) 
              return root; 
          // val is greater than root's key 
          if (root.data > key) 
              return search_Recursive(root.left, key); 
          // val is less than root's key 
          return search_Recursive(root.right, key); 
      } 
  
  
      public static void main(String[] args) {  
  
          BinarySearchTree tree = new BinarySearchTree();  
          //Add nodes to the binary tree  
          tree.insert(56);  
          tree.insert(30);  
          tree.insert(70); 
          tree.insert(11);  
          tree.insert(16);  
          tree.insert(40);
          tree.insert(60);  
          tree.insert(95);  
          tree.insert(63);
  
          System.out.println("Binary search tree after insertion:");  
           
          tree.inorderTraversal(tree.root);  
          boolean ret_val = tree.search (63);
          System.out.println("\nKey 63 found in BST:" + ret_val );
          
  
          
      }


}