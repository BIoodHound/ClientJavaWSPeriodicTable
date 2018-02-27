/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientjavawsperiodictable;
import javax.xml.ws.WebServiceRef;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import java.util.Scanner;
/**
 *
 * @author gonca
 */
public class Main {

    @WebServiceRef(wsdlLocation = "META-INF/wsdl/www.webservicex.com/periodictable.asmx.wsdl")
    private static Periodictable service;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        while(true){
            System.out.println("Enter an element to learn more about it\nfor a list of elements type 'list' for a full list of all elements");
            Scanner s = new Scanner(System.in);
            String res = s.nextLine();
            if(res.equals("list")){
                atomList();
            } else {atomData(res);}
        }
    }
    private static void atomList(){
        try{
            Serializer serializer = new Persister();
            String atomSource = getAtoms();
            atomDataSet atomDataSet = new atomDataSet();
            serializer.read(atomDataSet, atomSource);
            int i = 0;
            while(i<atomDataSet.getAtomTables().size()){
                System.out.println(atomDataSet.getAtomTables().get(i).getElementName());
                i++;
            }
            
        } catch(Exception e) {
            System.out.println("You done goof good sir");
        }
    }
            
    private static void atomData(String elementName){
        try {
            Serializer serializer = new Persister();
            String source = getAtomicNumber(elementName);
            DataSet DataSet = new DataSet();
            serializer.read(DataSet, source);

            System.out.println(DataSet.getTable().getElementName());
            System.out.println("Atomic number of " + elementName + ": "+ DataSet.getTable().getAtomicNumber());
            System.out.println("Symbol: " + DataSet.getTable().getSymbol());
            System.out.println("Atomic weight: " + DataSet.getTable().getAtomicWeight());
            System.out.println("Boiling point: " + DataSet.getTable().getBoilingPoint());
            System.out.println("Ionisation potential: " + DataSet.getTable().getIonisationPotential());
            System.out.println("Electro negativity: " + DataSet.getTable().getEletroNegativity());
            System.out.println("Atomic radius: " + DataSet.getTable().getAtomicRadius());
            System.out.println("Melting point: "+ DataSet.getTable().getMeltingPoint());
            System.out.println("Density: "+ DataSet.getTable().getDensity());
        } catch (Exception e) {
            System.out.println("Not a valid element");
        }
        
    }

    private static String getAtomicNumber(java.lang.String elementName) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        clientjavawsperiodictable.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getAtomicNumber(elementName);
    }

    private static String getAtomicWeight(java.lang.String elementName) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        clientjavawsperiodictable.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getAtomicWeight(elementName);
    }

    private static String getAtoms() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        clientjavawsperiodictable.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getAtoms();
    }

    private static String getElementSymbol(java.lang.String elementName) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        clientjavawsperiodictable.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getElementSymbol(elementName);
    }
    
   
}

