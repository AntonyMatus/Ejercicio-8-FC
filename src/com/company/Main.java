package com.company;

import com.company.controllers.CandidatosList;
import com.company.entities.student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<student> students = new ArrayList<>();
        CandidatosList candidatosList = new CandidatosList();
        Scanner sc = new Scanner(System.in);


        student.Status_face_to_face face_to_face = student.Status_face_to_face.PRESENCIAL;

        student student1 = new student("Antony", "México", "Cozumel", "8938494", "antony@gmail.com", true, "antony.jpg", "antony.pdf", student.Status_face_to_face.REMOTO);
        student student2 = new student("Juan", "Argentina", "Buenos Aires", "938494", "juan@gmail.com", true, "juan.jpg", "juan.pdf", student.Status_face_to_face.MIXTO);
        student student3 = new student("Pedro", "España", "Barcelona", "839494", "pedro@gmail.com", false, "pedro.jpg", "pedro.pdf", student.Status_face_to_face.PRESENCIAL);
        student student4 = new student("Ramon", "Chile", "Santiago", "773348", "ramon@gmail.com", true, "ramon.jpg", "ramon.pdf", student.Status_face_to_face.REMOTO);
        student student5 = new student("Angel", "España", "Madrid", "98493", "angel@gmail.com", false, "angel.jpg", "angel.pdf", student.Status_face_to_face.REMOTO);
        student student6 = new student("Martin", "México", "Campeche", "49473872", "martin@gmail.com", true, "martin.jpg", "martin.pdf", student.Status_face_to_face.PRESENCIAL);
        student student7 = new student("Maria", "Argentina", "Buenos Aires", "782748", "maria@gmail.com", true, "maria.jpg", "maria.pdf", student.Status_face_to_face.PRESENCIAL);
        student student8 = new student("Antony", "México", "Cozumel", "8938494", "antony@gmail.com", true, "antony.jpg", "antony.pdf", student.Status_face_to_face.REMOTO);
        student student9 = new student("Juan", "Argentina", "Buenos Aires", "938494", "juan@gmail.com", true, "juan.jpg", "juan.pdf", student.Status_face_to_face.MIXTO);
        student student10 = new student("Pedro", "España", "Barcelona", "839494", "pedro@gmail.com", false, "pedro.jpg", "pedro.pdf", student.Status_face_to_face.PRESENCIAL);
        student student11 = new student("Ramon", "Chile", "Santiago", "773348", "ramon@gmail.com", true, "ramon.jpg", "ramon.pdf", student.Status_face_to_face.REMOTO);
        student student12 = new student("Angel", "España", "Madrid", "98493", "angel@gmail.com", false, "angel.jpg", "angel.pdf", student.Status_face_to_face.REMOTO);
        student student13 = new student("Martin", "México", "Campeche", "49473872", "martin@gmail.com", true, "martin.jpg", "martin.pdf", student.Status_face_to_face.PRESENCIAL);
        student student14 = new student("Maria", "Argentina", "Buenos Aires", "782748", "maria@gmail.com", true, "maria.jpg", "maria.pdf", student.Status_face_to_face.PRESENCIAL);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);
        students.add(student10);
        students.add(student11);
        students.add(student12);
        students.add(student13);
        students.add(student14);

        candidatosList.setStudentArrayList(students);

        System.out.println("Selecciona una Opción: \n" +
                "1. Ver ciudades Top \n" +
                "2. Ver Paises Top \n" +
                "3. Total candidatos Remoto \n" +
                "4. Total candidatos con posibilidad de Traslado \n" +
                "5. Total candidatos con Presencialidad sin Traslado ");
        int menu = sc.nextInt();
        switch (menu){
            case 1 -> {
                candidatosList.imprimeCiudadesTop();

            }
            case 2 -> {
                candidatosList.imprimePaisesTop();
            }
            case 3 -> {
                System.out.println("Total de candidatos con tipo de Traslado REMOTO: "+ candidatosList.totalRemotos());
            }
            case 4 -> {
                System.out.println("Total de candidatos dispuestos a trasladarce: "+ candidatosList.totalPosibilidadTraslado());
            }
            case 5 -> {
                System.out.println("Total de candidatos dispuestos a trabajar de manera presencial pero sin la opcion de trasladarce: "+ candidatosList.totalPresencialSinTraslado());
            }
            default -> {
                System.out.println("Esta opcion no es valida por tanto finalizamos el ejercicio!");
                System.exit(0);
            }
        }
    }
}
