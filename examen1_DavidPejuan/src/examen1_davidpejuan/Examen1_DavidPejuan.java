/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_davidpejuan;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class Examen1_DavidPejuan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<alumno> a = new ArrayList();
       
        alumno n = new alumno();
        int resp = 0;
        Scanner sc = new Scanner(System.in);
        while (resp != 4) {
            System.out.println("1-crear cuenta: ");
            System.out.println("log in: ");
            System.out.println("crear examen: ");
            System.out.println("Ingrese su respuesta: ");
            resp = sc.nextInt();
            switch (resp) {
                case 1:
                    System.out.println("1-alumno normal\n"
                            + "2-tutor");
                    int resp2 = sc.nextInt();
                    switch (resp2) {
                        case 1:
                            System.out.println("1-ingeniero \n"
                                    + "2-licenciado \n"
                                    + "3-medico");
                            System.out.println("Ingrese seleccion:");
                            int resp3 = sc.nextInt();
                            switch (resp3) {
                                case 1:
                                    System.out.println("Ingrese nombre: ");
                                    String nom = sc.next();
                                    System.out.println("Ingrese edad: ");
                                    int edad = sc.nextInt();
                                    System.out.println("Ingrese carrera: ");
                                    String carrera = sc.next();
                                    System.out.println("Ingrese lugar de nacimiento:");
                                    String naci = sc.next();
                                    System.out.println("Ingrese el numero de cuenta: ");
                                    int cuenta = sc.nextInt();
                                    System.out.println("Ingrese su usuario: ");
                                    String usuario = sc.next();
                                    System.out.println("Ingrese cotraseña: ");
                                    String contra = sc.next();
                                    System.out.println("Ingrese destreza: ");
                                    double des = sc.nextDouble();
                                    System.out.println("Ingrese nivel de comunicacion;");
                                    double comu = sc.nextDouble();
                                    a.add(new ingeniero(des, comu, 0, 0, nom, edad, carrera, naci, cuenta, usuario, contra));
                                    break;
                                case 2:
                                    System.out.println("Ingrese nombre: ");
                                    String nom2 = sc.next();
                                    System.out.println("Ingrese edad: ");
                                    int edad2 = sc.nextInt();
                                    System.out.println("Ingrese carrera: ");
                                    String carrera2 = sc.next();
                                    System.out.println("Ingrese lugar de nacimiento:");
                                    String naci2 = sc.next();
                                    System.out.println("Ingrese el numero de cuenta: ");
                                    int cuenta2 = sc.nextInt();
                                    System.out.println("Ingrese su usuario: ");
                                    String usuario2 = sc.next();
                                    System.out.println("Ingrese cotraseña: ");
                                    String contra2 = sc.next();
                                    System.out.println("Ingrese nivel de interez en las clases");
                                    double interez = sc.nextDouble();
                                    a.add(new licenciado(interez, 0, 0, nom2, edad2, carrera2, naci2, cuenta2, usuario2, contra2));
                                    break;
                                case 3:
                                    System.out.println("Ingrese nombre: ");
                                    String nom3 = sc.next();
                                    System.out.println("Ingrese edad: ");
                                    int edad3 = sc.nextInt();
                                    System.out.println("Ingrese carrera: ");
                                    String carrera3 = sc.next();
                                    System.out.println("Ingrese lugar de nacimiento:");
                                    String naci3 = sc.next();
                                    System.out.println("Ingrese el numero de cuenta: ");
                                    int cuenta3 = sc.nextInt();
                                    System.out.println("Ingrese su usuario: ");
                                    String usuario3 = sc.next();
                                    System.out.println("Ingrese cotraseña: ");
                                    String contra3 = sc.next();
                                    System.out.println("Ingrese soliradidad: ");
                                    double soli = sc.nextDouble();
                                    System.out.println("Ingrese nivel de preocupacion: ");
                                    double preo = sc.nextDouble();
                                    a.add(new medicos(soli, preo, 0, 0, nom3, edad3, carrera3, naci3, cuenta3, usuario3, contra3));
                                    break;
                                default:

                            }
                            break;
                        case 2:
                            System.out.println("Ingrese nombre: ");
                            String nom = sc.next();
                            System.out.println("Ingrese edad: ");
                            int edad = sc.nextInt();
                            System.out.println("Ingrese carrera: ");
                            String carrera = sc.next();
                            System.out.println("Ingrese lugar de nacimiento:");
                            String naci = sc.next();
                            System.out.println("Ingrese el numero de cuenta: ");
                            int cuenta = sc.nextInt();
                            System.out.println("Ingrese su usuario: ");
                            String usuario = sc.next();
                            System.out.println("Ingrese cotraseña: ");
                            String contra = sc.next();
                            ArrayList<String> c = new ArrayList();
                            int respp = 1;
                            while (respp != 2) {
                                System.out.println("Ingrese que clase dara tutoria de: ");
                                String clase = sc.next();
                                c.add(clase);
                                System.out.println("1-agregar otra clase ");
                                System.out.println("2-salir.");
                                respp = sc.nextInt();
                            }
                            System.out.println("Ingrese nivel de esneñanza: ");
                            int ense = sc.nextInt();
                            a.add(new tutor(0, ense, nom, edad, carrera, naci, cuenta, usuario, contra, c));
                            break;
                        default:

                    }
                    break;
                case 2:
                    System.out.println("Ingrese su usuario: ");
                    String usuario = sc.next();
                    System.out.println("Ingrese su contraseña: ");
                    String contra = sc.next();
                    for (int i = 0; i < a.size(); i++) {
                        if (usuario.equals(a.get(i).getUsuario())) {
                            if (contra.equals(a.get(i).getContraseña())) {
                                n = a.get(i);
                            }
                        }
                    }
                    while (n != null) {
                        if (n instanceof normales) {
                            System.out.println("1-modificar datos \n"
                                    + "2-listar datos \n"
                                    + "3-ver examenes pendientes \n"
                                    + "4-ver examenes resueltos \n"
                                    + "5-reservar tutoria \n "
                                    + "6-hacer examen \n"
                                    + "7-log out");
                            int respwh = sc.nextInt();
                            switch (respwh) {
                                case 1:
                                    if (n instanceof ingeniero) {
                                        System.out.println("1- nombre ");
                                        System.out.println("2- edad ");
                                        System.out.println("3- carrera ");
                                        System.out.println("4- lugar de nacimiento");
                                        System.out.println("5- el numero de cuenta ");
                                        System.out.println("6- su usuario ");
                                        System.out.println("7-cotraseña ");
                                        System.out.println("8- destreza ");
                                        System.out.println("9- nivel de comunicacion");
                                        int respmi = sc.nextInt();
                                        switch (respmi) {
                                            case 1:
                                                System.out.println("Ingrese nuevo nombre");
                                                String nuevonomi = sc.next();
                                                n.setNombre(nuevonomi);
                                                break;
                                            case 2:
                                                System.out.println("Ingrese nueva edad: ");
                                                int nuevaedi = sc.nextInt();
                                                n.setEdad(nuevaedi);
                                                break;
                                            case 3:
                                                System.out.println("Ingrese nueva carrera");
                                                String nuevcarrei = sc.next();
                                                n.setCarrera(nuevcarrei);
                                                break;
                                            case 4:
                                                System.out.println("Ingrese nuevo lugar de nacimiento");
                                                String nuevolugari = sc.next();
                                                n.setLugarnacimiento(nuevolugari);
                                                break;
                                            case 5:
                                                System.out.println("Ingrese nuevo numero de cuenta");
                                                int nuevonumcuentai = sc.nextInt();
                                                n.setNumecuenta(nuevonumcuentai);
                                                break;
                                            case 6:
                                                System.out.println("nuevo usuario");
                                                String nuevousuarioi = sc.next();
                                                n.setUsuario(nuevousuarioi);
                                                break;
                                            case 7:
                                                System.out.println("Ingrese nueva contraseña");
                                                String nuevacontraseñai = sc.next();
                                                n.setContraseña(nuevacontraseñai);
                                                break;
                                            case 8:
                                                System.out.println("Ingrese nueva destreza");
                                                double nuevadestreza = sc.nextDouble();
                                                ((ingeniero) n).setDestreza(nuevadestreza);
                                                break;
                                            case 9:
                                                System.out.println("Ingrese nuevo nivel de comunicacion");
                                                double nuevocomu = sc.nextDouble();
                                                ((ingeniero) n).setNivelcomunicacion(nuevocomu);
                                                break;
                                            default:

                                        }

                                    }
                                    if (n instanceof licenciado) {
                                        System.out.println("1-nuevo nombre: ");
                                        System.out.println("2-nuevo edad: ");
                                        System.out.println("3-nuevo carrera: ");
                                        System.out.println("4-nuevo lugar de nacimiento:");
                                        System.out.println("5-nuevo  numero de cuenta: ");
                                        System.out.println("6-nuevo  usuario: ");
                                        System.out.println("7-nuevo cotraseña: ");
                                        System.out.println("8-nuevo nivel de interez en las clases");
                                        int respl = sc.nextInt();
                                        switch (respl) {
                                            case 1:
                                                System.out.println("Ingrese nuevo nombre");
                                                String nuevonomi = sc.next();
                                                n.setNombre(nuevonomi);
                                                break;
                                            case 2:
                                                System.out.println("Ingrese nueva edad: ");
                                                int nuevaedi = sc.nextInt();
                                                n.setEdad(nuevaedi);
                                                break;
                                            case 3:
                                                System.out.println("Ingrese nueva carrera");
                                                String nuevcarrei = sc.next();
                                                n.setCarrera(nuevcarrei);
                                                break;
                                            case 4:
                                                System.out.println("Ingrese nuevo lugar de nacimiento");
                                                String nuevolugari = sc.next();
                                                n.setLugarnacimiento(nuevolugari);
                                                break;
                                            case 5:
                                                System.out.println("Ingrese nuevo numero de cuenta");
                                                int nuevonumcuentai = sc.nextInt();
                                                n.setNumecuenta(nuevonumcuentai);
                                                break;
                                            case 6:
                                                System.out.println("nuevo usuario");
                                                String nuevousuarioi = sc.next();
                                                n.setUsuario(nuevousuarioi);
                                                break;
                                            case 7:
                                                System.out.println("Ingrese nueva contraseña");
                                                String nuevacontraseñai = sc.next();
                                                n.setContraseña(nuevacontraseñai);
                                                break;
                                            case 8:
                                                System.out.println("Ingrese nuevo nivel de interes");
                                                double nuevointerez = sc.nextDouble();
                                                break;
                                            default:
                                                throw new AssertionError();
                                        }
                                        if (n instanceof medicos) {
                                            System.out.println("1- nombre: ");
                                            System.out.println("2- edad: ");
                                            System.out.println("3- carrera: ");
                                            System.out.println("4-lugar de nacimiento:");
                                            System.out.println("5- el numero de cuenta: ");
                                            System.out.println("6- su usuario: ");
                                            System.out.println("7- cotraseña: ");
                                            System.out.println("8- soliradidad: ");
                                            System.out.println("9- nivel ocupacion: ");
                                            int respm = sc.nextInt();
                                            switch (respm) {
                                                case 1:
                                                    System.out.println("Ingrese nuevo nombre");
                                                    String nuevonomi = sc.next();
                                                    n.setNombre(nuevonomi);
                                                    break;
                                                case 2:
                                                    System.out.println("Ingrese nueva edad: ");
                                                    int nuevaedi = sc.nextInt();
                                                    n.setEdad(nuevaedi);
                                                    break;
                                                case 3:
                                                    System.out.println("Ingrese nueva carrera");
                                                    String nuevcarrei = sc.next();
                                                    n.setCarrera(nuevcarrei);
                                                    break;
                                                case 4:
                                                    System.out.println("Ingrese nuevo lugar de nacimiento");
                                                    String nuevolugari = sc.next();
                                                    n.setLugarnacimiento(nuevolugari);
                                                    break;
                                                case 5:
                                                    System.out.println("Ingrese nuevo numero de cuenta");
                                                    int nuevonumcuentai = sc.nextInt();
                                                    n.setNumecuenta(nuevonumcuentai);
                                                    break;
                                                case 6:
                                                    System.out.println("nuevo usuario");
                                                    String nuevousuarioi = sc.next();
                                                    n.setUsuario(nuevousuarioi);
                                                    break;
                                                case 7:
                                                    System.out.println("Ingrese nueva contraseña");
                                                    String nuevacontraseñai = sc.next();
                                                    n.setContraseña(nuevacontraseñai);
                                                    break;
                                                case 8:
                                                    System.out.println("Ingrese nuevo nivel de soliradidad");
                                                    double nevasoli = sc.nextDouble();
                                                    ((medicos) n).setNivelsoli(nevasoli);
                                                    break;
                                                case 9:
                                                    System.out.println("Ingrese nueva nivel de ocupacion");
                                                    double nuevoocu = sc.nextDouble();
                                                    ((medicos) n).setPreocupacion(nuevoocu);
                                                    break;
                                                default:
                                            }
                                        }
                                    }
                                    break;
                                default:
                                    throw new AssertionError();
                            }
                        }
                        if (n instanceof tutor) {
                            System.out.println("1-modificar datos \n"
                                    + "2-listar datos \n"
                                    + "3- dar tutoria");
                            int resptut = sc.nextInt();
                            switch (resptut) {
                                case 1:
                                    System.out.println("1-nuevo nombre: ");
                                    System.out.println("2-nuevo edad: ");
                                    System.out.println("3-nuevo carrera: ");
                                    System.out.println("4-nuevo lugar de nacimiento:");
                                    System.out.println("5-nuevo  numero de cuenta: ");
                                    System.out.println("6-nuevo  usuario: ");
                                    System.out.println("7-nuevo cotraseña: ");
                                    System.out.println("8-nivel de enseñanza");
                                    int resptutm = sc.nextInt();
                                    switch (resptutm) {
                                        case 1:
                                            System.out.println("Ingrese nuevo nombre");
                                            String nuevonomi = sc.next();
                                            n.setNombre(nuevonomi);
                                            break;
                                        case 2:
                                            System.out.println("Ingrese nueva edad: ");
                                            int nuevaedi = sc.nextInt();
                                            n.setEdad(nuevaedi);
                                            break;
                                        case 3:
                                            System.out.println("Ingrese nueva carrera");
                                            String nuevcarrei = sc.next();
                                            n.setCarrera(nuevcarrei);
                                            break;
                                        case 4:
                                            System.out.println("Ingrese nuevo lugar de nacimiento");
                                            String nuevolugari = sc.next();
                                            n.setLugarnacimiento(nuevolugari);
                                            break;
                                        case 5:
                                            System.out.println("Ingrese nuevo numero de cuenta");
                                            int nuevonumcuentai = sc.nextInt();
                                            n.setNumecuenta(nuevonumcuentai);
                                            break;
                                        case 6:
                                            System.out.println("nuevo usuario");
                                            String nuevousuarioi = sc.next();
                                            n.setUsuario(nuevousuarioi);
                                            break;
                                        case 7:
                                            System.out.println("Ingrese nueva contraseña");
                                            String nuevacontraseñai = sc.next();
                                            n.setContraseña(nuevacontraseñai);
                                            break;
                                        case 8:
                                            System.out.println("nueva nivel de enseñanza");
                                            double nuevonivelens = sc.nextDouble();
                                            ((tutor) n).setNivelenseñanza(nuevonivelens);
                                            break;
                                        default:
                                            throw new AssertionError();
                                    }
                                    break;
                                default:

                            }
                        }
                    }
                    break;
                case 3:
                    
                    break;
            }

        }
    }
}
