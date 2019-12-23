/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientewebservice;

import ServidorWS.Moneda;
import ServidorWS.Pais;
import ServidorWS.PaisesWebService;
import ServidorWS.PaisesWebServiceService;
import ServidorWS.Zona;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author arrio
 * @verson 05.16.19
 */
public class ClienteWebService {

    /**Clase cliente que llama al webservice
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                System.out.println("******************************************\r\n");
		System.out.println("* PSP - Tarea Individual 6 - Web Services * \r\n"); 
		System.out.println("****************************************** \r\n");
		System.out.println("* Luis Andrey Arriola Vassiliev * \r\n"); 
		System.out.println("****************************************** \r\n");
		System.out.println("* 09109448E \r\n"); 
		System.out.println("****************************************** \r\n");
		
        
        
        boolean salir = false;
         Scanner info = new Scanner(System.in);
                while (salir == false) {
			System.out.println("1. Listado de zonas geograficas ");
			System.out.println("2. Listado de monedas ");
                        System.out.println("3. Listado de paises completo ");
                        System.out.println("4. Listado de países por zona geográfica ");
                        System.out.println("5. Listado de países por moneda ");
                        System.out.println("6. Detalle del pais ");
                        System.out.println("7. Salir ");
			int menu = info.nextInt();
                        long zona; 
                        String codigoDivisa;
                        String nombrePais;
			
			switch (menu) {

			case 1:
                               
				System.out.println("Has elegido la opcion 1 ");
                                List <Zona> listaZonas = zonaGeo();
                                mostrarZona(listaZonas);
				break;
			case 2:
                            
				System.out.println("Has elegido la opcion 2 ");
                                List <Moneda> monedas = moneda();
                                mostrarMoneda(monedas);
				break;
                        case 3:
                                System.out.println("Has elegido la opcion 3 ");
                                List<Pais> paises = paises();
                                mostrarPaises(paises);
                                break;
                        case 4:
                                
                                System.out.println("Has elegido la opcion 4 ");
                                System.out.println("Ingresar Id Zona");
                                zona = info.nextLong();
                                List<Pais> paisesZona = paisesZona(zona);
                                mostrarPaises(paisesZona);
                                    
                                break;
                        case 5:    
                                System.out.println("Has elegido la opcion 5 ");
                                System.out.println("Ingresar tipo de moneda");
                                codigoDivisa = info.next();
                                List<Pais> paisesMoneda = paisesMoneda(codigoDivisa);
                                mostrarPaises(paisesMoneda);
                                break;
                        case 6:
                                System.out.println("Has elegido la opcion 6 ");
                                System.out.println("Ingresar nombre de pais a consultar");
                                nombrePais = info.next();
                                List<Pais> paisesdetalle = paises();
                                Pais pais = encontrarPais(paisesdetalle, nombrePais);
                                System.out.println(pais.getNombre() + " " + pais.getIdArea() +" " + pais.getCodigoDivisa() +" " 
                                        +  pais.getCodigoBandera() +" "+  pais.getCodigoNic());
                                break;
                        case 7:
                                System.out.println("Has elegido la opcion Salir");                   
				salir = true;
				break;
                                
                                default:
				System.out.println("Elegir opcion del 1 al 7");
			}
}
    }/**
     * Metodo para genererar una lista de la zona
     * @return nos da las zonas mediante el port del webservice
     */
        private static List <Zona> zonaGeo (){
            PaisesWebServiceService servicios = new PaisesWebServiceService ();
            PaisesWebService port = servicios.getPaisesWebServicePort();
               
                return port.getZonas();
              
        }/**
         * Metodo para imprimir la zona
         * @param zonaGeo lista de la zona geografica
         */
        private static void mostrarZona(List<Zona> zonaGeo){
            for(Zona zona: zonaGeo){
                System.out.println(zona.getId() +" " + zona.getNombre());
                
            }
        
        }/**
         * Metodo para listar generar una lista de monedas
         * @return nos da las monedas mediante el port del webservice
         */
        private static List <Moneda> moneda(){
            PaisesWebServiceService servicios = new PaisesWebServiceService ();
            PaisesWebService port = servicios.getPaisesWebServicePort();
                
            return port.getMonedas();
        
        }/**
         * metodo para imprimir las monedas
         * @param moneda lista de monedas
         */
        private static void mostrarMoneda(List<Moneda> moneda){
            for(Moneda monedas: moneda){
                System.out.println(monedas.getCodigo() +" " + monedas.getNombre());
            
            }
        }/**
         * Metodo para hacer una lista de paises
         * @return nos da los paises mediante el port del webservice
         */
        private static List <Pais> paises(){
            PaisesWebServiceService servicios = new PaisesWebServiceService ();
            PaisesWebService port = servicios.getPaisesWebServicePort();
                
            return port.getPaises();
        
        }/**
         * metodo para imrpimir la lista de paises
         * @param paises lista de paises
         */
        private static void mostrarPaises(List<Pais> paises){
            for(Pais pais: paises){
                System.out.println( pais.getId()+" "+pais.getIdArea() +" " + pais.getNombre());
            
            }
        }/**
         * metodo para hacer una lista de paises con zona
         * @param zona codigo de la zona
         * @return nos da los paises con zonas mediante el port del webservice
         */
          private static List <Pais> paisesZona(long zona){
            PaisesWebServiceService servicios = new PaisesWebServiceService ();
            PaisesWebService port = servicios.getPaisesWebServicePort();
                
            return port.getPaisesZona(zona);
    }/**
     * metodo para hacer una lsita de piases con moneda
     * @param codigoDivisa codigo de la moneda en divisa
     * @return nos da los paises con su moneda mediante el port del webservice
     */
           private static List<Pais> paisesMoneda(String codigoDivisa){
               PaisesWebServiceService servicios = new PaisesWebServiceService ();
               PaisesWebService port = servicios.getPaisesWebServicePort();
                
            return port.getPaisesMoneda(codigoDivisa);
        
        }/**
         * metodo para buscar un pais por su nombre
         * @param paises lista de paises
         * @param nombrePais nombre del pais
         * @return 
         */
           private static Pais encontrarPais(List <Pais> paises, String nombrePais){
               for(Pais pais: paises){
                   if(nombrePais.equals(pais.getNombre())){
                       return pais;
                   }
               
               } return null;
           }
          
}

    


