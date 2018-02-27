/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientjavawsperiodictable;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 *
 * @author gonca
 */

@Root(name = "Table")
public class atomTable{
    @Element(name = "ElementName")
    private String ElementName;

    public String getElementName() {
        return ElementName;
    }
}