package api.first_api.Controller;

import api.first_api.Model.Project;
import api.first_api.Service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class InfoController {

    private InfoService infoService;

    @Autowired
    public InfoController(InfoService infoService){
        this.infoService = infoService;
    }

    @GetMapping("/info")
    public Object projectInfo(){
        Project project = infoService.getProjectInfo();
        return project;
    }
}
