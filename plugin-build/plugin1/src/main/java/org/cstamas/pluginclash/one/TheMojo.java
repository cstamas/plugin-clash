package org.cstamas.pluginclash.one;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "goal")
public class TheMojo extends AbstractMojo {
    @Override
    public void execute() {
        System.out.println(getClass().getName());
    }
}
