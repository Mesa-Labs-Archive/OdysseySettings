/*      Copyright (C) 2016 Grouxho (esp-desarrolladores.com

        Licensed under the Apache License, Version 2.0 (the "License");
        you may not use this file except in compliance with the License.
        You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

        Unless required by applicable law or agreed to in writing, software
        distributed under the License is distributed on an "AS IS" BASIS,
        WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        See the License for the specific language governing permissions and
        limitations under the License.
*/
package com.odyssey.settings.fab;


import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.util.AttributeSet;
import android.view.View;

public class FABBehavIor extends CoordinatorLayout.Behavior<FloatingActionButton> {
public FABBehavIor() {
}

public FABBehavIor(Context context, AttributeSet attrs) {
super(context, attrs);
}

@Override
public boolean layoutDependsOn(CoordinatorLayout parent, FloatingActionButton child, View dependency) {
return dependency instanceof Snackbar.SnackbarLayout;
}

@Override
public boolean onDependentViewChanged(CoordinatorLayout parent, FloatingActionButton child, View dependency) {
float translationY = Math.min(0, dependency.getTranslationY() - dependency.getHeight());
child.setTranslationY(translationY);
return true;
  }
}