package proxy;

import java.util.List;
import java.util.Map;

public class AopClass {

    private List<Class> annotationClassList;

    public AopClass(){

    }

    public AopClass(String path, Class annotation){
        this.annotationClassList = ScannerAnnotation.initScannerAnnotation(path,annotation);
    }

    public List<Class> getAnnotationClassList() {
        return annotationClassList;
    }

    public void setAnnotationClassList(List<Class> annotationClassList) {
        this.annotationClassList = annotationClassList;
    }

    public Map<String, Class> getClassMap(){
        return ScannerAnnotation.getClassMap();
    }
}
