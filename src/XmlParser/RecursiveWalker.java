/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XmlParser;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
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
        }else{
            //resultado += actual.getNodeType();
            if(actual.getNodeType()==Node.ELEMENT_NODE){
                resultado += actual.getNodeName();
            }
            else if (actual.getNodeType()==Node.TEXT_NODE){
                resultado+=actual.getTextContent();
            }
            else if(actual.getNodeType() == Node.ATTRIBUTE_NODE){
                resultado+="Tag: " + actual.getLocalName() + "Value: " +actual.getNodeValue() ;
            }
        }
        return resultado;
    }
}
