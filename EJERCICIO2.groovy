// clase estudiante

class Estudiante {
    
    String nombre;
    long dni;
    int edad;
    String ciudadNatal;
    int calificacion;

    Estudiante(String nombre, long dni, int edad, String ciudadNatal, int calificacion) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.ciudadNatal = ciudadNatal;
        this.calificacion = calificacion;
    }
}

// clase curso

class Curso {
    
    List estudiantes = [];

    List estudiantes() {
        return estudiantes;
    }

    void agregarEstudiante(unEstudiante)
    {
        estudiantes.add(unEstudiante);  
    }
    
    int cantidadDeEstudiantesInscriptos()
    {
        int cantidad=0;
        cantidad=estudiantes.size();
        return cantidad;
    }
    
    /*void resetearNotas()
    {
        if(estudiantes.size()>0)
        {
            for(int i=0;i<estudiantes.size();i++)
            {
                estudiantes.get(i).setCalificacion(0);
            } 
        }
    }*/
    
    void resetearNotas()
    {
       this.estudiantes.each{it.calificacion=0};
    }
    
    void existeEstudiante(unEstudiante){
        
       int bandera=0;
        if(estudiantes.size()>0)
        {
            estudiantes.each
            {
                if(it.dni==unEstudiante.getDni()){
                    
                    bandera=1;
                }
            }
            if(bandera==1){
                    
                    println "Si se encuentra inscripto en el curso";
                }
                else{

                    println "No se encuentra inscripto en el curso";
                
                }   
        }   
    }
    
    void existeEstudianteConNotaDiez(){
        int cantidad = 0;
        if(estudiantes.size()>0)
        {
            estudiantes.each
            {
                if(it.calificacion==10){
                    
                    cantidad=cantidad+1;
                }
            } 
            println "Los alumnos que sacaron un 10 como calificacion son ${cantidad}";
        } 
    }
    
    void existeEstudianteLlamado(String unNombre){
        int cantidad = 0;
        if(estudiantes.size()>0)
        {
            estudiantes.each
            {
                if(it.nombre==unNombre){
                    
                    cantidad=cantidad+1;
                }
            } 
            if(cantidad>=0){
            println "Existe/n "+cantidad+" alumno/s inscripto/s con ese nombre en el curso";
            }
            else{
                
                println "No existe ningun alumno inscripto con ese nombre en el curso";
            }
        } 
    }
    
    float porcentajeDeAprobados(){
        
        float cantidadAprobados = 0,cantidadTotal=0,porcentajeAprobados=0;
        if(estudiantes.size()>0)
        {
            estudiantes.each
            {
                if(it.calificacion>=5){
                    
                    cantidadAprobados=cantidadAprobados+1;
                }
            }
            cantidadTotal=estudiantes.size();
            
            porcentajeAprobados=(cantidadAprobados)*100/cantidadTotal;
        }
        return porcentajeAprobados;
    }
    
    void promedioDeCalicaciones(){
        
        float sumaNotas = 0,cantidadTotal=0,promedioNotas=0;
        if(estudiantes.size()>0)
        {
            estudiantes.each
            {
                sumaNotas= sumaNotas+it.calificacion;
            }
            cantidadTotal=estudiantes.size();
            
            promedioNotas=sumaNotas/cantidadTotal;
            
            println "El promedio de las notas obtenidas por los alumnos es igual a ${promedioNotas}";
        }
    }
    
    boolean unDesastre(){
        
        int cantidadDesaprobados = 0,cantidadTotal=0;
        if(estudiantes.size()>0)
        {
            estudiantes.each
            {
                if(it.calificacion<=4){
                    
                    cantidadDesaprobados=cantidadDesaprobados+1;
                }
            }
            cantidadTotal=estudiantes.size();
            if(cantidadTotal==cantidadDesaprobados){
            
                return true;
            } 
        }
        return false;
    }
    
