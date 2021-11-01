package api.first_api.Service;

import api.first_api.Model.Project;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class InfoService {

    public Project getProjectInfo(){

        Project project = new Project();
        project.projectName = "hello-world";
        project.author = "first";
        project.createDate = new Date();

        return project;
    }
}
