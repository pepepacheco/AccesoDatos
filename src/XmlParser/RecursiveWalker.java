/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XmlParser;
import org.w3c.dom.*;
/**
 *
 * @author matinal
 */
public class RecursiveWalker {
    private Node raiz;

    public RecursiveWalker(Node raiz) {
        this.raiz = raiz;
    }

    public RecursiveWalker() {
    }

    public Node getRaiz() {
        return raiz;
    }

    public void setRaiz(Node raiz) {
        this.raiz = raiz;
    }
    static public String recursiveWalk(Node actual/*,Node padre*/){
        String resultado="";
       if (actual.hasChildNodes()){
        NodeList childrens = actual.getChildNodes();
            for (int i = 0; i<childrens.getLength(); i++)
            {
                resultado+=recursiveWalk(childrens.item(i));           
            }
        }
            //resultado += actual.getNodeType();
            if(actual.getNodeType()==Node.ELEMENT_NODE){
                if (actual.hasAttributes()){
                    for (int i = 0; i < actual.getAttributes().getLength(); i++) {
                     Attr atributo = (Attr) actual.getAttributes().item(i);   
                     resultado+="Elemento: "+ atributo.getName() + " Valor: " + atributo.getValue().trim() + " ";
                    }
                }
            }
            else if (actual.getNodeType()==Node.TEXT_NODE){
                if (actual.getNodeValue().trim().matches("")){}
                else{
                    resultado +=actual.getNodeName() + ": " +  actual.getNodeValue().trim()+ " ";
                }
            }
            else{}
        return resultado;
    }
}
