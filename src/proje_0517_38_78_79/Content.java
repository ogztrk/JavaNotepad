/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje_0517_38_78_79;

import java.util.ArrayList;

/**
 *
 * @author oğuz TURK
 */
public class Content {
    //words = sözlük , metin = Text Area içeriğini tutar.
    static ArrayList<String> words;
    public String metin="";
    
    public Content(ArrayList<String> words){
        this.words=words;
    }
    public Content(){
        
    }
    
    /* "kelime" değişkeninin noktalama işaretlerinden arındıırlmış string olması beklenmektedir.
        bu string ile word nesnesi oluşturulduktan sonra bu nesne metine eklenir */
    public void  add(String kelime){
        Word temp = new Word(kelime);
        
        metin += temp;
    }
    
    // sözlüğü görselleştirmek için kullandığımız fonksiyon
    public String wordVer(){
        String main="";
        for (String temp: words) {
            main+=temp+"\n";
        }
        return main;
    }
    
    
    
    class Word {
    // word class'ı ; string girdisinin word olmadan önce belirli kontrollerden geçmesini sağlar.    
    private String word;
    
    public Word(String word){
        setWord(word);
    }

    /**
     * @return the word
     */
    public String getWord() {
        return word;
    }

    /**
     * @param word the word to set
     */
    public void setWord(String word) {
        
        /* kelime words'de (sözlükte) bulunursa word nesnesi oluşturulur
           bulunamaz ise iki harf değiştirerek elde edilen türevlerinden words içinde olanı aranır.
           hiçbir türevi sözlükte yoksa ilk hâli ile nesne oluşturulur.*/
        if(!varMi(word)){
            word = ikiHarfDegistir(word);
        }
        this.word = word;
        
        
        
        
    }
    public String ikiHarfDegistir(String word){
        /* her harfin bir sağındakiyle yer değiştirmesi ile elde edilen tüm kelimeler
           search fonksiyonuna gönderilir. */
        String temp = word; 
        
        for (int i = 0; i < word.length()-1; i++) {
            temp=word.substring(0,i)+word.charAt(i+1)+word.charAt(i)+word.substring(i+2);
            if(varMi(temp)){
             
             return temp;
            }
            
        }
        
        return word;
        
    }
    public boolean varMi(String word){
        /* Arama fonksiyonu
         .txt dosyasındaki kelimeler alfabetik sırada olduğu için
         binary search kullanımı uygun görülmüştür.*/
        int deger=1;
        int bas = 0;
        int son = words.size()-1;
        while(deger!=0){
            deger = word.toLowerCase().compareTo(words.get((bas+son)/2));
            
            if (deger>0){
                
                bas = (bas+son)/2;
                }
            if(deger<0){
                son = (bas+son)/2;
                }
            if(bas+1==son && deger !=0){
                return false;
                }
        }
        
        
        return true;
        }
        
    
        public String toString(){
        return word;
        }
    }
    
    
}

