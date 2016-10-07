package org.atoc.rars.util.pojo2yaml;

import java.lang.reflect.Field;

/**
 * Created by radu on 06.10.2016.
 */
public class ClassWorker {
    protected Class<? extends Object> clazz;
    protected String rootPackage;
    protected int rootPackageLength;

    public ClassWorker(Class<? extends Object> clazz,String rootPackage) {
        this.clazz = clazz;
        this.rootPackageLength = rootPackage.length()+1;
        this.rootPackage = rootPackage;
    }

    String camelize(String packageLikeName) {
        boolean toUpperNext = false;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<packageLikeName.length();i++) {
            if( packageLikeName.charAt(i) == '.' ) {
                toUpperNext = true;
            } else if( toUpperNext ) {
                sb.append( packageLikeName.substring(i,i+1).toUpperCase() );
                toUpperNext = false;
            } else {
                sb.append( packageLikeName.charAt(i) );
            }
        }
        return sb.toString();
    }

    private boolean ignoreClass() {
        if(clazz.getCanonicalName().endsWith("ObjectFactory")){
            return true;
        }
        return false;
    }

    public void process(OutputHandler outputHandler) {
        if(ignoreClass()) {
            return;
        }
        System.out.println(String.format("processing CLASS: %s ...",clazz.getCanonicalName()));
        YamlTypeDefinition typeDef = new YamlTypeDefinition(camelize(
            clazz.getCanonicalName().substring(rootPackageLength)
        ), this);
        for(Field f : clazz.getDeclaredFields()) {
            try {
                typeDef.addField(f);
            } catch(RuntimeException re) {

            }
        }


        outputHandler.out(typeDef.toString());

        System.out.println("done");
    }
}
