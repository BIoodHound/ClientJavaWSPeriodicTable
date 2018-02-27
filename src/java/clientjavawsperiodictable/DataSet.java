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


@Root
public class DataSet {

    @Element
    private Table Table;

    public Table getTable() {
        return Table;
    }

    public void setTable(Table Table) {
        this.Table = Table;
    }
}