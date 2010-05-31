/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.pivot.experiments.scala_use_pivot

import java.awt.Color;
import java.awt.Font;

import org.apache.pivot.collections.Map;
import org.apache.pivot.wtk.DesktopApplicationContext;
import org.apache.pivot.wtk.Display;
import org.apache.pivot.wtk.HorizontalAlignment;
import org.apache.pivot.wtk.Label;
import org.apache.pivot.wtk.VerticalAlignment;
import org.apache.pivot.wtk.Window;
import org.apache.pivot.wtk.Application;

/**
 * Pivot entry point
 */
class HelloScala extends org.apache.pivot.wtk.Application
{
    private var window:Window = null

    override def startup(display:Display, properties:Map[String, String]) =
    {
        AppUtils.log("Pivot startup")

        val label = new Label()
        label.setText("Hello World from Scala!")
        label.getStyles().put("font", new Font("Arial", Font.BOLD, 24))
        label.getStyles().put("color", Color.RED)
        label.getStyles().put("horizontalAlignment", HorizontalAlignment.CENTER)
        label.getStyles().put("verticalAlignment",   VerticalAlignment.CENTER)

        window = new Window()
        window.setContent(label)
        window.setTitle("Hello World from Scala!")
        window.setMaximized(true)
        window.open(display)
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
