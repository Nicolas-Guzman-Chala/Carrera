package Model;

import java.util.ArrayList;
import java.util.Scanner;

import Model.Util;

public record Carrera(String nombre, ArrayList<Estudiante> listaEstudiantes, ArrayList<Materia> listaMaterias, ArrayList<Profesor> listaProfesores) {

    public String ingresarEstudiante(Estudiante estudiante){
        if(buscarEstudiante(estudiante.getId()) == null){
            listaEstudiantes.add(estudiante);
            return "El estudiante se registro exitosamente: ";
        }else{
            return "El estudiante ya existe: ";
        }
    }

    public Estudiante buscarEstudiante(String id){
        for(Estudiante e : listaEstudiantes){
            if(e.equals(id)){
                return e;
            }
        }
        return null;
    }

    public String eliminarEstudiante(Estudiante estudiante){
        if(buscarEstudiante(estudiante.getId()) != null){
            listaEstudiantes.remove(estudiante);
            return "El estudiante se ha eliminado exitosamente: ";
        }else{
            return "El estudiante ya existe: ";
        }
    }

    public void actualizarEstudinte (Estudiante estudiante){
        if(buscarEstudiante(estudiante.getId()) != null){
            estudiante.setId(Util.ingresarTexto("Ingrese su nuevo ID: "));
            estudiante.setNombre(Util.ingresarTexto("Ingrese su nuevo Nombre: "));
            estudiante.setDocumento(Util.ingresarTexto("Ingrese su nuevo Documento: "));
            estudiante.setSemestre(Util.ingresarEntero("Ingrese su nuevo semestre: "));
            estudiante.setId(Util.ingresarTexto("Ingrese su nuevo ID: "));
        }
    }

    public String ingresarMateria(Materia materia){
        if(buscarMateria(materia.getCodigo()) == null){
            listaMaterias.add(materia);
            return "El Materia se registro exitosamente: ";
        }else{
            return "El Materia ya existe: ";
        }
    }

    public Materia buscarMateria(String id){
        for(Materia e : listaMaterias){
            if(e.equals(id)){
                return e;
            }
        }
        return null;
    }

    public String eliminarMateria(Materia materia){
        if(buscarMateria(materia.getCodigo()) != null){
            listaMaterias.remove(materia);
            return "El Materia se ha eliminado exitosamente: ";
        }else{
            return "El Materia ya existe: ";
        }
    }

    public void actualizarMateria (Materia materia){
        if(buscarMateria(materia.getCodigo()) != null){
            materia.setCodigo(Util.ingresarTexto("Ingrese su nuevo Codigo: "));
            materia.setNombre(Util.ingresarTexto("Ingrese su nuevo Nombre: "));
            materia.setHoraSemana(Util.ingresarEntero("Ingrese su nuevo horaSemana: "));
            materia.setCreditos(Util.ingresarEntero("Ingrese su nuevo creditos: "));
            materia.setSemestres(Util.ingresarByte("Ingrese su nuevo semestres: "));
        }
    }

    public String ingresarProfesor(Profesor profesor){
        if(buscarProfesor(profesor.getId()) == null){
            listaProfesores.add(profesor);
            return "El profesor se registro exitosamente: ";
        }else{
            return "El profesor ya existe: ";
        }
    }

    public Profesor buscarProfesor(String id){
        for(Profesor e : listaProfesores){
            if(e.equals(id)){
                return e;
            }
        }
        return null;
    }

    public String eliminarProfesor(Profesor profesor){
        if(buscarProfesor(profesor.getId()) != null){
            listaProfesores.remove(profesor);
            return "El Profesor se ha eliminado exitosamente: ";
        }else{
            return "El Profesor ya existe: ";
        }
    }

    public void actualizarProfesor (Profesor profesor){
        if(buscarProfesor(profesor.getId()) != null){
            profesor.setId(Util.ingresarTexto("Ingrese su nuevo ID: "));
            profesor.setNombre(Util.ingresarTexto("Ingrese su nuevo Nombre: "));
            profesor.setTitulo(Util.ingresarTexto("Ingrese su nuevo Titulo: "));
            profesor.setAniosExperencia(Util.ingresarEntero("Ingrese su nuevo AnioExperencia: "));
        }
    }

    public String registrarMateriasP(String id){
        ArrayList<Materia> listaMateriasN = new ArrayList<>();
        String mensaje = "";
        for(Profesor p : listaProfesores){
            if(p.getId().equals(id)){
                int cantidadVeces = Util.ingresarEntero("Ingrese la cantidad de materias: ");
                while(cantidadVeces > 0){
                    String nombreMateria = Util.ingresarTexto("Ingresar nombre Materia: ");
                    for(Materia m : listaMaterias){
                        if(m.getNombre().equals(nombreMateria)){
                            listaMateriasN.add(m);
                            mensaje =  "La materia seha registrado con exito: ";
                        }
                        else{
                            mensaje =  "La materia no existe: ";
                        }
                    }
                    cantidadVeces--;
                }
                p.setListaMaterias(listaMateriasN);
            }
        }
        return mensaje;

    }
    public String registrarMateriasE(String id){
        ArrayList<Materia> listaMateriasN = new ArrayList<>();
        String mensaje = "";
        for(Estudiante p : listaEstudiantes){
            if(p.getId().equals(id)){
                int cantidadVeces = Util.ingresarEntero("Ingrese la cantidad de materias: ");
                while(cantidadVeces > 0){
                    String nombreMateria = Util.ingresarTexto("Ingresar nombre Materia: ");
                    for(Materia m : listaMaterias){
                        if(m.getNombre().equals(nombreMateria)){
                            listaMateriasN.add(m);
                            mensaje =  "La materia seha registrado con exito: ";
                        }
                        else{
                            mensaje =  "La materia no existe: ";
                        }
                    }
                    cantidadVeces--;
                }
                p.setListaMaterias(listaMateriasN);
            }
        }
        return mensaje;

    }

    public String registrarEstudianteM(String codigo){
        ArrayList<Estudiante> listaEstudianteN = new ArrayList<>();
        String mensaje = "";
        for(Materia p : listaMaterias){
            if(p.getCodigo().equals(codigo)){
                int cantidadVeces = Util.ingresarEntero("Ingrese la cantidad de estudiantes: ");
                while(cantidadVeces > 0){
                    String nombreEstudiante = Util.ingresarTexto("Ingresar nombre estudiante: ");
                    for(Estudiante m : listaEstudiantes){
                        if(m.getNombre().equals(nombreEstudiante)){
                            listaEstudianteN.add(m);
                            mensaje =  "El estudiante se ha registrado con exito: ";
                        }
                        else{
                            mensaje =  "El estudiante no existe: ";
                        }
                    }
                    cantidadVeces--;
                }
                p.setListaEstudiantes(listaEstudianteN);
            }
        }
        return mensaje;

    }


    public String registrarProfesorM(String codigo){
        String mensaje = "";
        for(Materia p : listaMaterias){
            if(p.getCodigo().equals(codigo)){
                String nombreProfesor = Util.ingresarTexto("Ingresar nombre estudiante: ");
                for(Profesor m : listaProfesores){
                    if(m.getNombre().equals(nombreProfesor)){
                        p.setProfesor(m);
                        mensaje =  "El profesor se ha registrado con exito: ";
                    }
                    else{
                        mensaje =  "El profesor no existe: ";
                    }
                }
            }
        }
        return mensaje;
    }


}
