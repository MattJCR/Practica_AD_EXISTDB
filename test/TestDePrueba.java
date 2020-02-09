/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import interfazad.Departamento;
import interfazad.Empresa;
import interfazad.GestorDeFicheros;
import interfazad.Smartphone;
import interfazad.Usuario;
import java.util.ArrayList;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Matt Workstation
 */
public class TestDePrueba {
    
    public TestDePrueba() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void test_constructor_clase_Smartphone(){
        Smartphone phone = new Smartphone("Modelo",100,5.2,"Firmware");
        Assert.assertEquals("Modelo", phone.getModelo());
        Assert.assertEquals(100, phone.getBateria());
        Assert.assertEquals(5.2, phone.getVersion());
        Assert.assertEquals("Firmware", phone.getFirmware());
    }
    @Test
    public void test_constructor_clase_Usuario(){
        Usuario user = new Usuario(0,"00001D","Mateo","Cabello","666000111","Sony Z2");
        Assert.assertEquals(0, user.getId());
        Assert.assertEquals("00001D", user.getDni());
        Assert.assertEquals("Mateo", user.getNombre());
        Assert.assertEquals("Cabello", user.getApellidos());
        Assert.assertEquals("666000111", user.getTelefono());
        Assert.assertEquals("Sony Z2", user.getSmartphone());
    }
    @Test
    public void test_constructor_clase_Departamento(){
        Departamento dep = new Departamento(1,"Nombre","Especialidad",true,"00001D");
        Assert.assertEquals(1, dep.getNumero());
        Assert.assertEquals("Nombre", dep.getNombre());
        Assert.assertEquals("Especialidad", dep.getEspecialidad());
        Assert.assertEquals(true, dep.getEstado());
        Assert.assertEquals("00001D", dep.getUsuario());
    }
    @Test
    public void test_constructor_clase_Empresa(){
        Empresa emp = new Empresa(100,"Empresa","Tipo",100.50,"Departamento");
        Assert.assertEquals(100, emp.getCodigo());
        Assert.assertEquals("Empresa", emp.getNombre());
        Assert.assertEquals("Tipo", emp.getTipo());
        Assert.assertEquals(100.50, emp.getValor());
        Assert.assertEquals("Departamento", emp.getDepartamento());
    }
    @Test
    public void test_write_and_read_file(){
        ArrayList writeData = new ArrayList();
        String modelos[] = {"Sony Xperia Z2","Iphone 4","Pocophone F1"};
        double versiones[] = {25.0,6.3,28.2};
        int baterias[] = {3000,3000,4000};
        String firmwares[] = {"2343AS567F.SonyXperia","OSI22F34.Apple","198673675.Xiaomi"};
        for (int i=0; i < modelos.length; i++){ 
            writeData.add(new Smartphone(modelos[i],baterias[i],versiones[i],firmwares[i]));
        }
        ArrayList readData = new ArrayList();
        GestorDeFicheros.EscribirObjetoFichero(writeData, "data.test");
        readData = GestorDeFicheros.LeerObjetoFichero("data.test", 0);
        Smartphone x,y;
        for (int i = 0; i < readData.size(); i++) {
            x = (Smartphone) writeData.get(i);
            y = (Smartphone) readData.get(i);
            Assert.assertEquals(x.getModelo(), y.getModelo());
            Assert.assertEquals(x.getVersion(), y.getVersion());
            Assert.assertEquals(x.getBateria(), y.getBateria());
            Assert.assertEquals(x.getFirmware(), y.getFirmware());
        }
        
    }
}
