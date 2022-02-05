package com.datadynecode.designpatterns;

import java.util.ArrayList;
import java.util.List;

public class SceneGroup implements SceneObject{

    private List<SceneObject> childrens = new ArrayList<>();

    public void add(SceneObject object) {
        childrens.add(object);
    }

    public void remove(SceneObject object) {
        childrens.remove(object);
    }

    @Override
    public void draw() {
        childrens.forEach(sceneObject -> sceneObject.draw());
    }
}
