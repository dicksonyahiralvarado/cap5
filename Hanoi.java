
public class Hanoi 
{
    static int paso;

    public static void main( String[] args )
    {
        int disco;
        paso = 0;

        if( args.length > 0 ) 
        {
            disco = Integer.parseInt( args[0] );
        }

        else 
        {
	        disco = 4;
        }

        MovRecur( disco, 'A', 'B', 'C' );
    }

    public static void MovRecur (int  disco, char fuente, char aux, char dest)
    {
        if( disco > 0 ) 
        {
            // Primero mueve todos los discos más pequeños de la clavija de origen a la clavija auxiliar.
            MovRecur( disco-1, fuente, dest, aux );
            // Luego mueve el disco grande.
            paso++;
            System.out.println(paso + ". Mueve el disco " + disco + " de "+ fuente +" a "+ dest);
            // Mueve los discos más pequeños de la clavija auxiliar a la de destino.
            MovRecur( disco - 1, aux, fuente, dest );
        }
    }
}