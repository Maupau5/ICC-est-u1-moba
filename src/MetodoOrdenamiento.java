public class MetodoOrdenamiento {
    public int[] BurbujaAjuste (int[] arreglo){
        int n = arreglo.length;
        boolean inter = false;
        for (int i = 0; i < n; i++){
            
            for (int j = 0; j < n-1-i; j++) {
                System.out.println(" j="+j+" [j]= "+arreglo[j]+" j+1= "+j+1+ " [j+1]= "+arreglo[j+1]);
                if(arreglo[j]> arreglo[j+1]){
                    System.out.println("Si hay cambio");
                //Intercambio
                int aux=arreglo[j];
                arreglo[j]=arreglo[j+1];
                arreglo[j+1]=aux;
                inter = true;
                
                }
                
            }
            if (!inter){ 
                break;
            }
       }
       return arreglo;
    }
    public void printArreglo(int[] arreglo){
        for (int num : arreglo) {
            System.out.print(num+",");
        }
    }
    }
