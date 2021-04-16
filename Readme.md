### Связывание Camunda, Karaf, Blueprint

Сборка
````
mvn clean install
````

В результате соберется бандл для Karaf в ./bundles/delegate.jar

Приложение в Karaf [ApplicationVasi.java](src/main/java/ru/perm/v/camunda/ApplicationVasi.java)

Объявляется с помощью [processes.xml](src/main/resources/META-INF/processes.xml). Путь важен. Иначе нужно определить deploymentDescriptors

````java
@ProcessApplication(name = "applicationvasi", deploymentDescriptors={"META-INF/processes.xml"})
@Slf4j
public class ApplicationVasi extends OSGiProcessApplication {
    public ApplicationVasi(BundleContext ctx, BlueprintContainer blueprintContainer) {

````

Пользовательский процесс camunda [diagram_1.bpmn](src/main/resources/diagram_1.bpmn) должен попасть в бандл

Типичный BeanBluePrint. 

````java
@Slf4j
public class BeanBluePrint {

    private final String id;

    public BeanBluePrint(String id) {
        this.id = id;
    }
    public void myMethod(DelegateExecution delegateExecution) {
        log.info("===================myMethod");
    }
````

Определение в [blueprint.xml](src/main/resources/OSGI-INF/blueprint/blueprint.xml)

````xml
    <bean id="beanBluePrint" class="ru.perm.v.camunda.BeanBluePrint">
        <argument value="Message from BeanBluePrint"/>
    </bean>
````
Из camunda доступен через 

````
camunda:expression="${beanBluePrint.myMethod(execution)}"
````

![Схема](./doc/task.png)

>Вызов blueprint сервиса ${delegateService.callOnExecution(execution)} не прокатил :(