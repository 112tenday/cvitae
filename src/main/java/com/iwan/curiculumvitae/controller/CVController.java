package com.iwan.curiculumvitae.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.iwan.curiculumvitae.model.Education;
import com.iwan.curiculumvitae.model.Experience;
import com.iwan.curiculumvitae.model.Profile;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CVController {
    @GetMapping("/cv")
    public String showCV(Model model) {
        // Inisialisasi data
        Profile profile = new Profile();
        profile.setFullName("Iwan Gunawan Tondang");
        profile.setAge(24);
        profile.setMaritalStatus("Single");
        profile.setUniversity("University of Sumatera Utara");
        profile.setUniversityGPA(3.46);
        profile.setDescription("I am a hard worker, have a passion for working independently and in a team. " +
                "I am very excited about new things and have innovative thoughts.");
        profile.setAddress("Jakarta Selatan, Indonesia");
        profile.setWhatsapp("0813 7576 1021");
        profile.setEmail("iwangunawantondang@gmail.com");

        List<Experience> experiences = new ArrayList<>();
        experiences.add(new Experience("Web Developer",
                "ACCENTURE", LocalDate.of(2023, 5, 1), null,
                "Perform and coordinate application programming activities."));
        experiences.add(new Experience("IT And User Support",
                "BTPN SYARIAH", LocalDate.of(2022, 12, 1), LocalDate.of(2023, 5, 1),
                "Analyze and repair devices used by all employees, both in terms of hardware and software."));
        experiences.add(new Experience("Web Developer (Java)",
                "Freelance", LocalDate.of(2022, 1, 1), LocalDate.of(2022, 12, 31),
                "Taking Freelance Job (from Group) for build development website app project. Developing the web using spring boot such as ResDOC for API tests, use of auto config, web service, web starter, CLI, JMS, GraphQL, etc."));

        List<Education> educations = new ArrayList<>();

        educations.add(new Education("Informatics Engineering", "University of Sumatera Utara",
                LocalDate.of(2018, 8, 1), LocalDate.of(2021, 5, 1), 3.46));
        educations.add(new Education("Computer and Network Engineering", "SMK RISMADUMA SUMBUL",
                LocalDate.of(2014, 9, 1), LocalDate.of(2017, 6, 1), 0));

        profile.setExperienceList(experiences);
        profile.setEducationList(educations);

        model.addAttribute("profile", profile);

        return "cv";
    }
}
