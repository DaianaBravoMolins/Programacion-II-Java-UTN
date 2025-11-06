
package ejercicio3;


public class Principal {

    public static void main(String[] args) {
        // Crear la universidad
        Universidad uni = new Universidad("Universidad Nacional");

        // Crear al menos 3 profesores
        Profesor p1 = new Profesor("P001", "Ana López", "Matemática");
        Profesor p2 = new Profesor("P002", "Carlos Pérez", "Física");
        Profesor p3 = new Profesor("P003", "María Gómez", "Programación");

        // Crear al menos 5 cursos
        Curso c1 = new Curso("C101", "Álgebra I");
        Curso c2 = new Curso("C102", "Física I");
        Curso c3 = new Curso("C103", "Programación I");
        Curso c4 = new Curso("C104", "Cálculo");
        Curso c5 = new Curso("C105", "Estructuras de Datos");

        // Agregar profesores y cursos a la universidad
        uni.agregarProfesor(p1);
        uni.agregarProfesor(p2);
        uni.agregarProfesor(p3);

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        // Asignar profesores a cursos (usa asignarProfesorACurso)
        uni.asignarProfesorACurso("C101", "P001"); // Ana -> Álgebra I
        uni.asignarProfesorACurso("C104", "P001"); // Ana -> Cálculo
        uni.asignarProfesorACurso("C102", "P002"); // Carlos -> Física I
        uni.asignarProfesorACurso("C103", "P003"); // María -> Programación I
        uni.asignarProfesorACurso("C105", "P003"); // María -> Estructuras de Datos

        // Listar cursos con su profesor y profesores con sus cursos
        System.out.println("\n=== Lista de Cursos (con profesor) ===");
        uni.listarCursos();

        System.out.println("\n=== Lista de Profesores (con sus cursos) ===");
        uni.listarProfesores();

        // Cambiar el profesor de un curso y verificar sincronización
        System.out.println("\n>>> Reasignando profesor del curso C103 (Programación I) de María (P003) a Carlos (P002)...");
        uni.asignarProfesorACurso("C103", "P002"); 

        System.out.println("\n=== Después de reasignar curso C103 ===");
        // Verificar curso C103
        Curso verific = uni.buscarCursoPorCodigo("C103");
        if (verific != null) verific.mostrarInfo();

        // Verificar profesores y sus listas
        System.out.println("\n=== Profesores y sus cursos tras la reasignación ===");
        uni.listarProfesores();

        // Remover un curso y confirmar que se rompe la relación en el profesor
        System.out.println("\n>>> Eliminando el curso C102 (Física I) ...");
        uni.eliminarCurso("C102");

        System.out.println("\n=== Cursos tras eliminar C102 ===");
        uni.listarCursos();

        System.out.println("\n=== Profesores tras eliminar C102 (verificar que Carlos ya no tenga C102) ===");
        uni.listarProfesores();

        // Remover un profesor y dejar profesor = null en sus cursos
        System.out.println("\n>>> Eliminando el profesor P001 (Ana López) ...");
        uni.eliminarProfesor("P001"); 
        
        System.out.println("\n=== Cursos tras eliminar al profesor P001 (Ana) ===");
        uni.listarCursos(); 

        System.out.println("\n=== Profesores actuales en la universidad ===");
        uni.listarProfesores();

        // 10) Reporte: cantidad de cursos por profesor
        System.out.println("\n=== Reporte: cantidad de cursos por profesor ===");
        uni.reporteCursosPorProfesor();

        // Extras: revisar estado final de cada curso y profesor
        System.out.println("\n=== Estado final - Cursos (detalle) ===");
        for (Curso c : uni.getCursos()) {
            c.mostrarInfo();
            System.out.println();
            }
        }
}

    
