package br.ulbra.main;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
public class BdFamoso {
    
    public ArrayList listaFamosoAlfa;
    public ArrayList listaFamoso;

    public BdFamoso(){
        listaFamoso = new ArrayList();
        listaFamosoAlfa = new ArrayList();
    }
    public void save(String famoso){
            listaFamoso.add(famoso);
            listaFamosoAlfa.add(famoso);
        JOptionPane.showMessageDialog(null, 
                famoso+" foi salvo(a) com sucesso..."); 
    }
    
    public String toString(){
        String result = "Lista de famosos:\n";
        if(!listaFamoso.isEmpty()){
            for(int i=0; i < listaFamoso.size();i++){
                result += listaFamoso.get(i)+"\n";
            }
        }else{
            result = "A base de dados encontra-se vazia...";
        }
        return result;
    }
    public int getSize(){
        return listaFamoso.size();
    }
    public String getFamoso(int i){
        String r = "";
        if(i >= 0){
            r = (String) listaFamoso.get(i);
        }else{
            r = "Artista não existente...";
        }
        return r;
    }
    public boolean espaco(String famoso){
      boolean espaco;
        String[] f = famoso.split(" ");
      if(f.length <= 1){
          espaco = false;
      }else{
          espaco = true;
      }
      return espaco;
    }
    public void delete(int i, int iAlfa){
        if(i!=-1){
            listaFamoso.remove(i);
            listaFamosoAlfa.remove(iAlfa);
             JOptionPane.showMessageDialog(null, "Artista excluído com sucesso");
        }else{
            JOptionPane.showMessageDialog(null, "Artista não encontrado...");
        }
    }
    public void del(int i){
        listaFamoso.clear();
        listaFamosoAlfa.clear();
    }
    public int search(String famoso){
        boolean gotcha = false;
        int i = 0,r = -1;
        while(i < listaFamoso.size() && !gotcha){
            if(listaFamoso.get(i).equals(famoso)){
                r = i;
                gotcha = true;
            }
            i++;
        }
        return r;
    }
    public int searchAlfa(String famoso){
        boolean gotcha = false;
        int iAlfa = 0,r = -1;
        while(iAlfa < listaFamosoAlfa.size() && !gotcha){
            if(listaFamosoAlfa.get(iAlfa).equals(famoso)){
                r = iAlfa;
                gotcha = true;
            }
            iAlfa++;
        }
        return r;
    }
    public void update(int i, int iAlfa, String update){
        if(i != -1 || update.length() > 0){
        listaFamoso.set(i, update);   
        listaFamosoAlfa.set(iAlfa, update);
        JOptionPane.showMessageDialog(null, "Artista alterado com sucesso");
    }else{
            JOptionPane.showMessageDialog(null, "Artista não alterado");
        }
    }
    public String toStringAlphabetic(){
        String result = "Lista de famosos:\n";
        if(!listaFamosoAlfa.isEmpty()){
            Collections.sort(listaFamosoAlfa);
            for(int i=0; i < listaFamosoAlfa.size();i++){
                result += listaFamosoAlfa.get(i)+"\n";
            }
        }else{
            result = "A base de dados encontra-se vazia...";
        }
        return result;
    }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
 
    
