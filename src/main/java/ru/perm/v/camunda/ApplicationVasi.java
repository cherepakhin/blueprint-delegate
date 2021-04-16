package ru.perm.v.camunda;

import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.application.ProcessApplication;
import org.camunda.bpm.extension.osgi.application.OSGiProcessApplication;
import org.osgi.framework.BundleContext;
import org.osgi.service.blueprint.container.BlueprintContainer;

@ProcessApplication(name = "applicationvasi", deploymentDescriptors={"META-INF/processes.xml"})
@Slf4j
public class ApplicationVasi extends OSGiProcessApplication {
    public ApplicationVasi(BundleContext ctx, BlueprintContainer blueprintContainer) {
        super(ctx.getBundle(), blueprintContainer);
//        blueprintContainer.getComponentIds().stream().forEach(log::info);
    }
}
