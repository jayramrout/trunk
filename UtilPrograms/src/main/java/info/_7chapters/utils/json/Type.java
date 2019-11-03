package info._7chapters.utils.json;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jrout on 10/6/2015.
 */
public class Type implements Serializable {


    private String typeName;
    private List<String> referenceList = new ArrayList<String>();
    private List<String> aggregateList = new ArrayList<String>();
    private Map<String , String> aggregateMap = new HashMap<String, String>();
    private Map<String , String> referenceMap = new HashMap<String, String>();
    private Map<String,String> attributeMap = new HashMap<String,String>();


    public Type(String typeName) {
        this.typeName = typeName;
    }

    public Map<String, String> getReferences() {
        return referenceMap;
    }

    public Map<String,String> getAttributes() {
        return attributeMap;
    }

    public Map<String, String> getAggregates() {
        return aggregateMap;
    }

    public String getTypeName() {
        return typeName;
    }
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public void addAttribute(String attributeName) {
        attributeMap.put(attributeName,attributeName);
    }

    public void addAggregate(String name) {
        aggregateMap.put(name,name);
    }

    public void addReference(String referenceName) {
        referenceMap.put(referenceName,referenceName);
    }
}