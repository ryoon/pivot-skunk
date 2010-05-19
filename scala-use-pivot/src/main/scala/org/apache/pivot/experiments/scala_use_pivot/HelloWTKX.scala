package org.apache.pivot.experiments.scala_use_pivot

import org.apache.pivot.collections.Map;
import org.apache.pivot.wtk.Application;
import org.apache.pivot.wtk.DesktopApplicationContext;
import org.apache.pivot.wtk.Display;
import org.apache.pivot.wtk.Window;
import org.apache.pivot.wtkx.WTKXSerializer;

/**
 * Pivot entry point
 */
class HelloWTKX extends org.apache.pivot.wtk.Application 
{
    private var window: Window = null

    override def startup(display:Display, properties:Map[String, String]) = 
    {
        AppUtils.log("Pivot startup")

        var wtkxSerializer: WTKXSerializer = new WTKXSerializer();

        // note: to load the wtkx file from resources (in the above code), put the resource file in the same folder of the current class,
        //       or if put in another source folder (like resources), create there the same package/folder structure as found here (under src) ...
        // window = (Window) wtkxSerializer.readObject(this, "hello.wtkx");           // Java  version
        window = wtkxSerializer.readObject(this, "hello.wtkx").asInstanceOf[Window];  // Scala version

        if (window != null) 
            window.open(display);
        
    }

    override def shutdown(optional:Boolean):Boolean = 
    {
        AppUtils.log("Pivot shutdown")

        if (window != null) 
          window.close
        
        return false;
    }

    override def suspend():Unit = {}

    override def resume():Unit = {}
    
}
