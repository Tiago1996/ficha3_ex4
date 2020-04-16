import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Dicionario{
    private final Map<String,HashMap<String,String>> dics = new HashMap<>() ;
    private Map<String,String> atual = null;



    public void add(String lingua ,String palavra, String trad) {
        HashMap<String,String> dic;
        dic = dics.get(lingua);
        if(dic==null){
            dic = new HashMap<>();
            dics.put(lingua,dic);
        }
        dic.put(palavra,trad);
    }

    void defineLingua(String lingua){
        atual = dics.get(lingua);
    }

    public String get(String palavra){
        if(atual ==null)
            return "ERRO:Lingua desconhecida";
        String trad = atual.get(palavra);
        if(trad==null)
            return "Erro:palavra desconhecida";
        return trad;
    }
}
