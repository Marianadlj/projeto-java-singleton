package dio.gof;

/**
 * Singleton "preguiçoso"
 *
 * @author Mariana
 *
 */

public class SingletonLazy {
    private static SingletonLazy instancia;

    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstancia(){
        if (instancia == null){
            instancia = new SingletonLazy();
        }

        return instancia;
    }
}
