import java.util.HashMap;
import java.util.Map;

public class ResultadosExamen {
    public static Map getcalificacionOriginal(){
        Map<String, Integer> calificacion = new HashMap<>();
        calificacion.put("Ana", 24);
        calificacion.put("Daniel", 50);
        calificacion.put("Alejandro", 79);
        calificacion.put("Laura", 32);
        calificacion.put("Kelly", 80);
        calificacion.put("Ivan", 40);
        calificacion.put("Maria", 59);
        calificacion.put("Melanie", 55);
        calificacion.put("Diego", 95);
        calificacion.put("Miguel", 63);
        return calificacion;
    }
    public static Map getcalificacionNueva(){
        Map <String, Integer> calificacion = new HashMap<>();
        calificacion.put("Ana", 97);
        calificacion.put("Daniel", 89);
        calificacion.put("Alejandro", 79);
        calificacion.put("Laura", 82);
        calificacion.put("Kelly", 76);
        calificacion.put("Ivan", 98);
        calificacion.put("Maria", 80);
        calificacion.put("Melanie", 95);
        calificacion.put("Diego", 90);
        calificacion.put("Miguel", 62);
        return calificacion;
    }
    public static void main(String[] args) {
        Map calificacionFinal = new HashMap();
        getcalificacionOriginal().forEach((key,value) -> {
            if (getcalificacionNueva().containsKey(key)) {
                int valor = (int) getcalificacionNueva().get(key);
                if (valor > (int) value) {
                    calificacionFinal.put(key, valor);
                } else {
                    calificacionFinal.put(key, value);
                }
            } else {
                calificacionFinal.put(key, value);
            }
        }
        );
        calificacionFinal.forEach((key,value) -> System.out.println("Alumno: "+ key +". Calificacion: " + value));
    }
}