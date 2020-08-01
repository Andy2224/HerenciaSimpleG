/*Diseñe e implemente un algoritmo; de tal manera, que le permita crear una superclase 
y una subclase con respecto al paper "Detección de fallas en motores de combustión
interna automotriz utilizando técnicas de redes neuronales artificiales".
 */
package herenciasimple4;

class MotorCombustionInterna{
    int falla_cojinete;
    int falla_piston;
    int falla_valvula;

void MostrarPartesFalla(){
    System.out.println("La parte del Motor de Combusión Interna a revisar es: ");

 }
}

class Cojinete extends MotorCombustionInterna{
    String tipo;
    int FallaCojinete(){
        System.out.println("Cojinete");
        return falla_cojinete;

    }
    void mostrarFalla(){
        System.out.println("El Tipo de Falla es: "+tipo);
    }
}

class Piston extends MotorCombustionInterna{
    String tipo;
    int FallaPiston(){
        System.out.println("Piston");
        return falla_piston;
    }
    void mostrarFalla(){
        System.out.println("El Tipo de Falla es: "+tipo);
    }
}
class Valvula extends MotorCombustionInterna{
    String tipo;
    int FallaValvula(){
        System.out.println("Válvula");
        return falla_valvula;
    }
    void mostrarFalla(){
        System.out.println("El Tipo de Falla es: "+tipo);
    }
}
public class HerenciaSimple4 {
    public static void main(String[] args) {
         System.out.println("\tUniversidad de las Fuerzas Armadas ESPE ");
        System.out.println("\t\tSede Latacunga");
        System.out.println("Nombre: Andrés Mogollón");
        System.out.println("Carrera: Ingenieria Automotriz");
        System.out.println("Materia: Programacion [7450]");
         System.out.println("\t\t\tHerencia Simple\n");
        Cojinete falla=new Cojinete();
        Piston falla1=new Piston();
        Valvula falla2=new Valvula();

        falla.falla_cojinete=28182;
        falla.tipo="Se detectó falta de cojintente faltante";

        falla1.falla_piston=109127;
        falla1.tipo="Falla del chirrido del pistón detectada";

       falla2.falla_valvula=1278361;
       falla2.tipo="No permite la ademisión al cilindro";

        System.out.println("Información para Cojinete es: ");
        falla.mostrarFalla();
        falla.MostrarPartesFalla();
        System.out.println("Código de Falla: "+falla.FallaCojinete());
        System.out.println("");

        System.out.println("Información para Piston: ");
        falla1.mostrarFalla();
        falla1.MostrarPartesFalla();
        System.out.println("Código de Falla: "+falla1.FallaPiston());
        System.out.println("");

        System.out.println("Información para la Válvula es: ");
        falla.mostrarFalla();
        falla.MostrarPartesFalla();
        System.out.println("Código de Falla: "+falla2.FallaValvula());


    }
}
