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
    private String recursiveWalk(Node actual){
        String resultado="";
       if (actual.hasChildNodes()){
        NodeList childrens = actual.getChildNodes();
            for (int i = 0; i<childrens.getLength(); i++){
                resultado+=recursiveWalk(childrens.item(i));
            }
        }
        switch (actual.getNodeType()) {
            case Node.ELEMENT_NODE:
                   resultado+="elemento: " + actual.getNodeName() + "\n";
                   break;
            case Node.TEXT_NODE:
                if (actual.getNodeValue().trim().matches("")){}
                else{
                    resultado +="Texto: " + actual.getNodeValue().trim()+ "\n";
                }   break;
            default:
                break;
        }
        if (actual.hasAttributes()){
            for (int i = 0; i < actual.getAttributes().getLength(); i++) {
                Attr atributo = (Attr) actual.getAttributes().item(i);
                resultado+="atributo: "+ atributo.getName() + " Valor: " + atributo.getValue().trim() + "\n";
            }
        }
        return resultado;
    }

    @Override
    public String toString() {
        return recursiveWalk(this.raiz);
    }
    
}
