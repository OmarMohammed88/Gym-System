 package health.club;

import java.util.*;
import java.io.File;

public class GYMSYSTEM {
    public GYMSYSTEM() {
    }

    public static void main(String[] args) {

        String projectpath = System.getProperty("user.dir");
        System.out.println("projectpath: " + projectpath);
        File currentdir = new File(projectpath);
        checkDirectoryContents(currentdir);

    }


    public static void checkDirectoryContents(File dir) {
        File[] files = dir.listFiles();
        boolean AdminFile = true;
        boolean MemberFile = true;
        boolean CoachFile = true;
        boolean UserFile = true;

        for (File file : files) {

            if (file.getName().contains("Admin.bin")) {
                AdminFile = false;
            }else if (file.getName().contains("Professor.bin")) {
                MemberFile = false;
            } else if (file.getName().contains("TA.bin")) {
                CoachFile = false;
            }
        }
        if (AdminFile) {
            Admin x = new Admin();
            x.Committofile();
        }

        if (MemberFile) {
            Member x = new Member();
            x.Committofile();
        }

        if (CoachFile) {
            Coach x = new Coach();
            x.Committofile();
        }

    }
}
