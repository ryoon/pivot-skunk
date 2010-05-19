package org.apache.pivot.experiments.scala_use_pivot

import org.apache.pivot.wtk.DesktopApplicationContext;

/**
 * HelloJava App(lication) entry point, for running HelloWTKX with Pivot
 */
object HelloWTKXApp 
    // extends Application 
{

    def main(args: Array[String]) = 
    {
        AppUtils.log("Scala Application Started" + " (main class " + AppUtils.className(HelloWTKXApp) + ")")
        DesktopApplicationContext.main(classOf[HelloWTKX], args)
    }

}
