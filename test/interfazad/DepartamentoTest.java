/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazad;

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
public class DepartamentoTest {
    
    public DepartamentoTest() {
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

    /**
     * Test of setNumero method, of class Departamento.
     */
    @Test
    public void testSetNumero() {
        System.out.println("setNumero");
        int numero = 100;
        Departamento instance = new Departamento();
        instance.setNumero(numero);
        // TODO review the generated test code and remove the default call to fail.
        Assert.assertEquals(100, instance.getNumero());
    }

    /**
     * Test of setNombre method, of class Departamento.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "Mateo";
        Departamento instance = new Departamento();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        Assert.assertEquals("Mateo", instance.getNombre());
    }

    /**
     * Test of setEspecialidad method, of class Departamento.
     */
    @Test
    public void testSetEspecialidad() {
        System.out.println("setEspecialidad");
        String especialidad = "Especialidad";
        Departamento instance = new Departamento();
        instance.setEspecialidad(especialidad);
        // TODO review the generated test code and remove the default call to fail.
        Assert.assertEquals("Especialidad", instance.getEspecialidad());
    }

    /**
     * Test of setEstado method, of class Departamento.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        boolean Estado = false;
        Departamento instance = new Departamento();
        instance.setEstado(Estado);
        // TODO review the generated test code and remove the default call to fail.
        Assert.assertEquals(false, instance.getEstado());
    }

    /**
     * Test of setUsuario method, of class Departamento.
     */
    @Test
    public void testSetUsuario() {
        System.out.println("setUsuario");
        String Usuario = "12345678C";
        Departamento instance = new Departamento();
        instance.setUsuario(Usuario);
        // TODO review the generated test code and remove the default call to fail.
        Assert.assertEquals("12345678C", instance.getUsuario());
    }
}
