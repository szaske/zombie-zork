import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.ArrayList;
import java.util.List;

public class App {

  static int getHerokuAssignedPort() {

  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      Location testLocation = new Location("Kitchen", "A messy kitchen");
      List<Exit> testExits = new ArrayList<Exit>();
      Exit oneExit = new Exit(1,1,1);
      testExits.add(oneExit);
      Exit twoExit = new Exit(2,2,2);
      testExits.add(twoExit);
      model.put("location", testLocation);
      model.put("exits", testExits);
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/go", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      Location testLocation = new Location("Kitchen", "A messy kitchen");
      List<Exit> testExits = new ArrayList<Exit>();
      Exit oneExit = new Exit(1,1,1);
      testExits.add(oneExit);
      Exit twoExit = new Exit(2,2,2);
      testExits.add(twoExit);
      model.put("location", testLocation);
      model.put("exits", testExits);
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());



  } //end of main
} //end of class