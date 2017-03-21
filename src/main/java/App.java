import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";
    ArrayList<JobOpening> jobsArray = new ArrayList<JobOpening>();

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/jobList", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      request.session().attribute("jobsArrayKey", jobsArray);
      String title = request.queryParams("jobTitle");
      String description = request.queryParams("jobDescription");
      String contact = request.queryParams("jobContactInfo");
      JobOpening newJob = new JobOpening(title, description, contact);
      jobsArray.add(newJob);

      model.put("printJobs", request.session().attribute("jobsArrayKey"));
      model.put("template", "templates/jobList.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
