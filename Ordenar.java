
package objetos.ordenar;


public class Ordenar {

  public static void main(String[] args) {
      int [] arreglo={99,10,77,60,1,3,98,16,0,2};
      int n= arreglo.length;
      int cambio;
    
    //Imreimir arreglo desordenado
     System.out.println("Arreglo desordenado");
    for(int i=0;i<n;i++){
        System.out.print(" "+arreglo[i]+" ");
    }
    
    //Ordenar el arreglo
      for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
          if(arreglo[j]<arreglo[i]){
              cambio=arreglo[i];
              arreglo[i]=arreglo[j];
              arreglo[j]=cambio;
          }
        }
      }
    
    //Imprimir el arreglo ordenado
    System.out.println("\n====================================");
    System.out.println("\nArreglo ordenado");
       for(int k=0;k<n;k++){
          System.out.print(" "+arreglo[k]+" ");
      }
  }
}
