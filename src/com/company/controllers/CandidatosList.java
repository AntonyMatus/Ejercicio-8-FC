package com.company.controllers;

import com.company.entities.student;

import java.util.*;

public class CandidatosList {


    public ArrayList<student> studentArrayList = new ArrayList<student>();

    //  create student
    public ArrayList<student> getStudentArrayList() {
        return studentArrayList;
    }

    public void setStudentArrayList(ArrayList<student> studentArrayList) {
        this.studentArrayList = studentArrayList;
    }

    // delete student

    public void delete( int student) {
        studentArrayList.remove(student);
    }

    /*
      filter student
      - public ArrayList<Candidato> filtrar(String ciudad)
     */

    public ArrayList<student> filtrar(String city){
        ArrayList<student> studentCity = new ArrayList<>();
        for (student student : studentArrayList){
            if (Objects.equals(city, student.getCity())){
                studentCity.add(student);
            }
        }
        return studentCity;
    }
    /*
    - public ArrayList<Candidato> filtrar(String presencialidad)
     */

    public ArrayList<student> filtrar(student.Status_face_to_face presencialidad){

        ArrayList<student> studentFaceToFace = new ArrayList<>();

        for (student studentFace : studentArrayList){
            if (presencialidad == studentFace.getStatus_face_to_face()){
                studentFaceToFace.add(studentFace);
            }
        }
        return studentFaceToFace;
    }



    /*
     public ArrayList<Candidato> filtrar(boolean tipoTraslado)
     */

    public ArrayList<student> filtrar(boolean status_transfer){

        ArrayList<student> studentTransfer = new ArrayList<>();
        for (student studentTransf : studentArrayList){
            if (status_transfer == studentTransf.getStatus_transfer()){
                studentTransfer.add(studentTransf);
            }
        }
        return studentTransfer;
    }


     /*
     - public ArrayList<Candidato> filtrar(String ciudad, String presencialidad, boolean tipoTraslado)
      */

    public ArrayList<student> filtrar(String city, student.Status_face_to_face presencialidad, boolean status_transfer){
        ArrayList<student> studentCPS = new ArrayList<>();

        for (student studentcpt :  studentArrayList){
            if (Objects.equals(city, studentcpt.getCity()) && presencialidad == studentcpt.getStatus_face_to_face() && status_transfer == studentcpt.getStatus_transfer()){
                studentCPS.add(studentcpt);
            }
        }
        return studentCPS;
    }

    /*
    - public Candidato buscarEmail(String email)
     */

    public student buscarEmail (String email){

        student studenEmail = new student();

        for (student studentEm : studentArrayList){
            if (Objects.equals(email, studentEm.getEmail())){
                studenEmail = studentEm;
            }
        }
        return studenEmail;
    }

    /*
    - public Candidato buscarTelefono(String telefono)
     */

    public student buscarTelefono(String phone){
        student studentPhone = new student();
        for (student studentPh : studentArrayList){
            if (Objects.equals(phone, studentPh.getPhone())){
                studentPhone = studentPh;
            }
        }
        return studentPhone;
    }


    /*
    public void imprimeCiudadesTop() → Imprime el número de alumnos por ciudad, ordenadas por total
     */

    public void imprimeCiudadesTop(){
        Map<String, Integer> CiudadesRep = new HashMap<>();
        for (student st : studentArrayList){
            CiudadesRep.merge(st.getCity(), 1, Integer::sum);
        }
        List<Map.Entry<String, Integer>> PorOrden = new ArrayList<>(CiudadesRep.entrySet());
        PorOrden.sort(Map.Entry.comparingByValue());
        Collections.reverse(PorOrden);
        System.out.println("Lista de Candidatos ordenados por ciudades  de forma descendiente");
        for (Map.Entry<String, Integer> porOrd : PorOrden){
            System.out.println("Ciudad: " + porOrd.getKey() + " - Cantidad: "+ porOrd.getValue()+ " \n");

        }
    }

    /**
     * public void imprimePaisesTop() → Imprime el número de alumnos por país, ordenadas por total
     */

    public void imprimePaisesTop(){
        Map<String, Integer> PaisesRep = new HashMap<>();

        for (student st : studentArrayList){
            PaisesRep.merge(st.getCountry(), 1, Integer::sum);
        }
        List<Map.Entry<String, Integer>> PorOrden = new ArrayList<>(PaisesRep.entrySet());
        PorOrden.sort(Map.Entry.comparingByValue());
        Collections.reverse(PorOrden);
        System.out.println("Lista de total de candidatos en un pais ordenado de forma descendiente");
        for (Map.Entry<String, Integer> porOrd : PorOrden){
            System.out.println("Pais: "+ porOrd.getKey() + "- Cantidad: "+ porOrd.getValue() + " \n");
        }
    }

    /**
     * public int totalRemotos() → Devuelve un entero con los candidatos que están dispuestos a trabajar en remoto
     */

    public int totalRemotos(){
      int  count = 0;
      for (student st : studentArrayList){
          if (st.getStatus_face_to_face() == student.Status_face_to_face.REMOTO) {
              count++;
          }
      }
        return count;
    }

    /**
     * public int totalPosibilidadTraslado() → Devuelve un entero con los candidatos que están dispuestos a trasladarse
     */

    public int totalPosibilidadTraslado(){
        int count = 0;
        for (student st : studentArrayList){
            if (st.getStatus_transfer()){
                count++;
            }
        }
        return count;
    }

    /**
     * public int totalPresencialSinTraslado() → Devuelve un entero con los candidatos que quieren trabajo exclusivamente presencial y no están dispuestos a trasladarse
     */

    public int totalPresencialSinTraslado(){
        int count = 0;
        for (student st : studentArrayList){
            if (!st.getStatus_transfer() && st.getStatus_face_to_face() == student.Status_face_to_face.PRESENCIAL){
                count++;
            }

        }
        return count;
    }
}


