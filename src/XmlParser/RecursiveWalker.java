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
    private String recursiveWalk(Node actual, int ident){
        String resultado="";
        String identa ="";
       for (int i = 0; i < ident-1; i++) {
            identa+="#";
        }
        switch (actual.getNodeType()) {
            case Node.ELEMENT_NODE:
                   resultado+=identa +  "elemento: " + actual.getNodeName().trim() + "\n";
                   break;
            case Node.TEXT_NODE:
                if (actual.getNodeValue().trim().matches("")){}
                else{
                    resultado +=identa +"Texto: " + actual.getNodeValue().trim()+ "\n";
                }   break;
            default:
                break;
        }
        if (actual.hasAttributes()){
            for (int i = 0; i < actual.getAttributes().getLength(); i++) {
                Attr atributo = (Attr) actual.getAttributes().item(i);
                resultado+=identa +"atributo: "+ atributo.getName() + " Valor: " + atributo.getValue().trim() + "\n";
            }
        }
        if (actual.hasChildNodes()){
        NodeList childrens = actual.getChildNodes();
            for (int i = 0; i<childrens.getLength(); i++){
                resultado+=recursiveWalk(childrens.item(i),ident+1);
            }
        }
       
        return resultado;
    }

    @Override
    public String toString() {
        return recursiveWalk(this.raiz,0);
    }
    
}
