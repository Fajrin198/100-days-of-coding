/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Day100 {
    public static void main(String[] args) {
        // Membuat Generator Program yang membuat 400 variabel dengan 4 jenis variabel
        try {
            String namaClass = "BikinVariable";
            StringBuffer sb = new StringBuffer();
            sb.append("public class "+namaClass+" {\n");
            
            String[] tipeData = {"byte","short","int","long","float","double","boolean","Integer","Byte"};
            sb.append("//variabel instant\n");
            for (int i = 0; i < 100; i++) {
                int indexTD = i%tipeData.length;
                sb.append(tipeData[indexTD]+" VarInstance"+(i+1)+";\n");
            }
            sb.append("//variabel class\n");
            for (int i = 0; i < 100; i++) {
                int indexTD = i%tipeData.length;
                sb.append("static "+tipeData[indexTD]+" VarClass"+(i+1)+";\n");
            }
            sb.append("public void lokalvariabel(){\n");
            for (int i = 0; i < 100; i++) {
                int indexTD = i%tipeData.length;
                sb.append(tipeData[indexTD]+" Varlocal"+(i+1)+";\n");
            }
            sb.append("}");
            
            for (int i = 0; i < 100; i++) {
                int indexTD = i%tipeData.length;
                sb.append("public void parameterVariabel"+(i+1)+"("+tipeData[indexTD]+" Varparameter"+(i+1)+"){\n");
                sb.append("}\n");
            }
            
            sb.append("}");
            File f = new File("src/"+namaClass+".java");
            Files.writeString(f.toPath(), sb.toString());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
