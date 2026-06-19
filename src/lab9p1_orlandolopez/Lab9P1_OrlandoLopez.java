/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab9p1_orlandolopez;
import java.util.Random;
import javax.swing.JOptionPane; 
import java.util.ArrayList;
/**
 *
 * @author Home
 */
public class Lab9P1_OrlandoLopez {
    static  ArrayList<Soldado>soldado =new ArrayList<Soldado>();
    static Random R=new Random();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion=1;
        while(opcion!=3){
            opcion=Integer.parseInt(JOptionPane.showInputDialog("1.-Creador de personajes\n2.-Dawn of the dead\n3.-Salir\nIngrese una opcion: "));
            switch(opcion){
                case 1:{
                    int opcion2=1;
                    while(opcion2!=5){
                    opcion2=Integer.parseInt(JOptionPane.showInputDialog("1.-Crear Personaje\n2.-Modificar personaje\n3.-Eliminar Personaje\n4.-Listar Personajes\n5.-Salir\nIngrese una opcion: "));
                    switch(opcion2){
                        case 1:{
                           Agregarpersonaje(soldado);                          
                        }break;
                        case 2:{
                             if(soldado.isEmpty()==true){
                                JOptionPane.showMessageDialog(null,"No ha creado personajes todavia");
                                break;
                             }else{
                            Modificar(soldado);}
                        }break;
                        case 3:{
                               if(soldado.isEmpty()==true){
                                JOptionPane.showMessageDialog(null,"No ha creado personajes todavia");
                                break;
                               }else{
                                   Eliminar(soldado);
                               }
                        }break;
                        case 4:{
                                if(soldado.isEmpty()==true){
                                    JOptionPane.showMessageDialog(null,"No ha creado personajes todavia");
                                break;
                                }else{
                            JOptionPane.showMessageDialog(null,Impresion(soldado));
                                                        }
                        }break;
                        case 5:{
                            
                        }break;
                        default:
                            JOptionPane.showMessageDialog(null,"Ingrese una opcion valida");
                    }
                    }
                }break;
                case 2:{
                    int t=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño de la matriz"));
                    char [][]m=LlenarMatriz(t);
                    String Imprimir=mostrarMatriz(m);
                    JOptionPane.showMessageDialog(null,"La matriz original es:\n"+Imprimir);
                    char zombi='Z';
                    char humano='H';
                    char muro='M';
                    for(int i=0;i<m.length;i++){
                        for(int j=0;j<m[i].length;j++){
                            
                            if(m[i+1][j]==zombi){
                                m[i][j]=zombi;
                            }
                            if(m[i-1][j]==zombi){
                                m[i][j]=zombi;
                            } 
                            if(m[i][j-1]==zombi){
                                m[i][j]=zombi;
                            }
                            if(m[i][j+1]==zombi){
                                m[i][j]=zombi;
                            }
                                                        if(m[i][j]==zombi&&i>0||j>0||j>t-1||i>t-1){
                                }
                        }                       
                    }
                    String Imprimir2=mostrarMatriz(m);
                    JOptionPane.showMessageDialog(null,"la matriz es:\n"+Imprimir2);
                }break;
                case 3:{                    
                }break;
                default:
                JOptionPane.showMessageDialog(null,"Ingrese una opcion valida");
            }
        }         
    }
    public static void Agregarpersonaje(ArrayList<Soldado>s){
        String nombre=JOptionPane.showInputDialog("Ingrese el nombre de su personaje: ");
        String clase=JOptionPane.showInputDialog("Ingrese el nombre de su clase: ");
        String habilidad=JOptionPane.showInputDialog("Ingrese el nombre de su habilidad: ");
       Soldado temp=new Soldado(nombre,clase,habilidad);
       soldado.add(temp);
    }
    public static String Impresion(ArrayList<Soldado>s){
        String acum=" ";
            for(int i=0;i<s.size();i++){
           acum+=(i+1)+". "+s.get(i)+"\n";
        }
    return acum;}
    public static void Modificar(ArrayList<Soldado>s){
        String imprimir=Impresion(soldado);
        int indice=Integer.parseInt(JOptionPane.showInputDialog(imprimir+"\nIngrese el indice del personaje que quiere cambiar: "));
        indice--;
        String nombre=JOptionPane.showInputDialog("Ingrese el nombre de su personaje: ");
        String clase=JOptionPane.showInputDialog("Ingrese el nombre de su clase: ");
        String habilidad=JOptionPane.showInputDialog("Ingrese el nombre de su habilidad: ");
       Soldado temp=new Soldado(nombre,clase,habilidad);
       soldado.set(indice,temp);    
       JOptionPane.showMessageDialog(null,"El personaje modificado resulto en: \n"+temp);    
    }
    public static void Eliminar(ArrayList<Soldado>s){
            String imprimir=Impresion(soldado);
            int indice=Integer.parseInt(JOptionPane.showInputDialog(imprimir+"\nIngrese el indice del personaje que quiere eliminar: "));
            indice--;
            soldado.remove(indice);  
            String imprimir2=Impresion(soldado);
            JOptionPane.showMessageDialog(null,"El personaje se ha eliminado exitosamente\n"+imprimir2);
    }

    public static char[][] LlenarMatriz(int t){
        String personajes="MHZ";
        char[][]temp=new char[t][t];
        for(int i=0;i<t;i++){
            for(int j=0;j<t;j++){
            temp[i][j]=personajes.charAt(R.nextInt(0,3));
            }
        }
    return temp;}
            public static String mostrarMatriz(char[][] mat) {
            String acum=" ";      
        for(int i=0;i<mat.length;i++) {
            for(int j=0;j<mat[i].length;j++) {
                acum+="["+mat[i][j]+"]"+"\t ";
            }
            acum+="\n";
        }
    return acum;}
}
