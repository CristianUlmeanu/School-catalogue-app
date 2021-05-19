package Services;

import java.util.HashMap;
import java.util.Map;

public class Singleton{

    private static final Singleton instance = new Singleton();

    @SuppressWarnings( "rawtypes")
    private Map<Class,Object> mapHolder = new HashMap<Class,Object>();

    private Singleton() {}


    @SuppressWarnings("unchecked")
    public static <Temp> Temp getInstance(Class<Temp> classOf) throws IllegalAccessException, InstantiationException {


        synchronized(instance){

            if(!instance.mapHolder.containsKey(classOf)){

                Temp obj = classOf.newInstance();

                instance.mapHolder.put(classOf, obj);
            }

            return (Temp)instance.mapHolder.get(classOf);

        }

    }

}
