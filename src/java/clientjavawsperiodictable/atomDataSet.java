/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientjavawsperiodictable;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementArray;
import org.simpleframework.xml.Root;

@Root(name = "NewDataSet")
public class atomDataSet {

    @Element(name = "Table")
    private atomTable atomTables;

    public atomTable getAtomTables() {
        return atomTables;
    }
    
}