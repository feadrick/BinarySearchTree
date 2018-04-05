/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BSTpkg;

/**
 *
 * @author User
 */
public class BST
{
 private class BSTNode
 {
 private BSTNode left, right;
 private int data;

 /* Constructor */
 public BSTNode()
 {}
 /* Constructor */
 public BSTNode(int n)
 {
 data = n;
 }
 }

 private BSTNode root;
 /* Constructor */
 public BST()
 {
 root = null;
 }
 /* Function to check if tree is empty */
 public boolean isEmpty()
 {
 return root == null;
 }
 /* Functions to insert data */
 public void insert(int data)
 {
 root = insert(root, data);
 }
 /* Function to insert data recursively */
 private BSTNode insert(BSTNode node, int data)
 {
 if (node == null)
 node = new BSTNode(data);
 else
 {
 if (data <= node.data)
 node.left = insert(node.left, data);
 else
 node.right = insert(node.right, data);
 }
 return node;
 }
 
/* Functions to delete data */
 public void delete(int k)
 {
 if (isEmpty())
 System.out.println("Tree Empty");
 else if (search(k) == false)
 System.out.println("Sorry "+ k +" is not present");
 else
 {
 root = delete(root, k);
 System.out.println(k+ " deleted from the tree");
 }
 }
 private BSTNode delete(BSTNode root, int k)
 {
 BSTNode p, p2, n;
 if (root.data == k)
 {
 BSTNode lt, rt;
 lt = root.left;
 rt = root.right;
 if (lt == null && rt == null)
 return null;
 else if (lt == null)
 {
 p = rt;
return p;
 }
 else if (rt == null)
 {
 p = lt;
return p;
 }
 else
 {
 p2 = rt;
p = rt;
while (p.left != null)
 p = p.left;
 p.left = lt;
 return p2;
 }
 }
 if (k < root.data)
 { n = delete(root.left, k);
 root.left = n;
 }
 else
 {
 n = delete(root.right, k);
 root.right = n;
 }
 return root;
 }
 public int countNodes()
 {
 return countNodes(root);
 }
 /* Function to count number of nodes recursively */
 private int countNodes(BSTNode r)
 {
     int i=1;
  if(r!=null){
      if(r.right!=null){
      
      }
      
      if(r.left!=null){
      
      }
  }
  return i;
 }
 /* Functions to search for an element */
 public boolean search(int val)
 {
 return search(root, val);
 }
 /* Function to search for an element recursively */
 private boolean search(BSTNode r, int val)
 {
 boolean found = false;
 while ((r != null) && !found)
 {
 int rval = r.data;
 if (val < rval)
 r = r.left;
 else if (val > rval)
 r = r.right;
 else
 {
 found = true;
break;
 }
 found = search(r, val);
 }
 return found;
 }
 /* Function for inorder traversal */
 public void inorder()
 {
 inorder(root);
 }
 private void inorder(BSTNode r)
 {
 if (r != null)
 {
 inorder(r.left);
 System.out.print(r.data +" ");
 inorder(r.right);
 }
 }
 
/* Function for preorder traversal */
 public void preorder()
 {
 preorder(root);
 }
 private void preorder(BSTNode r)
 {
     if(r!=null){
     System.out.print(r.data+" ");
     preorder(r.left);
     preorder(r.right);
     }
 }
 /* Function for postorder traversal */
 public void postorder()
 {
 postorder(root);
 }
 private void postorder(BSTNode r)
 {
     if(r!=null){
         postorder(r.left);
         postorder(r.right);
         System.out.print(r.data+" ");
     }
 }
 /* Function for finding max value */
 public void findMax()
 {
 if(isEmpty())
 System.out.println("Empty");
 else
 System.out.println("Max: "+findMax(root));
 }
 private int findMax(BSTNode node)
 {
     int max=0;
     if(node.right!=null){
         max=node.data;
       return findMax(node.right);
     }else{
       return node.data;
     }

 }
}