    String calificacionMasFrecuente(){
        
        int c0=0,c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0,c9=0,c10=0;
        if(estudiantes.size()>0)
        {
            estudiantes.each
            {
                if(it.calificacion==0){
                    
                    c0=c0+1;
                }
                else{
                    
                    if(it.calificacion==1){
                    
                        c1=c1+1;
                    }
                    else{
                    
                        if(it.calificacion==2){
                    
                            c2=c2+1;
                        }
                        else{
                    
                            if(it.calificacion==3){
                    
                                c3=c3+1;
                            }
                            else{
                    
                                if(it.calificacion==4){
                    
                                    c4=c4+1;
                                }
                                else{
                    
                                    if(it.calificacion==5){
                    
                                        c5=c5+1;
                                    }
                                    else{
                    
                                        if(it.calificacion==6){
                    
                                            c6=c6+1;
                                        }
                                        else{
                    
                                            if(it.calificacion==7){
                    
                                                c7=c7+1;
                                            }
                                            else{
                    
                                                if(it.calificacion==8){
                    
                                                    c8=c8+1;
                                                }
                                                else{
                    
                                                    if(it.calificacion==9){
                    
                                                        c9=c9+1;
                                                    }
                                                    else{
                    
                                                        if(it.calificacion==10){
                    
                                                            c10=c10+1;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if((c0>c1)&&(c0>c2)&&(c0>c3)&&(c0>c4)&&(c0>c5)&&(c0>c6)&&(c0>c7)&&(c0>c8)&&(c0>c9)&&(c0>c10)){
                
                return "cero";
            }
            if((c1>c0)&&(c1>c2)&&(c1>c3)&&(c1>c4)&&(c1>c5)&&(c1>c6)&&(c1>c7)&&(c1>c8)&&(c1>c9)&&(c1>c10)){
                
                return "uno";
            }
            if((c2>c0)&&(c2>c1)&&(c2>c3)&&(c2>c4)&&(c2>c5)&&(c2>c6)&&(c2>c7)&&(c2>c8)&&(c2>c9)&&(c2>c10)){
                
                return "dos";
            }
            if((c3>c0)&&(c3>c1)&&(c3>c2)&&(c3>c4)&&(c3>c5)&&(c3>c6)&&(c3>c7)&&(c3>c8)&&(c3>c9)&&(c3>c10)){
                
                return "tres";
            }
            if((c4>c0)&&(c4>c1)&&(c4>c2)&&(c4>c3)&&(c4>c5)&&(c4>c6)&&(c4>c7)&&(c4>c8)&&(c4>c9)&&(c4>c10)){
                
                return "cuatro";
            }
            if((c5>c0)&&(c5>c1)&&(c5>c2)&&(c5>c3)&&(c5>c4)&&(c5>c6)&&(c5>c7)&&(c5>c8)&&(c5>c9)&&(c5>c10)){
                
                return "cinco";
            }
            if((c6>c0)&&(c6>c1)&&(c6>c2)&&(c6>c3)&&(c6>c4)&&(c6>c5)&&(c6>c7)&&(c6>c8)&&(c6>c9)&&(c6>c10)){
                
                return "seis";
            }
            if((c7>c0)&&(c7>c1)&&(c7>c2)&&(c7>c3)&&(c7>c4)&&(c7>c5)&&(c7>c6)&&(c7>c8)&&(c7>c9)&&(c7>c10)){
                
                return "siete";
            }
            if((c8>c0)&&(c8>c1)&&(c8>c2)&&(c8>c3)&&(c8>c4)&&(c8>c5)&&(c8>c6)&&(c8>c7)&&(c8>c9)&&(c8>c10)){
                
                return "ocho";
            }
            if((c9>c0)&&(c9>c1)&&(c9>c2)&&(c9>c3)&&(c9>c4)&&(c9>c5)&&(c9>c6)&&(c9>c7)&&(c9>c8)&&(c9>c10)){
                
                return "nueve";
            }
            if((c10>c0)&&(c10>c1)&&(c10>c2)&&(c10>c3)&&(c10>c4)&&(c10>c5)&&(c10>c6)&&(c10>c7)&&(c10>c8)&&(c10>c9)){
                
                return "diez";
            }
        }
        return "error";
    }
    
    List estudiantesAprobados(){
    
        return this.estudiantes.each{it.calificacion>4};
    }
    
    List estudiantesNoCatamarquenios(){
    
        return this.estudiantes.findAll{it.ciudadNatal!="Catamarca"};
    } 
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

def curso = new Curso();

curso.agregarEstudiante( new Estudiante("fabri",21123123,21,"Catamarca",6));
curso.agregarEstudiante( new Estudiante("ale",21423123,32,"Catamarca",8));
curso.agregarEstudiante( new Estudiante("esteban",21173123,20,"Catamarca",10));
curso.agregarEstudiante( new Estudiante("lucas",21173193,22,"Tucuman",10));
curso.agregarEstudiante( new Estudiante("juan",21176193,32,"Tucuman",3));


println "Cantidad de estudiantes inscriptos: ${curso.cantidadDeEstudiantesInscriptos()}\n";

//curso.resetearNotas();

curso.existeEstudiante(new Estudiante("lucas",21173193,22,"Tucuman",10));
curso.existeEstudiante(new Estudiante("federico",21173196,24,"Tucuman",9));
println "\n";

curso.existeEstudianteConNotaDiez();
println "\n";

curso.existeEstudianteLlamado("fabri");
curso.existeEstudianteLlamado("facu");
println "\n";

def porcentaje=curso.porcentajeDeAprobados();
println "El porcentaje de alumnos aprobados en el curso es igual al ${porcentaje}%\n";

curso. promedioDeCalicaciones();
println "\n";

def estado=curso.unDesastre();

if(estado==true){

    println "Todo el curso esta desaprobado";
}
else{

    println "No todo el curso esta desaprobado";
}
println "\n";

def mayorFrecuencia=curso.calificacionMasFrecuente();
println "La calificacion mas frecuente es un ${mayorFrecuencia}\n";

List estudiantesAprobados = curso.estudiantesAprobados();
estudiantesAprobados.each{println it.nombre; println it.dni; println it.edad; println it.ciudadNatal; println it.calificacion};

println "\n";

List estudiantesNoCatamarquenios = curso.estudiantesNoCatamarquenios();
estudiantesNoCatamarquenios.each{println it.nombre; println it.dni; println it.edad; println it.ciudadNatal; println it.calificacion};

