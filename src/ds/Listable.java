/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ds;

/**
 *
 * @author Mahesh
 */
interface Listable {
    
      public abstract int compareTo(Listable other);
    
    public abstract Listable copy();
}
